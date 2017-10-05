package com.action;

import java.util.HashMap;
import java.util.Map;

import com.Javamail.client.CheckSendMail;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ConsultEmploymentService;

public class SendSimpleEmail extends ActionSupport {
	private String recipient;     // 收件人邮箱号
	private String emailName;     // 发件人邮箱号
	private String emailPsw;      // 发件人的邮箱密码
	private String subject;       // 邮件主题
	private String content;       // 邮件内容
	private Map<String, Object> map;  //返回json数据

	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public String sendEmail() {
        map=new HashMap<String, Object>();
        CheckSendMail.sendEmail(recipient, emailName, emailPsw);
		map.put("msg", "success");
		return SUCCESS;
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

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
}
