package com.espacex.decouverte.objetsastro;

import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;

public class PlaneteTellurique extends Planete implements Habitable{

    public int totalVisiteurs;

    Vaisseau[][] baieAccostage;

    public PlaneteTellurique(String nom, int tailleBaie) {
        super(nom);
        this.baieAccostage = new Vaisseau[tailleBaie][tailleBaie];
    }

    public void accueillirVaisseaux(Vaisseau... vaisseaux){

        for (int i=0; i<vaisseaux.length; i++) {

            int indexZone=0;
            switch (vaisseaux[i].type){
                case CARGO :
                case VAISSEAUMONDE:
                    indexZone=1;
            }

            for (int index = 0; index < baieAccostage[indexZone].length; index++) {
                if (baieAccostage[indexZone][index] == null) {
                    baieAccostage[indexZone][index] = vaisseaux[i];
                    break;
                }
            }

            if (vaisseaux[i] instanceof VaisseauDeGuerre) {
                ((VaisseauDeGuerre) vaisseaux[i]).desactiverArmes();
            }

            totalVisiteurs = totalVisiteurs + vaisseaux[i].nombrePassagers;

        }

    }

    public boolean restePlaceDisponible(Vaisseau vaisseau){
        int indexZone=0;
        switch (vaisseau.type){
            case CARGO :
            case VAISSEAUMONDE:
                indexZone=1;
        }

        for(int i=0; i<baieAccostage[indexZone].length;i++){
            if(baieAccostage[indexZone][i]==null){
                return true;
            }
        }
        return false;
    }
}
