package sets;

import java.lang.Comparable;

public class Pays implements Comparable<Pays>{

	String nom;
	long nbhab;
	long pibhab;
	
	public Pays(String nom) {
		this.nom= nom;
		}
	
	public Pays(String nom, long nbhab) {
		this(nom);
		this.nbhab= nbhab;
					
}	
	public Pays(String nom, long nbhab, long pibhab) {
		this(nom,nbhab);
		this.pibhab= pibhab;}
		
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbhab() {
		return nbhab;
	}

	public void setNbhab(long nbhab) {
		this.nbhab = nbhab;
	}

	public long getPibhab() {
		return pibhab;
	}

	public void setPibhab(long pibhab) {
		this.pibhab = pibhab;}
		
	public long calcPib(long nbhbab, long pibhab) {
		return (nbhab*pibhab);
		}
	
	public String toString() {
		return pibhab+ " "; }

	
	@Override
	public int compareTo(Pays arg0) {
		int result = this.nom.compareTo(arg0.getNom());
		return result;
	}

		}
