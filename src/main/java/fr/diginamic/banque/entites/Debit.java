package fr.diginamic.banque.entites;

public class Debit extends Operations {

	public Debit (String datop, double montant) {
		super (datop,montant);
}
	
	public String getType() {
		return "Debit";}
	
}