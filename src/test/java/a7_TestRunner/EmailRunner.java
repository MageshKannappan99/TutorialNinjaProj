package a7_TestRunner;

import a4_utils.CucumberReportExtractor;
import a4_utils.EmailUtils;

public class EmailRunner {

	public static void main(String[] args) {

		EmailRunner.sendEmail();

	}

	public static void sendEmail() {

		CucumberReportExtractor.asd();

		System.out.println("ASD ASD ASD");
		String to = "mageshyadav1999@gmail.com";
		String subject = "Cucumber Test Results";
		String body = "Your Cucumber tests have completed successfully.";

		EmailUtils.sendEmail(to, subject, body);

	}

}
