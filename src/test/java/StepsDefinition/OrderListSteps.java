package StepsDefinition;

import com.mystore.commons.PathUrls;
import com.mystore.pages.OrderListPage;
import io.cucumber.java.en.Then;

public class OrderListSteps {
    private OrderListPage orderListPage;

    public OrderListSteps() {
        this.orderListPage = new OrderListPage();
    }

    @Then("I see order list page")
    public void iSeeOrderListPage(){
        orderListPage.redirectTo(PathUrls.RedirectTo.ORDER_LIST_PAGE_PATH);
    }
}
