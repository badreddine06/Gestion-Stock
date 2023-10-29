package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.LigneCommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, Integer> {
}
