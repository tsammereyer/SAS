package com.sammereyer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	public Contact() {}
	public Contact(String title, String firstName, String lastName, String department, String email,
			String extensionNumber, String mobileNumber, String additionalInformation, boolean newsletter,
			CustomerBase customerBase) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
		this.extensionNumber = extensionNumber;
		this.mobileNumber = mobileNumber;
		this.additionalInformation = additionalInformation;
		this.newsletter = newsletter;
		this.customerBase = customerBase;
	}

	@Id @GeneratedValue
	private Long id;
	private String title;
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String extensionNumber;
	private String mobileNumber;
	private String additionalInformation;
	private boolean newsletter;
	
	@ManyToOne
	private CustomerBase customerBase;

	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExtensionNumber() {
		return extensionNumber;
	}
	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	public boolean isNewsletter() {
		return newsletter;
	}
	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
	public CustomerBase getCustomerBase() {
		return customerBase;
	}
	public void setCustomerBase(CustomerBase customerBase) {
		this.customerBase = customerBase;
	}
	
	
	
	
}
