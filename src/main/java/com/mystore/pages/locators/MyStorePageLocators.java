package com.mystore.pages.locators;

/**
 *  This class is set the locator's variable are located on page.
 */
public class MyStorePageLocators {
    /**
     * The constructor as initial.
     */
    protected MyStorePageLocators() {
    }

    /**
     * PRODUCT_ITEM_BY_PRODUCT_NAME_XPATH is locate of the product item name.
     */
    public static final String PRODUCT_ITEM_BY_PRODUCT_NAME =
            ".//ul[@id='homefeatured']//a[contains(text(),'{XXX}')]";
    /**
     * ADD_CART_BY_PRODUCT_ITEM_XPATH is locate of
     * the add cart button for product item.
     */
    public static final String ADD_CART_BY_PRODUCT_ITEM =
            ".//ul[@id='homefeatured']//a[contains(text(),'{XXX}')]"
                    + "/../following-sibling::div"
                    + "[@class='button-container']/a[1]";
    /**
     * CHECKOUT_PRODUCT_ID is locate of the checkout product button.
     */
    public static final String CHECKOUT_PRODUCT = "layer_cart";
    /**
     * TITLE_PRODUCT_POPUP_XPATH is locate of
     * the product title name.
     */
    public static final String TITLE_PRODUCT_POPUP =
            ".//*[@id='layer_cart_product_title']";
    /**
     * CHECKOUT_BUTTON_POPUP_XPATH is locate
     * of the checkout button on pop up.
     */
    public static final String CHECKOUT_BUTTON_POPUP =
            ".//div[@id='layer_cart']//div[@class='button-container']/a";
}
