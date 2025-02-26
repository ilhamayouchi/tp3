package ma.projet.organisation;

public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String telephone;
    protected String email;
    
    static int compt = 0;

    public Personne(String nom, String prenom, String telephone, String email) {
        this.id = compt++;
        this.nom = nom;
        this.prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1).toLowerCase();
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void afficher();
}
