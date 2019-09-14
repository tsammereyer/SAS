package com.sammereyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sammereyer.domain.Offer;
import com.sammereyer.repository.OfferRepository;

@Service("offerService")
public class OfferService {

	@Autowired
	private OfferRepository repo;
	
	public Offer saveOffer(Offer offer) {
		return repo.save(offer);
	}
}
