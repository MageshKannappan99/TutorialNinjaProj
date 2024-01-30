package a5_Hooks;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import a4_Factory.DriverFactory;
import a4_utils.CommonUtils;
import a5_Constatnts.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	WebDriver driver;

	@Before
	public void beforeScenario() throws IOException {

		CommonUtils com = new CommonUtils();
		Properties prop = com.initializeProperties();

		if (driver == null) {
			DriverFactory.launchBrowser(Constants.browser);
		}

		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@After
	public void afterScenario(Scenario scenario) {

		if (scenario.isFailed()) {
			String screenshotName = scenario.getName() + "- Failed Scenario";
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", screenshotName);
		}

		driver.quit();

	}


}
