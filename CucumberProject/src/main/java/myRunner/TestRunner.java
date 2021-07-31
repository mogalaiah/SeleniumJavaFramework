package myRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/Feature/Login.feature"}
		, glue = {"StepDef"}
		, dryRun = true
		, monochrome = true
		, plugin = {"pretty"}
		)

public class TestRunner {

}

