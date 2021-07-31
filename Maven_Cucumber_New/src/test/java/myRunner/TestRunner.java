package myRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/Feature/Login.feature" }
		, glue = { "StepDef" }
		, dryRun = true
		, plugin = { "pretty" }
)

public class TestRunner {

}
