package com.company;

public abstract class Vaisseau {
    TypeVaisseau type;
    int nombrePassagers;
    int blindage;
    int resistanceDuBouclier;
    int tonnageMax;
    int tonnageActuel;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }

    abstract int emporterCargaison(int cargaison);

}
