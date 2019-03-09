package com.dc.stock.core.entity;

public class User {
	private String userId;
	
	private String useName;
	
	private String emailAddr;
	
	private String phoneNumber;
	
	private int age;
	
	
	
	

	public User(String userId, String useName, String emailAddr, String phoneNumber, int age) {
		super();
		this.userId = userId;
		this.useName = useName;
		this.emailAddr = emailAddr;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", useName=" + useName + ", emailAddr=" + emailAddr + ", phoneNumber="
				+ phoneNumber + ", age=" + age + "]";
	}
	
	
	
	
	
	
	

}
