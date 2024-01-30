package a7_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Eclipse Projects\\TutorialNinjaProj\\src\\test\\resources\\features", 
	glue = {"a6_StepDefinitions", "a5_Hooks" }, 
	plugin = { "pretty", "html:Reports/Cucumber Reports/cucumber-reports.html",
				"pretty", "json:Reports/Cucumber Reports/json-reports.json", 
				"pretty", "junit:Reports/Cucumber Reports/xml-reports.xml", 
				"rerun:target/Failed Scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
	monochrome = false, publish = true, dryRun = false, tags = "")

public class Test_Runner {

	public static void main(String[] args) {

	}
}
	