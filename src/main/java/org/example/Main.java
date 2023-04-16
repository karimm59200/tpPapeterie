package org.example;

import org.example.tpPapeterie.FactureInterface.FactureInterface;
import org.example.tpPapeterie.Menu.Menu;
import org.example.tpPapeterie.data.Magasin;
import org.example.tpPapeterie.models.AchatLot;
import org.example.tpPapeterie.models.ArticleUnitaire;
import org.example.tpPapeterie.models.Facture;
import org.example.tpPapeterie.models.Ligne;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        HashMap<String,ArticleUnitaire> produits = Magasin.getProduits();
        menu.getMenu(produits);
        Facture facture = new Facture();

        




        System.out.println("Veuillez selectionner un article");
        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();
        if(choix.equals("Q")){

            facture.getLignes().forEach(Ligne::afficherLigne);
            System.out.println(facture.calculerTotal());

        }else{

            System.out.println("Quelle quantité voulez vous?");
            int quantite = sc.nextInt();
            Ligne ligne = new Ligne();
                if(facture.getLignes().size()==0){
                    ligne = new Ligne(quantite,Magasin.getArticleUnitaire(choix));
                    facture.ajouterLigneFacture(ligne);
                }else{
                    ligne = facture.getLignes().stream().filter(x->x.getArticleUnitaire().getReference().equals(choix)).toList().get(0);
                    if(ligne == null){
                        ligne = new Ligne(quantite,Magasin.getArticleUnitaire(choix));
                        facture.ajouterLigneFacture(ligne);
                    }else{
                        ligne.setQuantite(ligne.getQuantite() + quantite);
                    };
                }

            if(ligne.getQuantite() >= 10){
                AchatLot.getLigneNouveauPrix(ligne);
            }

        System.out.println("Vos articles ont bien été ajoutés");
        menu.getMenu(produits);
    }
}}