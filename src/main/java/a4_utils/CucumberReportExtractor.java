package a4_utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CucumberReportExtractor {

	public static void asd() {
		// Run your Cucumber tests and capture the console output
		String consoleOutput = captureConsoleOutput();

		// Extract the report link from the console output
		String reportLink = extractReportLink(consoleOutput);

		// Store or use the extracted report link as needed
		System.out.println("Extracted Cucumber Report Link: " + reportLink);
	}

	private static String captureConsoleOutput() {
		// Implement code to run your Cucumber tests and capture console output
		// Return the captured console output as a string
		return "Your Cucumber test console output here...";
	}

	private static String extractReportLink(String consoleOutput) {
		// Define a regular expression pattern to match the report link
		String pattern = "View your Cucumber Report at: https://reports.cucumber.io/reports";
		Pattern r = Pattern.compile(pattern);

		// Create a matcher object
		Matcher matcher = r.matcher(consoleOutput);

		// Find the first match
		if (matcher.find()) {
			return matcher.group(1);
		} else {
			return "Report link not found.";
		}
	}
}
