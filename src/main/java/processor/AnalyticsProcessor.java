package processor;

import model.Customer;
import model.CustomerProspect;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by chand on 11/6/16.
 */
public class AnalyticsProcessor implements ItemProcessor<Customer, CustomerProspect> {

    @Override
    public CustomerProspect process(Customer customer) throws Exception {

        return null;
    }
}
