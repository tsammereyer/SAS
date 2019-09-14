package com.sammereyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sammereyer.domain.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
