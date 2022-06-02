package com.company;

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
        atmosphereUranus.tauxHydrogene = 83;
        atmosphereUranus.tauxHelium = 15;
        atmosphereUranus.tauxMethane = 2.5F;
        uranus.atmosphere = atmosphereUranus;

        System.out.println(uranus.atmosphere.tauxHydrogene);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println(Planete.nbPlanetesDecouvertes);

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        ((VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("Résistance du bouclier du " + vaisseauMonde.type + " = " +vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du " + vaisseauMonde.type + " = " + vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        Vaisseau chasseurSurTerre = new VaisseauDeGuerre("CHASSEUR");
        terre.accueillirVaisseau(chasseurSurTerre);
        System.out.println("Le chasseur a rejeté " + chasseurSurTerre.emporterCargaison(20) + " tonnes.");
        Vaisseau fregateSurTerre = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre.nombrePassagers=100;
        terre.accueillirVaisseau(fregateSurTerre);
        System.out.println("La fregate a rejeté "+fregateSurTerre.emporterCargaison(45)+" tonnes.");
        System.out.println("La fregate a rejeté "+fregateSurTerre.emporterCargaison(12)+" tonnes.");

        Vaisseau fregateSurTerre2 = new VaisseauDeGuerre("FREGATE");
        fregateSurTerre2.nombrePassagers=14;
        terre.accueillirVaisseau(fregateSurTerre2);
        System.out.println("La fregate 2 a rejeté "+fregateSurTerre2.emporterCargaison(30)+" tonnes.");

        Vaisseau vaisseauMondeSurTerre = new VaisseauCivil("VAISSEAU-MONDE");
        terre.accueillirVaisseau(vaisseauMondeSurTerre);
        System.out.println("Le vaisseau-monde a rejeté "+vaisseauMondeSurTerre.emporterCargaison(1560)+" tonnes.");
        System.out.println("Le vaisseau-monde a rejeté "+vaisseauMondeSurTerre.emporterCargaison(600)+" tonnes.");
    }
}
