package com.mystore.pages;

import com.mystore.model.User;
import com.mystore.pages.locators.AuthenticationPageLocators;
import com.mystore.selenium.manager.HelperBasePage;
import org.openqa.selenium.By;

/**
 * This class is managing the elements of the locator from authentication page.
 */
public class AuthenticationPage extends HelperBasePage {

    /**
     * emailInput locator.
     */
    private By emailInput = By.id(AuthenticationPageLocators.EMAIL_INPUT);
    /**
     * createAccountButton locator.
     */
    private By createAccountButton = By.id(
            AuthenticationPageLocators.CREATE_ACCOUNT_BUTTON);

    /**
     * @param user Set the user value.
     */
    public void inputEmailField(final User user) {
        typeTextInBox(user.getEmail(), emailInput);
    }

    /**
     * clickCreateAccountbutton method.
     */
    public void clickCreateAccountButton() {
        waitElementBeClicked(createAccountButton);
        click(createAccountButton);
    }
}
