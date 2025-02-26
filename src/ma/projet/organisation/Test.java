package ma.projet.organisation;

public class Test {
    public static void main(String[] args) {
        
        Filiere irt = new Filiere("IRT", "Ingénierie des réseaux et télécommunications", 3);
        Filiere ite = new Filiere("2ITE", "Ingénierie informatique et technologies émergentes", 2);

        Etudiant etu1 = new Etudiant("safi", "Amal", "0612345678", "amal.google@gmail.com", "22885676");
        Etudiant etu2 = new Etudiant("alami", "Samir", "0678945612", "samir.google@gmail.com", "23585976");
        Etudiant etu3 = new Etudiant("ayouchi", "Aya", "0654321987", "aya.google@gmail.com", "24567898");
        Etudiant etu4 = new Etudiant("Benfdil", "Omar", "0687654321", "omar.google@gmail.com", "26543219");

        
        irt.ajouterEtudiant(etu1);
        irt.ajouterEtudiant(etu2);
        irt.ajouterEtudiant(etu3);
        irt.ajouterEtudiant(etu4); 

        
        irt.afficherEtudiants();
    }
}
