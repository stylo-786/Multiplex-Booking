package com.multiplex.dto;

import java.util.Date;

public class UsersDTO {
	private Integer id;
	private String name;
	private String emailId;
	private String mobileNumber;
	private Date dateOfBirth;
	private String passward;
	private String cPassward;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	public String getcPassward() {
		return cPassward;
	}

	public void setcPassward(String cPassward) {
		this.cPassward = cPassward;
	}
}