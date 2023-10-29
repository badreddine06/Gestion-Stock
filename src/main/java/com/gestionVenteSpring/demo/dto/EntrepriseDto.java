package com.gestionVenteSpring.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionVenteSpring.demo.model.Entreprise;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adress;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

     @JsonIgnore
    private List<UtilisateurDto> utilisateurs;

    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if (entreprise==null){
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .photo(entreprise.getPhoto())
                .description(entreprise.getDescription())
                .adress(AdresseDto.fromEntity(entreprise.getAdress()))
                .build();

    }
    public static Entreprise toEntity(EntrepriseDto entrepriseDto){
        if (entrepriseDto==null){
            return null;
        }
        Entreprise entreprise=new Entreprise();
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setAdress(AdresseDto.toEntity(entrepriseDto.getAdress()));

        return entreprise;
    }

}
