package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentesRepository extends JpaRepository<Integer, Vente> {
}
