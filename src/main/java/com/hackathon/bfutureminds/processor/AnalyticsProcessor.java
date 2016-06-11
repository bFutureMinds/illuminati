package com.hackathon.bfutureminds.processor;

import com.hackathon.bfutureminds.model.Customer;
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
