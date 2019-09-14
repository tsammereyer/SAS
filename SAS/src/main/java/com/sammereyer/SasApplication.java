package com.sammereyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sammereyer.service.ArticleService;


@SpringBootApplication
public class SasApplication {

	public static void main(String[] args) {
		// different than the generated standard
		// saved the context in a variable, pretty useful from time to time
		ApplicationContext applicationContext = 
				SpringApplication.run(SasApplication.class, args);
		//printBeans(applicationContext);
		System.out.println("seeding data ...");
		new DataGenerator(applicationContext).seedData();
		System.out.println("... done seeding data!");
	}

	// if there are some issues with autowiring or similar. prints all the registered beans
	@SuppressWarnings("unused")
	private static void printBeans(ApplicationContext applicationContext) {
		ArticleService articleService = (ArticleService) applicationContext.getBean("articleService");
		System.out.println(articleService.toString());

		System.out.println();
		System.out.println("Printing Components:");
		System.out.println("--------------------------------------------------------"); 
		for (String name : applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name); 
		}
		System.out.println("--------------------------------------------------------"); 
		System.out.println();
	}
	

}
