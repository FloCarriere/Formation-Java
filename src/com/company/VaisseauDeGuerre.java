package com.company;

public class VaisseauDeGuerre extends Vaisseau{


    void attaque(Vaisseau vaisseauAttaque, String arme, int dureeAttaque){
        System.out.println("Un vaisseau de type " + this.type + "attaque une vaisseau de type " + vaisseauAttaque.type +" en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
        vaisseauAttaque.resistanceDuBouclier = 0;
        vaisseauAttaque.blindage = vaisseauAttaque.blindage/2;
    }
}
