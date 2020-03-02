package com.mystore.pages;

import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.pages.locators.OrderConfirmationPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 *This class is managing the elements of
 *  the locator from order confirmation page.
 */
public class OrderConfirmationPage extends HelperBasePage {

    /**
     * titleLabel locator.
     */
    private By titleLabel = By.className(
            OrderConfirmationPageLocators.TITLE_LABEL);
    /**
     * priceValue locator.
     */
    private By priceValue = By.xpath(
            OrderConfirmationPageLocators.PRICE_VALUE);

    /**
     * @return Get the order is complete message.
     * @throws NotSelectLocatorType throw the exception
     * if it not defined locator type.
     */
    public String getOrderIsCompleteMessage()
            throws NotSelectLocatorType {
        return getTextLabel(titleLabel);
    }

    /**
     * @return Get the price label on page.
     * @throws NotSelectLocatorType throw the exception if
     * it not defined locator type.
     */
    public String getPriceValueOnLabel() throws NotSelectLocatorType {
        return getTextLabel(priceValue);
    }
}
