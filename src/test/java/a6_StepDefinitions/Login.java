package a6_StepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import a1_Base.Base;
import a3_PageObjectManager.PageObjectManager;
import a4_Factory.DriverFactory;
import a4_utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Base {

	WebDriver driver = DriverFactory.getDriver();
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {

		clickingEle(pom.getInstanceHome().getMyAcc());
		clickingEle(pom.getInstanceHome().getLogin());
	}

	@When("the user enters valid {string} and {string}")
	public void the_user_enters_valid_and_(String email, String pass) {

		pom.getInstanceLogin().getEmail().sendKeys(email);
		pom.getInstanceLogin().getPass().sendKeys(pass);
	}

	@And("clicks the Login button")
	public void clicks_the_login_button() {

		clickingEle(pom.getInstanceLogin().getLoginBtn());
	}

	@Then("the user should be redirected to the Homepage")
	public void the_user_should_be_redirected_to_the_homepage() {

		eleCheck(pom.getInstanceMyAcc().getEditAccLink());
	}

	// Unsuccessful Login (Invalid Credentials)

	@When("the user enters an invalid username {string} and password {string}")
	public void the_user_enters_an_invalid_username_and_password(String inv_mail, String inv_pass) {

		driver.findElement(By.id("input-email")).sendKeys(inv_mail);
		driver.findElement(By.id("input-password")).sendKeys(inv_pass);
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {

		eleCheck(pom.getInstanceLogin().getWarnMsg());
		String msg = "Warning: No match for E-Mail Address and/or Password.";
		pom.getInstanceLogin().getWarnMsg().toString().contains(msg);
	}

	// Unsuccessful Login (Empty Fields)

	@When("the user leaves the username and password fields empty")
	public void the_user_leaves_the_username_and_password_fields_empty() {

		sendValues(pom.getInstanceLogin().getEmail(), "");
		sendValues(pom.getInstanceLogin().getPass(), "");
	}

	@Then("the user should see a message indicating that fields are required")
	public void the_user_should_see_a_message_indicating_that_fields_are_required() {

		eleCheck(pom.getInstanceLogin().getWarnMsg());
		String msg = "Warning: No match for E-Mail Address and/or Password.";
		pom.getInstanceLogin().getWarnMsg().toString().contains(msg);
	}

	// Password Reset

	@When("the user clicks the Forgot Password link")
	public void the_user_clicks_the_forgot_password_link() {

		clickingEle(pom.getInstanceLogin().getForgetPassLink());
	}

	@Then("the user should be redirected to the password reset page")
	public void the_user_should_be_redirected_to_the_password_reset_page() {

		pom.getInstanceLogin().getForgetPassHead().getText().contains("Forgot Your Password?");

	}

	@Then("the user should see a form for resetting the password")
	public void the_user_should_see_a_form_for_resetting_the_password() throws IOException, InterruptedException {

		CommonUtils com = new CommonUtils();
		Properties prop = com.initializeProperties();

		pom.getInstanceLogin().getForgetEmailinp().sendKeys(prop.getProperty("email"));
		clickingEle(pom.getInstanceLogin().getContBtn());
		eleCheck(pom.getInstanceLogin().getResetConfirmMsg());
		pom.getInstanceLogin().getResetConfirmMsg().getText()
				.contains("An email with a confirmation link has been sent your email address.");
	}

}
