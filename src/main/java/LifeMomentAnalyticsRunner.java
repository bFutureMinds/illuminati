import configuration.LifeMomentAnalyticsConfig;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * Created by chand on 11/6/16.
 */

@Component
@Configuration
@ComponentScan
public class LifeMomentAnalyticsRunner implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.applicationContext = applicationContext;
    }

    public void runJob(){

        JobLauncher jobLauncher = (JobLauncher) applicationContext.getBean("jobLauncher");
        Job job = applicationContext.getBean("createCustomerProspectJob",Job.class);

        JobParametersBuilder builder = new JobParametersBuilder();

        runJobForFile(jobLauncher,job,builder);
    }

    private void runJobForFile(JobLauncher jobLauncher, Job job, JobParametersBuilder jobParametersBuilder)  {
        try{
            JobExecution run = jobLauncher.run(job, jobParametersBuilder.toJobParameters());
            ExitStatus exitStatus = run.getExitStatus();
        }catch(JobParametersInvalidException | JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException e){

        }
    }
}
