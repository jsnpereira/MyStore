package com.mystore.pages;

import com.mystore.pages.locators.AddressOrderPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from address orders page.
 */
public class AddressOrdersPage extends HelperBasePage {
    /**
     * nameValueByDeliveryAddress locator.
     */
    private By nameValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.NAME_VALUE_XPATH);
    /**
     * companyValueByDeliveryAddress locator.
     */
    private By companyValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.COMPANY_VALUE_XPATH);
    /**
     * addressValueByDeliveryAddress locator.
     */
    private By addressValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.ADDRESS_VALUE_XPATH);
    /**
     * cityAndStateByDeliveryAddress locator.
     */
    private By cityAndStateByDeliveryAddress = By.xpath(
            AddressOrderPageLocators
            .DeliveryAddress.CITY_AND_STATE_VALUE_XPATH);
    /**
     * countryValueByDeliveryAddress locator.
     */
    private By countryValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.COUNTRY_VALUE_XPATH);
    /**
     * phoneValueByDeliveryAddress locator.
     */
    private By phoneValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.PHONE_VALUE_XPATH);
    /**
     * phoneMobileValueByDeliveryAddress locator.
     */
    private By phoneMobileValueByDeliveryAddress = By.xpath(
            AddressOrderPageLocators.DeliveryAddress.PHONE_MOBILE_VALUE_XPATH);
    /**
     * nameValueByBillingAddress locator.
     */
    private By nameValueByBillingAddress = By.xpath(
            AddressOrderPageLocators.BillingAddress.NAME_VALUE_XPATH);
    /**
     * companyValueByBillingAddress locator.
     */
    private By companyValueByBillingAddress = By.xpath(
            AddressOrderPageLocators.BillingAddress.COMPANY_VALUE_XPATH);
    /**
     * addressValueByBillingAddress locator.
     */
    private By addressValueByBillingAddress = By.xpath(
            AddressOrderPageLocators.BillingAddress.ADDRESS_VALUE_XPATH);
    /**
     * cityAndStateByBillingAddress locator.
     */
    private By cityAndStateByBillingAddress = By.xpath(
            AddressOrderPageLocators
            .BillingAddress.CITY_AND_STATE_VALUE_XPATH);
    /**
     * countryValueByBillingAddress locator.
     */
    private By countryValueByBillingAddress = By.xpath(AddressOrderPageLocators
            .BillingAddress.COUNTRY_VALUE_XPATH);
    /**
     * phoneValueByBillingAddress locator.
     */
    private By phoneValueByBillingAddress = By.xpath(
            AddressOrderPageLocators.BillingAddress.PHONE_VALUE_XPATH);
    /**
     * phoneMobileByBillingAddress locator.
     */
    private By phoneMobileByBillingAddress = By.xpath(
            AddressOrderPageLocators.BillingAddress.PHONE_MOBILE_VALUE_XPATH);
    /**
     * proceedCheckoutButton locator.
     */
    private By proceedCheckoutButton = By.name(
            AddressOrderPageLocators.PROCEED_CHECKOUT_BUTTON_NAME);


    /**
     * @return Get the name value from delivery address section.
     */
    public String getNameFromDeliveryAddress() {
        return getTextLabel(nameValueByDeliveryAddress);
    }

    /**
     * @return Get the company value from delivery
     * address section.
      */
    public String getCompanyFromDeliveryAddress() {
        return getTextLabel(companyValueByDeliveryAddress);
    }

    /**
     * @return Get the address value from delivery
     * address section.
     */
    public String getAddressFromDeliveryAddress() {
        return getTextLabel(addressValueByDeliveryAddress);
    }

    /**
     * @return Get the city value from delivery address section.
     */
    public String getCityAndStateFromDeliveryAddress() {
        return getTextLabel(cityAndStateByDeliveryAddress);
    }

    /**
     * @return Get the country value from
     * delivery address section.
     */
    public String getCountryFromDeliveryAddress() {
        return getTextLabel(countryValueByDeliveryAddress);
    }

    /**
     * @return Get the phone number value from delivery address section.
     */
    public String getPhoneFromDeliveryAddress() {
        return getTextLabel(phoneValueByDeliveryAddress);
    }

    /**
     * @return Get the phone mobile number value from delivery address section.
     */
    public String getPhoneMobileFromDeliveryAddress() {
        return getTextLabel(phoneMobileValueByDeliveryAddress);
    }

    /**
     * @return Get the name value from billing address section.
     */


    public String getNameFromBillingAddress() {
        return getTextLabel(nameValueByBillingAddress);
    }

    /**
     * @return Get the company value from billing address section.
     */
    public String getCompanyFromBillingAddress() {
        return getTextLabel(companyValueByBillingAddress);
    }

    /**
     * @return Get the address value from billing address section.
      */
    public String getAddressFromBillingAddress() {
        return getTextLabel(addressValueByBillingAddress);
    }

    /**
     * @return Get the city value from billing address section.
     */
    public String getCityAndStateFromBillingAddress() {
        return getTextLabel(cityAndStateByBillingAddress);
    }

    /**
     * @return Get the country value from billing address section.
     */
    public String getCountryFromBillingAddress() {
        return getTextLabel(countryValueByBillingAddress);
    }

    /**
     * @return Get the phone number value from billing address section.
     */
    public String getPhoneFromBillingyAddress() {
        return getTextLabel(phoneValueByBillingAddress);
    }

    /**
     * @return Get the phone mobile number value from billing address section.
     */
    public String getPhoneMobileFromBillingAddress() {
        return getTextLabel(phoneMobileByBillingAddress);
    }

    /**
     * This method is click the proceed checkout button.
     */
    public void clickProccedCheckoutButton() {
        scrollToViewElement(proceedCheckoutButton);
        click(proceedCheckoutButton);
    }
}
