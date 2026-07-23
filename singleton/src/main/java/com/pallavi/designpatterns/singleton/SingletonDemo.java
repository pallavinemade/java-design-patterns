package com.pallavi.designpatterns.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * Demonstrates the Singleton design pattern implementation.
 *
 * This class showcases two different approaches to implementing the Singleton pattern:
 * <ul>
 *   <li>{@link BankConfigurationManager} - Lazy initialization with synchronized method</li>
 *   <li>{@link ConfigurationManager} - Enum-based Singleton pattern</li>
 * </ul>
 *
 * It verifies that both implementations ensure only a single instance exists
 * regardless of how many times the instance is requested.
 */
@Log4j2
public class SingletonDemo {
    public static void main(String[] args) {
        BankConfigurationManager configurationManager = BankConfigurationManager.getInstance();
        log.info("Bank Configuration Manager instance: {}", configurationManager);
        BankConfigurationManager configurationManager2 = BankConfigurationManager.getInstance();
        log.info("Bank Configuration Manager instance: {}", configurationManager2);
        log.info("Are both Bank Configuration Manager's instances the same? {}", configurationManager == configurationManager2);

        ConfigurationManager configuration = ConfigurationManager.INSTANCE;
        log.info("Configuration Manager instance: {}", configuration);
        ConfigurationManager configuration2 = ConfigurationManager.INSTANCE;
        log.info("Configuration Manager instance: {}", configuration2);
        log.info("Are both Configuration Manager's instances the same? {}", configuration == configuration2);
        configuration2.getConfiguration();
    }
}
