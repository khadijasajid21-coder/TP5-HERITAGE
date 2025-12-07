package entities;

public class Document {
	protected int numEnreg = 1;
	protected String titre;

	public Document(String titre) {
		super();
		this.numEnreg = numEnreg++;
		this.titre = titre;
	}

	public int getNumEnreg() {
		return numEnreg;
	}

	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
}
