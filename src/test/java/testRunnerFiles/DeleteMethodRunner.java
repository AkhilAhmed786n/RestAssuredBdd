package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\DelMethodFile.feature"},
		glue = {"stepDefFiles"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		
		)

public class DeleteMethodRunner extends AbstractTestNGCucumberTests{

}
