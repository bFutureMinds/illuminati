package com.hackathon.bfutureminds.tasklet;


import com.hackathon.bfutureminds.model.CsvContract;
import com.hackathon.bfutureminds.model.Customer;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        ExecutionContext executionContext = stepExecution.getJobExecution().getExecutionContext();

        executionContext.putDouble("minYearsOfRelationship",minYearsOfRelationship);
        executionContext.putDouble("minFamilyAnnualIncome",minFamilyAnnualIncome);
        executionContext.putDouble("averageAnnualIncome",averageAnnualIncome);
        executionContext.putDouble("averageDebtToIncomeRatio",averageDebtToIncomeRatio);
        executionContext.putDouble("averageExposureExceeds", averageExposureExceeds);
        executionContext.putInt("minTimeInBusiness",minTimeInBusiness);

        return ExitStatus.COMPLETED;
    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        //@Value("${inFile}")
        String inputFilePath="/home/shikha/Desktop/HackathonExcelModelInput.csv";

        CSVReader reader =null;

        try {
            reader = new CSVReader(new FileReader(inputFilePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
        //Set mappingStrategy type to Customer Type
        mappingStrategy.setType(Customer.class);
        //Setting the columns for mappingStrategy
        mappingStrategy.setColumnMapping(CsvContract.PROJECTION);
        //create instance for CsvToBean class
        CsvToBean ctb = new CsvToBean();
        //parsing csvReader(Input.csv) with mappingStrategy
        customers = ctb.parse(mappingStrategy,reader);

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
                customer.loyaltyStatus = "true";
            }else{
                customer.loyaltyStatus = "false";
            }

            if (Boolean.parseBoolean(customer.loyaltyStatus)) {
                if (customer.timeInBusiness < minTimeInBusiness)
                    minTimeInBusiness = customer.timeInBusiness;

                totalOfAnnualIncome += Double.parseDouble(customer.annualIncome);
                count++;
                totalDebtToIncomeRatio += Double.parseDouble(customer.currentAmtOfDebt)/Double.parseDouble(customer.annualIncome);
                totalExposureExceeds += Double.parseDouble(customer.exposureExceedsBank);

                if (Double.parseDouble(customer.yrsRelationshipCustomerBank) < minYearsOfRelationship)
                    minYearsOfRelationship = Double.parseDouble(customer.yrsRelationshipCustomerBank);

                if (Double.parseDouble(customer.totalFamilyIncomeAnnual) < minFamilyAnnualIncome)
                    minFamilyAnnualIncome = Double.parseDouble(customer.totalFamilyIncomeAnnual);
            }
        }

        System.out.println("Loyal Customer Count : " + count);

        return RepeatStatus.FINISHED;
    }
}
