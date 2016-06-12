package com.hackathon.bfutureminds.processor.algorithm;

import com.hackathon.bfutureminds.model.Customer;
import com.hackathon.bfutureminds.model.CustomerProspect;
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

    public boolean isEligibleForSpecialHotelCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionHotelBookingBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialTrainCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionTrainTicketsBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialFlightCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionFlightTicketsBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialTravelCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoBookingTravelBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialRetailCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionRetailshoppingBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialMovieCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionMoviesBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public boolean isEligibleForSpecialFuelCard(Customer customer) {
        if (Integer.parseInt(customer.totalNoTransactionFuelBank)/getTotalNumberOfTransactions(customer) > 0.10) {
            return true;
        }
        return false;
    }

    public void personalLoanAnalysis(Customer customer, CustomerProspect customerProspect, int maxNumberOfPersonalLoansBank) {
        customerProspect.eligibilityForPersonalLoan = false;
        customerProspect.numberOfPersonalLoansToBeOffered = 0;
        customerProspect.amountOfPersonalLoansToBeOffered = 0.0;

        if (getCreditCardProspect(customer) && Integer.parseInt(customer.totalNumberOfPersonalLoan) < maxNumberOfPersonalLoansBank) {
            customerProspect.eligibilityForPersonalLoan = true;
            customerProspect.numberOfPersonalLoansToBeOffered = maxNumberOfPersonalLoansBank - Integer.parseInt(customer.totalNumberOfPersonalLoan);
            customerProspect.amountOfPersonalLoansToBeOffered = Double.parseDouble(customer.totalDisposableIncomeAnnual) * 1.4;
        }
    }

    public void educationLoanAnalysis(Customer customer, CustomerProspect customerProspect) {
        customerProspect.eligibilityForEducationLoan = false;
        customerProspect.amountOfEducationLoansToBeOffered = 0.0;

        if (getCreditCardProspect(customer) && "Student".equals(customer.occupation)) {
            customerProspect.eligibilityForEducationLoan = true;
            customerProspect.amountOfEducationLoansToBeOffered = Double.parseDouble(customer.totalDisposableIncomeAnnual) * 1.2;
        }
    }

    public void homeLoanAnalysis(Customer customer, CustomerProspect customerProspect, int maxNumberOfHomeLoansBank) {
        customerProspect.eligibilityForHomeLoan = false;
        customerProspect.amountOfHomeLoansToBeOffered = 0.0;

        if (getCreditCardProspect(customer) &&
                "Student".equals(customer.occupation) &&
                Integer.parseInt(customer.totalNumberOfHomeLoan) < maxNumberOfHomeLoansBank) {
            customerProspect.eligibilityForHomeLoan = true;
            customerProspect.amountOfHomeLoansToBeOffered = Double.parseDouble(customer.totalDisposableIncomeAnnual) * 1.2;
        }
    }

    public void savingAccountAnalysis(Customer customer, CustomerProspect customerProspect, int maxNumberOfSavingAccountsBank) {
        customerProspect.eligibilityForSavingsAccount = false;

        if (Integer.parseInt(customer.numberOfSavingAccountsBank) < maxNumberOfSavingAccountsBank &&
                Double.parseDouble(customer.totalDisposableIncomeAnnual) > 100) {
            customerProspect.eligibilityForSavingsAccount = true;
        }
    }

    public int getTotalNumberOfTransactions(Customer customer) {
        return customer.totalNoTransactions1M3MBank+customer.totalNoTransactions3M12MBank+customer.totalNoTransactions6M12MBank;
    }
}
