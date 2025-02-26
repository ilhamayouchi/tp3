package entities;

public class Bibliotheque {
    private Document[] documents;
    private int nbDocuments;

    public Bibliotheque(int capacite) {
        documents = new Document[capacite];
        nbDocuments = 0;
    }

    public boolean ajouter(Document doc) {
        if (nbDocuments == documents.length) return false;
        documents[nbDocuments++] = doc;
        return true;
    }

    public boolean supprimer(int numEnreg) {
        for (int i = 0; i < nbDocuments; i++) {
            if (documents[i].getNumEnreg() == numEnreg) {
                documents[i] = documents[--nbDocuments]; 
                return true;
            }
        }
        return false;
    }

    public void afficherDocuments() {
        if (nbDocuments == 0) System.out.println("Aucun document.");
        else for (int i = 0; i < nbDocuments; i++) System.out.println(documents[i]);
    }

    public void afficherAuteurs() {
        for (int i = 0; i < nbDocuments; i++)
            if (documents[i] instanceof Livre) System.out.println(((Livre) documents[i]).getAuteur());
    }
}
