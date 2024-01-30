package a6_StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import a1_Base.Base;
import a3_PageObjectManager.PageObjectManager;
import a4_Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search extends Base {

	WebDriver driver = DriverFactory.getDriver();
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("User is on the Home page")
	public void user_is_on_the_home_page() throws IOException {

		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}

	@When("User enters the valid product {string} in the search field")
	public void user_enters_the_valid_product_in_the_search_field(String string) {

		sendValues(pom.getInstanceHome().getSearchBar(), string);
	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {

		clickingEle(pom.getInstanceHome().getSearchBtn());
	}

	@Then("User should get valid product displayed in search result")
	public void user_should_get_valid_product_displayed_in_search_result() {

		eleCheck(pom.getInstanceSearch().getPhoneresult());
		String text = pom.getInstanceSearch().getPhoneresult().getText();
		System.out.println(text);
	}

	@When("User enters the invalid product {string} in the search field")
	public void user_enters_the_invalid_product_in_the_search_field(String string) {

		sendValues(pom.getInstanceHome().getSearchBar(), string);

	}

	@Then("User should get message as no product matching")
	public void user_should_get_message_as_no_product_matching() {

		eleCheck(pom.getInstanceSearch().getNoProductMsg());
	}

	@When("User dont enter any product in the search field")
	public void user_dont_enter_any_product_in_the_search_field() {

		sendValues(pom.getInstanceHome().getSearchBar(), "");
	}

}
