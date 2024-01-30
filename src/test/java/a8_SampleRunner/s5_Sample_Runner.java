package a8_SampleRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Eclipse Projects/TutorialNinjaProj"
		+ "/src/test/java/a8_SampleRunner/Sample.feature", 
//		glue = {"src/test/java/a8_SampleRunner","src/test/java/a8_SampleRunner"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
		monochrome = false, 
		stepNotifications = true,
//		publish = true, 
		dryRun = false)

public class s5_Sample_Runner {
}
