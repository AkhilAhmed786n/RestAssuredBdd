package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\BearerToken.feature"},
		glue =  {"stepDefFiles"},
		tags = "@BearerToken",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class GetBearerTokenAuth extends AbstractTestNGCucumberTests {
	
	

}
