package org.example.tpPapeterie;

public class Stylo extends ArticleUnitaire {

    private String couleur;

    public Stylo(int ref, String nom, long prixUnitaire, String couleur) {
        super(ref, nom, prixUnitaire);
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
