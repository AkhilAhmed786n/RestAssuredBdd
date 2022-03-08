package testRunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"X:\\RestAssure\\RestAssuredBDD\\src\\test\\java\\featureFiles\\Postfile.feature"},
		glue= {"postStepDef"},
		dryRun= false,
		monochrome=true,
		tags="@Post",
		plugin= {"pretty"}
		)


public class PostRunner1 extends AbstractTestNGCucumberTests {

}
