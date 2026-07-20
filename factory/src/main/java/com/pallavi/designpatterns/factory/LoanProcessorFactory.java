package com.pallavi.designpatterns.factory;

public class LoanProcessorFactory {

    public static LoanProcessor getLoanProcessor(LoanType loanType) {
        return switch (loanType) {
            case PERSONAL -> new PersonalLoanProcessor();
            case HOME -> new HomeLoanProcessor();
            case AUTO -> new AutoLoanProcessor();
        };
    }
}
