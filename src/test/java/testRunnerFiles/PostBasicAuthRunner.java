package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\authPost.feature"},
		glue = {"postStepDef"},
		dryRun=false,
		monochrome=true,
		plugin={"pretty"}
		
		)

public class PostBasicAuthRunner extends AbstractTestNGCucumberTests {

}
