package com.dc.stock.web.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	
	@RequestMapping("/stockpro/Login")
	public String Login(){
		
		System.out.println("Coming in ");
		
		return "login successfully";
	}
}
