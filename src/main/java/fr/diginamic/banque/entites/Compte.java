package fr.diginamic.banque.entites;

import java.util.*;

public class Compte {
	private int numcompte;
	private double soldecompte;
	private boolean number;

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
		public boolean equals(Object object) {
			if (!(object instanceof Compte)) {
				
			return false;
			}
			Compte other = (Compte) object;
			return numcompte==other.getNumcompte()&& soldecompte==other.getSoldecompte();
			}
		
		

		
			
	}
	
	


