package com.company;

public class PlaneteTellurique extends Planete implements Habitable{

    int totalVisiteurs;

    Vaisseau[] baieAccostage;

    PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.baieAccostage = new Vaisseau[tailleBaie];
    }

    public void accueillirVaisseau(Vaisseau vaisseau){
        if (vaisseau instanceof VaisseauDeGuerre){
            ((VaisseauDeGuerre) vaisseau).desactiverArmes();
        }
        totalVisiteurs=totalVisiteurs+vaisseau.nombrePassagers;

        for(int i=0; i<baieAccostage.length;i++){
            if(baieAccostage[i]==null){
                baieAccostage[i]=vaisseau;
                break;
            }
        }

    }

    boolean restePlaceDisponible(){
        for(int i=0; i<baieAccostage.length;i++){
            if(baieAccostage[i]==null){
                return true;
            }
        }
        return false;
    }
}
