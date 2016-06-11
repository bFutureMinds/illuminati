package com.hackathon.bfutureminds.configuration;

import model.CsvContract;
import model.Customer;
import model.CustomerProspect;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import processor.AnalyticsProcessor;

import java.io.File;

/**
 * Created by chand on 11/6/16.
 */
@Configuration
@EnableBatchProcessing
public class LifeMomentAnalyticsConfig {

    @Value("${inFile}")
    String inputFilePath;


    @Value("${outFile}")
    String outputFilePath;


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
        fieldExtractor.setNames(CsvContract.PROJECTION);
        delLineAgg.setFieldExtractor(fieldExtractor);
        writer.setLineAggregator(delLineAgg);
        return writer;
    }

    //Analytics Processor Configuration
    @Bean
    public ItemProcessor<Customer, Customer> processor() {
        return new AnalyticsProcessor();
    }

    //Job Configuration
    @Bean
    public Job createCustomerProspectJob(JobBuilderFactory jobs, Step step) {
        return jobs.get("createCustomerProspectJob")
                .flow(step)
                .end()
                .build();
    }

    //Step Configuration
    @Bean
    public Step step(StepBuilderFactory stepBuilderFactory, ItemReader<Customer> reader,
                     ItemWriter<CustomerProspect> writer, ItemProcessor<Customer, CustomerProspect> processor) {
        return stepBuilderFactory.get("step")
                .<Customer, CustomerProspect> chunk(100)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }
}
