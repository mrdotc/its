package com.dc.stock.web.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.stock.core.dto.Email;
import com.dc.stock.core.entity.User;
import com.dc.stock.core.service.IMailService;
import com.dc.stock.core.service.UserService;

import freemarker.template.TemplateException;

@RestController
public class LoginController {

	
	@Autowired
  private  UserService userSerive;
	
	@Autowired
	private IMailService iMailService;
	
	@RequestMapping("/stockpro/Login")
	public User Login() throws MessagingException, IOException, TemplateException{
		
		System.out.println("Coming in ");
		
		
		Email email=new Email();
		email.setContent("Login Successfully");
		email.setEmailFrom("SysAdminPCN-UAT@avnet.info");
		email.setEmailTo("042659@avnet.com");
		email.setSubject("Well you ,in your home");
		email.setTemplate("main/resources/template/LoginSuccess.html");
		iMailService.sendMailWithFreemarker(email);
		
		return this.userSerive.getUserById("001");
	}
}
