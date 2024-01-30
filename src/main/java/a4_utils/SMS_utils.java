package a4_utils;

import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMS_utils {

	// Replace these values with your Twilio credentials

	public static final String ACCOUNT_SID = "ACacab5410dd85a6001556ae7dc1364170";
	public static final String AUTH_TOKEN = "a758c50b1583929d11a4af2261400c41";
	public static final String TWILIO_PHONE_NUMBER = "18583608486";

	public static void sendSMS(String toPhoneNumber, String messageBody) {

		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		try {

			Message message = Message
			.creator(new PhoneNumber(toPhoneNumber), 
			new PhoneNumber(TWILIO_PHONE_NUMBER), messageBody)
            .create();

			System.out.println("SMS sent: " + message.getSid());
		} catch (ApiException e) {
			System.err.println("Twilio API Exception: " + e.getMessage());
			
			// Additional error handling or logging can be added here
		}
	}

	public static void main(String[] args) {

		sendSMS("+91-8124497957", 
				"Your Cucumber Test Report has been Generated and E-Mail has been sent");

	}
}
