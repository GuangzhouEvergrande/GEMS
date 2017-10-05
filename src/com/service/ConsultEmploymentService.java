package com.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ConsultEmploymentService {
	private String recipient;     // 收件人邮箱号
	private String emailName;     // 发件人邮箱号
	private String emailPsw;      // 发件人的邮箱密码
	private String subject;       // 邮件主题
	private String content;       // 邮件内容
	
	public ConsultEmploymentService() {
		
	}
	
	public ConsultEmploymentService(String newTo,String newFrom,String newPsw,String newSub,String newContent) {
		this.recipient=newTo;
		this.emailName=newFrom;
		this.emailPsw=newPsw;
		this.subject=newSub;
		this.content=newContent;
	}
	
    public void sendSimpleEmail() {
        System.out.println("执行了sendsimpleemail方法");
    	// Recipient's email ID needs to be mentioned.
	      String to = recipient;

	      // Sender's email ID needs to be mentioned
	      String from = emailName;
	      final String username = emailName;//change accordingly
	      final String password = emailPsw;//change accordingly

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
		   message.setSubject(subject);
		
		   // Now set the actual message
		   message.setText(content);

		   // Send message
		   Transport.send(message);

		   System.out.println("Sent message successfully....");

	      } catch (MessagingException e) {
	         throw new RuntimeException(e);
	      }
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getEmailPsw() {
		return emailPsw;
	}

	public void setEmailPsw(String emailPsw) {
		this.emailPsw = emailPsw;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
