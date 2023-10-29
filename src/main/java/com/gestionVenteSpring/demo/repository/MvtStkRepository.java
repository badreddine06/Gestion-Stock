package com.gestionVenteSpring.demo.repository;

import com.gestionVenteSpring.demo.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<MvtStk, Integer> {
}
