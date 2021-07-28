package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

  @CucumberOptions( 
		  features = "src/test/java/feature", 
		  glue =  "stepdefination",
		  stepNotifications = true,
		  monochrome = true 
		 ,tags =  "@seleniumTest"
		//  ,plugin =  {"pretty","html:target/cucumber.html","junit:target/cucumberXML.xml",  "json:target/cucumberText.text"}
  
  )
 public class TestRunner {

}
