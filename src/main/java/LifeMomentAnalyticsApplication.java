import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by sbanga on 11/6/16.
 */
public class LifeMomentAnalyticsApplication {

    public static void main(String[] args){


        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(LifeMomentAnalyticsRunner.class);
        springApplicationBuilder.web(false);

        ConfigurableApplicationContext applicationContext = springApplicationBuilder.run(args);

        if(applicationContext!=null){
            LifeMomentAnalyticsRunner lifeMomentAnalyticsRunner = applicationContext.getBean("lifeMomentAnalyticsRunner",LifeMomentAnalyticsRunner.class);
            lifeMomentAnalyticsRunner.runJob();

            if(applicationContext.isActive()){
                SpringApplication.exit(applicationContext);
            }
        }

    }
}
