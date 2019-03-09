package javaknowledge.annotation;

import java.io.Serializable;

public class UploadUserBean extends Creature implements Serializable{
	
	private Class clazz;

	@ExcelFieldAlias(excelField = "user id", mandatory = true, orderNum = "1")
	private String userId;
	@ExcelFieldAlias(excelField = "user name", mandatory = true, orderNum = "2")
	private String userName;
	@ExcelFieldAlias(excelField = "phoneNumber", mandatory = false, orderNum = "3")
	private String phoneNumber;
	@ExcelFieldAlias(excelField = "emailAddress", mandatory = false, orderNum = "4")
	private String emailAddress;
	@ExcelFieldAlias(excelField = "age", mandatory = true, orderNum = "5")
	private int age;

	public UploadUserBean() {

	}

	public UploadUserBean(String userId, String userName, String phoneNumber, String emailAddress, int age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
