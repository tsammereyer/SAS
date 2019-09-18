package com.sammereyer.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Offer {
	
	public Offer() {}
	public Offer(Long position, boolean printed, Date offerDate, String enquiry,
			Date deliveryDate, double nettoSum, String text, double bruttoSum, double globalDiscount, String text2,
			Set<Article> articles, String project) {
		this.position = position;
		this.printed = printed;
		this.offerDate = offerDate;
		this.enquiry = enquiry;
		this.deliveryDate = deliveryDate;
		this.nettoSum = nettoSum;
		this.text = text;
		this.bruttoSum = bruttoSum;
		this.globalDiscount = globalDiscount;
		this.text2 = text2;
		this.articles = articles;
		this.project = project;
	}

	@Id @GeneratedValue
	private Long id;
	private Long position;
	private boolean printed;
	private Date offerDate;
	//private CustomerBase customer;
	private String enquiry; // Anfrage
	// private PaymentMethod paymentMethod;
	// private ShippingMethod shippingMethod;
	// private Set<Article> articles; + Quantity + OfferPrice + Discount
	private Date deliveryDate;
	private double nettoSum;
	private String text;
	private double bruttoSum;
	private double globalDiscount;
	// private Employee salesPerson;
	// private int "Mitrechnen";
	private String text2;
	//private double "EKErfassung";
	//private String "ArtikelText";
	private String project;
	
	@ManyToMany
	private Set<Article> articles = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public Long getPosition() {
		return position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}
	public boolean isPrinted() {
		return printed;
	}
	public void setPrinted(boolean printed) {
		this.printed = printed;
	}
	public Date getOfferDate() {
		return offerDate;
	}
	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}
	public String getEnquiry() {
		return enquiry;
	}
	public void setEnquiry(String enquiry) {
		this.enquiry = enquiry;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public double getNettoSum() {
		return nettoSum;
	}
	public void setNettoSum(double nettoSum) {
		this.nettoSum = nettoSum;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public double getBruttoSum() {
		return bruttoSum;
	}
	public void setBruttoSum(double bruttoSum) {
		this.bruttoSum = bruttoSum;
	}
	public double getGlobalDiscount() {
		return globalDiscount;
	}
	public void setGlobalDiscount(double globalDiscount) {
		this.globalDiscount = globalDiscount;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	
	

}
