package a7_TestRunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import a1_Base.Base;

public class Elementchecker extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("debuggerAddress", "localhost:9977");
		

				WebDriver driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				driver.get("https://www.netmeds.com/");
		//
		//		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Upload')]"));
		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//		wait.until(ExpectedConditions.visibilityOf(element));
		//		element.click();
		//
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// driver.get("http://autopract.com");

		// driver.switchTo().newWindow(WindowType.WINDOW);
		// driver.get("https://tutorialsninja.com");
		//
		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.get("https://www.selenium.dev");
		//
		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.get("https://cucumber.io");

		driver.quit();

		// Logger logger = LogManager.getLogger(Elementchecker.class);
		// WebDriver driver = new ChromeDriver();
		// logger.info("Browser Initiated");
		// driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		// logger.info("URL Launched");
		// String acttitle = driver.getTitle();
		// String exptitle =
		// "https://tutorialsninja.com/demo/index.php?route=common/home";
		// assertEquals(exptitle, acttitle);
		//
		// // String randMailId = RandomStringUtils.randomAlphabetic(10);
		// // System.out.println("Random Generated Gmail ID: " + randMailId +
		// "@asd.com");
		//
		//
		// logger.debug("Debug message");
		//
		// logger.warn("Warning message");
		// logger.error("Error");
		// logger.fatal("asjfcvhgadscv");

		// logger2.error("Error message");

		// CommonUtils com = new CommonUtils();
		// @SuppressWarnings("unused")
		// Properties prop = com.initializeProperties();
		//
		// DriverFactory.launchBrowser(Constants.browser);
		// driver = DriverFactory.getDriver();
		// PageObjectManager pom = new PageObjectManager(driver);
		// driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		//
		// clickingEle(pom.getInstanceHome().getMyAcc());
		// clickingEle(pom.getInstanceHome().getLogin());
		// sendValues(pom.getInstanceLogin().getEmail(), Constants.email);
		// sendValues(pom.getInstanceLogin().getPass(), "PASS");
		// freeze();
		// quitBrowser();

	}

}
