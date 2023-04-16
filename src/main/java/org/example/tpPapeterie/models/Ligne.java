package org.example.tpPapeterie;

public class Ligne {

    private int quantite;

    private ArticleUnitaire articleUnitaire;

    public Ligne(int quantite, ArticleUnitaire articleUnitaire) {
        this.quantite = quantite;
        this.articleUnitaire = articleUnitaire;
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
        long prix = articleUnitaire.getPrixUnitaire();
        String nomArti =  articleUnitaire.getNom();
        int refArti = articleUnitaire.getRef();





    }


    @Override
    public String toString() {
        return "Ligne{" +
                "quantite=" + quantite +
                ", articleUnitaire=" + articleUnitaire +
                '}';
    }


}

