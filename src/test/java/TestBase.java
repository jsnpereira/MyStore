import com.mystore.enums.Browser;
import com.mystore.selenium.manager.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * This class is base of the test.
 */
public class TestBase {
    /**
     * @param browser Set the browser name;
     */
    @BeforeClass
    @Parameters("browser")
    public void preCondition(@Optional("CHROME")
                                        final String browser) {
        System.out.println("Testbase");
        DriverManager.start(Browser.valueOf(browser));
    }

    /**
     * This method is finished all tests, drivers shutdown.
     */
    @AfterClass(alwaysRun = true)
    public void postCondition() {
        DriverManager.shutdown();
    }
}
