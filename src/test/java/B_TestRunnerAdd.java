import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "src/test/java/Features/B_AddFirstAddress.feature",
        glue        = "MyStore/B_AddFirstAddress/Steps",
        plugin      = {"pretty"},
        publish     = true)

public class B_TestRunnerAdd {
}
