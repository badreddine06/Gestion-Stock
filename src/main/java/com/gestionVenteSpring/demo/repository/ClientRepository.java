package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Integer, Client> {
}
