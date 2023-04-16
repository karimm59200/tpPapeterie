package org.example.tpPapeterie.models;

import java.util.List;

public class Papeterie {

String nom;
List<Article> article;
List<Client> client;


    public Papeterie(String nom, List<Article> article, List<Client> client) {
        this.nom = nom;
        this.article = article;
        this.client = client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Papeterie{" +
                "nom='" + nom + '\'' +
                ", article=" + article +
                ", client=" + client +
                '}';
    }


    public static void main(String[] args) {

//        HashMap< Integer, String> produits = new HashMap<>();
//
//        produits.put(1,"stylo rouge");
//        produits.put(2,"stylo bleu");
//        produits.put(3,"style vert");
//        produits.put(4, "ramette 35gr");
//        produits.put(5, "ramette 70gr");
//        produits.put(6, "ramette 120gr");
//        produits.put(7, "ramette 160gr");
//
//        System.out.println(produits);
    }

}
