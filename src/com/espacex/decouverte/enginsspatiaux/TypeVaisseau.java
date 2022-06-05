package com.espacex.decouverte.enginsspatiaux;

public enum TypeVaisseau {
    CHASSEUR ("Chasseur"),
    FREGATE("Frégate"),
    CROISEUR("Croiseur"),
    CARGO("Cargo"),
    VAISSEAUMONDE("Vaisseau-monde");

    String nom;

    private  TypeVaisseau (String nom){
        this.nom = nom;
    }
}
