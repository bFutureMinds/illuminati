package com.hackathon.bfutureminds.model;

/**
 * Created by chand on 11/6/16.
 */
public class CustomerProspect {

    public String id;
    public String customerId;
    public int age;
    boolean loyaltyStatus;
    boolean prospectStatus;

    public boolean eligibilityForPersonalLoan;
    public Integer numberOfPersonalLoansToBeOffered;
    public Double amountOfPersonalLoansToBeOffered;

    public boolean eligibilityForEducationLoan;
    public Double amountOfEducationLoansToBeOffered;

    public boolean eligibilityForHomeLoan;
    public Double amountOfHomeLoansToBeOffered;

    public boolean eligibilityForSavingsAccount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(boolean loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public boolean isProspectStatus() {
        return prospectStatus;
    }

    public void setProspectStatus(boolean prospectStatus) {
        this.prospectStatus = prospectStatus;
    }
}
