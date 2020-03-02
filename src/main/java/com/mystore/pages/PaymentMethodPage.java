package com.mystore.pages;

import com.mystore.pages.locators.PaymentMethodPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from payment method page.
 */
public class PaymentMethodPage extends HelperBasePage {

    /**
     * confirmMyOrderButton locator.
     */
    private By confirmMyOrderButton = By.xpath(
            PaymentMethodPageLocators.CONFIRM_MY_ORDER_BUTTON_XPATH);
    /**
     * This method is click the confirm my order button.
     */
    public void clickConfirmMyOrder() {
        click(confirmMyOrderButton);
    }
}
