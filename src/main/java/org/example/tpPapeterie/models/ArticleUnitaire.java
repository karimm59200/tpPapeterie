package org.example.tpPapeterie;

public class ArticleUnitaire extends Article {
     private String nom;
     private long prixUnitaire;


    public ArticleUnitaire(int ref, String nom, long prixUnitaire ) {
        super(ref);
        this.nom=nom;
        this.prixUnitaire=prixUnitaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(long prixUnitaire) {
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
