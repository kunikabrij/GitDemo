package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/feature", 
		glue = "stepdefination", 
		monochrome = true, 
		plugin = { "pretty", "html:target/cucumber.html", "junit:target/cucumberXML.xml" }
		)
		
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
