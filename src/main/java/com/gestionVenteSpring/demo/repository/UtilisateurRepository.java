package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
