package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\getMethodFile.feature"},
		glue="stepDefFiles",
		dryRun=false,
		monochrome =true,
		tags="@Get",
		plugin= {"pretty"}
		)

public class GetRunnerFile extends AbstractTestNGCucumberTests {

}
