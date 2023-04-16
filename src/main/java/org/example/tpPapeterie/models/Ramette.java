package org.example.tpPapeterie.models;

public class Ramette  extends ArticleUnitaire{

    private int grammage;

    public Ramette(String reference, String nom, double prixUnitaire, int grammage) {
        super(reference, nom, prixUnitaire);
        this.grammage=grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    public void setGrammage(int grammage) {
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "grammage=" + grammage +
                '}';
    }
}
