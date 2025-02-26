package ma.projet.organisation;

public class Etudiant extends Personne {
    private String cne;

    public Etudiant(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant [ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", CNE: " + cne + "]");
    }
}
