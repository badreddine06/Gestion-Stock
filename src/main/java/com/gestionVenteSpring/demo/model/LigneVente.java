package com.gestionVenteSpring.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "ligneventes")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

//    @ManyToOne
//    @JoinColumn(name = "idarticle")
//    private Article article;
}
