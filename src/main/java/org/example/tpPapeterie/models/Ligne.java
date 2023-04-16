package org.example.tpPapeterie.models;

public class Ligne {

    private int quantite;

    private ArticleUnitaire articleUnitaire;

    public Ligne(int quantite, ArticleUnitaire articleUnitaire) {
        this.quantite = quantite;
        this.articleUnitaire = articleUnitaire;
    }
    public Ligne() {
    }


    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public ArticleUnitaire getArticleUnitaire() {
        return articleUnitaire;
    }

    public void setArticleUnitaire(ArticleUnitaire articleUnitaire) {
        this.articleUnitaire = articleUnitaire;
    }

    public void afficherLigne(){
        System.out.println(this.quantite + " " + articleUnitaire.getReference() + " " + articleUnitaire.getNom() + " " + articleUnitaire.getPrixUnitaire() + " " + getPrixTotalLigne());
    }

    public double getPrixTotalLigne(){
        return (double) this.quantite * this.articleUnitaire.getPrixUnitaire();
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "quantite=" + quantite +
                ", articleUnitaire=" + articleUnitaire +
                '}';
    }


}

