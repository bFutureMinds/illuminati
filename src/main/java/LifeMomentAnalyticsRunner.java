import configuration.LifeMomentAnalyticsConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chand on 11/6/16.
 */
public class LifeMomentAnalyticsRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LifeMomentAnalyticsConfig.class);
    }
}
