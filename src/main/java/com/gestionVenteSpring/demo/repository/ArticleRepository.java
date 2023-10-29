package com.gestionVenteSpring.demo.repository;


import com.gestionVenteSpring.demo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}