package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Bibliotheque;
import entities.Document;
import entities.Livre;
import entities.Revue;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Donner la capacité de la bibliothèque  : ");
		int cap = sc.nextInt();
		Bibliotheque biblio = new Bibliotheque(cap);
		biblio.ajouter(new Livre("La gloire de mon père", "Marcel Pagnol" , 100));
		biblio.ajouter(new Revue("Antigone", "Janvier", 1948));
		int choix;
		System.out.println("   Menu Bibliothèque   ");
		System.out.println("1,   Ajouter un document");
		System.out.println("2 - Afficher tous les documents");
		System.out.println("3 - Supprimer un document");
		System.out.println("4 - Rechercher un document");
		System.out.println("0 - Quitter");
		System.out.print("Votre choix : ");

        choix = sc.nextInt();
        sc.nextLine();

        switch (choix) {
            case 1:
                System.out.print("Numéro d'enregistrement : ");
                int num = sc.nextInt();
                sc.nextLine();

                System.out.print("Titre : ");
                String titre = sc.nextLine();

                if (biblio.ajouter(new Document(titre))) {
                    System.out.println("Document ajouté.");
                } else {
                    System.out.println("Échec : numéro déjà existant.");
                }
                break;

            case 2:
                biblio.afficherDocuments();
                break;

            case 3:
                System.out.print("Numéro du document à supprimer : ");
                String numS = sc.nextLine();
                if (biblio.supprimer(new Document(numS))) {
                    System.out.println("Document supprimé.");
                } else {
                    System.out.println("Document introuvable.");
                }
                break;

            case 4:
                System.out.print("Numéro du document : ");
                int numR = sc.nextInt();
                Document d = biblio.document(numR);
                if (d != null) {
                    System.out.println("Document trouvé : " + d);
                } else {
                    System.out.println("Introuvable.");
                }
                break;

            case 0:
                System.out.println("Fin du programme.");
                break;

            default:
                System.out.println("Choix invalide.");
        }

    while (choix != 0);

    sc.close();
}

}
