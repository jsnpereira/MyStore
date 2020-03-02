package StepsDefinition;

import com.mystore.commons.PathUrls;
import com.mystore.exceptions.NotSelectLocatorType;
import com.mystore.pages.MyStorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MyStoreSteps {
    MyStorePage myStorePage;
    public MyStoreSteps() {
        myStorePage = new MyStorePage();
    }

    @Given("I navigate for the my store link")
    public void iNavegateTheMyStoreLink() {
        myStorePage.navigationTo(PathUrls.HOME);
    }

    @When("I select {string} product on add cart button")
    public void iSelectProduct(String product) throws NotSelectLocatorType {
        myStorePage.seeProduct(product);
        myStorePage.addCartByProduct(product);
    }

    @When("I click the check out button on pop up")
    public void iClickCheckout() throws NotSelectLocatorType {
        myStorePage.seePopUpOpen();
        myStorePage.clickCheckOutPopUp();
    }
}
