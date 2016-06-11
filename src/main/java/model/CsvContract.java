package model;

/**
 * Created by sbanga 11/6/16.
 */
public class CsvContract {

    private static final String ID = "id";
    private static final String CUSTOMERID = "customerId";
    private static final String AGE = "age";
    private static final String GENDER = "gender";
    private static final String MARITALSTATUS = "maritalStatus";
    private static final String NUMBERHOUSEHOLDS = "numberHouseHolds";
    private static final String NUMBERCHILD = "numberChild";
    private static final String ZIPCODE = "zipcode";
    private static final String RESIDENTIALSTATUS = "residentialStatus";
    private static final String EDUCATION = "education";
    private static final String OCCUPATION = "occupation";
    private static final String INDUSTRYTYPE = "industryType";
    private static final String CURRENTDESIGNATION = "currentDesignation";
    private static final String TIMEINBUSINESS = "timeInBusiness";
    private static final String CURRENTEMPLOYMENTSTATUS = "currentEmploymentStatus";
    private static final String TYPEOFACCOMMODATION = "typeOfAccommodation";
    private static final String NUMBEROFOWNHOUSES = "numberOfOwnHouses";
    private static final String USAGEOFHOUSE = "usageOfHouse";
    private static final String NUMBEROFCARS = "numberOfCars";
    private static final String INCOMEFROMBUSINESSORPROFESSION = "incomeFromBusinessOrProfession";
    private static final String OTHERINCOME = "otherIncome";
    private static final String ANNUALINCOME = "annualIncome ";
    private static final String MONTHLYEXPENDITURE = "monthlyExpenditure ";
    private static final String ANNUALEXPENDITURE = "annualExpenditure ";
    private static final String ANNUALDISPOSABLEINCOME = "annualDisposableIncome ";
    private static final String MONTHLYAVGDISPOSABLEINCOME = "monthlyAvgDisposableIncome ";
    private static final String TOTALFAMILYINCOMEANNUAL = "totalFamilyIncomeAnnual ";
    private static final String TOTALFAMILYEXPENDITUREANNUAL = "totalFamilyExpenditureAnnual ";
    private static final String TOTALDISPOSABLEINCOMEANNUAL = "totalDisposableIncomeAnnual ";
    private static final String TOTALASSETS = "totalAssets";
    private static final String TOTALLIABILITIES = "totalLiabilities ";
    private static final String CURRENTAMTOFDEBT = "currentAmtOfDebt ";
    private static final String TOTALNUMBEROFLOANS = "totalNumberOfLoans ";
    private static final String TOTALAMOUNTOFLOANS = "totalAmountOfLoans ";
    private static final String NUMBEROFLOANSWITHOUTSTANDINGBALANCE = "numberOfLoansWithOutstandingBalance ";
    private static final String OUTSTANDINGBALANCEOFLOAN = "outstandingBalanceOfLoan ";
    private static final String MOSTRECENTLOAN = "mostRecentLoan";
    private static final String AGEOFOLDESTLOAN = "ageOfOldestLoan ";
    private static final String LOANLAST1MTO3M = "loanLast1Mto3M ";
    private static final String LOANLAST3MTO6M = "loanLast3Mto6M ";
    private static final String LOANLAST6MTO12M = "loanLast6Mto12M ";
    private static final String TOTALNUMBEROFEDUCATIONLOAN = "totalNumberOfEducationLoan ";
    private static final String TOTALAMOUNTOFEDUCATIONLOAN = "totalAmountOfEducationLoan ";
    private static final String MOSTRECENTEDUCATIONLOAN = "mostRecentEducationLoan ";
    private static final String EDUCATIONLOANLAST1MTO3M = "educationLoanLast1Mto3M ";
    private static final String EDUCATIONLOANLAST3MTO6M = "educationLoanLast3Mto6M ";
    private static final String EDUCATIONLOANLAST6MTO12M = "educationLoanLast6Mto12M ";
    private static final String TOTALNUMBEROFHOMELOAN = "totalNumberOfHomeLoan ";
    private static final String TOTALAMOUNTOFHOMELOAN = "totalAmountOfHomeLoan ";
    private static final String MOSTRECENTHOMELOAN = "mostRecentHomeLoan ";
    private static final String HOMELOANLAST1MTO3M = "homeLoanLast1Mto3M ";
    private static final String HOMELOANLAST3MTO6M = "homeLoanLast3Mto6M ";
    private static final String HOMELOANLAST6MTO12M = "homeLoanLast6Mto12M ";
    private static final String TOTALNUMBEROFCARLOAN = "totalNumberOfCarLoan ";
    private static final String TOTALAMOUNTOFCARLOAN = "totalAmountOfCarLoan ";
    private static final String MOSTRECENTCARLOAN = "mostRecentCarLoan ";
    private static final String CARLOANLAST1MTO3M = "carLoanLast1Mto3M ";
    private static final String CARLOANLAST3MTO6M = "carLoanLast3Mto6M ";
    private static final String CARLOANLAST6MTO12M = "carLoanLast6Mto12M ";
    private static final String TOTALNUMBEROFPERSONALLOAN = "totalNumberOfPersonalLoan ";
    private static final String TOTALAMOUNTOFPERSONALLOAN = "totalAmountOfPersonalLoan ";
    private static final String MOSTRECENTPERSONALLOAN = "mostRecentPersonalLoan ";
    private static final String PERSONALLOANLAST1MTO3M = "personalLoanLast1Mto3M ";
    private static final String PERSONALLOANLAST3MTO6M = "personalLoanLast3Mto6M ";
    private static final String PERSONALLOANLAST6MTO12M = "personalLoanLast6Mto12M ";
    private static final String TOTALNOCREDITCARDS = "totalNoCreditCards ";
    private static final String TOTALCREDITLIMIT = "totalCreditLimit ";
    private static final String CREDITLIMITUTILIZATIONPERCENTAGE = "creditLimitUtilizationPercentage ";
    private static final String MOSTRECENTCREDITCARD = "mostRecentCreditCard ";
    private static final String AGEOFFIRSTCREDITCARD = "ageOfFirstCreditCard ";
    private static final String NUMBEREOFPASTDUE = "numbereOfPastDue ";
    private static final String TOTALAMOUNTOFPASTDUE = "totalAmountofPastDue ";
    private static final String CREDITCARDLAST1MTO3M = "creditCardLast1Mto3M ";
    private static final String CREDITCARDLAST3MTO6M = "creditCardLast3Mto6M ";
    private static final String CREDITCARDLAST6MTO12M = "creditCardLast6Mto12M ";
    private static final String NUMBEROFDEFAULTANDLEGALACTION = "numberOfDefaultAndLegalAction ";
    private static final String TOTALAMOUNTOFDEFAULTANDLEGALACTION = "totalAmountofDefaultAndLegalAction ";
    private static final String LASTDATEOFDEFAULTANDLEGALACTION = "lastDateOfDefaultAndLegalAction ";
    private static final String NUMBERLOANSOFDEFAULTANDLEGALACTION = "numberLoansOfDefaultAndLegalAction ";
    private static final String NUMBEROFINQUIRIESINPAST12M = "numberOfInquiriesInPast12M ";
    private static final String FICOSCORE = "ficoScore ";
    private static final String BANKINTERNALSCORE = "bankInternalScore ";
    private static final String TOTALNUMBEROFCARDSBANK = "totalNumberOfCardsBank";
    private static final String TOTALCREDITLIMITBANK = "totalCreditLimitBank ";
    private static final String TYPEOFCREDITCARDBANK = "typeOfCreditCardBank ";
    private static final String DATEOFFIRSTCREDITCARDISSUEDBANK = "dateOfFirstCreditCardIssuedBank";
    private static final String AGEOFFIRSTCREDITCARDINDAYSBANK = "ageOfFirstCreditCardInDaysBank";
    private static final String MOSTRECENTCREDITCARDBANK = "mostRecentCreditCardBank";
    private static final String CREDITCARDLAST1MTO3MExtra = "creditCardLast1Mto3M";
    private static final String CREDITCARDLAST3MTO6MExtra = "creditCardLast3Mto6M";
    private static final String CREDITCARDLAST6MTO12MExtra = "creditCardLast6Mto12M";
    private static final String MOSTUSAGEOFCREDITCARD12MBANK = "mostUsageOfCreditCard12MBank";
    private static final String CURRENTBALANCE = "currentBalance ";
    private static final String AVAILABLECREDITBANK = "availableCreditBank";
    private static final String MINIMUMPAYMENTDUEBANK = "minimumPaymentDueBank";
    private static final String AVERAGEEXPENDITUREPERMONTHBANK = "averageExpenditurePerMonthBank";
    private static final String CREDITLIMITUTILIZATIONBANK = "creditLimitUtilizationBank";
    private static final String DAYSBILLINGCYCLEBANK = "daysBillingCycleBank";
    private static final String ANNUALPERCENTAGERATEAPRBANK = "annualPercentageRateAprBank";
    private static final String AVERAGEANNUALFEEBANK = "averageAnnualFeeBank";
    private static final String BALANCETRANSFERFEEINFORMATIONBANK = "balanceTransferFeeInformationBank";
    private static final String DATEOFLASTTRANSACTIONBANK = "dateOfLastTransactionBank";
    private static final String NUMBEROFTRANSACTIONS12MBANK = "numberOfTransactions12MBank";
    private static final String NUMBEROFTRANSACTIONS6MBANK = "numberOfTransactions6MBank";
    private static final String NUMBEROFTRANSACTIONS3MBANK = "numberOfTransactions3MBank";
    private static final String PERIODOFMAXTRANSACTIONBANK = "periodOfMaxTransactionBank";
    private static final String PASTDUECREDITCARDBANK = "pastDueCreditCardBank";
    private static final String DATEOFPASTDUEBANK = "dateOfPastDueBank";
    private static final String TOTALNUMBEROFLOANSBANK = "totalNumberOfLoansBank";
    private static final String TOTALAMOUNTOFLOANBANK = "totalAmountOfLoanBank";
    private static final String OUTSTANDINGAMOUNTBANK = "outstandingAmountBank";
    private static final String EXPOSURELIMITBANK = "exposureLimitBank";
    private static final String EXPOSUREOFSECUREDLOANBANK = "exposureOfSecuredLoanBank";
    private static final String EXPOSUREEXCEEDSBANK = "exposureExceedsBank";
    private static final String FIRSTACTIVELOANBANK = "firstActiveLoanBank";
    private static final String AGEOFFIRSTLOANBANK = "ageOfFirstLoanBank";
    private static final String TOTALAMOUNTOFLOANSBANK = "totalAmountOfLoansBank";
    private static final String MOSTRECENTLOANBANK = "mostRecentLoanBank";
    private static final String LOANLAST1MTO3MBANK = "loanLast1Mto3MBank";
    private static final String LOANLAST3MTO6MBANK = "loanLast3Mto6MBank";
    private static final String LOANLAST6MTO12MBANK = "loanLast6Mto12MBank";
    private static final String TOTALNUMBEREDUCATIONLOANBANK = "totalNumberEducationLoanBank";
    private static final String TOTALAMOUNTEDUCATIONLOANBANK = "totalAmountEducationLoanBank";
    private static final String MOSTRECENTEDUCATIONLOANBANK = "mostRecentEducationLoanBank";
    private static final String EDUCATIONLOANLAST1MTO3MBANK = "educationLoanLast1Mto3MBank";
    private static final String EDUCATIONLOANLAST3MTO6MBANK = "educationLoanLast3Mto6MBank";
    private static final String EDUCATIONLOANLAST6MTO12MBANK = "educationLoanLast6Mto12MBank";
    private static final String FIRSTEDUCATIONLOANBANK = "firstEducationLoanBank";
    private static final String AGEOFFIRSTEDUCATIONLOANBANK = "ageOfFirstEducationLoanBank";
    private static final String INTERESTONEDUCATIONLOANBANK = "interestOnEducationLoanBank";
    private static final String TOTALNUMBERHOMELOANBANK = "totalNumberHomeLoanBank";
    private static final String TOTALAMOUNTOFHOMELOANBANK = "totalAmountOfHomeLoanBank";
    private static final String MOSTRECENTHOMELOANBANK = "mostRecentHomeLoanBank";
    private static final String HOMELOANLAST1MTO3MBANK = "homeLoanLast1Mto3MBank";
    private static final String HOMELOANLAST3MTO6MBANK = "homeLoanLast3Mto6MBank";
    private static final String HOMELOANLAST6MTO12MBANK = "homeLoanLast6Mto12MBank";
    private static final String FIRSTHOMELOANDATEBANK = "firstHomeLoanDateBank";
    private static final String AGEOFFIRSTHOMELOANBANK = "ageOfFirstHomeLoanBank";
    private static final String NUMBEROFFIXEDRATELOANBANK = "numberOfFixedRateLoanBank";
    private static final String NUMBEROFVARIABLERATELOANBANK = "numberOfVariableRateLoanBank";
    private static final String MAXINTERESTCHARGEDBANK = "maxInterestChargedBank";
    private static final String MININTERESTCHARGEDBANK = "minInterestChargedBank";
    private static final String AVERAGEINTERESTCHARGEDBANK = "averageInterestChargedBank";
    private static final String TOTALNUMBERCARLOANBANK = "totalNumberCarLoanBank";
    private static final String TOTALAMOUNTCARLOANBANK = "totalAmountCarLoanBank";
    private static final String FIRSTCARLOANBANK = "firstCarLoanBank";
    private static final String AGEFIRSTCARLOANBANK = "ageFirstCarLoanBank";
    private static final String MOSTRECENTCARLOANBANK = "mostRecentCarLoanBank";
    private static final String CARLANLAST1MTO3MBANK = "carLanLast1Mto3MBank";
    private static final String CARLOANLAST3MTO6MBANK = "carLoanLast3Mto6MBank";
    private static final String CARLOANLAST6MTO12MBANK = "carLoanLast6Mto12MBank";
    private static final String MAXINTERESTCARLOANBANK = "maxInterestCarLoanBank";
    private static final String MININTERESTCHARGEDCARLOANBANK = "minInterestChargedCarloanBank";
    private static final String AVGINTERESTCHARGEDCARLOANBANK = "avgInterestchargedCarloanBank";
    private static final String TOTALNOPERSONALLOANBANK = "totalNoPersonalLoanBank";
    private static final String TOTALAMTPERSONALLOANBANK = "totalAmtPersonalLoanBank";
    private static final String FIRSTPERSONALLOANBANK = "firstPersonalLoanBank";
    private static final String AGEOFFIRSTPERSONALLOANBANKINDAYS = "ageofFirstPersonalLoanBankInDays";
    private static final String MOSTRECENTPERSONALLOANBANK = "mostRecentPersonalLoanBank";
    private static final String PERSONALLOANLAST1M3MBANK = "personalLoanLast1M3MBank";
    private static final String PERSONALLOANLAST3M6MBANK = "personalLoanLast3M6MBank";
    private static final String PERSONALLOANLAST6M12MBANK = "personalLoanLast6M12MBank";
    private static final String MAXINTERESTCHARGEDPERSONALLOANBANK = "maxInterestChargedPersonalLoanBank";
    private static final String MININTERESTCHARGEDPERSONALLOANBANK = "minInterestChargedPersonalLoanBank";
    private static final String AVGINTERESTCHARGEDPERSONALLOANBANK = "avgInterestChargedPersonalLoanBank";
    private static final String PURPOSEOFPERSONALLOANBANK = "purposeofPersonalLoanBank";
    private static final String NUMBEROFCREDITCARDSPERLOANSLAST1YRBANK = "numberOfCreditCardsPerLoansLast1YrBank";
    private static final String NUMBEROFSAVINGACCOUNTSBANK = "numberOfSavingAccountsBank";
    private static final String FIRSTSAVINGSACCOUNTBANK = "firstSavingsAccountBank";
    private static final String AGEOFFIRSTACCOUNTINDAYSBANK = "ageofFirstAccountInDaysBank";
    private static final String LASTOPENINGDATEACCOUNTBANK = "lastOpeningDateAccountBank";
    private static final String NUMBEROFSAVINGSACCOUNTSINLAST1MTO3MBANK = "numberOfSavingsAccountsInLast1Mto3MBank";
    private static final String NUMBEROFSAVINGSACCOUNTSLAST3MTO6MBANK = "numberOfSavingsAccountsLast3Mto6MBank";
    private static final String NUMBEROFSAVINGSACCOUNTSLAST6MTO12MBANK = "numberOfSavingsAccountsLast6Mto12MBank";
    private static final String CURRENTBALANCESAVINGSBANK = "currentBalanceSavingsBank";
    private static final String CLOSINGBALLASTYRBANK = "closingBalLastyrBank";
    private static final String DATEOFLASTTRANSACTIONBANKExtra = "dateofLastTransactionBank";
    private static final String NOTRANSACTIONS1M3MBANK = "noTransactions1M3MBank";
    private static final String NOTRANSACTIONS3M6MBANK = "noTransactions3M6MBank";
    private static final String NOOFTRANSACTIONS6M12MBANK = "noofTransactions6M12MBank";
    private static final String NOFIXEDDEPOSITSBANK = "noFixedDepositsBank";
    private static final String TOTALAMTFIXEDDEPOSITBANK = "totalAmtFixedDepositBank";
    private static final String NO_FIXEDDEPOSITS_LASTYRBANK = "no_FixedDeposits_LastYrBank";
    private static final String MAXINTEREST_FIXEDDEPOSITBANK = "maxInterest_FixedDepositBank";
    private static final String MININTEREST_FIXEDDEPOSITBANK = "minInterest_FixedDepositBank";
    private static final String AVGINTEREST_FIXEDDEPOSITBANK = "avgInterest_FixedDepositBank";
    private static final String NOOFINSURANCEPOLICIESBANK = "noofInsurancePoliciesBank";
    private static final String TOTALPREMIUMBANK = "totalPremiumBank";
    private static final String TOTALSUMASSUREDBANK = "totalSumAssuredBank";
    private static final String NOTERMINSURANCEBANK = "noTermInsuranceBank";
    private static final String LASTTERMINSURANCEBANK = "lastTermInsuranceBank";
    private static final String TERMINSURANCE1M3MBANK = "termInsurance1M3MBank";
    private static final String TERMINSURANCE3M6MBANK = "termInsurance3M6MBank";
    private static final String TERMINSURANCE6M12MBANK = "termInsurance6M12MBank";
    private static final String TOTALSUMASSUREDTERMINSURANCEPOLICYBANK = "totalSumAssuredTermInsurancePolicyBank";
    private static final String TOTALENDOWMENTPOLICYBANK = "totalEndowmentPolicyBank";
    private static final String TOTALSUMASSUREDENDOWMENTPOLICYBANK = "totalSumAssuredEndowmentPolicyBank";
    private static final String LASTENDOWMENTPOLICYBANK = "lastEndowmentPolicyBank";
    private static final String ENDOWMENTPOLICY1M3MBANK = "endowmentPolicy1M3MBank";
    private static final String ENDOWMENTPOLICY3M6MBANK = "endowmentPolicy3M6MBank";
    private static final String ENDOWMENTPOLICY6M12MBANK = "endowmentPolicy6M12MBank";
    private static final String NOPENSIONPLANBANK = "noPensionPlanBank";
    private static final String TOTALSUMASSUREDPENSIONPLANBANK = "totalSumAssuredPensionPlanBank";
    private static final String LASTPENSIONPLANBANK = "lastPensionPlanBank";
    private static final String PENSIONPLAN1M3MBANK = "pensionPlan1M3MBank";
    private static final String PENSIONPLAN3M6MBANK = "pensionPlan3M6MBank";
    private static final String PENSIONPLAN6M12MBANK = "pensionPlan6M12MBank";
    private static final String NOOFDEMATACCOUNTBANK = "noofDematAccountBank";
    private static final String AVGNOOFTRANSACTION_DEMATBANK = "avgNoofTransaction_DematBank";
    private static final String NOMUTUALFUNDSBANK = "noMutualFundsBank";
    private static final String TOTALAMTMUTUALFUNDBANK = "totalAmtMutualFundBank";
    private static final String NOMUTUALFUNDLASTYRBANK = "noMutualFundLastYrBank";
    private static final String NOLOANSDEFAULTLEGALACTIONBANK="noLoansDefaultLegalActionBank";
    private static final String TOTALAMTDEFAULTLEGALACTIONBANK="totalAmtDefault&LegalActionBank";
    private static final String LASTDATEOFDEFAULTLEGALACTIONBANK="lastDateofDefault&LegalActionBank";
    private static final String AVGNO_VISIT12MBANK = "avgNo_visit12MBank";
    private static final String CHANNELOFTRANSACTIONBANK = "channelofTransactionBank";
    private static final String DATEOFLASTTRANSACTION = "dateofLastTransaction";
    private static final String TOTALNOTRANSACTIONS1M3MBANK = "totalNoTransactions1M3MBank";
    private static final String TOTALNOTRANSACTIONS3M12MBANK = "totalNoTransactions3M12MBank";
    private static final String TOTALNOTRANSACTIONS6M12MBANK = "totalNoTransactions6M12MBank";
    private static final String TOTALNOTRANSACTIONHOTELBOOKINGBANK = "totalNoTransactionHotelBookingBank";
    private static final String TOTALNOTRANSACTIONTRAINTICKETSBANK = "totalNoTransactionTrainTicketsBank";
    private static final String TOTALNOTRANSACTIONFLIGHTTICKETSBANK = "totalNoTransactionFlightTicketsBank";
    private static final String TOTALNOTRANSACTIONTAXIBANK = "totalNoTransactionTaxiBank";
    private static final String TOTALNOBOOKINGTRAVELBANK = "totalNoBookingTravelBank";
    private static final String TOTALNOTRANSACTIONBILLPAYMENTBANK = "totalNoTransactionBillPaymentBank";
    private static final String TOTALNOTRANSACTIONRETAILSHOPPINGBANK = "totalNoTransactionRetailshoppingBank";
    private static final String TOTALNOTRANSACTIONMOVIESBANK = "totalNoTransactionMoviesBank";
    private static final String TOTALNOTRANSACTIONGROCERYSHOPPINGBANK = "totalNoTransactionGroceryShoppingBank";
    private static final String TOTALNOTRANSACTIONFUELBANK = "totalNoTransactionFuelBank";
    private static final String EVERAPPROACHEDFORPROMOTIONBANK = "everApproachedForPromotionBank";
    private static final String PROMOTIONCHANNELBANK = "promotionChannelBank";
    private static final String TYPEOFPRODUCTRECENTLYSOLDBANK = "typeofProductRecentlySoldBank";
    private static final String TOTALNOOFNEWPRODUCTSOLD12MBANK = "totalNoofNewProductsold12MBank";
    private static final String CUSTOMERAPPROACHABLETHROUGHPHONEBANK = "customerApproachableThroughPhoneBank";
    private static final String CUSTOMERAPPROACHABLETHROUGHMAILBANK = "customerApproachableThroughMailBank";
    private static final String NOOFTIMESREPRESENTATIVESENDTOCUSTOMERBANK = "noofTimesRepresentativesendtoCustomerBank";
    private static final String CUSTOMERFEEDBACKBANK = "customerFeedbackBank";
    private static final String CUSTOMERISSUEBANK = "customerIssueBank";
    private static final String LOYALTYSTATUS = "loyaltyStatus";
    private static final String YRSRELATIONSHIPCUSTOMERBANK = "yrsRelationshipCustomerBank";
    private static final String AVGSPENDINGPERYEARBANK = "avgSpendingPerYearBank";
    private static final String FACILITIESGIVENBYBANK = "facilitiesGivenByBank";
    private static final String DATEOFBIRTH = "dateOfBirth";
    private static final String WEDDINGANNIVERSARY = "weddinganniversary";
    private static final String MAXTRANSACTIONCATEGORY = "maxTransactioncategory";


    public static final String[] PROJECTION = {ID, CUSTOMERID, AGE, GENDER, MARITALSTATUS, NUMBERHOUSEHOLDS, NUMBERCHILD, ZIPCODE, RESIDENTIALSTATUS, EDUCATION, OCCUPATION, INDUSTRYTYPE, CURRENTDESIGNATION, TIMEINBUSINESS, CURRENTEMPLOYMENTSTATUS, TYPEOFACCOMMODATION, NUMBEROFOWNHOUSES, USAGEOFHOUSE, NUMBEROFCARS, INCOMEFROMBUSINESSORPROFESSION, OTHERINCOME, ANNUALINCOME, MONTHLYEXPENDITURE, ANNUALEXPENDITURE, ANNUALDISPOSABLEINCOME, MONTHLYAVGDISPOSABLEINCOME, TOTALFAMILYINCOMEANNUAL, TOTALFAMILYEXPENDITUREANNUAL, TOTALDISPOSABLEINCOMEANNUAL, TOTALASSETS, TOTALLIABILITIES, CURRENTAMTOFDEBT, TOTALNUMBEROFLOANS, TOTALAMOUNTOFLOANS, NUMBEROFLOANSWITHOUTSTANDINGBALANCE, OUTSTANDINGBALANCEOFLOAN, MOSTRECENTLOAN, AGEOFOLDESTLOAN, LOANLAST1MTO3M, LOANLAST3MTO6M, LOANLAST6MTO12M, TOTALNUMBEROFEDUCATIONLOAN, TOTALAMOUNTOFEDUCATIONLOAN, MOSTRECENTEDUCATIONLOAN, EDUCATIONLOANLAST1MTO3M, EDUCATIONLOANLAST3MTO6M, EDUCATIONLOANLAST6MTO12M, TOTALNUMBEROFHOMELOAN, TOTALAMOUNTOFHOMELOAN, MOSTRECENTHOMELOAN, HOMELOANLAST1MTO3M, HOMELOANLAST3MTO6M, HOMELOANLAST6MTO12M, TOTALNUMBEROFCARLOAN, TOTALAMOUNTOFCARLOAN, MOSTRECENTCARLOAN, CARLOANLAST1MTO3M, CARLOANLAST3MTO6M, CARLOANLAST6MTO12M, TOTALNUMBEROFPERSONALLOAN, TOTALAMOUNTOFPERSONALLOAN, MOSTRECENTPERSONALLOAN, PERSONALLOANLAST1MTO3M, PERSONALLOANLAST3MTO6M, PERSONALLOANLAST6MTO12M, TOTALNOCREDITCARDS, TOTALCREDITLIMIT, CREDITLIMITUTILIZATIONPERCENTAGE, MOSTRECENTCREDITCARD, AGEOFFIRSTCREDITCARD, NUMBEREOFPASTDUE, TOTALAMOUNTOFPASTDUE, CREDITCARDLAST1MTO3M, CREDITCARDLAST3MTO6M, CREDITCARDLAST6MTO12M, NUMBEROFDEFAULTANDLEGALACTION, TOTALAMOUNTOFDEFAULTANDLEGALACTION, LASTDATEOFDEFAULTANDLEGALACTION, NUMBERLOANSOFDEFAULTANDLEGALACTION, NUMBEROFINQUIRIESINPAST12M, FICOSCORE, BANKINTERNALSCORE, TOTALNUMBEROFCARDSBANK, TOTALCREDITLIMITBANK, TYPEOFCREDITCARDBANK, DATEOFFIRSTCREDITCARDISSUEDBANK, AGEOFFIRSTCREDITCARDINDAYSBANK, MOSTRECENTCREDITCARDBANK, CREDITCARDLAST1MTO3MExtra, CREDITCARDLAST3MTO6MExtra, CREDITCARDLAST6MTO12MExtra, MOSTUSAGEOFCREDITCARD12MBANK, CURRENTBALANCE, AVAILABLECREDITBANK, MINIMUMPAYMENTDUEBANK, AVERAGEEXPENDITUREPERMONTHBANK, CREDITLIMITUTILIZATIONBANK, DAYSBILLINGCYCLEBANK, ANNUALPERCENTAGERATEAPRBANK, AVERAGEANNUALFEEBANK, BALANCETRANSFERFEEINFORMATIONBANK, DATEOFLASTTRANSACTIONBANK, NUMBEROFTRANSACTIONS12MBANK, NUMBEROFTRANSACTIONS6MBANK, NUMBEROFTRANSACTIONS3MBANK, PERIODOFMAXTRANSACTIONBANK, PASTDUECREDITCARDBANK, DATEOFPASTDUEBANK, TOTALNUMBEROFLOANSBANK, TOTALAMOUNTOFLOANBANK, OUTSTANDINGAMOUNTBANK, EXPOSURELIMITBANK, EXPOSUREOFSECUREDLOANBANK, EXPOSUREEXCEEDSBANK, FIRSTACTIVELOANBANK, AGEOFFIRSTLOANBANK, TOTALAMOUNTOFLOANSBANK, MOSTRECENTLOANBANK, LOANLAST1MTO3MBANK, LOANLAST3MTO6MBANK, LOANLAST6MTO12MBANK, TOTALNUMBEREDUCATIONLOANBANK, TOTALAMOUNTEDUCATIONLOANBANK, MOSTRECENTEDUCATIONLOANBANK, EDUCATIONLOANLAST1MTO3MBANK, EDUCATIONLOANLAST3MTO6MBANK, EDUCATIONLOANLAST6MTO12MBANK, FIRSTEDUCATIONLOANBANK, AGEOFFIRSTEDUCATIONLOANBANK, INTERESTONEDUCATIONLOANBANK, TOTALNUMBERHOMELOANBANK, TOTALAMOUNTOFHOMELOANBANK, MOSTRECENTHOMELOANBANK, HOMELOANLAST1MTO3MBANK, HOMELOANLAST3MTO6MBANK, HOMELOANLAST6MTO12MBANK, FIRSTHOMELOANDATEBANK, AGEOFFIRSTHOMELOANBANK, NUMBEROFFIXEDRATELOANBANK, NUMBEROFVARIABLERATELOANBANK, MAXINTERESTCHARGEDBANK, MININTERESTCHARGEDBANK, AVERAGEINTERESTCHARGEDBANK, TOTALNUMBERCARLOANBANK, TOTALAMOUNTCARLOANBANK, FIRSTCARLOANBANK, AGEFIRSTCARLOANBANK, MOSTRECENTCARLOANBANK, CARLANLAST1MTO3MBANK, CARLOANLAST3MTO6MBANK, CARLOANLAST6MTO12MBANK, MAXINTERESTCARLOANBANK, MININTERESTCHARGEDCARLOANBANK, AVGINTERESTCHARGEDCARLOANBANK, TOTALNOPERSONALLOANBANK, TOTALAMTPERSONALLOANBANK, FIRSTPERSONALLOANBANK, AGEOFFIRSTPERSONALLOANBANKINDAYS, MOSTRECENTPERSONALLOANBANK, PERSONALLOANLAST1M3MBANK, PERSONALLOANLAST3M6MBANK, PERSONALLOANLAST6M12MBANK, MAXINTERESTCHARGEDPERSONALLOANBANK, MININTERESTCHARGEDPERSONALLOANBANK, AVGINTERESTCHARGEDPERSONALLOANBANK, PURPOSEOFPERSONALLOANBANK, NUMBEROFCREDITCARDSPERLOANSLAST1YRBANK, NUMBEROFSAVINGACCOUNTSBANK, FIRSTSAVINGSACCOUNTBANK, AGEOFFIRSTACCOUNTINDAYSBANK, LASTOPENINGDATEACCOUNTBANK, NUMBEROFSAVINGSACCOUNTSINLAST1MTO3MBANK, NUMBEROFSAVINGSACCOUNTSLAST3MTO6MBANK, NUMBEROFSAVINGSACCOUNTSLAST6MTO12MBANK, CURRENTBALANCESAVINGSBANK, CLOSINGBALLASTYRBANK, DATEOFLASTTRANSACTIONBANKExtra, NOTRANSACTIONS1M3MBANK, NOTRANSACTIONS3M6MBANK, NOOFTRANSACTIONS6M12MBANK, NOFIXEDDEPOSITSBANK, TOTALAMTFIXEDDEPOSITBANK, NO_FIXEDDEPOSITS_LASTYRBANK, MAXINTEREST_FIXEDDEPOSITBANK, MININTEREST_FIXEDDEPOSITBANK, AVGINTEREST_FIXEDDEPOSITBANK, NOOFINSURANCEPOLICIESBANK, TOTALPREMIUMBANK, TOTALSUMASSUREDBANK, NOTERMINSURANCEBANK, LASTTERMINSURANCEBANK, TERMINSURANCE1M3MBANK, TERMINSURANCE3M6MBANK, TERMINSURANCE6M12MBANK, TOTALSUMASSUREDTERMINSURANCEPOLICYBANK, TOTALENDOWMENTPOLICYBANK, TOTALSUMASSUREDENDOWMENTPOLICYBANK, LASTENDOWMENTPOLICYBANK, ENDOWMENTPOLICY1M3MBANK, ENDOWMENTPOLICY3M6MBANK, ENDOWMENTPOLICY6M12MBANK, NOPENSIONPLANBANK, TOTALSUMASSUREDPENSIONPLANBANK, LASTPENSIONPLANBANK, PENSIONPLAN1M3MBANK, PENSIONPLAN3M6MBANK, PENSIONPLAN6M12MBANK, NOOFDEMATACCOUNTBANK, AVGNOOFTRANSACTION_DEMATBANK, NOMUTUALFUNDSBANK, TOTALAMTMUTUALFUNDBANK, NOMUTUALFUNDLASTYRBANK, NOLOANSDEFAULTLEGALACTIONBANK, TOTALAMTDEFAULTLEGALACTIONBANK, LASTDATEOFDEFAULTLEGALACTIONBANK, AVGNO_VISIT12MBANK, CHANNELOFTRANSACTIONBANK, DATEOFLASTTRANSACTION, TOTALNOTRANSACTIONS1M3MBANK, TOTALNOTRANSACTIONS3M12MBANK, TOTALNOTRANSACTIONS6M12MBANK, TOTALNOTRANSACTIONHOTELBOOKINGBANK, TOTALNOTRANSACTIONTRAINTICKETSBANK, TOTALNOTRANSACTIONFLIGHTTICKETSBANK, TOTALNOTRANSACTIONTAXIBANK, TOTALNOBOOKINGTRAVELBANK, TOTALNOTRANSACTIONBILLPAYMENTBANK, TOTALNOTRANSACTIONRETAILSHOPPINGBANK, TOTALNOTRANSACTIONMOVIESBANK, TOTALNOTRANSACTIONGROCERYSHOPPINGBANK, TOTALNOTRANSACTIONFUELBANK, EVERAPPROACHEDFORPROMOTIONBANK, PROMOTIONCHANNELBANK, TYPEOFPRODUCTRECENTLYSOLDBANK, TOTALNOOFNEWPRODUCTSOLD12MBANK, CUSTOMERAPPROACHABLETHROUGHPHONEBANK, CUSTOMERAPPROACHABLETHROUGHMAILBANK, NOOFTIMESREPRESENTATIVESENDTOCUSTOMERBANK, CUSTOMERFEEDBACKBANK, CUSTOMERISSUEBANK, LOYALTYSTATUS, YRSRELATIONSHIPCUSTOMERBANK, AVGSPENDINGPERYEARBANK, FACILITIESGIVENBYBANK, DATEOFBIRTH, WEDDINGANNIVERSARY, MAXTRANSACTIONCATEGORY};

}

