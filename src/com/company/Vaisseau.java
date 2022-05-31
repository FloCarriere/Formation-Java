package com.company;

public class Vaisseau {
    String type;
    int nombrePassagers;
    int blindage;
    int resistanceDuBouclier;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }
}
