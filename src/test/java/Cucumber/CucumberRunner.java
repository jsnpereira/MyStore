package Cucumber;

import io.cucumber.core.internal.gherkin.events.PickleEvent;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {"pretty", "json:target/report/cucumber2.json"},
        strict = true,
        features = {"src/test/resources/features"},
        glue = {"StepsDefinition"}
)
public class CucumberRunner extends CucumberBase {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        testNGCucumberRunner.finish();
    }

    @Test(groups = "Cucumber", description = "Run cucumber feature", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }
}
