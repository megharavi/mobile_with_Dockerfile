package com.MobileAPI.MobileAPI.mobile;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SecondaryTable(name="details")
public class ContactListJPA {
	@Id
	@GeneratedValue
	private Integer SerialNum;
	
	private String luckyNum;

	private String phNum;
	
	private String name;
	
	private String email;
	
	public ContactListJPA() {
		
	}
	
	public ContactListJPA(Integer serialNum, String luckyNum, String phNum, String name, String email) {
		super();
		SerialNum = serialNum;
		this.luckyNum = luckyNum;
		this.phNum = phNum;
		this.name = name;
		this.email = email;
	}

	@Column(table="customer")
	public Integer getSerialNum() {
		return SerialNum;
	}

	public void setSerialNum(Integer serialNum) {
		SerialNum = serialNum;
	}

	@Column(table="details")
	public String getPhNum() {
		return phNum;
	}

	public void setPhNum(String phNum) {
		this.phNum = phNum;
	}
	@Column(table="customer")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(table="details")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(table="details")
	public String getLuckyNum() {
		return luckyNum;
	}
	
	public void setLuckyNum(String luckyNum) {
		this.luckyNum = luckyNum;
	}
	
	
	
}
