package org.example.tpPapeterie;

public class Article {
     private int ref;

    public Article(int ref) {
        this.ref = ref;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ref=" + ref +
                '}';
    }
}
