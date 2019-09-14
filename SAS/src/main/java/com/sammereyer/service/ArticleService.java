package com.sammereyer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sammereyer.domain.Article;
import com.sammereyer.repository.ArticleRepository;

@Service("articleService")
public class ArticleService {

	@Autowired
	private ArticleRepository repo;
	
	public Article saveArticle(Article article) {
		return repo.save(article);
	}
	
	public void deleteArticle(Long id) {
		repo.deleteById(id);
	}
	
	public Optional<Article> findArticle(Long id) {
		return repo.findById(id);
	}
	
	public List<Article> getAllArticles() {
		return repo.findAll();
	}
}
