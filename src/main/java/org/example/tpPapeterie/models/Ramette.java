package org.example.tpPapeterie;

public class Ramette  extends ArticleUnitaire{

    private int grammage;

    public Ramette(int ref, String nom, long prixUnitaire, int grammage) {
        super(ref, nom, prixUnitaire);
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
