package org.example.tpPapeterie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facture {

    private int num;

    private Date date;

    private List<Ligne> lignes;

    public Facture(int num) {
        this.num = num;
        this.date =  new Date();
        this.lignes = new ArrayList<>();
    }

    public Facture(){}

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Ligne> lignes) {
        lignes = lignes;
    }

    public void ajouterLigneFacture(Ligne ligne){
        this.lignes.add(ligne);
    }

    public void supprimerLigneFacture(int ref){
        this.lignes.stream().filter(ligne -> ligne.getArticleUnitaire().getRef()== ref).findFirst().ifPresent(ligne -> this.lignes.remove(ligne));
    }

    public long calculerTotal(){
        return this.lignes.stream().mapToLong(ligne->ligne.getArticleUnitaire().getPrixUnitaire()*ligne.getQuantite()).sum();
    }


}