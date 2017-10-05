package com.Javamail.client;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class CheckSendMail {
	public static void main(String[] args) {
	      sendEmail("1263369303@qq.com", "lwj_4657@163.com", "b8634657");
	   }
	
	public static void sendEmail(String newTo,String newFrom,String newPsw){
		// Recipient's email ID needs to be mentioned.
	      String to = newTo;

	      // Sender's email ID needs to be mentioned
	      String from = newFrom;
	      final String username =newFrom ;//change accordingly
	      final String password = newPsw;//change accordingly

	      // Assuming you are sending email through relay.jangosmtp.net
	      String host = "smtp.163.com";

	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "25");

	      // Get the Session object.
	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
		   }
	         });

	      try {
		   // Create a default MimeMessage object.
		   Message message = new MimeMessage(session);
		
		   // Set From: header field of the header.
		   message.setFrom(new InternetAddress(from));
		
		   // Set To: header field of the header.
		   message.setRecipients(Message.RecipientType.TO,
	               InternetAddress.parse(to));
		
		   // Set Subject: header field
		   message.setSubject("Testing Subject");
		
		   // Now set the actual message
		   message.setText("Hello, this is sample for to check send " +
			"email using JavaMailAPI ");

		   // Send message
		   Transport.send(message);

		   System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }
	}
}