package com.gestionVenteSpring.demo.dto;

import com.gestionVenteSpring.demo.model.Vente;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VenteDto {

    private Integer id;

    private  String code;

    private Instant dateVente;

    private String commentaire;

    public static VenteDto fromEntity(Vente vente){
        if(vente==null){
            return null;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .commentaire(vente.getCommentaire())
                .dateVente(vente.getDateVente())
                .build();
    }
    public static Vente toEntity(VenteDto venteDto){
        if (venteDto==null){
            return null;
        }
        Vente vente=new Vente();
        vente.setId(venteDto.getId());
        vente.setCode(venteDto.getCode());
        vente.setCommentaire(vente.getCommentaire());
        vente.setDateVente(vente.getDateVente());

        return vente;
    }
}
