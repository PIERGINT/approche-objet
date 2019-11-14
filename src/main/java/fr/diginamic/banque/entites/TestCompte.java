package fr.diginamic.banque.entites;

public class TestCompte {

	public static void main(String args[]) {

		Compte count = new Compte(189892, 2000);
		count.setSoldecompte(1000);
		Compte count2 = new Compte(14896325, 5000);

		System.out.println(count);

		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(189892, 2000);
		comptes[1] = new CompteTaux(14896325, 5000, 1.5);

		for(int i = 0; i< comptes.length; ++i){
			
			System.out.println(comptes[i]+ "");
		}
	}
	}
	