package entities;

public class Roman extends Livre {
    private double prix;

    public Roman(String titre, String auteur, int nbPages, double prix) {
        super(titre, auteur, nbPages);
        this.prix = prix;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roman [prix=" + prix + "]";
    }
}
