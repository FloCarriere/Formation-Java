package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;
        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;
        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;
        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        System.out.println(jupiter.nom + " est une planète avec un diamètre de " + jupiter.diametre + " kilomètres.");

        System.out.println("Neptune a effectée " + neptune.revolution(-3542) + " tour(s) autour de son étoile");
        System.out.println("Mars a effectuée " + mars.rotation(-684) + " tour(s) sur elle même");
        System.out.println("Venus a effectuée " + venus.rotation(1250) + " tour(s) sur elle même");

        Vaisseau nouveauVaisseau = new VaisseauDeGuerre("FREGATE");
        nouveauVaisseau.nombrePassagers = 9;
        Vaisseau autreVaisseau = new VaisseauDeGuerre("CROISEUR");
        autreVaisseau.nombrePassagers = 42;

        System.out.println("Le nombre d'humain ayant deja séjourné sur Mars est " + mars.totalVisiteurs);

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = new Float(83f);
        atmosphereUranus.tauxHelium = new Float(15f);
        atmosphereUranus.tauxMethane = new Float(2.5F);
        atmosphereUranus.tauxAzote = new Float(0.0f);
        uranus.atmosphere = atmosphereUranus;

        if (uranus.atmosphere.tauxHydrogene != null)
        System.out.println("Hydrogene : " + uranus.atmosphere.tauxHydrogene);
        if (uranus.atmosphere.tauxHelium != null)
            System.out.println("Helium : " + uranus.atmosphere.tauxHelium);
        if (uranus.atmosphere.tauxMethane != null)
            System.out.println("Methane : " + uranus.atmosphere.tauxMethane);
        if (uranus.atmosphere.tauxAzote != null)
            System.out.println("Azote : " + uranus.atmosphere.tauxAzote);
        if (uranus.atmosphere.tauxCO2 != null)
            System.out.println("CO2 : " + uranus.atmosphere.tauxCO2);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println(Planete.nbPlanetesDecouvertes);

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nombrePassagers = 24;
        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        Vaisseau cargo = new VaisseauCivil("CARGO");
        Vaisseau vaisseauMonde = new VaisseauDeGuerre("VAISSEAU-MONDE");

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel type de vaisseau :");
        String vaisseauSelectionne = sc.nextLine();
        System.out.println("Quelle planete :");
        String nomPlanete = sc.nextLine();
        System.out.println("Quel tonnage :");
        int tonnage = sc.nextInt();

        Vaisseau vaisseau = null;
        switch (vaisseauSelectionne){
            case "CHASSEUR" : vaisseau = chasseur;
            break;
            case "FREGATE" : vaisseau = fregate;
                break;
            case "CROISEUR" : vaisseau = croiseur;
                break;
            case "CARGO" : vaisseau = cargo;
                break;
            case "VAISSEAU-MONDE" : vaisseau = vaisseauMonde;
                break;
            default:
                System.out.println("vaisseau inexistant");
        }
        PlaneteTellurique planete = null;
        switch (nomPlanete){
            case "VENUS": planete = venus; break;
            case "MERCURE": planete = mercure; break;
            case "TERRE": planete = terre; break;
            case "MARS": planete = mars; break;
            default:
                System.out.println("planete inexistante");
        }
        planete.accueillirVaisseau(vaisseau);
        int rejet = vaisseau.emporterCargaison(tonnage);

        System.out.println("Le rejet est de " + rejet);


    }
}
