package com.company;

public class PlaneteTellurique extends Planete implements Habitable{

    int totalVisiteurs;

    Vaisseau[] baieAccostage;

    PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.baieAccostage = new Vaisseau[tailleBaie];
    }

    public void accueillirVaisseaux(Vaisseau... vaisseaux){

        for (int i=0; i<vaisseaux.length; i++) {

            for (int index = 0; index < baieAccostage.length; index++) {
                if (baieAccostage[index] == null) {
                    baieAccostage[index] = vaisseaux[i];
                    break;
                }
            }

            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }

            totalVisiteurs = totalVisiteurs + vaisseaux[i].nombrePassagers;

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
