package tasklet;

import model.Customer;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chand on 11/6/16.
 */
public class CalculationTasklet implements Tasklet, StepExecutionListener {

    private List<Customer> customers = new ArrayList<>();

    private int minTimeInBusiness = 0;
    private double totalOfAnnualIncome = 0.0;
    private double totalDebtToIncomeRatio = 0.0;
    private int count = 0;
    private double totalExposureExceeds = 0.0;
    private double minYearsOfRelationship = 0.0;
    private double minFamilyAnnualIncome = 0.0;

    @Override
    public void beforeStep(StepExecution stepExecution) {

    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        double averageAnnualIncome = totalOfAnnualIncome/count;
        double averageDebtToIncomeRatio = totalDebtToIncomeRatio/count;
        double averageExposureExceeds = totalExposureExceeds/count;
        return null;
    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        for (Customer customer : customers) {
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

            if (customer.loyaltyStatus) {
                if (customer.timeInBusiness < minTimeInBusiness)
                    minTimeInBusiness = customer.timeInBusiness;

                totalOfAnnualIncome += customer.annualIncome;
                count++;
                totalDebtToIncomeRatio += customer.currentAmtOfDebt/customer.annualIncome;
                totalExposureExceeds += customer.exposureExceedsBank;
                minYearsOfRelationship += customer.yrsRelationshipCustomerBank;

                if (customer.totalFamilyIncomeAnnual < minFamilyAnnualIncome)
                    minFamilyAnnualIncome = customer.totalFamilyIncomeAnnual;
            }
        }

        return RepeatStatus.FINISHED;
    }
}
