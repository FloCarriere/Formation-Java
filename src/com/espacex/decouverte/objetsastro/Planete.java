package com.espacex.decouverte.objetsastro;

public abstract class Planete implements Comparable{

        public String nom;
        public long diametre;
        public Atmosphere atmosphere;
        public float distanceEtoile;

        static String forme = "Sphérique";
        public static int nbPlanetesDecouvertes;

        Planete(String nom){
                this.nom = nom;
                nbPlanetesDecouvertes++;
        }

        public final int revolution(int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile.");
                return angle /360;
        }
        public final int rotation (int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
                return angle /360;
        }



        public static String expansion (double distance){
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
