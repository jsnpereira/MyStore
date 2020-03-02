package com.mystore.pages.locators;

/**
 *  This class is set the locator's variable are located on page.
 */
public class OrderListPageLocators {

    /**
     * The constructor as initial.
     */
    protected OrderListPageLocators() {
    }

    /**
     * PRODUCT_NAME_ITEM_XPATH is locate of the product name.
     */
    public static final String PRODUCT_NAME_ITEM_XPATH =
            "(.//td[@class='cart_description'])[XXX]/"
                    + "p[@class='product-name']/a";
    /**
     *CHECKOUT_BUTTON_XPATH is locate of the checkout button.
     */
    public static final String CHECKOUT_BUTTON_XPATH =
            ".//a[contains(@class,'standard-checkout')]";


}
