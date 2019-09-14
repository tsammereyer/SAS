package com.sammereyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sammereyer.service.ArticleService;


@SpringBootApplication
public class SasApplication {

	public static void main(String[] args) {		
		ApplicationContext applicationContext = 
				SpringApplication.run(SasApplication.class, args);
		//printBeans(applicationContext);
		System.out.println("seeding data ...");
		new DataGenerator(applicationContext).seedData();
		System.out.println("... done seeding data!");
	}

	private static void printBeans(ApplicationContext applicationContext) {
		ArticleService articleService = (ArticleService) applicationContext.getBean("articleService");
		System.out.println(articleService.toString());

		System.out.println(); System.out.println("Printing Components:");
		System.out.println("--------------------------------------------------------"); 
		for (String name : applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name); 
		}
		System.out.println("--------------------------------------------------------"); 
		System.out.println();
	}
	

}
