package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "FeatureFiles", glue = "StepDefinitions",
	dryRun = false, monochrome = true, plugin = {"pretty","html:target/cucumber/report.html"}, 
	tags = "@Amazon"	)

public class TestRunner extends AbstractTestNGCucumberTests {

}

