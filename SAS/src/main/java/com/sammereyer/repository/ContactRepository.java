package com.sammereyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sammereyer.domain.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
