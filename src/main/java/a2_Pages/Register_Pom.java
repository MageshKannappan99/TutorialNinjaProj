package a2_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Pom {

	public WebDriver driver;

	public Register_Pom(WebDriver driver2) {
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

	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-right']//a)[1]")
	private WebElement regBtn;

	public WebElement getRegBtn() {
		return regBtn;
	}

	public void setRegBtn(WebElement regBtn) {
		this.regBtn = regBtn;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-firstname")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-lastname")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-telephone")
	private WebElement telephone;

	public WebElement getTelephone() {
		return telephone;
	}

	public void setTelephone(WebElement telephone) {
		this.telephone = telephone;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-confirm")
	private WebElement confrmPass;

	public WebElement getConfrmPass() {
		return confrmPass;
	}

	public void setConfrmPass(WebElement confrmPass) {
		this.confrmPass = confrmPass;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "(//input[@name='newsletter'])[1]")
	private WebElement newsLetter;

	public WebElement getNewsLetter() {
		return newsLetter;
	}

	public void setNewsLetter(WebElement newsLetter) {
		this.newsLetter = newsLetter;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement contBtn;

	public WebElement getContBtn() {
		return contBtn;
	}

	public void setContBtn(WebElement contBtn) {
		this.contBtn = contBtn;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyCheckBox;

	public WebElement getPrivacyCheckBox() {
		return privacyCheckBox;
	}

	public void setPrivacyCheckBox(WebElement privacyCheckBox) {
		this.privacyCheckBox = privacyCheckBox;
	}
	
	
	

}
