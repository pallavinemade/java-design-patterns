package com.pallavi.designpatterns.factory;

public class PersonalLoanProcessor implements LoanProcessor {
    @Override
    public String processLoan() {
        return "Processing personal loan";
    }
}
