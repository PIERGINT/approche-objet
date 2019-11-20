package fr.diginamic.banque.entites;

import java.util.*;
import java.lang.*;

public class TestCompte {

	public static void main(String args[]) {

		Compte count = new Compte(189892, 2000);
		count.setSoldecompte(1000);
		Compte count2 = new Compte(14896325, 5000);

		System.out.println(count);
		System.out.println(count2);
		
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(189892, 2000);
		comptes[1] = new CompteTaux(14896325, 5000, 1.5);

		for(int i = 0; i< comptes.length; ++i){
			
			System.out.println(comptes[i]+ "");
		}
		
		// Comparaison des comptes avec la méthode equals.
		//
		
		Compte compte1 = new Compte(555444, 3000);
		
		Compte compte2 = new Compte(555444, 3000);
		
		boolean result = compte1.equals(compte2);
		System.out.println(result);
		
		Compte compte3 = compte2;
		boolean result2 = compte2.equals(compte3);
		System.out.println(result2);
		
	}
	}
	