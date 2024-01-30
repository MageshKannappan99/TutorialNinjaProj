package a2_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Pom {

	public WebDriver driver;

	public Search_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// -----------------------------------------------------------------------------------------------
	//Sample

	public WebElement getBox() {
		return box;
	}

	public void setBox(WebElement box) {
		this.box = box;
	}

	@FindBy(id = "Message")
	private WebElement box;

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement phoneresult;

	public WebElement getPhoneresult() {
		return phoneresult;
	}

	public void setPhoneresult(WebElement phoneresult) {
		this.phoneresult = phoneresult;
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//p[text()='There is no product that matches the search criteria.']")
	private WebElement noProductMsg;

	public WebElement getNoProductMsg() {
		return noProductMsg;
	}

	public void setNoProductMsg(WebElement noProductMsg) {
		this.noProductMsg = noProductMsg;
	}

	// -----------------------------------------------------------------------------------------------

}
