package org.example.tpPapeterie;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String nom;
    private List<Facture> factures;

    public Client(String nom) {
        this.nom = nom;
        this.factures = new ArrayList<>();
    }

    public String nom() {
        return nom;
    }

    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public List<Facture> factures() {
        return factures;
    }

    public Client setFactures(List<Facture> factures) {
        this.factures = factures;
        return this;
    }

    private void ajouterFacture(Facture facture) {
        this.factures.add(facture);
    }


}
