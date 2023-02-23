import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "src/test/java/Features/C_ProductPurchase.feature",
        glue        = "MyStore/C_ProductPurchase/Steps",
        plugin      = {"pretty"},
        publish     = true)

public class C_TestRunnerPurchase {
}
