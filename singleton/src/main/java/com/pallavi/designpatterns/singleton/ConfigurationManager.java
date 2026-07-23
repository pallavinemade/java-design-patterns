package com.pallavi.designpatterns.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * ConfigurationManager is a thread-safe singleton implementation using an enum.
 * This class manages application configuration settings and ensures only one instance
 * exists throughout the application lifecycle.
 *
 * <p>Using an enum for singleton implementation provides built-in serialization
 * and reflection protection, making it one of the most robust singleton patterns in Java.</p>
 *
 */
public enum ConfigurationManager {
    /**
     * The single instance of ConfigurationManager.
     * Guaranteed to be thread-safe and instantiated exactly once.
     */
    INSTANCE;

    private static final Logger log = LogManager.getLogger(ConfigurationManager.class);

    /**
     * Retrieves the configuration settings.
     * This method provides access to the application's configuration properties.
     */
    public void getConfiguration(){
        log.info("Retrieving configuration settings...");
        // Implementation to retrieve configuration settings goes here
    }
}
