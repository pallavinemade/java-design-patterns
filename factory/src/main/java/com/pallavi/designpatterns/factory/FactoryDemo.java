package com.pallavi.designpatterns.factory;

import lombok.extern.log4j.Log4j2;

/**
 * Demonstrates usage of the Simple Factory and Factory Method patterns in this package.
 * <p>
 * The demo obtains different {@link LoanProcessor} implementations from
 * {@link LoanProcessorFactory} and processes sample loans using Simple Factory method. It also shows
 * creation of different {@link Message} implementations using
 * {@link MessageCreator} implementations (JSON and XML) using Factory Method.
 * </p>
 *
 * <p>Run this class to see example outputs for personal, home and auto loans
 * and for JSON/XML messages written to the configured logger.</p>
 *
 */
@Log4j2
public class FactoryDemo {

    /**
     * Application entry point for the factory demo.
     *
     * @param args runtime arguments (ignored)
     */
    public static void main(String[] args) {
        LoanProcessor loanProcessor = LoanProcessorFactory.getLoanProcessor(LoanType.PERSONAL);
        log.info(loanProcessor.processLoan());
        loanProcessor = LoanProcessorFactory.getLoanProcessor(LoanType.HOME);
        log.info(loanProcessor.processLoan());
        loanProcessor = LoanProcessorFactory.getLoanProcessor(LoanType.AUTO);
        log.info(loanProcessor.processLoan());

        MessageCreator messageCreator = new JsonMessageCreator();
        Message jsonMessage = messageCreator.createMessage();
        log.info(jsonMessage.getContent());
        messageCreator = new XmlMessageCreator();
        Message xmlMessage = messageCreator.createMessage();
        log.info(xmlMessage.getContent());

    }
}
