package com.sammereyer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sammereyer.domain.Article;
import com.sammereyer.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService service;
	
	@GetMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("articles", service.getAllArticles());
		return "index";
	}
	
	@GetMapping("/find")
	@ResponseBody
	public Optional<Article> findArticle(Long id) {
		return service.findArticle(id);
	}	
	@PostMapping("/save") //smth is not working here, not able to update an article
	public String saveArticle(Article article) {
		service.saveArticle(article);
		return "redirect:/";
	}
	@GetMapping("/delete")
	public String deleteArticle(Long id) {
		service.deleteArticle(id);
		return "redirect:/";
	}
}
