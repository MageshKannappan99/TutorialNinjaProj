package a8_SampleRunner;

import org.openqa.selenium.WebDriver;

import a1_Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample extends Base {

	WebDriver driver = s1_SampleFactory.getDriver();
	s3_SamplePOM pom = new s3_SamplePOM(driver);

	@Given("User enters the Form fillup page")
	public void user_enters_the_form_fillup_page() {
		driver.get("http://autopract.com/selenium/form4/");
	}

	@When("User fills up the {string} and {string}")
	public void user_fills_up_the_and(String name, String email) {

		pom.getName().sendKeys(name);
		pom.getEmail().sendKeys(email);

		// driver.findElement(By.id("Name")).sendKeys(name);
		// driver.findElement(By.id("Email")).sendKeys(email);
	}

	@When("user fills up the your message message box")
	public void user_fills_up_the_your_message_message_box(String docString) {

		pom.getMsg().sendKeys(docString);

		// driver.findElement(By.id("Message")).sendKeys(docString);
	}

	@When("user taps on the Send Message CTA")
	public void user_taps_on_the_send_message_cta() {

		pom.getBtn().click();
		// driver.findElement(By.id("fcf-button")).click();
	}

	@Then("the success message is displayed")
	public void the_success_message_is_displayed() {
		System.err.println("END");
	}

}
