package org.example.tpPapeterie.models;

public class ArticleUnitaire extends Article {
     private String nom;
     private double prixUnitaire;


    public ArticleUnitaire(String reference, String nom, double prixUnitaire ) {
        super(reference);
        this.nom=nom;
        this.prixUnitaire=prixUnitaire;
    }
    public ArticleUnitaire() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire{" +
                "nom='" + nom + '\'' +
                ", prixUnitaire=" + prixUnitaire +
                '}';
    }
}
