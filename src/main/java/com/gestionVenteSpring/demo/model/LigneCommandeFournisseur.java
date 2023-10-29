package com.gestionVenteSpring.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "lignecommandefourinisseurs")
public class LigneCommandeFournisseur extends AbstractEntity{


    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

   @ManyToOne
   @JoinColumn(name = "idcommandefournissueurs")
    private  CommandeFournisseur commandeFournisseur;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;
}
