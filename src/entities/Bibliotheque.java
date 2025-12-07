package entities;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	private int capacite;
	private List<Document> docu;

	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		docu = new ArrayList<>();
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public String toString() {
		return "Bibliotheque [capacite=" + capacite + "]";
	}

	public void afficherDocuments() {
		if (docu.isEmpty()) {
			System.out.println("La bibliothèque est vide.");
			return;
		}
		for (Document d : docu) {
			System.out.println(d);
		}
	}

	public boolean ajouter(Document doc) {

		if (docu.size() >= capacite)
			return false;
		docu.add(doc);
		return true;
	}

	public boolean supprimer(Document doc) {

		if (doc == null)
			return false;

		return docu.remove(doc);

	}

	public Document document(int numEnrg) {
		for (Document doc : docu) {
			if (doc.getNumEnreg() == numEnrg) {
				return doc;
			}
		}
		return null;
	}

	public void afficherAuteurs() {
		System.out.println("Auteurs :");
		for (Document d : docu) {
			if (d instanceof Livre) {
				System.out.println(((Livre) d).getAuteur());
			}
		}
	}

}
