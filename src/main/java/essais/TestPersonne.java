package essais;

import entites.Personne;
import entites.AdressePostale;
import essais.TestAdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale a= new AdressePostale(11, "rue des myosotis", 29280, "Plouzane");
		a.afficherAdresse();
		AdressePostale b= new AdressePostale(12, "rue de Coat Edern", 29280, "Plouzane");
		b.afficherAdresse();
		
		Personne lgpy= new Personne("Le Guellec", "Pierre-Yves");
		lgpy.donnernom();
		lgpy.changerPrenom("Paul");
		lgpy.changerNom("LeGarrec");
		lgpy.afficherIdentite();
		
		
		Personne cg= new Personne("Cazuguel", " Sterenn");
		
		Personne lgpy1= new Personne("Le Guellec","Pierre-Yves", a);
		
		Personne cg2= new Personne("Cazuguel","Sterenn", b);
		cg2.donneradresse();
		cg2.donnerprenom();
		cg2.changerAdresse(a);
		
	}

}
