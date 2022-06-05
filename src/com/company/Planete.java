package com.company;

public abstract class Planete implements Comparable{

        String nom;
        long diametre;
        Atmosphere atmosphere;
        float distanceEtoile;

        static String forme = "Sphérique";
        static int nbPlanetesDecouvertes;

        Planete(String nom){
                this.nom = nom;
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



        static String expansion (double distance){
                if(distance<14)
                        return "Oh la la mais c'est super rapide !";
                else
                        return "Je rêve ou c'est plus rapide que la lumière";
        }

        @Override
        public int compareTo(Object o) {
                Planete autrePlanete = (Planete) o;
                return ((Float)distanceEtoile).compareTo(autrePlanete.distanceEtoile);
        }
}
