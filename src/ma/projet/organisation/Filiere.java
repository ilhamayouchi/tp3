package ma.projet.organisation;

import java.util.Arrays;

public class Filiere {
    
    private int id;
    private String code;
    private String libelle;
    private Etudiant[] etudiants;
    private int nbEtudiants;
    static int comp = 0;
    
    public Filiere(String code, String libelle, int capacite) {
        this.id = comp++;
        this.code = code;
        this.libelle = libelle;
        this.nbEtudiants = 0;
        this.etudiants = new Etudiant[capacite]; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    @Override
    public String toString() {
        return "Filiere [id=" + id + ", code=" + code + ", libelle=" + libelle + ", etudiants="
                + Arrays.toString(etudiants) + ", nbEtudiants=" + nbEtudiants + "]";
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        if (nbEtudiants < etudiants.length) {
            etudiants[nbEtudiants] = etudiant;
            nbEtudiants++;
        } else {
            System.out.println("Impossible d'ajouter plus d'étudiants dans la filière " + libelle);
        }
    }

    public void afficherEtudiants() {
        System.out.println("Liste des étudiants de la filière " + libelle + " (" + code + ") :");
        for (int i = 0; i < nbEtudiants; i++) {
            etudiants[i].afficher();
        }
    }
}
