package com.gestionVenteSpring.demo.exception;

public enum Errorcodes {
    ARTICLE_NOT_FOUND(1000),
    ARTICLE_NOT_VALID(1001),
    CATEGORY_NOT_FOUND(2000),
    CLIENT_NOT_FOUND(3000),
    COMMANDE_CLIENT_NOT_FOUND(4000),
    COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
    ENTREPRISE_NOT_FOUND(6000),
    FOURNISSEUR_NOT_FOUND(7000),
    LIGNE_COMMANDE_CLIENT_NOT_FOUND(8000),
    LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(9000),
    LIGNE_VENTE_NOT_FOUND(10000),
    MVT_STK_NOT_FOUND(11000),
    UTILISATEUR_NOT_FOUND(12000),
    VENTEC_NOT_FOUND(13000);



    private int code;

    public int getCode() {
        return code;
    }

    Errorcodes(int code) {
        this.code=code;
    }
}
