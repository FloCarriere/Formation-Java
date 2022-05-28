package com.company;

public class Planete {

        String nom;
        String matiere;
        long diametre;
        int totalVisiteurs;
        Atmosphere atmosphere;


        int revolution(int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne autour de mon étoile.");
                return angle /360;
        }
        int rotation (int angle){
                System.out.println("Je suis la planète " + this.nom + " et je tourne sur moi-même.");
                return angle /360;
        }

        void accueillirVaisseau(int nouveauHumain){
                totalVisiteurs = totalVisiteurs + nouveauHumain;
        }
        void accueillirVaisseau(String typeVaisseau){
                switch (typeVaisseau){
                        case "CHASSEUR": totalVisiteurs = totalVisiteurs + 3; break;
                        case "FREGATE": totalVisiteurs += 12; break;
                        case "CROISEUR": totalVisiteurs += 50; break;
                        default:
                                System.out.println("pas normal");
                }
        }
}
