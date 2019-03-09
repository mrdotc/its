package com.dc.stock.core.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.dc.stock.core.dto.Email;
import com.dc.stock.core.service.IMailService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class MailServiceImpl implements IMailService {

	   @Autowired
	    private SpringTemplateEngine  templateEngine;
    @Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private Configuration configuration;
	
 

	@Override
	public void sendMailWithFreemarker(Email email) throws MessagingException, IOException, TemplateException {
		// TODO Auto-generated method stub
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(email.getEmailFrom());
		helper.setTo(email.getEmailTo());
		helper.setSubject(email.getSubject());

		Map<String, Object> modelMap = new HashMap<String, Object>();

		modelMap.put("content", email.getContent());
		modelMap.put("user", email.getEmailTo());

		/*Template template = configuration.getTemplate(email.getTemplate());
		String text = FreeMarkerTemplateUtils.processTemplateIntoString(template, modelMap);*/
		helper.setText("Welcome to this .....................................", true);
		javaMailSender.send(message);

	}

	@Override
	public void sendMailWithThymeleaf(Email email) {
		// TODO Auto-generated method stub

	}

}
