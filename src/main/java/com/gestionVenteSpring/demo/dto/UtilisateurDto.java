package com.gestionVenteSpring.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.gestionVenteSpring.demo.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    @JsonIgnore
    private List<RoleDto> roles;

    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur==null){
            return null;
        }
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .photo(utilisateur.getPhoto())
                .motDePasse(utilisateur.getMotDePasse())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
                .adresse(AdresseDto.fromEntity(utilisateur.getAdresse())).build();


}

    public static Utilisateur toEntity(UtilisateurDto utilisateurDto)  {
        if (utilisateurDto==null){
            return null;
        }
        Utilisateur utilisateur=new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setDateDeNaissance(utilisateurDto.getDateDeNaissance());
        utilisateur.setPrenom(utilisateur.getPrenom());
        utilisateur.setAdresse(AdresseDto.toEntity(utilisateurDto.getAdresse()));
        utilisateur.setEntreprise(EntrepriseDto.toEntity(utilisateurDto.getEntreprise()));
        return utilisateur;
    }


}
