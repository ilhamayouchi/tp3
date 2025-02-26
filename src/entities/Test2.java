package entities;

import java.util.Scanner;
public class Test2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Entrez la capacité de la bibliothèque :");
	        int capacite = scanner.nextInt();
	        Bibliotheque biblio = new Bibliotheque(capacite);

	        
	        biblio.ajouter(new Livre("Antigone", "Jean Anouilh", 150));
	        biblio.ajouter(new Revue("Science et Vie", 5, 2023));
	        biblio.ajouter(new Dictionnaire("Larousse Français", "Français"));

	        while (true) {
	            System.out.println("\nChoisissez une opération :");
	            System.out.println("1- Ajouter un document");
	            System.out.println("2- Supprimer un document");
	            System.out.println("3- Afficher les documents");
	            System.out.println("4- Afficher les auteurs");
	            System.out.println("5- Quitter");

	            int choix = scanner.nextInt();
	            switch (choix) {
	                case 1:
	                    scanner.nextLine();
	                    System.out.print("Titre du livre : ");
	                    String titre = scanner.nextLine();
	                    System.out.print("Auteur :");
	                    String auteur = scanner.nextLine();
	                    System.out.print("Nombre de pages :");
	                    int pages = scanner.nextInt();
	                    biblio.ajouter(new Livre(titre, auteur, pages));
	                    System.out.println("Livre ajouté");
	                    break;
	                case 2:
	                    System.out.print("Entrez le numéro d'enregistrement a supprimer ");
	                    int num = scanner.nextInt();
	                    if (biblio.supprimer(num)) {
	                        System.out.println("Document supprime");
	                    } else {
	                        System.out.println("Document non trouvé");
	                    }
	                    break;
	                case 3:
	                    biblio.afficherDocuments();
	                    break;
	                case 4:
	                    biblio.afficherAuteurs();
	                    break;
	                case 5:
	                    System.out.println("Au revoir");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Choix invalide");
	            }
	        }
	    }
	}



