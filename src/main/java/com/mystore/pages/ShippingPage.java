package com.mystore.pages;

import com.mystore.pages.locators.ShippingPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from shipping page.
 */
public class ShippingPage extends HelperBasePage {

    /**
     * checkTerms locator.
     */
    private By checkTerms = By.xpath(
            ShippingPageLocators.CHECK_TERMS_XPATH);
    /**
     * proceedCheckoutButton locator.
     */
    private By proceedCheckoutButton = By.name(
            ShippingPageLocators.PROCEED_CHECKOUT_BUTTON_NAME);
    /**
     * This method is click the check terms.
     */
    public void clickCheckTerms() {
        click(checkTerms);
    }

    /**
     * This method is click the proceed checkout button.
     */
    public void clickProceedCheckoutButton() {
        scrollToViewElement(proceedCheckoutButton);
        click(proceedCheckoutButton);
    }
}
