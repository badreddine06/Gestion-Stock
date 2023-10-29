package com.gestionVenteSpring.demo.repository;


import com.gestionVenteSpring.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
