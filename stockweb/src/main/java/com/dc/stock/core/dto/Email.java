package com.dc.stock.core.dto;

import java.io.Serializable;

public class Email implements Serializable {

    private String emailTo;
    
    private String emailFrom;
    
    private String subject;
    private String content;
   
    private String template;
    

	public Email() {
	}


	public Email(String emailTo, String emailFrom, String subject, String content, String template) {
		super();
		this.emailTo = emailTo;
		this.emailFrom = emailFrom;
		this.subject = subject;
		this.content = content;
		this.template = template;
	}


	public String getEmailTo() {
		return emailTo;
	}


	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}


	public String getEmailFrom() {
		return emailFrom;
	}


	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
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


	public String getTemplate() {
		return template;
	}


	public void setTemplate(String template) {
		this.template = template;
	}
    
    
    
}
