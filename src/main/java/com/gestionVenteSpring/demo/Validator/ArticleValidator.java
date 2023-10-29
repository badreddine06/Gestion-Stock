package com.gestionVenteSpring.demo.Validator;

import com.gestionVenteSpring.demo.dto.ArticleDto;
import org.springframework.util.StringUtils;


import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto) {
        List<String> errors = new ArrayList<>();
        if(articleDto==null){
            errors.add("veuillez renseinger le code Article ");
            errors.add("veuillez renseinger le Designation Article ");
            errors.add("le prix unitaireHt est obligatoire  ");
            errors.add("le prix taux tva  est obligatoire  ");
            errors.add("le prix unitaireTtc est obligatoire  ");
            errors.add("le prix category est obligatoire  ");
            return errors;
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veuillez renseinger le code Article ");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("veuillez renseinger le Designation Article ");
        }
        if(articleDto.getPrixUnitaireHt()==null){
            errors.add("le prix unitaireHt est obligatoire  ");
        }
        if(articleDto.getTauxTva()==null){
            errors.add("le prix taux tva  est obligatoire  ");
        }
        if(articleDto.getPrixUnitaireTtc()==null){
            errors.add("le prix unitaireTtc est obligatoire  ");
        }
        if(articleDto.getCategory()==null){
            errors.add("le prix category est obligatoire  ");
        }

        return errors;
    }
}
