package a6_StepDefinitions;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import a1_Base.Base;
import a3_PageObjectManager.PageObjectManager;
import a4_Factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register extends Base {

	WebDriver driver = DriverFactory.getDriver();
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {

		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		clickingEle(pom.getInstanceHome().getMyAcc());
		clickingEle(pom.getInstanceRegister().getRegBtn());
	}

	@When("the user fills in the registration form with valid mandatory information")
	public void the_user_fills_in_the_registration_form_with_valid_mandatory_information(DataTable dataTable)
			throws InterruptedException {

		List<List<String>> validData = dataTable.asLists(String.class);
		String firstName = validData.get(0).get(1);
		String LastName = validData.get(1).get(1);
		@SuppressWarnings("unused")
		String email = validData.get(2).get(1);
		String telephone = validData.get(3).get(1);
		String pass = validData.get(4).get(1);
		String confirmpass = validData.get(5).get(1);

		sendValues(pom.getInstanceRegister().getFirstName(), firstName);
		sendValues(pom.getInstanceRegister().getLastName(), LastName);
		String randMailId = RandomStringUtils.randomAlphabetic(10) + "@asd.com";
		sendValues(pom.getInstanceRegister().getEmail(), randMailId);
		sendValues(pom.getInstanceRegister().getTelephone(), telephone);
		sendValues(pom.getInstanceRegister().getPass(), pass);
		sendValues(pom.getInstanceRegister().getConfrmPass(), confirmpass);
		clickingEle(pom.getInstanceRegister().getNewsLetter());

	}

	@When("click the privacy policy check box")
	public void click_the_privacy_policy_check_box() {

		clickingEle(pom.getInstanceRegister().getPrivacyCheckBox());
	}

	@When("clicks the continue button")
	public void clicks_the_continue_button() {
		clickingEle(pom.getInstanceRegister().getContBtn());
	}

	@Then("the user should see a confirmation message")
	public void the_user_should_see_a_confirmation_message() {

		driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText()
				.contains("Your Account Has Been Created!");

	}

	@When("the user fills in the registration form with invalid mandatory information")
	public void the_user_fills_in_the_registration_form_with_invalid_mandatory_information(DataTable dataTable) {

		List<List<String>> invData = dataTable.asLists(String.class);
		String firstName = invData.get(0).get(1);
		String lastName = invData.get(1).get(1);
		String email = invData.get(2).get(1);
		String telephone = invData.get(3).get(1);
		String pass = invData.get(4).get(1);
		String confirmpass = invData.get(5).get(1);

		sendValues(pom.getInstanceRegister().getFirstName(), firstName);
		sendValues(pom.getInstanceRegister().getLastName(), lastName);
		sendValues(pom.getInstanceRegister().getEmail(), email);
		sendValues(pom.getInstanceRegister().getTelephone(), telephone);
		sendValues(pom.getInstanceRegister().getPass(), pass);
		sendValues(pom.getInstanceRegister().getConfrmPass(), confirmpass);
		clickingEle(pom.getInstanceRegister().getNewsLetter());

	}

	@Then("the user should see an invalid error message")
	public void the_user_should_see_an_invalid_error_message() {

	}

}
