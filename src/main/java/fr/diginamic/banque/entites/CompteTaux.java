package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxremun;
	private String comptenormal;
	private String comptetaux;

	public CompteTaux(int numcompte, double soldecompte, double tauxremun) {
		super(numcompte, soldecompte);
		this.tauxremun = tauxremun;
	}

	public String toString() {
		String info = super.toString();
		return info +" |" + "Taux : " +tauxremun+ "";
	}

	public double getTauxremun() {
		return tauxremun;
	}

	public void setTauxremun(int tauxremun) {
		this.tauxremun = tauxremun;
	}

	public String getComptenormal() {
		return comptenormal;
	}

	public void setComptenormal(String comptenormal) {
		this.comptenormal = comptenormal;
	}

	public String getComptetaux() {
		return comptetaux;
	}

	public void setComptetaux(String comptetaux) {
		this.comptetaux = comptetaux;
	}

}