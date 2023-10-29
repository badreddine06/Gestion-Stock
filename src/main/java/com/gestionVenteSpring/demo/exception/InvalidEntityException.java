package com.gestionVenteSpring.demo.exception;

import lombok.Getter;

import java.util.List;

public class InvalidEntityException extends  RuntimeException{
    @Getter
    private Errorcodes errorcode;
    @Getter
    private List<String> errors;
    public InvalidEntityException(String message){
        super(message);
    }
    public InvalidEntityException(String message ,Throwable cause){
        super(message,cause);
    }
    public InvalidEntityException(String message ,Throwable cause, Errorcodes errorcode){
        super(message,cause);
        this.errorcode=errorcode;
    }
    public InvalidEntityException(String message , Errorcodes errorcode){
        super(message);
        this.errorcode=errorcode;
    }
    public InvalidEntityException(String message , Errorcodes errorcode, List<String> errors){
        super(message);
        this.errorcode=errorcode;
        this.errors=errors;
    }


}

