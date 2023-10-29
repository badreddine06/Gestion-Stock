package com.gestionVenteSpring.demo.Validator;

import com.gestionVenteSpring.demo.dto.ClientDto;
import com.gestionVenteSpring.demo.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {
    public static List<String> validate(FournisseurDto fournisseurDto){
        List<String> errors=new ArrayList<>();
        errors.add("veuillez renseinger le code Article ");
        if(fournisseurDto==null){
            errors.add("veuillez renseinger le nom fournisseur");
            errors.add("veuillez renseinger le prenom fournisseur ");
            errors.add("veuillez renseinger le mail fournisseur ");
            errors.add("veuillez renseinger le num tel fournisseur ");
            return errors;
        }

        if(!StringUtils.hasLength(fournisseurDto.getNom())){
            errors.add("veuillez renseinger le nom Article ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getPrenom())){
            errors.add("veuillez renseinger le prenom Article ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getMail())){
            errors.add("veuillez renseinger le mail Article ");
        }
        if(!StringUtils.hasLength(fournisseurDto.getNumTel())){
            errors.add("veuillez renseinger le num tel Article ");
        }



        return errors;
    }
}
