package a7_TestRunner;
//@RunWith(Cucumber.class)

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Eclipse Projects\\TutorialNinjaProj\\src\\test\\resources\\features\\Login.feature", 
	glue = {"a6_StepDefinitions", "a5_Hooks" }, 
	plugin = { "pretty", "html:Reports/Cucumber Reports/cucumber-reports.html",
				"pretty", "json:Reports/Cucumber Reports/json-reports.json", 
				"pretty", "junit:Reports/Cucumber Reports/xml-reports.xml", 
				"rerun:target/Failed Scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
	monochrome = false, publish = true, dryRun = false, tags = "")

public class Test_Runner2 extends AbstractTestNGCucumberTests{
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
}
	