package configuration;

import model.CsvContract;
import model.Customer;
import model.CustomerProspect;
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
import org.springframework.core.io.ClassPathResource;
import processor.AnalyticsProcessor;
import tasklet.CalculationTasklet;
import tasklet.LoyalFilterTasklet;

/**
 * Created by chand on 11/6/16.
 */
@Configuration
@EnableBatchProcessing
public class LifeMomentAnalyticsConfig {


    //Input File Reader Configuration
    @Bean
    public ItemReader<Customer> reader() {
        FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>();
        reader.setResource(new ClassPathResource("student-data.csv"));
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
        writer.setResource(new ClassPathResource("student-marksheet.csv"));
        DelimitedLineAggregator<CustomerProspect> delLineAgg = new DelimitedLineAggregator<>();
        delLineAgg.setDelimiter(",");
        BeanWrapperFieldExtractor<CustomerProspect> fieldExtractor = new BeanWrapperFieldExtractor<>();
        fieldExtractor.setNames(new String[] {"stdId", "totalSubMark"});
        delLineAgg.setFieldExtractor(fieldExtractor);
        writer.setLineAggregator(delLineAgg);
        return writer;
    }

    //Analytics Processor Configuration
    @Bean
    public ItemProcessor<Customer, CustomerProspect> processor() {
        return new AnalyticsProcessor();
    }
    @Bean
    public Job createCustomerProspect(JobBuilderFactory jobs, Step csvReadStep) {
        return jobs.get("createCustomerProspect")
                .flow(csvReadStep)
                .end()
                .build();
    }

    @Bean
    public Step minMaxCalculationStep(StepBuilderFactory stepBuilderFactory, Tasklet calculationTasklet) {
        return stepBuilderFactory.get("minMaxCalculationStep")
                .tasklet(calculationTasklet)
                .build();
    }

    @Bean
    public Tasklet calculationTasklet() {
        return new CalculationTasklet();
    }

    @Bean
    public Step analyticsStep(StepBuilderFactory stepBuilderFactory, Tasklet analyticsTasklet) {
        return stepBuilderFactory.get("analyticsStep")
                .tasklet(analyticsTasklet)
                .build();
    }

    @Bean
    public Tasklet analyticsTasklet() {
        return new LoyalFilterTasklet();
    }
}
