package com.mystore.selenium.base;

import com.mystore.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;

/**
 * The class is set up the browser will be execute of the tests.
 */
public class DriverFactory {
    /**
     * Get current user path
     */
    private String currentDirectory = System.getProperty("user.dir");

    /**
     * The constructor as initial.
     */
    protected DriverFactory() {
    }

    /**
     * @param browserName Set the browser name
     * @return Get the driver
     */
    public static WebDriver setup(final Browser browserName) {
        switch (browserName) {
            case CHROME:
                return chrome();
            case FIREFOX:
                return firefox();
            default:
                return null;
        }
    }

    /**
     * @return Get the extension from win or linux
     */
    public static String getExtesionValue() {
        String extension = "";
        String operationalSystem = System.getProperty("os.name").toLowerCase();

        if (operationalSystem.indexOf("win") >= 0) {
            extension = ".exe";
        }
        return extension;
    }

    /**
     * @return Get the driver of the Chrome browser
     */
    private static WebDriver chrome() {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("The current working directory is " + currentDirectory);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setCapability(CapabilityType
                .ForSeleniumServer
                .ENSURING_CLEAN_SESSION, true);
        System.setProperty("webdriver "
                + ".chrome.driver", currentDirectory + "/drivers/"
                + "chromedriver" + getExtesionValue());
        return new ChromeDriver(options);
    }

    /**
     * @return Get the driver of the Firefox browser
     */
    private static WebDriver firefox() {
        System.setProperty(
                "webdriver.gecko.driver",
                "geckodriver" + getExtesionValue());
        return new FirefoxDriver();
    }
}
