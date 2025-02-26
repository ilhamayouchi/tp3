package entities;

public class Document {
	private int numEnreg;
    private String titre;
    static int comp= 0;
    
    public Document(String titre) {
        this.numEnreg = comp++;
        this.titre = titre;
    }
    public int getNumEnreg() {
        return numEnreg;
    }

    public String getTitre() {
        return titre;
    }
    public String toString() {
        return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
    }


}
