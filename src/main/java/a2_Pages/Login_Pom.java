package a2_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {

	public WebDriver driver;

	public Login_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
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

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//div[text()='Warning: No match for E-Mail Address and/or Password.']")
	private WebElement warnMsg;

	public WebElement getWarnMsg() {
		return warnMsg;
	}

	public void setWarnMsg(WebElement warnMsg) {
		this.warnMsg = warnMsg;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//div[@class='form-group']//a[1]")
	private WebElement forgetPassLink;

	public WebElement getForgetPassLink() {
		return forgetPassLink;
	}

	public void setForgetPassLink(WebElement forgetPassLink) {
		this.forgetPassLink = forgetPassLink;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//h1[text()='Forgot Your Password?']")
	private WebElement forgetPassHead;

	public WebElement getForgetPassHead() {
		return forgetPassHead;
	}

	public void setForgetPassHead(WebElement forgetPassHead) {
		this.forgetPassHead = forgetPassHead;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "input-email")
	private WebElement forgetEmailinp;

	public WebElement getForgetEmailinp() {
		return forgetEmailinp;
	}

	public void setForgetEmailinp(WebElement forgetEmailinp) {
		this.forgetEmailinp = forgetEmailinp;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement contBtn;

	public WebElement getContBtn() {
		return contBtn;
	}

	public void setContBtn(WebElement contBtn) {
		this.contBtn = contBtn;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//div[text()='An email with a confirmation link has been sent your email address.']")
	private WebElement resetConfirmMsg;

	public WebElement getResetConfirmMsg() {
		return resetConfirmMsg;
	}

	public void setResetConfirmMsg(WebElement resetConfirmMsg) {
		this.resetConfirmMsg = resetConfirmMsg;
	}

}
