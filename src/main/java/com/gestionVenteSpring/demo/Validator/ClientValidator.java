package com.gestionVenteSpring.demo.Validator;

import com.gestionVenteSpring.demo.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {
    public static List<String> validate(ClientDto clientDto){
        List<String> errors=new ArrayList<>();
        errors.add("veuillez renseinger le code Article ");
        if(clientDto==null){
        errors.add("veuillez renseinger le nom Client ");
        errors.add("veuillez renseinger le prenom Client ");
        errors.add("veuillez renseinger le mail Client ");
        errors.add("veuillez renseinger le num tel Client");
        return errors;
        }

        if(!StringUtils.hasLength(clientDto.getNom())){
        errors.add("veuillez renseinger le nom Client ");
    }
        if(!StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("veuillez renseinger le prenom Client ");
        }
        if(!StringUtils.hasLength(clientDto.getMail())){
            errors.add("veuillez renseinger le mail Client ");
        }
        if(!StringUtils.hasLength(clientDto.getNumTel())){
            errors.add("veuillez renseinger le num tel Client");
        }



        return errors;
    }
}
