package org.example.tpPapeterie.data;

import org.example.tpPapeterie.models.ArticleUnitaire;
import org.example.tpPapeterie.models.Ramette;
import org.example.tpPapeterie.models.Stylo;
import java.util.HashMap;
import java.util.Map;

public class Magasin {

    static ArticleUnitaire stylo1 = new Stylo("1", "stylo bic", 1.50, "noir");
    static ArticleUnitaire stylo2 = new Stylo("2", "stylo bic", 2.50, "bleu");
    static ArticleUnitaire stylo3 = new Stylo("3", "stylo bic", 2.50, "rouge");
    static ArticleUnitaire stylo4 = new Stylo("4", "stylo bic", 2.50, "vert");

    static ArticleUnitaire ramette1 = new Ramette("5","ramette 500 feuilles", 6.59, 80);
    static ArticleUnitaire ramette2 = new Ramette("6","ramette 500 feuilles", 7.59, 90);
    static ArticleUnitaire ramette3 = new Ramette("7","ramette 500 feuilles", 8.59, 100);
    static ArticleUnitaire ramette4 = new Ramette("8","ramette 500 feuilles", 9.59, 120);



    public static HashMap<String, ArticleUnitaire> getProduits(){

        HashMap<String, ArticleUnitaire> produits = new HashMap<>();

        produits.put(stylo1.getReference(),stylo1);
        produits.put(stylo2.getReference(),stylo2);
        produits.put(stylo3.getReference(),stylo3);
        produits.put(stylo4.getReference(),stylo4);
        produits.put(ramette1.getReference(),ramette1);
        produits.put(ramette2.getReference(),ramette2);
        produits.put(ramette3.getReference(),ramette3);
        produits.put(ramette4.getReference(),ramette4);

        return produits;
    }


    public static ArticleUnitaire getArticleUnitaire(String reference) {
        ArticleUnitaire articleUnitaire = new ArticleUnitaire();
        for (
                Map.Entry<String, ArticleUnitaire> entry : getProduits().entrySet()) {
            String key = entry.getKey();
            ArticleUnitaire value = entry.getValue();
           if(key.equals(reference)) articleUnitaire = value;
        }
        return articleUnitaire;
    }

}
