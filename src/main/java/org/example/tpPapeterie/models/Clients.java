package org.example.tpPapeterie.models;

public enum Clients {
    MOHAMED_BENABOU("Mohamed Benabou"),
    ROBERT_REDFORD("Robert Redford"),
    BRAD_PITT("Brad Pitt");

    public final String label;

    private Clients(String label) {
        this.label = label;
    }

}
