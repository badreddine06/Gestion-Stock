package com.gestionVenteSpring.demo.handlers;

import com.gestionVenteSpring.demo.exception.Errorcodes;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorDTO {

    private Integer httpcodde;
    private Errorcodes code;
    private   String message;
    private  List<String> errors = new ArrayList<>();

}
