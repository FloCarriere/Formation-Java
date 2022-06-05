package com.espacex.decouverte.enginsspatiaux;

public abstract class Vaisseau {
    public final TypeVaisseau type;
    public int nombrePassagers;
    public int blindage;
    public int resistanceDuBouclier;
    int tonnageMax;
    protected int tonnageActuel;

    public Vaisseau(TypeVaisseau type) {
        this.type = type;
    }

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type " + type);
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type " + type);
    }

    public abstract int emporterCargaison(int cargaison);

}
