package com.pallavi.designpatterns.factory;

public class HomeLoanProcessor implements LoanProcessor {
    @Override
    public String processLoan() {
        return "Processing home loan";
    }
}
