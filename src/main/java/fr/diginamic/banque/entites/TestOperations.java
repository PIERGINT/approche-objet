package fr.diginamic.banque.entites;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations[] decred = new Operations[4];
		decred[0] = new Credit("12/11/19", 50);
		decred[1] = new Debit("13/11/19", 100);
		decred[2] = new Credit("15/11/19", 200);
		decred[3] = new Debit("20/11/19", 500);

		double soldeGlobal = 0.0;
		for (int i = 0; i < decred.length; ++i) {

			System.out.println(decred[i] + "  " + decred[i].getType());

			if (decred[i].getType().equals("Credit")) {
				soldeGlobal = soldeGlobal + decred[i].getMontant();
			}

			else {
				soldeGlobal = soldeGlobal - decred[i].getMontant();
			}
		}
		System.out.println("Solde Global : " + soldeGlobal);

	}
}
