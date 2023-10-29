package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<Integer, CommandeClient> {
}
