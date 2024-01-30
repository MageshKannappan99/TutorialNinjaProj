package a4_utils;

import java.io.IOException;
import java.util.Properties;

import a5_Constatnts.Constants;

public class CommonUtils {
	public Properties initializeProperties() throws IOException {

		// FileReader reader = new FileReader(
		// System.getProperty("user.dir") +
		// "\\src\\test\\resources\\config\\Config.properties");,

		Properties prop = new Properties();
		prop.load(getClass().getResourceAsStream("/config/config.properties"));

		// Properties

		Constants.email = prop.getProperty("email");
		Constants.browser = prop.getProperty("browser");
		Constants.url = prop.getProperty("url");

		return prop;
	}

}
