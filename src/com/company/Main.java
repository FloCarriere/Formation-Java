package com.company;

public class Main {

    public static void main(String[] args) {
        Planete mercure = new Planete("Mercure");
        mercure.matiere = "Tellurique";
        mercure.diametre = 4880;
        Planete venus = new Planete("Venus");
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete("Terre");
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete("Mars");
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");

        System.out.println("Neptune a effectée " + neptune.revolution(-3542) + " tour(s) autour de son étoile");
        System.out.println("Mars a effectuée " + mars.rotation(-684) + " tour(s) sur elle même");
        System.out.println("Venus a effectuée " + venus.rotation(1250) + " tour(s) sur elle même");

        Vaisseau nouveauVaisseau = new Vaisseau();
        nouveauVaisseau.type = "FREGATE";
        nouveauVaisseau.nombrePassagers = 9;
        mars.accueillirVaisseau(nouveauVaisseau);
        Vaisseau autreVaisseau = new Vaisseau();
        autreVaisseau.type = "CROISEUR";
        autreVaisseau.nombrePassagers = 42;
        mars.accueillirVaisseau(autreVaisseau);
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

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "CHASSEUR";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "VAISSEAU-MONDE";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaque(vaisseauMonde, "lasers photoniques", 3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("Résistance du bouclier du " + vaisseauMonde.type + " = " +vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du " + vaisseauMonde.type + " = " + vaisseauMonde.blindage);
    }
}
