package org.nelioalves.taxexample.service;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
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
