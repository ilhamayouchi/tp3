package entities;

public class Revue extends Document {
    private int mois;
    private int annee;

    public Revue(String titre, int mois, int annee) {
        super(titre);
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Revue [mois=" + mois + ", annee=" + annee + "]";
    }
}
