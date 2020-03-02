package com.mystore.pages;

import com.mystore.pages.locators.PaymentPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from payment page.
 */
public class PaymentPage extends HelperBasePage {
    /**
     * totalPriceValue.
     */
    private By totalPriceValue = By.xpath(
            PaymentPageLocators.TOTAL_PRICE_VALUE_XPATH);
    /**
     * selectBankCard locator.
     */
    private By selectBankCard = By.className(
            PaymentPageLocators.SELECT_BANK_CARD_CLASS);

    /**
     * @return Get the total value.
     */
    public String totalValue() {
        return getTextLabel(totalPriceValue);
    }

    /**
     * The method is click the bank card.
     */
    public void clickBankCard() {
        scrollToViewElement(selectBankCard);
        click(selectBankCard);
    }
}
