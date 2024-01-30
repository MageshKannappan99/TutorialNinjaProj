package a2_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Pom {

	public WebDriver driver;

	public Home_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//span[text()='My Account']/following-sibling::span")
	private WebElement myAcc;

	public WebElement getMyAcc() {
		return myAcc;
	}

	public void setMyAcc(WebElement myAcc) {
		this.myAcc = myAcc;

		// -----------------------------------------------------------------------------------------------

	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editYourAcc;

	public WebElement getEditYourAcc() {
		return editYourAcc;
	}

	public void setEditYourAcc(WebElement editYourAcc) {
		this.editYourAcc = editYourAcc;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBar;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		this.searchBar = searchBar;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//span[@class='input-group-btn']//button[1]")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	// -----------------------------------------------------------------------------------------------

	
	
	
}
