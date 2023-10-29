package com.gestionVenteSpring.demo.Validator;

import com.gestionVenteSpring.demo.dto.CategoryDto;
import org.springframework.util.StringUtils;


import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors=new ArrayList<>();

        if (categoryDto ==null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("il faut entrer le code du categorie");
        }
        return errors;


    }
}
