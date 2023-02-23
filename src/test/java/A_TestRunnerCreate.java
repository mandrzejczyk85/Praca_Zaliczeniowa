import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "src/test/java/Features/A_CreateAccount.feature",
        glue        = "MyStore/A_CreateAccount/Steps",
        plugin      = {"pretty"},
        publish     = true)

public class A_TestRunnerCreate {
}
