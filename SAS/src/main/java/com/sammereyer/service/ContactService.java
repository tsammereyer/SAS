package com.sammereyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sammereyer.domain.Contact;
import com.sammereyer.repository.ContactRepository;

@Service("contactService")
public class ContactService {

	@Autowired
	private ContactRepository repo;
	
	public Contact saveContact(Contact contact) {
		return repo.save(contact);
	}
}
