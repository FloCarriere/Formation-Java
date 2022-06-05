package com.espacex.decouverte.enginsspatiaux;

public class VaisseauDeGuerre extends Vaisseau{
    private boolean armesDesactivees;

    public VaisseauDeGuerre(TypeVaisseau type){
        super(type);
        if(type==TypeVaisseau.CHASSEUR){
            tonnageMax = 0;
        }
        else if (type==TypeVaisseau.FREGATE){
            tonnageMax= 50;
        }
        else if (type==TypeVaisseau.CROISEUR){
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

    public void desactiverArmes(){
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " +type);
    }
    public void armesDesactivees(){
        armesDesactivees =false;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
        this.desactiverArmes();
    }

    public int emporterCargaison(int cargaison){
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
