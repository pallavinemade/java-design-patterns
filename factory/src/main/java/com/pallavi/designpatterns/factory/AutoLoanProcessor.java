package com.pallavi.designpatterns.factory;

public class AutoLoanProcessor implements LoanProcessor {
    @Override
    public String processLoan() {
        return "Processing auto loan";
    }
}
