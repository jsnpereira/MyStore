package com.mystore.selenium.manager;

import com.mystore.enums.Browser;
import com.mystore.selenium.base.DriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * This class is managing the drivers.
 */
public class DriverManager {
    /**
     * The constructor as initial.
     */
    protected DriverManager() {
    }

    /**
     *driver variable is set the web driver.
     */
    private static WebDriver driver;

    /**
     * @param browser Set the browser name to provider the driver.
     */
    public static void start(final Browser browser) {
        driver = DriverFactory.setup(browser);
    }

    /**
     * @return Get the driver.
     */
    public static WebDriver driver() {
        return driver;
    }

    /**
     * This method is close of the driver when our test finished.
     */
    public static void shutdown() {
        driver.close();
    }

}
