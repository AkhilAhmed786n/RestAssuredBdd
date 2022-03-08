package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\ReqChainingPostGet.feature"},
		glue = {"reqChainingStepDef"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)

public class PostGetReqChainRunner extends AbstractTestNGCucumberTests {

}
