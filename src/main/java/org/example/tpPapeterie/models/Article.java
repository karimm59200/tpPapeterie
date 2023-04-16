package org.example.tpPapeterie.models;

public class Article {
     private String reference;

    public Article(String ref) {
        this.reference = ref;
    }

    public Article() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ref=" + reference +
                '}';
    }
}
