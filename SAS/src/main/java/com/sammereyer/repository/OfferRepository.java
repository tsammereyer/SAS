package com.sammereyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sammereyer.domain.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long>{

}
