package com.company;

public class VaisseauDeGuerre extends Vaisseau{
    boolean armesDesactivees;

    void attaque(Vaisseau vaisseauAttaque, String arme, int dureeAttaque){
        if(armesDesactivees){
            System.out.println("Attaque impossible, l'armement est désactivé.");
        }
        else {
            System.out.println("Un vaisseau de type " + this.type + "attaque une vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
            vaisseauAttaque.resistanceDuBouclier = 0;
            vaisseauAttaque.blindage = vaisseauAttaque.blindage / 2;
        }
    }

    void desactiverArmes (){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " +type);
    }

}
