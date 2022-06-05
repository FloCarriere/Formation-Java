package com.company;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Galaxie systemeSolaire = new Galaxie();
        systemeSolaire.nom = "Système solaire";


        PlaneteTellurique mercure = new PlaneteTellurique("Mercure",1);
        mercure.diametre = 4880;
        systemeSolaire.planetes.add(mercure);
        mercure.distanceEtoile = 57.9f;
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        venus.diametre = 12100;
        venus.distanceEtoile=108.2f;
        systemeSolaire.planetes.add(venus);
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 10);
        terre.diametre = 12756;
        terre.distanceEtoile=149.6f;
        systemeSolaire.planetes.add(terre);
        PlaneteTellurique mars = new PlaneteTellurique("Mars", 3);
        mars.diametre = 6792;
        mars.distanceEtoile=227.9f;
        systemeSolaire.planetes.add(mars);
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        systemeSolaire.planetes.add(jupiter);
        jupiter.distanceEtoile=778.3f;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        systemeSolaire.planetes.add(saturne);
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        uranus.distanceEtoile = 2877.38f;
        systemeSolaire.planetes.add(uranus);
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        systemeSolaire.planetes.add(neptune);

        System.out.println(jupiter.nom + " est une planète avec un diamètre de " + jupiter.diametre + " kilomètres.");

        System.out.println("Neptune a effectée " + neptune.revolution(-3542) + " tour(s) autour de son étoile");
        System.out.println("Mars a effectuée " + mars.rotation(-684) + " tour(s) sur elle même");
        System.out.println("Venus a effectuée " + venus.rotation(1250) + " tour(s) sur elle même");

        Vaisseau nouveauVaisseau = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        nouveauVaisseau.nombrePassagers = 9;
        Vaisseau autreVaisseau = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        autreVaisseau.nombrePassagers = 42;

        System.out.println("Le nombre d'humain ayant deja séjourné sur Mars est " + mars.totalVisiteurs);

        Atmosphere atmosphereMars = new Atmosphere();
        atmosphereMars.constituant.put("CO2", 95f);
        atmosphereMars.constituant.put("N2", 3f);
        atmosphereMars.constituant.put("AR", 1.5f);
        atmosphereMars.constituant.put("NO", 0.013f);

        mars.atmosphere = atmosphereMars;

        System.out.println("L'atmosphère de Mars est composé : ");

        for (Map.Entry<String, Float> constituant: mars.atmosphere.constituant.entrySet() ) {
            System.out.println(constituant.getValue() +"% de "+constituant.getKey()   );
        }
        

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println(Planete.nbPlanetesDecouvertes);

        for(Planete nextPlanete : systemeSolaire.planetes){
            System.out.println("La planete suivante est "+nextPlanete.nom);
        }

        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nombrePassagers = 4;
        chasseur2.blindage=156;
        chasseur2.resistanceDuBouclier=2;
        Vaisseau chasseur3 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur3.nombrePassagers = 5;
        chasseur3.blindage=156;
        chasseur3.resistanceDuBouclier=2;
        Vaisseau cargo2 = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo2.nombrePassagers = 1001;
        cargo2.blindage=1520;
        cargo2.resistanceDuBouclier=20;

        terre.accueillirVaisseaux(chasseur2, chasseur3, cargo2);

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nombrePassagers = 24;
        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        Vaisseau vaisseauMonde = new VaisseauDeGuerre(TypeVaisseau.VAISSEAUMONDE);

        Boolean recommencer=true;
        Scanner sc = new Scanner(System.in);
        while (recommencer) {

            System.out.println("Quel type de vaisseau :");
            String vaisseauSelectionne = sc.nextLine();
            System.out.println("Sur quelle planete tellurique en partant du soleil du système solaire voulez vous vous poser : Mercure, Venus, Terre ou Mars");
            String nomPlanete = sc.nextLine();
            System.out.println("Quel tonnage :");
            int tonnage = sc.nextInt();
            sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(vaisseauSelectionne);

            Vaisseau vaisseau = null;
            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseau = chasseur;
                    break;
                case FREGATE:
                    vaisseau = fregate;
                    break;
                case CROISEUR:
                    vaisseau = croiseur;
                    break;
                case CARGO:
                    vaisseau = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseau = vaisseauMonde;
                    break;
                default:
                    System.out.println("vaisseau inexistant");
            }

            Planete planeteSelectionnee=null;
            for (Planete p : systemeSolaire.planetes) {
                if(p.nom.equals(nomPlanete)){
                    planeteSelectionnee= p;
                    break;
                }
                
            }

            if (planeteSelectionnee instanceof PlaneteGazeuse){
                System.out.println("La planete selectionnée n'est pas une planète tellurique. Recommencer");
                continue;
            }

            PlaneteTellurique planete = (PlaneteTellurique) planeteSelectionnee;

            if (!planete.restePlaceDisponible(vaisseau)) {
                System.out.println("Le vaisseau ne pas se poser sur la planète par manque de place dans la baie.");
            } else {
                planete.accueillirVaisseaux(vaisseau);
                int rejet = vaisseau.emporterCargaison(tonnage);

                System.out.println("Le rejet est de " + rejet);
            }
            System.out.println("Voulez vous recommencer");
            recommencer=sc.nextLine().equalsIgnoreCase("oui");
        }







    }
}
