package com.MobileAPI.MobileAPI.mobile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactListJPA {
	@Id
	@GeneratedValue
	private Integer SerialNum;
	
	private String phNum;
	
	private String name;
	
	private String email;
	
	public ContactListJPA() {
		
	}

	

	public ContactListJPA(Integer serialNum, String phNum, String name, String email) {
		super();
		this.SerialNum = serialNum;
		this.phNum = phNum;
		this.name = name;
		this.email = email;
	}

	public Integer getSerialNum() {
		return SerialNum;
	}

	public void setSerialNum(Integer serialNum) {
		SerialNum = serialNum;
	}

	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
