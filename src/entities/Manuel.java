package entities;

public class Manuel extends Livre {
    private String niveau;

    public Manuel(String titre, String auteur, int nbPages, String niveau) {
        super(titre, auteur, nbPages);
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return super.toString() + ", Manuel [niveau=" + niveau + "]";
    }
}
