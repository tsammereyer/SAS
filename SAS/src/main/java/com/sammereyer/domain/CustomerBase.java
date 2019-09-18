package com.sammereyer.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CustomerBase {
	
	public CustomerBase() {}
	public CustomerBase(String name1, String name2, String street, String zipCode, String city, String country,
			String phone, String fax, String mobilePhone, String additionalInformation, String sortName,
			String sortCity, String dob, String companyNumber, Set<Contact> contacts) {
		this.name1 = name1;
		this.name2 = name2;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.mobilePhone = mobilePhone;
		this.additionalInformation = additionalInformation;
		this.sortName = sortName;
		this.sortCity = sortCity;
		this.dob = dob;
		this.companyNumber = companyNumber;
		this.contacts = contacts;
	}

	@Id @GeneratedValue
	private Long id;
	private String name1;
	private String name2;
	private String street;
	private String zipCode;
	private String city;
	private String country;
	private String phone;
	private String fax;
	private String mobilePhone;
	private String additionalInformation;
	private String sortName;
	private String sortCity;
	private String dob; // doesn't make sense here?
	//private List<PaymentMethod> paymentMethods;
	//private List<ShippingMethod> shippingMethod;
	//Taxes
	//Customergroups
	private String companyNumber;
	
	// ... many more

	@OneToMany(mappedBy = "customerBase")
	private Set<Contact> contacts = new HashSet<>();

	public Long getId() {
		return id;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortCity() {
		return sortCity;
	}

	public void setSortCity(String sortCity) {
		this.sortCity = sortCity;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
