package com.company;

public class Planete {

        String nom;
        String matiere;
        long diametre;
        int totalVisiteurs;
        Atmosphere atmosphere;
        Vaisseau vaisseauActuellementAccoste;


        int revolution(int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile.");
                return angle /360;
        }
        int rotation (int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
                return angle /360;
        }

        Vaisseau accueillirVaisseau(Vaisseau vaisseau){
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
