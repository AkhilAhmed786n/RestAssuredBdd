package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\ReqChainingPostGetDel.feature"},
		glue = {"reqChainingStepDef"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)
public class ReqChainingPGDRunner extends AbstractTestNGCucumberTests {

}
