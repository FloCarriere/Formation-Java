package com.company;

public class PlaneteTellurique extends Planete implements Habitable{

    int totalVisiteurs;
    Vaisseau vaisseauActuellementAccoste;

    PlaneteTellurique(String nom) {
        super(nom);
    }

    public Vaisseau accueillirVaisseau(Vaisseau vaisseau){
        totalVisiteurs = totalVisiteurs + vaisseau.nombrePassagers;
        if (vaisseauActuellementAccoste==null){
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else{
            System.out.println("Un vaisseau de type " + vaisseauActuellementAccoste.type + " doit s'en aller.");
        }
        Vaisseau vaisseauPrecedent=vaisseauActuellementAccoste;
        vaisseauActuellementAccoste=vaisseau;
        return vaisseauPrecedent;

    }
}
