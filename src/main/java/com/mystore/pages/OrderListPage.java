package com.mystore.pages;

import com.mystore.enums.LocatorType;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.pages.locators.OrderListPageLocators;
import com.mystore.selenium.base.Locator;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from order list page.
 */
public class OrderListPage extends HelperBasePage {

    /**
     * checkoutButton locator.
     */
    private By checkoutButton = By.xpath(
            OrderListPageLocators.CHECKOUT_BUTTON_XPATH);
    /**
     * @param itemNumber Set the number for item from product name.
     * @return Get the product title.
     * @throws NotSelectLocatorType throw the exception if
     * it not defined locator type.
     */
    public String getProductTitleItem(final int itemNumber)
            throws NotSelectLocatorType {
        return getTextLabel(Locator.getBy(OrderListPageLocators
                .PRODUCT_NAME_ITEM_XPATH.replace("XXX",
                        String.valueOf(itemNumber)), LocatorType.XPATH));
    }

    /**
     * This method is click the checkout button.
     * @throws NotSelectLocatorType throw the exception if
     * it not defined locator type.
     */
    public void clickCheckout() throws NotSelectLocatorType {
        click(checkoutButton);
    }
}
