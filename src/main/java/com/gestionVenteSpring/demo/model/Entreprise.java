package com.gestionVenteSpring.demo.model;

import com.gestionVenteSpring.demo.dto.AdresseDto;
import com.gestionVenteSpring.demo.dto.EntrepriseDto;
import com.gestionVenteSpring.demo.dto.UtilisateurDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name= "entreprises")
public class Entreprise extends AbstractEntity{
    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Embedded
    private Adresse adress;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numtel")
    private String numTel;

    @Column(name = "siteweb")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;



}
