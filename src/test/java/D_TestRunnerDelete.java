import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features    = "src/test/java/Features/D_DeleteFirstAddress.feature",
        glue        = "MyStore/D_DeleteFirstAddress/Steps",
        plugin      = {"pretty"},
        publish     = true)

public class D_TestRunnerDelete {
}
