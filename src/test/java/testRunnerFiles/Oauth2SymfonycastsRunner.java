package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\Oauth2PostSymfonycasts.feature"},
		glue = {"stepDefFiles"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)


public class Oauth2SymfonycastsRunner extends AbstractTestNGCucumberTests {

}
