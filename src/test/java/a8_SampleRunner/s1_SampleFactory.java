package a8_SampleRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1_SampleFactory {

	static WebDriver driver;

	public static void launchBrowser(String browserName) {

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			System.err.println("Driver error");
		}
	}

	public static WebDriver getDriver() {
		return driver;

	}
}
