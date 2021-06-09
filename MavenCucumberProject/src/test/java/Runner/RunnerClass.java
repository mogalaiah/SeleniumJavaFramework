
  package Runner;
  
  import org.junit.runner.RunWith; 
  import cucumber.api.CucumberOptions; 
  import cucumber.api.junit.Cucumber;
  
  
  @RunWith(Cucumber.class)  
  @CucumberOptions(features=".//Feature/Login.feature",
			glue="StepDef",
			dryRun=false,
			monochrome=true,
			plugin = {"pretty"})
  public class RunnerClass {
  
  }
 