package a8_SampleRunner;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class s2_SampleHooks {

	WebDriver driver;

	@Before(order = 1)
	public void beforeScenario1() throws IOException {

		if (driver == null) {
			s1_SampleFactory.launchBrowser("chrome");
		}
		driver = s1_SampleFactory.getDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Before(order = 2)
	public void beforeScenario2() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@After
	public void afterScenario() {

		if (driver != null) {
			driver.quit();
		}
	}

}
