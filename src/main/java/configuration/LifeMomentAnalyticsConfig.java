package configuration;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import processor.AnalyticsProcessor;

/**
 * Created by chand on 11/6/16.
 */
@Configuration
@EnableBatchProcessing
public class LifeMomentAnalyticsConfig {

    @Bean
    public ItemReader<Customer> reader() {
        FlatFileItemReader<Customer> reader = new FlatFileItemReader<Customer>();
        reader.setResource(new ClassPathResource("student-data.csv"));
        reader.setLineMapper(new DefaultLineMapper<Customer>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[]{"stdId", "subMarkOne", "subMarkTwo"});
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Customer>() {{
                setTargetType(Customer.class);
            }});
        }});
        return reader;
    }
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
    @Bean
    public ItemProcessor<Customer, CustomerProspect> processor() {
        return new AnalyticsProcessor();
    }
    @Bean
    public Job createCustomerProspect(JobBuilderFactory jobs, Step step) {
        return jobs.get("createCustomerProspect")
                .flow(step)
                .end()
                .build();
    }

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
