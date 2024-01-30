package a2_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount_Pom {

	public WebDriver driver;

	public MyAccount_Pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// -----------------------------------------------------------------------------------------------

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAccLink;

	public WebElement getEditAccLink() {
		return editAccLink;
	}

	public void setEditAccLink(WebElement editAccLink) {
		this.editAccLink = editAccLink;
	}

	// -----------------------------------------------------------------------------------------------

	
	
}
