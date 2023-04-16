package org.example.tpPapeterie.FactureInterface;

import org.example.tpPapeterie.models.Ligne;

public interface FactureInterface {

    void ajouterLigneFacture(Ligne ligne);

     void supprimerLigneFacture(String reference);

     long calculerTotal();
}
