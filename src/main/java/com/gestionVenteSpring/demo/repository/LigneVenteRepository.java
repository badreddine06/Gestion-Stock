package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {
}
