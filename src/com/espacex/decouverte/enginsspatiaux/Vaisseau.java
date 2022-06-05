package com.espacex.decouverte.enginsspatiaux;

public abstract class Vaisseau {
    public TypeVaisseau type;
    public int nombrePassagers;
    public int blindage;
    public int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }

    public abstract int emporterCargaison(int cargaison);

}
