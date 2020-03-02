import com.mystore.commons.DataValueConstants;
import com.mystore.commons.PathUrls;
import com.mystore.commons.labels.OrderConfirmationLabels;
import com.mystore.enums.Gender;
import com.mystore.exceptions.NotSelectGender;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.model.Address;
import com.mystore.model.User;

import com.mystore.pages.OrderConfirmationPage;
import com.mystore.pages.PaymentPage;
import com.mystore.pages.ShippingPage;
import com.mystore.pages.AddressOrdersPage;
import com.mystore.pages.AuthenticationPage;
import com.mystore.pages.MyStorePage;
import com.mystore.pages.OrderListPage;
import com.mystore.pages.CreateAccountPage;
import com.mystore.pages.PaymentMethodPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This class is tests for my store.
 */
public class TestMyStore extends TestBase {
    /**
     * This variable will be select an product on my store page.
     */
    private static final String PRODUCT_SHORT_SLEEVE_TSHIRTS =
            "Faded Short Sleeve T-shirts";
    /**
     * MyStorePage class.
     */
    private MyStorePage myStorePage;
    /**
     * OrderListPage class.
     */
    private OrderListPage orderListPage;
    /**
     * AuthenticationPage class.
     */
    private AuthenticationPage authenticationPage;
    /**
     * CreateAccountPage class.
     */
    private CreateAccountPage createAccountPage;
    /**
     * AddressOrdersPage class.
     */
    private AddressOrdersPage addressOrdersPage;
    /**
     * ShippingPage class.
     */
    private ShippingPage shippingPage;
    /**
     * PaymentPage class.
     */
    private PaymentPage paymentPage;
    /**
     * PaymentMethodPage class.
     */
    private PaymentMethodPage paymentMethodPage;
    /**
     * OrderConfirmationPage class.
     */
    private OrderConfirmationPage orderConfirmationPage;

    /**
     * User class.
     */
    private User user;

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.ONE,
            testName = "Select the product on shopp page")
    public void test01() throws NotSelectLocatorType {
        myStorePage.seeProduct(PRODUCT_SHORT_SLEEVE_TSHIRTS);
        myStorePage.addCartByProduct(PRODUCT_SHORT_SLEEVE_TSHIRTS);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.TWO,
            testName = "Pop up displayed and make checkup the product")
    public void test02() throws NotSelectLocatorType {
        myStorePage.seePopUpOpen();
        myStorePage.clickCheckOutPopUp();
        myStorePage.redirectTo(PathUrls.RedirectTo.ORDER_LIST_PAGE_PATH);

        Assertions.assertThat(orderListPage.getProductTitleItem(1))
                .isEqualTo(PRODUCT_SHORT_SLEEVE_TSHIRTS);
        orderListPage.clickCheckout();
        orderListPage.redirectTo(PathUrls.RedirectTo.AUTHENTICATION_PAGE);
    }

    /**
     * @throws NotSelectGender throw the exception if it not defined
     * the gender value
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.THREE,
            testName = "Create the new account")
    public void test03() throws NotSelectGender, NotSelectLocatorType {
        authenticationPage.inputEmailField(user);
        authenticationPage.clickCreateAccountButton();
        authenticationPage.redirectTo(
                PathUrls.RedirectTo.ACCOUNT_CREATION_PAGE_PATH);

        createAccountPage.selectGender(Gender.MR);
        createAccountPage.enterFirstName(user);
        createAccountPage.enterLastName(user);
        createAccountPage.enterPassword(user);
        createAccountPage.selectDateOfBirth(user);

        Address address = user.getAddresses().get(0);
        createAccountPage.enterCompany(address);
        createAccountPage.enterAddressLine1(address);
        createAccountPage.enterAddressLine2(address);
        createAccountPage.enterCity(address);
        createAccountPage.selectState(address);
        createAccountPage.enterPostalCode(address);
        createAccountPage.selectCountry(address);
        createAccountPage.enterAdditionalInformation(address);
        createAccountPage.enterPhone(address);
        createAccountPage.enterMobilePhone(address);
        createAccountPage.enterAddressAlias(address);
        createAccountPage.clickRegisterButton();
        createAccountPage.redirectTo(PathUrls.RedirectTo.ORDER_LIST_PAGE_PATH);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.FOUR,
            testName = "Check the delivery address is correctly")
    public void test04() throws NotSelectLocatorType {
        Assertions.assertThat(addressOrdersPage
                .getNameFromDeliveryAddress())
                .isEqualTo(user.getFullName());

        Address address = user.getAddresses().get(0);
        Assertions.assertThat(addressOrdersPage
                .getCompanyFromDeliveryAddress())
                .isEqualTo(address.getCompany());
        Assertions.assertThat(addressOrdersPage
                .getAddressFromDeliveryAddress())
                .isEqualTo(address.getFullAdressLine());
        Assertions.assertThat(addressOrdersPage
                .getCityAndStateFromDeliveryAddress())
                .isEqualTo(address.getFullAddressHome());
        Assertions.assertThat(addressOrdersPage
                .getCountryFromDeliveryAddress())
                .isEqualTo(address.getCountry());
        Assertions.assertThat(addressOrdersPage
                .getPhoneFromDeliveryAddress())
                .isEqualTo(address.getHomePhone());
        Assertions.assertThat(addressOrdersPage
                .getPhoneMobileFromDeliveryAddress())
                .isEqualTo(address.getMobilePhone());
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.FIVE,
            testName = "Check the Billing address is correctly")
    public void test05() throws NotSelectLocatorType {
        Assertions.assertThat(addressOrdersPage
                .getNameFromBillingAddress())
                .isEqualTo(user.getFullName());

        Address address = user.getAddresses().get(0);
        Assertions.assertThat(addressOrdersPage
                .getCompanyFromBillingAddress())
                .isEqualTo(address.getCompany());
        Assertions.assertThat(addressOrdersPage
                .getAddressFromBillingAddress())
                .isEqualTo(address.getFullAdressLine());
        Assertions.assertThat(addressOrdersPage
                .getCityAndStateFromBillingAddress())
                .isEqualTo(address.getFullAddressHome());
        Assertions.assertThat(addressOrdersPage
                .getCountryFromBillingAddress())
                .isEqualTo(address.getCountry());
        Assertions.assertThat(addressOrdersPage
                .getPhoneFromBillingyAddress())
                .isEqualTo(address.getHomePhone());
        Assertions.assertThat(addressOrdersPage
                .getPhoneMobileFromBillingAddress())
                .isEqualTo(address.getMobilePhone());

        addressOrdersPage.clickProccedCheckoutButton();
        addressOrdersPage.redirectTo(PathUrls.RedirectTo.ORDER_LIST_PAGE_PATH);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.SIX,
            testName = "Accepted the terms and continue to buy")
    public void test06() throws NotSelectLocatorType {
        shippingPage.clickCheckTerms();
        shippingPage.clickProceedCheckoutButton();
        shippingPage.redirectTo(PathUrls.RedirectTo.SHIPPING_PAGE_PATH);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.SEVEN,
            testName = "Check total price,"
                    + " select bank card and confirm my order")
    public void test07() throws NotSelectLocatorType {
        Assertions.assertThat(paymentPage.totalValue()).isEqualTo("$19.25");
        paymentPage.clickBankCard();
        paymentPage.redirectTo(PathUrls.RedirectTo.PAYMENT_METHOD_PAGE_PATH);
        paymentMethodPage.clickConfirmMyOrder();
        paymentMethodPage.redirectTo(PathUrls
                .RedirectTo.ORDER_CONFIRMATION_PAGE_PATH);
    }

    /**
     * @throws NotSelectLocatorType throw the exception
     *                              if it not defined locator type.
     */
    @Test(priority = DataValueConstants.EIGHT,
            testName = "Check the order is finished with success")
    public void test08() throws NotSelectLocatorType {
        Assertions.assertThat(orderConfirmationPage.getOrderIsCompleteMessage())
                .isEqualTo(OrderConfirmationLabels
                        .YOUR_ORDER_COMPLETE);
        Assertions.assertThat(orderConfirmationPage
                .getPriceValueOnLabel()).isEqualTo("$19.25");
    }

    /**
     * @throws Exception Throw the exception.
     */
    @BeforeClass
    public void preCondition() throws Exception {
        myStorePage = new MyStorePage();
        orderListPage = new OrderListPage();
        authenticationPage = new AuthenticationPage();
        createAccountPage = new CreateAccountPage();
        addressOrdersPage = new AddressOrdersPage();
        shippingPage = new ShippingPage();
        paymentPage = new PaymentPage();
        paymentMethodPage = new PaymentMethodPage();
        orderConfirmationPage = new OrderConfirmationPage();
        myStorePage.navigationTo(PathUrls.HOME);
        user = new User();
    }
}
