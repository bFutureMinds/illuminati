package com.hackathon.bfutureminds.processor;

import com.hackathon.bfutureminds.model.Customer;
import com.hackathon.bfutureminds.model.CustomerProspect;
import com.hackathon.bfutureminds.processor.algorithm.CreditCardProspectAlgorithm;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chand on 11/6/16.
 */
public class AnalyticsProcessor implements ItemProcessor<Customer, CustomerProspect>,StepExecutionListener {

    @Autowired
    CreditCardProspectAlgorithm creditCardProspectAlgorithm;

    double minYearsOfRelationship;
    double minFamilyAnnualIncome;
    double averageAnnualIncome;
    double averageDebtToIncomeRatio;
    double averageExposureExceeds;
    int minTimeInBusiness;

    @Override
    public CustomerProspect process(Customer customer) throws Exception {

        CustomerProspect customerProspect = new CustomerProspect();
        customerProspect.setId(customer.getId());
        customerProspect.setCustomerId(customer.getCustomerId());
        customerProspect.setLoyaltyStatus(creditCardProspectAlgorithm.getCustomerLoyalty(customer));

        if(!customerProspect.isLoyaltyStatus())
            return null;

        customerProspect.setProspectStatus(creditCardProspectAlgorithm.getCreditCardProspect(customer));;

        return customerProspect;
    }

    @Override
    public void beforeStep(StepExecution stepExecution) {
        ExecutionContext executionContext = stepExecution.getJobExecution().getExecutionContext();

        minYearsOfRelationship = executionContext.getDouble("minYearsOfRelationship");
        minFamilyAnnualIncome = executionContext.getDouble("minFamilyAnnualIncome");
        averageAnnualIncome = executionContext.getDouble("averageAnnualIncome");
        averageDebtToIncomeRatio = executionContext.getDouble("averageDebtToIncomeRatio");
        averageExposureExceeds = executionContext.getDouble("averageExposureExceeds");
        minTimeInBusiness = executionContext.getInt("minTimeInBusiness");

        System.out.println("averageAnnualIncome : "+averageAnnualIncome+"\naverageExposureExceeds : "+averageExposureExceeds);

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return null;
    }
}
