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
            customer.loyaltyStatus = true;
        }

        if (customer.loyaltyStatus ||
                customer.age >= 18 ||
                "Working".equals(customer.currentEmploymentStatus) ||
                "Resident".equals(customer.residentialStatus) ||
                )

        return null;
    }
}
