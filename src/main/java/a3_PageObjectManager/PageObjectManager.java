package a3_PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import a2_Pages.Home_Pom;
import a2_Pages.Login_Pom;
import a2_Pages.MyAccount_Pom;
import a2_Pages.Register_Pom;
import a2_Pages.Search_Pom;
import a4_utils.CommonUtils;

public class PageObjectManager {

	WebDriver driver;

	private CommonUtils comUtil;

	public CommonUtils getInstanceComUtil() {
		comUtil = new CommonUtils();
		return comUtil;
	}

	// -----------------------------------------------------------------------------------------------

	private Home_Pom home;

	public Home_Pom getInstanceHome() {
		home = new Home_Pom(driver);
		return home;
	}

	// -----------------------------------------------------------------------------------------------

	private Register_Pom register;

	public Register_Pom getInstanceRegister() {
		register = new Register_Pom(driver);
		return register;
	}

	// -----------------------------------------------------------------------------------------------

	private MyAccount_Pom myAccount;

	public MyAccount_Pom getInstanceMyAcc() {
		myAccount = new MyAccount_Pom(driver);
		return myAccount;
	}

	// -----------------------------------------------------------------------------------------------

	private Login_Pom login;

	public Login_Pom getInstanceLogin() {
		login = new Login_Pom(driver);
		return login;
	}

	// -----------------------------------------------------------------------------------------------

	private Search_Pom search;

	public Search_Pom getInstanceSearch() {
		search = new Search_Pom(driver);
		return search;
	}

	// -----------------------------------------------------------------------------------------------

	public PageObjectManager(WebDriver pom_Driver) {
		this.driver = pom_Driver;
		PageFactory.initElements(driver, this);
	}

}
