package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//FeatureFiles",
		glue="StepDef",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output"}
		)

public class RunnerClass {

}
