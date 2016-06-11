package com.hackathon.bfutureminds.configuration;

import com.hackathon.bfutureminds.model.CsvContract;
import com.hackathon.bfutureminds.model.Customer;
import com.hackathon.bfutureminds.model.CustomerProspect;
import com.hackathon.bfutureminds.processor.AnalyticsProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import com.hackathon.bfutureminds.tasklet.CalculationTasklet;

import java.io.File;

/**
 * Created by chand on 11/6/16.
 */
@Configuration
@EnableBatchProcessing
public class LifeMomentAnalyticsConfig {

    //@Value("${inFile}")
    String inputFilePath="/home/shikha/Desktop/HackathonExcelModelInput.csv";


    //@Value("${outFile}")
    String outputFilePath="/home/shikha/Desktop/HackathonExcelModelOut.csv";;


    //Input File Reader Configuration
    @Bean
    public ItemReader<Customer> reader() {
        FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>();
        reader.setResource(new FileSystemResource(new File(inputFilePath)));
        reader.setLineMapper(new DefaultLineMapper<Customer>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(CsvContract.PROJECTION);
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Customer>() {{
                setTargetType(Customer.class);
            }});
        }});
        return reader;
    }

    //Output File Writer Configuration
    @Bean
    public ItemWriter<CustomerProspect> writer() {
        FlatFileItemWriter<CustomerProspect> writer = new FlatFileItemWriter<>();
        writer.setResource(new FileSystemResource(new File(outputFilePath)));
        DelimitedLineAggregator<CustomerProspect> delLineAgg = new DelimitedLineAggregator<>();
        delLineAgg.setDelimiter(",");
        BeanWrapperFieldExtractor<CustomerProspect> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(CsvContract.PROSPECT_PROJECTION);
        delLineAgg.setFieldExtractor(fieldExtractor);
        writer.setLineAggregator(delLineAgg);
        return writer;
    }

    //Analytics Processor Configuration
    @Bean
    public ItemProcessor<Customer,CustomerProspect> processor() {
        return new AnalyticsProcessor();
    }

    //Job Configuration
    @Bean
    public Job createCustomerProspect(JobBuilderFactory jobs, Step prospectsAnalyticsStep, Step calculationStep) {
        return jobs.get("createCustomerProspect")
                .flow(calculationStep)
                .on("COMPLETED")
                .to(prospectsAnalyticsStep)
                .end()
                .build();
    }


    //Step Configuration
    @Bean
    public Step prospectsAnalyticsStep(StepBuilderFactory stepBuilderFactory, ItemReader<Customer> reader,ItemProcessor<Customer,CustomerProspect> processor,ItemWriter<CustomerProspect> writer) {
        return stepBuilderFactory.get("prospectsAnalyticsStep")
                .<Customer,CustomerProspect>chunk(5000)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Step calculationStep(StepBuilderFactory stepBuilderFactory, Tasklet calculationTasklet) {
        return stepBuilderFactory.get("calculationStep")
                .tasklet(calculationTasklet)
                .build();
    }

    @Bean
    public Tasklet calculationTasklet() {
        return new CalculationTasklet();
    }



}
