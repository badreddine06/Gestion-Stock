package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Role, Integer> {
}
