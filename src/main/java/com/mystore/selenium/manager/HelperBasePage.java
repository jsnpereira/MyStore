package com.mystore.selenium.manager;

import com.mystore.commons.DataValueConstants;
import com.mystore.enums.LocatorType;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.selenium.base.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * This class is managing the elements for all pages.
 */
public class HelperBasePage {
    /**
     * This variable should be log on console.
     */
    private final Logger logger = (Logger)
            LogManager.getLogger(this.getClass());

    /**
     * @param url set value to navigate the URL.
     */
    public void navigationTo(final String url) {
        logger.info("URL: " + url);
        DriverManager.driver().get(url);
        loading();
    }

    /**
     * This method is waiting until the page is completed load.
     */
    protected void loading() {
        ExpectedCondition<Boolean> pageLoadCondition
                = new ExpectedCondition<Boolean>() {
            public Boolean apply(final WebDriver driver) {
                String status = ((JavascriptExecutor) driver)
                        .executeScript("return document"
                                + ".readyState").toString();
                logger.info("ReadyState: " + status);
                return ((JavascriptExecutor) driver)
                        .executeScript(
                                "return document"
                                        + ".readyState")
                        .equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(), DataValueConstants.THIRTY);
        wait.until(pageLoadCondition);
    }

    /**
     * @param locator Set the locator value.
     */
    protected void click(final By locator) {
        waitElementIslocated(locator);
        getElement(locator).click();
    }

    /**
     * @param locator     Set the locator value.
     * @param locatorType Set the locator type value.
     * @return Get the element
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected WebElement getElement(final String locator,
                                    final LocatorType locatorType)
            throws NotSelectLocatorType {
        return getElement(Locator.getBy(locator, locatorType));
    }

    /**
     * @param locator set the locator
     * @return get element value
     */
    protected WebElement getElement(final By locator) {
        return DriverManager.driver().findElement(locator);
    }


    /**
     * @param locator Set the locator value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void waitElementIslocated(final By locator) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(), DataValueConstants.THIRTY);
        final WebElement until = wait.until(ExpectedConditions.
                presenceOfElementLocated(locator));
    }

    /**
     * @param locator Set the locator value.
     */
    protected void waitElementBeClicked(final By locator) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(), DataValueConstants.THIRTY);
        final WebElement until = wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * @param element set the webelement instance.
     */
    protected void waitElementBeClicked(final WebElement element) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(), DataValueConstants.THIRTY);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * @param locator     Set the locator value.
     * @param locatorType Set the locator type value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void moveToElement(final String locator,
                                 final LocatorType locatorType)
            throws NotSelectLocatorType {
        moveToElement(getElement(locator, locatorType));
    }

    /**
     * @param element Set the element value.
     */
    protected void moveToElement(final WebElement element) {
        Actions action = new Actions(DriverManager.driver());
        action.moveToElement(element).build().perform();
    }

    /**
     * @param locator Set the locator value.
     */
    protected void scrollToViewElement(final By locator) {
        ((JavascriptExecutor) DriverManager.driver()).
                executeScript("arguments[0].scrollIntoView(true);",
                        getElement(locator));
    }

    /**
     * @param locator Set the locator value.
     * @return Get the value on page's label.
     */
    protected String getTextLabel(final By locator) {
        return getElement(locator).getText();
    }

    /**
     * @param locator Set the locator value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void waitElementIsVisible(final By locator) {
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(), DataValueConstants.THIRTY);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * @param value   Set the text will be fill on input.
     * @param locator Set the locator value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void typeTextInBox(final String value, final By locator) {
        typeTextInBox(value, locator, false);
    }

    /**
     * @param value   Set the text will be fill on input.
     * @param locator Set the locator value.
     * @param clear   Set the value when the input should be clean or no.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void typeTextInBox(final String value, final By locator,
                                 final Boolean clear) {
        logger.info("Type: " + value);
        WebElement element = getElement(locator);

        if (clear) {
            element.clear();
        }
        element.sendKeys(value);
    }

    /**
     * @param url Set the value will be contains url is redirect.
     */
    public void redirectTo(final String url) {
        logger.info("Redirect to: " + url);
        WebDriverWait wait = new WebDriverWait(
                DriverManager.driver(),
                DataValueConstants.THIRTY);
        wait.until(ExpectedConditions.urlContains(url));
        loading();
    }

    /**
     * @param value   Set the value will be select on dropdown.
     * @param locator Set the locator value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void selectItemOnDropDown(final String value,
                                        final By locator) {
        logger.info("Select value[" + value
                + "] => locator: " + locator.toString());
        WebElement mySelectElement = getElement(locator);
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByValue(value);
    }

    /**
     * @param value   Set the text value should be select it dropdown.
     * @param locator Set the locator value.
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    protected void selectItemVisibleOnDropDown(final String value,
                                               final By locator) {
        logger.info("Select value[" + value
                + "] => locator: " + locator.toString());
        WebElement mySelectElement = getElement(locator);
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByVisibleText(value);
    }
}
