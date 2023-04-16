package org.example.tpPapeterie.models;

public class Stylo extends ArticleUnitaire {

    private String couleur;

    public Stylo(String reference, String nom, double prixUnitaire, String couleur) {
        super(reference, nom, prixUnitaire);
        this.couleur=couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
