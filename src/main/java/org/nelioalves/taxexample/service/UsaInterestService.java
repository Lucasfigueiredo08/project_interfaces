package org.nelioalves.taxexample.service;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {

    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setInterestRate(Double amount){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
