package com.gestionVenteSpring.demo.Validator;

import com.gestionVenteSpring.demo.dto.CategoryDto;
import com.gestionVenteSpring.demo.dto.UtilisateurDto;
import org.springframework.util.StringUtils;


import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto) {
        List<String> errors = new ArrayList<>();
        if(utilisateurDto==null){
            errors.add("veuillez renseinger le nom d'utilasateur");
            errors.add("veuillez renseinger le prenom d'utilasateur");
            errors.add("veuillez renseinger le mot de passe d'utilasateur");
            errors.add("veuillez renseinger l'adress  d'utilasateur");
        }


        if (StringUtils.hasLength(utilisateurDto.getNom())) {
            errors.add("veuillez renseinger le nom d'utilasateur");
        }
        if (StringUtils.hasLength(utilisateurDto.getEmail())) {
            errors.add("veuillez renseinger l'email d'utilasateur");
        }
        if(StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("veuillez renseinger le prenom d'utilasateur");
        }
        if(StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("veuillez renseinger le mot de passe d'utilasateur");

        }
        if(utilisateurDto.getDateDeNaissance()==null ) {
            errors.add("  le champs date de naissance est obligatoire ");
        }

        if(utilisateurDto.getAdresse()==null ){
            errors.add("veuillez renseinger l'adress  d'utilasateur");

        }else {
            if(StringUtils.hasLength(utilisateurDto.getAdresse().getAdresse1())){
            errors.add("le champs adresse 1 obligatoire  ");

           }
            if(StringUtils.hasLength(utilisateurDto.getAdresse().getPays())){
                errors.add(" le champs adress obligatoire ");

            }
            if(StringUtils.hasLength(utilisateurDto.getAdresse().getVille())){
                errors.add(" le champs ville  obligatoire  ");

            }
            if(StringUtils.hasLength(utilisateurDto.getAdresse().getCodePostal())){
                errors.add("le champs code postale  obligatoire");

            }
        }
        return  errors;







    }

}
