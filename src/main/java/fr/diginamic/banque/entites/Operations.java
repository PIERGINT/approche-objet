package fr.diginamic.banque.entites;

public abstract class Operations {

	private String datop;
	private double montant;
		
	public Operations (String datop, double montant) {
	this.datop = datop;
	this.montant= montant;
	
	}
	
	public abstract String getType(); 
	
	public String toString() {
		return "Date :"+ " " + datop + " " + "Montant :" + " "+ montant;
		
	
	
	}

	public String getDatop() {
		return datop;
	}

	public void setDatop(String datop) {
		this.datop = datop;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}