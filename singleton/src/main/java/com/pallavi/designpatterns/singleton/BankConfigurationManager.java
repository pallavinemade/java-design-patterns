package com.pallavi.designpatterns.singleton;

import lombok.extern.log4j.Log4j2;

/**
 * BankConfigurationManager is a thread-safe singleton that manages bank configuration settings.
 *
 * <p>This class implements the singleton pattern using Bill Pugh's approach with a static helper class.
 * This ensures thread-safety without requiring synchronized methods or eager initialization.
 * The singleton instance is created only when the getInstance() method is first called.</p>
 */
@Log4j2
public class BankConfigurationManager {

    /**
     * Private constructor to prevent direct instantiation.
     * Called only once when the singleton instance is created.
     */
    private BankConfigurationManager() {
        log.info("BankConfigurationManager instance created.");
    }

    /**
     * Static helper class that holds the singleton instance.
     *
     * <p>This inner class is loaded only when getInstance() is first invoked,
     * ensuring lazy initialization and thread-safety through class loader synchronization.</p>
     */
    public static class SingletonHelper {
        private static final BankConfigurationManager INSTANCE = new BankConfigurationManager();
    }

    /**
     * Returns the singleton instance of BankConfigurationManager.
     *
     * <p>This method is thread-safe and uses lazy initialization.</p>
     *
     * @return the singleton instance of BankConfigurationManager
     */
    public static BankConfigurationManager getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
