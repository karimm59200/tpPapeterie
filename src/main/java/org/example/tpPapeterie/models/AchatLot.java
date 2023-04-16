package org.example.tpPapeterie;

public class AchatLot extends Article {

     private int quantite;

     private ArticleUnitaire articleUnitaire;

    private long remise;

    public AchatLot(int ref, int quantite, long remise, ArticleUnitaire articleUnitaire) {
        super(ref);
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

    public long getRemise() {
        return remise;
    }

    public void setRemise(long remise) {
        this.remise = remise;
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
