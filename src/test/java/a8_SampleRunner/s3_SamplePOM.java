package a8_SampleRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class s3_SamplePOM {

	public WebDriver driver;

	public s3_SamplePOM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "Name")
	private WebElement name;

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getName() {
		return name;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "Email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "Message")
	private WebElement msg;

	public WebElement getMsg() {
		return msg;
	}

	public void setMsg(WebElement msg) {
		this.msg = msg;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(id = "fcf-button")
	private WebElement btn;

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}

}
