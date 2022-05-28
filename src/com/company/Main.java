package com.company;

public class Main {

    public static void main(String[] args) {
        Planete mercure=new Planete();
        mercure.nom="Mercure";
        mercure.matiere="Tellurique";
        mercure.diametre=4880;
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println(jupiter.nom+" est une planète "+jupiter.matiere+" avec un diamètre de "+jupiter.diametre+" kilomètres.");

        Planete test = new Planete();
        System.out.println(test.nom +" - " + test.diametre);

        System.out.println("Neptune a effectée " + neptune.revolution(-3542)+ " tour(s) autour de son étoile");
        System.out.println("Mars a effectuée " + mars.rotation(-684) + " tour(s) sur elle même");
        System.out.println("Venus a effectuée " + venus.rotation(1250) + " tour(s) sur elle même");

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humain ayant deja séjourné sur Mars est " + mars.totalVisiteurs);

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83;
        atmosphereUranus.tauxHelium = 15;
        atmosphereUranus.tauxMethane = 2.5F;
        uranus.atmosphere = atmosphereUranus;

        System.out.println(uranus.atmosphere.tauxHydrogene);
    }
}
