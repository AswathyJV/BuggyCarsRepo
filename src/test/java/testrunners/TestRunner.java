package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions

(
features = "./src/test/resources/Featurefiles/",
		glue= {"Stepdefenitions"},
		tags="@Buggycar",
		plugin = { "pretty","html:target/executionreports/cucumber-report.html"},
		monochrome = true
		)


public class TestRunner {
	

	

}
