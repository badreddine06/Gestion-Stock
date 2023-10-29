package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
}
