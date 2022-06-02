package com.company;

public class VaisseauDeGuerre extends Vaisseau{
    boolean armesDesactivees;

    VaisseauDeGuerre(String type){
        this.type = type;
        if(type.equals("CHASSEUR")){
            tonnageMax = 0;
        }
        else if (type.equals("FREGATE")){
            tonnageMax= 50;
        }
        else if (type.equals("CROISEUR")){
            tonnageMax=100;
        }
    }

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

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
        this.desactiverArmes();
    }

    int emporterCargaison(int cargaison){
        if (type.equals("CHASSEUR")){
            return cargaison;
        }
        else if (nombrePassagers < 12){
            return cargaison;
        }
        else{
            int tonnagePassagers = 2*nombrePassagers;
            int tonnageRestant=tonnageMax-tonnageActuel;
            int tonnageAConsiderer = (tonnagePassagers<tonnageRestant ? tonnagePassagers : tonnageRestant);
            if(cargaison>tonnageAConsiderer){
                tonnageActuel = tonnageMax;
                return cargaison - tonnageAConsiderer;
            }
            else{
                tonnageActuel=tonnageActuel+cargaison;
                return 0;
            }
        }
    }


}
