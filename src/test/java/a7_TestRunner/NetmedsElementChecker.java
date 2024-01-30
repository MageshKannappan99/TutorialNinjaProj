package a7_TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetmedsElementChecker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netmeds.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='search']")).sendKeys("Dolo" + Keys.ENTER);
		driver.navigate().back();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin" + Keys.TAB);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.navigate().to("https://www.netmeds.com/");
		driver.findElement(By.xpath("//a[text()='Upload']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text() ,' Sign in / Sign up ')]")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-eventkey='non-prescriptions-surgicals'][@class='level-top']")).click();

		driver.navigate().back();
		driver.findElement(By.xpath("//a[starts-with(text(), 'Lab Tests')][1]")).click();

		driver.navigate().back();
		driver.findElement(By.xpath(
				"//a[contains(@href, '/non-prescriptions/sexual-wellness')][@data-eventkey='non-prescriptions-sexual-wellness']"))
		.click();

		driver.quit();
	}

}
