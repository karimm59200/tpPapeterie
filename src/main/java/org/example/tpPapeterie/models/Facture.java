package org.example.tpPapeterie.models;

import lombok.Builder;
import org.example.tpPapeterie.FactureInterface.FactureInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Facture implements FactureInterface {

    private Client client;

    private int num;

    private Date date;

    private List<Ligne> lignes = new ArrayList<Ligne>();

    public Facture(Client client, int num, Date date, List<Ligne> lignes) {
        this.client = client;
        this.num = num;
        this.date = date;
        this.lignes = lignes;
    }

    public Facture() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

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
        this.lignes = lignes;
    }

    @Override
    public void ajouterLigneFacture(Ligne ligne){
       this.lignes.add(ligne);
    }

    @Override
    public void supprimerLigneFacture(String reference){
        this.lignes.stream().filter(ligne -> Objects.equals(ligne.getArticleUnitaire().getReference(), reference)).findFirst().ifPresent(lignes::remove);
    }

    public long calculerTotal(){
        return lignes.stream().mapToLong(ligne-> (long) (ligne.getArticleUnitaire().getPrixUnitaire() * ligne.getQuantite())).sum();
    }




}