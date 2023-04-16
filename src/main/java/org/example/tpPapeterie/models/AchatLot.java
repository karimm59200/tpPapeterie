package org.example.tpPapeterie.models;

public class AchatLot extends Article {

     private int quantite;

     private ArticleUnitaire articleUnitaire;

    private static double remise = 0.1;

    public AchatLot(String reference, int quantite, double remise, ArticleUnitaire articleUnitaire) {
        super(reference);
        this.quantite=quantite;
        this.remise=remise;
        this.articleUnitaire=articleUnitaire;
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

    public double getRemise() {
        return remise;
    }

    public void setRemise(int remise) {
        this.remise = remise;
    }

    public static Ligne getLigneNouveauPrix(Ligne ligne){
        double prix = ligne.getArticleUnitaire().getPrixUnitaire();
        ligne.getArticleUnitaire().setPrixUnitaire(prix - (prix * remise));
        return ligne;
    }

    @Override
    public String toString() {
        return "AchatLot{" +
                "quantite=" + quantite +
                ", articleUnitaire=" + articleUnitaire +
                ", remise=" + remise +
                '}';
    }
}
