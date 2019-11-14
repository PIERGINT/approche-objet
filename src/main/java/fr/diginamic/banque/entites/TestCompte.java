package fr.diginamic.banque.entites;

public class TestCompte {

	public static void main(String args[]) {

		Compte count = new Compte();
		count.setNumcompte(189892);
		count.setSoldecompte(2000);

		System.out.println("Numéro de compte : " + count.getNumcompte());
		System.out.println("Solde : " + count.getSoldecompte() + " euros");
	}
}