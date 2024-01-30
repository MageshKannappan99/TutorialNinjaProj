package a4_utils;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtils {
	public static void sendEmail(String to, String subject, String body) {

		// Set up mail server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// Create a session with authentication
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("mageshtesting2022@gmail.com", "ywyj uqfb dpkv pihc");
			}
		});

		try {
			// Create a MimeMessage object
			Message message = new MimeMessage(session);

			// Set the sender and recipient addresses
			message.setFrom(new InternetAddress("mageshtesting2022@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			// Set the email subject
			message.setSubject(subject);

			// Create a MimeBodyPart for the email body
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(body);

			// Create a MimeBodyPart for the HTML attachment
			MimeBodyPart attachmentPart = new MimeBodyPart();
			String filename = "C:/Eclipse/Mini Project/TutorialNinjaProj/"
					+ "Reports/Cucumber Reports/cucumber-reports.html";
			DataSource source = new FileDataSource(filename);
			attachmentPart.setDataHandler(new DataHandler(source));
			attachmentPart.setFileName("CucumberTestReport.html");

			MimeBodyPart attachmentPart2 = new MimeBodyPart();
			String filename2 = "C:/Eclipse/Mini Project/TutorialNinjaProj/"
					+ "Reports/Extent Reports/Reports 18-12-23-18-15-33/PDF_Report.pdf";
			DataSource source2 = new FileDataSource(filename2);
			attachmentPart2.setDataHandler(new DataHandler(source2));
			attachmentPart2.setFileName("CucumberPdfReport.pdf");

			// Create a Multipart object and add the parts to it
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			multipart.addBodyPart(attachmentPart);
			multipart.addBodyPart(attachmentPart2);

			// Set the Multipart object as the content of the message
			message.setContent(multipart);

			// // Set the subject and body of the email
			// message.setSubject(subject);
			// message.setText(body);

			// Send the email
			Transport.send(message);

			System.out.println("Email sent successfully!");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
