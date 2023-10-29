package com.gestionVenteSpring.demo.dto;

import com.gestionVenteSpring.demo.model.Article;
import com.gestionVenteSpring.demo.model.MvtStk;
import com.gestionVenteSpring.demo.model.TypeMvt;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvt typeMvt;

    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if (mvtStk==null){
            return null;
        }
        return  MvtStkDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .build();

    }

    public static MvtStk toEntity (MvtStkDto mvtStkDto){
        if (mvtStkDto==null){
            return null;
        }
        MvtStk mvtStk=new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setDateMvt(mvtStkDto.getDateMvt());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setArticle(ArticleDto.toEntity(mvtStkDto.getArticle()));
        return mvtStk;



    }
}
