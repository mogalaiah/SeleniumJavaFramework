
package Runner;
  
  import cucumber.api.CucumberOptions;
  
  @CucumberOptions( features = ".//Feature//Login.feature" 
		  , glue =  "StepDefination" 
		  , dryRun = false 
		  , monochrome = true
		  , plugin = {"pretty",  "html:test-output" })
  
  public class RunnerClass {
  
  }
