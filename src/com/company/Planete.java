package com.company;

public class Planete {

        String nom;
        String matiere;
        long diametre;
        int totalVisiteurs;
        Atmosphere atmosphere;
        Vaisseau vaisseauActuellementAccoste;
        static String forme = "Sphérique";
        static int nbPlanetesDecouvertes;

        Planete(){
                nbPlanetesDecouvertes++;
        }


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

        static String expansion (double distance){
                if(distance<14)
                        return "Oh la la mais c'est super rapide !";
                else
                        return "Je rêve ou c'est plus rapide que la lumière";
        }

}
