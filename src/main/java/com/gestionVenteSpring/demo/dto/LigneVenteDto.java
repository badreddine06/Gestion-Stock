package com.gestionVenteSpring.demo.dto;

import com.gestionVenteSpring.demo.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private VenteDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;


    public static LigneVenteDto fromEntiy(LigneVente ligneVente){
        if (ligneVente==null){
            return null;
        }
        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .quantite(ligneVente.getQuantite())
                .vente(VenteDto.fromEntity(ligneVente.getVente()))
                .build();
    }
    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto==null){
            return null;
        }
        LigneVente ligneVente=new LigneVente();
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setVente(VenteDto.toEntity(ligneVenteDto.getVente()));
        return ligneVente;
    }
}
