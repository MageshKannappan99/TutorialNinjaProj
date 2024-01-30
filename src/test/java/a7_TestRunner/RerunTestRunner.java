package a7_TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/Failed Scenarios.txt", 
glue = { "a6_StepDefinitions", "a5_Hooks" }, 
publish = true)

public class RerunTestRunner {

}
