package com.mystore.pages;

import com.mystore.enums.Gender;
import com.mystore.exceptions.NotSelectGender;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.model.Address;
import com.mystore.model.User;
import com.mystore.pages.locators.CreateAccountPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * This class is managing the elements of the locator from create account page.
 */
public class CreateAccountPage extends HelperBasePage {

    /**
     * mrRadio locator.
     */
    private By mrRadio = By.id(CreateAccountPageLocators.MR_RADIO_ID);
    /**
     * mrsRadio locator.
     */
    private By mrsRadio = By.id(CreateAccountPageLocators.MRS_RADIO_ID);
    /**
     * firstNameField locator.
     */
    private By firstNameField = By.id(
            CreateAccountPageLocators.FIRST_NAME_FIELD_ID);
    /**
     * lastNameField locator.
     */
    private By lastNameField = By.id(
            CreateAccountPageLocators.LAST_NAME_FIELD_ID);
    /**
     * passwordField locator.
     */
    private By passwordField = By.id(
            CreateAccountPageLocators.PASSWORD_FIELD_ID);
    /**
     * addressLine1AddressField locator.
     */
    private By addressLine1AddressField = By.id(
            CreateAccountPageLocators.ADDRESS_LINE1_ADDRESS_FIELD_ID);
    /**
     * addressLine2AddressField locator.
     */
    private By addressLine2AddressField = By.id(
            CreateAccountPageLocators.ADDRESS_LINE2_ADDRESS_FIELD_ID);
    /**
     * companyAddressField locator.
     */
    private By companyAddressField = By.id(
            CreateAccountPageLocators.COMPANY_ADDRESS_FIELD_ID);
    /**
     * cityAddressField locator.
     */
    private By cityAddressField = By.id(
            CreateAccountPageLocators.CITY_ADDRESS_FIELD_ID);
    /**
     * postCodeField locator.
     */
    private By postCodeField = By.id(
            CreateAccountPageLocators.POSTCODE_FIELD_ID);
    /**
     * phoneField locator.
     */
    private By phoneField = By.id(
            CreateAccountPageLocators.PHONE_FIELD_ID);
    /**
     * phoneMobileField locator.
     */
    private By phoneMobileField = By.id(
            CreateAccountPageLocators.PHONE_MOBILE_FIELD_ID);
    /**
     * otherField locator.
     */
    private By otherField = By.id(
            CreateAccountPageLocators.OTHER_FIELD_ID);
    /**
     * addressAliasField locator.
     */
    private By addressAliasField = By.id(
            CreateAccountPageLocators.ADDRESS_ALIAS_FIELD_ID);
    /**
     * submitAccountButton locator.
     */
    private By submitAccountButton = By.id(
            CreateAccountPageLocators.SUBMIT_ACCOUNT_BUTTON_ID);
    /**
     * dayOfBirthdayDropdown locator.
     */
    private By dayOfBirthdayDropdown = By.id(
            CreateAccountPageLocators.DAY_OF_BIRTHDAY_DROPDOWN_ID);
    /**
     * monthOfBirthdayDropdown locator.
     */
    private By monthOfBirthdayDropdown = By.id(
            CreateAccountPageLocators.MONTH_OF_BIRTHDAY_DROPDOWN_ID);
    /**
     * yearOfBirthdayDropdown locator.
     */
    private By yearOfBirthdayDropdown = By.id(
            CreateAccountPageLocators.YEARS_OF_BIRTHDAY_DROPDOWN_ID);
    /**
     * countriesListDropdown locator.
     */
    private By countriesListDropdown = By.xpath(
            CreateAccountPageLocators.COUNTRIES_LIST_DROPDOWN_XPATH);
    /**
     * countrySelectorField locator.
     */
    private By countrySelectorField = By.xpath(
            CreateAccountPageLocators.COUNTRY_SELECTOR_FIELD_XPATH);
    /**
     * statesDropdownSelect locator.
     */
    private By statesDropdownSelect = By.xpath(
            CreateAccountPageLocators.STATES_DROPDOWN_SELECT_XPATH);


    /**
     * @param gender Set the gender value.
     * @throws NotSelectGender throw the exception if it not defined gender.
     */
    public void selectGender(final Gender gender)
            throws NotSelectGender {
        switch (gender) {
            case MR:
                click(mrRadio);
                break;
            case MRS:
                click(mrsRadio);
                break;
            default:
                throw new NotSelectGender("Test not select the gender item");
        }

    }

    /**
     * @param user Set the user value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterFirstName(final User user) throws NotSelectLocatorType {
        typeTextInBox(user.getFirstName(), firstNameField);
    }

    /**
     * @param user Set the user value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterLastName(final User user) throws NotSelectLocatorType {
        typeTextInBox(user.getLastName(), lastNameField);
    }

    /**
     * @param user Set the user value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterPassword(final User user) throws NotSelectLocatorType {
        typeTextInBox(user.getPassword(), passwordField);
    }

    /**
     * @param address Set the address value Set the
     *                address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterAddressLine1(final Address address)
            throws NotSelectLocatorType {
        typeTextInBox(address.getAddressLine1(), addressLine1AddressField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterAddressLine2(final Address address)
            throws NotSelectLocatorType {
        typeTextInBox(address.getAddressLine2(), addressLine2AddressField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterCompany(final Address address)
            throws NotSelectLocatorType {
        typeTextInBox(address.getCompany(), companyAddressField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterCity(final Address address) throws NotSelectLocatorType {
        typeTextInBox(address.getCity(), cityAddressField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterPostalCode(final Address address)
            throws NotSelectLocatorType {
        typeTextInBox(address.getPostalCode(), postCodeField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterPhone(final Address address) throws NotSelectLocatorType {
        typeTextInBox(address.getHomePhone(), phoneField);
    }

    /**
     * @param address Set the address value.
     */
    public void enterMobilePhone(final Address address) {
        typeTextInBox(address.getMobilePhone(), phoneMobileField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterAdditionalInformation(final Address address) {
        typeTextInBox(address.getAdditionalInformation(), otherField);
    }

    /**
     * @param address Set the address value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void enterAddressAlias(final Address address)
            throws NotSelectLocatorType {
        typeTextInBox(address.getAddressAlias(), addressAliasField);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void clickRegisterButton() throws NotSelectLocatorType {
        click(submitAccountButton);
    }

    /**
     * @param user Set the user value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    public void selectDateOfBirth(final User user) throws NotSelectLocatorType {
        LocalDate dateBirth = user.getDateBirth().toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate();
        selectItemOnDropDown(String
                .valueOf(dateBirth.getDayOfMonth()), dayOfBirthdayDropdown);
        selectItemOnDropDown(String
                .valueOf(dateBirth.getMonthValue()), monthOfBirthdayDropdown);
        selectItemOnDropDown(String
                .valueOf(dateBirth.getYear()), yearOfBirthdayDropdown);
    }

    /**
     * @param address Set the address value Set the address
     *                value Set the address value.
     * @throws NotSelectLocatorType throw the exception if
     *                              it not defined locator type.
     */
    public void selectCountry(final Address address)
            throws NotSelectLocatorType {
        waitElementIsVisible(countriesListDropdown);
        WebElement element = getElement(countrySelectorField);
        if (!element.getText().equals(address.getCountry())) {
            selectItemVisibleOnDropDown(address.getCountry(),
                    countriesListDropdown);
        }
    }

    /**
     * @param address Set the address value Set the address
     *                value Set the address value.
     * @throws NotSelectLocatorType throw the exception if it not
     *                              defined locator type.
     */
    public void selectState(final Address address) throws NotSelectLocatorType {
        scrollToViewElement(statesDropdownSelect);
        selectItemVisibleOnDropDown(address.getState(), statesDropdownSelect);
    }
}
