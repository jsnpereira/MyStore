package com.mystore.pages.locators;

/**
 *This class is set the locator's variable are
 *located on page.
 */
public class ShippingPageLocators {
    /**
     * The constructor as initial.
     */
    protected ShippingPageLocators() {
    }

    /**
     * CHECK_TERMS_XPATH is locate of the check terms field.
     */
    public static final String CHECK_TERMS_XPATH =
            ".//div[@id='uniform-cgv']//input";
    /**
     * PROCEED_CHECKOUT_BUTTON_NAME is locate of
     * the proceed checkout button name.
     */
    public static final String PROCEED_CHECKOUT_BUTTON_NAME =
            "processCarrier";
}
