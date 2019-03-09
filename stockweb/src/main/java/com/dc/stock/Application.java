package com.dc.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
public class Application {

	/// <imap-server password="Change$135" username="SysAdminPCN-UAT@avnet.info" outbound-socket-binding-ref="mail-imap"/>
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
		System.out.println("log information ");
	}

}
