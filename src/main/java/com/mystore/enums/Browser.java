package com.mystore.enums;

/**
 * This class is set the browser name.
 */
public enum Browser {
    /**
     * Chrome browser.
     */
    CHROME("CHROME"),
    /**
     * Firefox browser.
     */
    FIREFOX("FIREFOX");

    /**
     * this variable is set the browser name value.
     */
    private String name;

    /**
     * @param browserName set the browser name.
     */
    Browser(final String browserName) {
        this.name = browserName;
    }
}
