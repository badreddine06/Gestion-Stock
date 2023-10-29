package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
