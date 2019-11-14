package fr.diginamic.banque.entites;

public class Credit extends Operations {

	public Credit (String datop, double montant) {
		super (datop,montant);
	}
		public String getType() {
			return "Credit";
			}
		
		
	}


