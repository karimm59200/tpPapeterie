package org.example.tpPapeterie.Menu;

import org.example.tpPapeterie.models.ArticleUnitaire;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    public void getMenu(HashMap<String,ArticleUnitaire> produits){
        int compteur = 1;

        for (Map.Entry<String, ArticleUnitaire> entry : produits.entrySet()) {
            String key = entry.getKey();
            ArticleUnitaire value = entry.getValue();
            System.out.println(compteur + " - " + value.getNom() + " - " + value.getPrixUnitaire());
            compteur++;
        }
        System.out.println("Q - Editer une facture");

    }

}

