package com.sammereyer.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Article {
	
	public Article() {}
	public Article(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Id @GeneratedValue
	private Long id;
	private String name;
	private double price;
	
	@ManyToMany(mappedBy = "articles")
	private Set<Offer> offers = new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Offer> getOffers() {
		return offers;
	}
	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}
	
	
	

}
