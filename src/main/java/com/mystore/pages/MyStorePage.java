package com.mystore.pages;

import com.mystore.enums.LocatorType;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.pages.locators.MyStorePageLocators;
import com.mystore.selenium.base.Locator;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the
 * locator from my store page.
 */
public class MyStorePage extends HelperBasePage {

    /**
     * checkoutButton locator.
     */
    private By checkoutButton = By.xpath(
            MyStorePageLocators.CHECKOUT_BUTTON_POPUP);
    /**
     * checkoutProduct locator.
     */
    private By checkoutProduct = By.id(MyStorePageLocators.CHECKOUT_PRODUCT);

    /**
     * @param productName Set the product name will be see it on page.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void seeProduct(final String productName)
            throws NotSelectLocatorType {
        scrollToViewElement(Locator.getBy(MyStorePageLocators
                .PRODUCT_ITEM_BY_PRODUCT_NAME
                .replace("{XXX}", productName), LocatorType.XPATH));
        moveToElement(MyStorePageLocators.PRODUCT_ITEM_BY_PRODUCT_NAME
                .replace("{XXX}", productName), LocatorType.XPATH);
    }

    /**
     * @param productName Set the product name will add cart.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void addCartByProduct(final String productName)
            throws NotSelectLocatorType {
        waitElementBeClicked(Locator.getBy(
                MyStorePageLocators.ADD_CART_BY_PRODUCT_ITEM
                .replace("{XXX}", productName), LocatorType.XPATH));
        click(Locator.getBy(MyStorePageLocators.ADD_CART_BY_PRODUCT_ITEM
                .replace("{XXX}", productName), LocatorType.XPATH));
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void seePopUpOpen() throws NotSelectLocatorType {
        waitElementIsVisible(checkoutProduct);
    }

    /**
     * This method is click the checkout button on pop up.
     *
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void clickCheckOutPopUp() throws NotSelectLocatorType {
        waitElementBeClicked(checkoutButton);
        click(checkoutButton);
    }
}
