package com.hackathon.bfutureminds.processor.algorithm;

import com.hackathon.bfutureminds.model.Customer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * Created by shikha on 12/6/16.
 */

@Component
public class CreditCardProspectAlgorithm {

    public boolean getCreditCardProspect(Customer customer){

        return false;
    }

    public boolean getCustomerLoyalty(Customer customer){
        if (customer.loanLast1Mto3M > 0 ||
                customer.personalLoanLast1M3MBank > 0 ||
                customer.educationLoanLast1Mto3MBank > 0 ||
                customer.carLoanLast1Mto3MBank > 0 ||
                customer.homeLoanLast1Mto3MBank > 0 ||
                customer.creditCardLast1Mto3M > 0 ||
                customer.numberOfTransactions3MBank > 0 ||
                customer.numberOfSavingsAccountsInLast1Mto3MBank > 0 ||
                customer.numberOfTransactions3MBank > 0 ||
                customer.pensionPlan1M3MBank > 0 ||
                customer.endowmentPolicy1M3MBank > 0 ||
                customer.totalNoTransactions1M3MBank > 0) {
            return true;
        }

        return false;

    }
}
