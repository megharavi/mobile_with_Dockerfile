package com.MobileAPI.MobileAPI.mobile;

public class ContactList {
	
	private Integer serNum;
	private String name;
	private Integer PhNum;
	private String email;
	
	
	public ContactList(Integer serNum, String name, Integer phNum, String email) {
		super();
		this.serNum = serNum;
		this.name = name;
		this.PhNum = phNum;
		this.email = email;
	}


	public Integer getSerNum() {
		return serNum;
	}


	public void setSerNum(Integer serNum) {
		this.serNum = serNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getPhNum() {
		return PhNum;
	}


	public void setPhNum(Integer phNum) {
		PhNum = phNum;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
}
