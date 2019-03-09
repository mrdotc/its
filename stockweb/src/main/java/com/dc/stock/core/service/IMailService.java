package com.dc.stock.core.service;

import java.io.IOException;

import javax.mail.MessagingException;

import com.dc.stock.core.dto.Email;

import freemarker.template.TemplateException;

public interface IMailService {

	public void sendMailWithFreemarker(Email email) throws MessagingException, IOException, TemplateException;
	public void sendMailWithThymeleaf(Email email);
}
