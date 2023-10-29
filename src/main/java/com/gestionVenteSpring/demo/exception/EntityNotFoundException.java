package com.gestionVenteSpring.demo.exception;

public class EntityNotFoundException extends  RuntimeException{
    private Errorcodes errorcode;
    public EntityNotFoundException(String message){
        super(message);
    }
    public EntityNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    public EntityNotFoundException(String message, Throwable cause, Errorcodes errorcode){
        super(message, cause);
        this.errorcode=errorcode;
    }
    public EntityNotFoundException(String message ,Errorcodes errorcode){
        super(message);
        this.errorcode=errorcode;
    }
}
