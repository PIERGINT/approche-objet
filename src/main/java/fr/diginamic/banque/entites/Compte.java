package fr.diginamic.banque.entites;

public class Compte {
	private int numcompte;
	private double soldecompte;

	public Compte(int numcompte, double soldecompte) {
		this.numcompte = numcompte;
		this.soldecompte = soldecompte;
	}

	public int getNumcompte() {
		return numcompte;
	}

	public void setNumcompte(int numcompte) {
		this.numcompte = numcompte;
	}

	public double getSoldecompte() {
		return soldecompte;
	}

	public void setSoldecompte(int soldecompte) {
		this.soldecompte = soldecompte;
	}

	public String toString() {
		return "Numéro de compte : " +numcompte + " | " + "Solde : "+ soldecompte+ " €";
	}
	
}
