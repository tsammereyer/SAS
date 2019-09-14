package com.sammereyer;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sammereyer.domain.Article;
import com.sammereyer.domain.Contact;
import com.sammereyer.domain.CustomerBase;
import com.sammereyer.domain.Offer;
import com.sammereyer.service.ArticleService;
import com.sammereyer.service.ContactService;
import com.sammereyer.service.CustomerBaseService;
import com.sammereyer.service.OfferService;

@Component
public class DataGenerator {
	
	// Service classes are used to generate data via the repository
	private ArticleService articleService;
	private ContactService contactService;
	private CustomerBaseService customerBaseService;
	private OfferService offerService;
	
	// Application context is handed over from the Spring start up class
	public DataGenerator(ApplicationContext context) {
		articleService = (ArticleService) context.getBean("articleService");
		contactService = (ContactService) context.getBean("contactService");
		customerBaseService = (CustomerBaseService) context.getBean("customerBaseService");
		offerService =  (OfferService) context.getBean("offerService");
	}

	// sample data
	private Article macbook = new Article();
	private Article surface = new Article();
	private Article magicMouse = new Article();
	
	private Contact steveJobs = new Contact();
	private Contact timCook = new Contact();
	private Contact steveWozniak = new Contact();
	private Contact billGates = new Contact();
	private Contact steveBalmer = new Contact();
	
	private CustomerBase apple = new CustomerBase();
	private CustomerBase microsoft = new CustomerBase();
	
	private Offer offerFromAppleOne = new Offer();
	private Offer offerFromAppleTwo = new Offer();
	
	
	
	public void seedData() {
		setValues();
		//connectEntities();
		storeInDatabase();
	}
	
	private void storeInDatabase() {
		articleService.saveArticle(macbook);
		articleService.saveArticle(surface);
		articleService.saveArticle(magicMouse);
		
		contactService.saveContact(steveJobs);
		contactService.saveContact(timCook);
		contactService.saveContact(steveWozniak);
		contactService.saveContact(billGates);
		contactService.saveContact(steveBalmer);
		
		customerBaseService.saveCustomer(apple);
		customerBaseService.saveCustomer(microsoft);
		
		offerService.saveOffer(offerFromAppleOne);
		offerService.saveOffer(offerFromAppleTwo);
	}
	
	// has some issues with the linking, need to be checked
	private void connectEntities() {
		offerFromAppleOne.getArticles().add(macbook);
		offerFromAppleOne.getArticles().add(magicMouse);
		offerFromAppleTwo.getArticles().add(surface);
		
		macbook.getOffers().add(offerFromAppleOne);
		magicMouse.getOffers().add(offerFromAppleOne);
		surface.getOffers().add(offerFromAppleTwo);
		
		apple.getContacts().add(steveJobs);
		apple.getContacts().add(timCook);
		apple.getContacts().add(steveWozniak);
		microsoft.getContacts().add(billGates);
		microsoft.getContacts().add(steveBalmer);
		
		steveJobs.setCustomerBase(apple);
		timCook.setCustomerBase(apple);
		steveWozniak.setCustomerBase(apple);
		billGates.setCustomerBase(microsoft);
		steveBalmer.setCustomerBase(microsoft);	
	}
	
	private void setValues() {
		macbook.setName("Macbook Pro");
		macbook.setPrice(1234.2);
		surface.setName("Surface Noob");
		surface.setPrice(1134.2);
		magicMouse.setName("Magic Mouse 2");
		magicMouse.setPrice(69.69);
		
		steveJobs.setFirstName("Steve");
		steveJobs.setLastName("Jobs");
		steveJobs.setEmail("steve.jobs@apple.com");
		steveJobs.setDepartment("C-Level");
		steveJobs.setMobileNumber("+1 234567");
		steveJobs.setAdditionalInformation("steve is dead unfortunatley!");
		timCook.setFirstName("Tim");
		timCook.setLastName("Cook");
		timCook.setEmail("tim.cook@apple.com");
		timCook.setDepartment("C-Level");
		timCook.setMobileNumber("+1 876543");
		steveWozniak.setFirstName("Steve");
		steveWozniak.setLastName("Wozniak");
		steveWozniak.setEmail("steve.wozniak@apple.com");
		steveWozniak.setDepartment("TechnicalStuff");
		steveWozniak.setMobileNumber("+1 7454684");
		billGates.setFirstName("Bill");
		billGates.setLastName("Gates");
		billGates.setEmail("bill.gates@microsoft.com");
		billGates.setDepartment("C-Level");
		billGates.setMobileNumber("+1 90765345");
		billGates.setAdditionalInformation("he is the founder and was the first CEO");
		steveBalmer.setFirstName("Steve");
		steveBalmer.setLastName("Balmer");
		steveBalmer.setEmail("steve.balmer@microsoft.com");
		steveBalmer.setDepartment("C-Level");
		steveBalmer.setMobileNumber("+1 3478543");
		
		apple.setName1("Apple");
		apple.setName2("Computers");
		apple.setCountry("USA");
		microsoft.setName1("Microsoft");
		microsoft.setName2("Software");
		microsoft.setCountry("USA");
		
		offerFromAppleOne.setText("Pretty good offer from Apple");
		offerFromAppleOne.setText2("Computers and other stuff");
		offerFromAppleOne.setBruttoSum(101234.00);
		offerFromAppleOne.setGlobalDiscount(7.0);
		offerFromAppleTwo.setText("Pretty bad offer from Apple");
		offerFromAppleTwo.setText2("Computers and not really much else");
		offerFromAppleTwo.setBruttoSum(201234.00);
		offerFromAppleTwo.setGlobalDiscount(0.0);
		
		
	}
	
}
