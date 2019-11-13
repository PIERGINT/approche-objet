package entites;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressepostale;

	public Personne(String n, String pn) {
		nom = n;
		prenom = pn;
	}

	public Personne(String n, String pn, AdressePostale ad) {
		nom = n;
		prenom = pn;
		adressepostale = ad;
	}

	public void afficherIdentite() {
		System.out.println(nom.toUpperCase() + " " + prenom);

	}

	public void changerNom(String n) {
		nom = n;
	}

	public void changerPrenom(String pn) {
		prenom = pn;
	}

	public void changerAdresse(AdressePostale ad) {
		adressepostale = ad;
	}

	public void afficherAdresse() {
		System.out.println(nom.toUpperCase() + " " + prenom + " " + adressepostale);
	}

	public void donnernom() {
		System.out.println(nom);
	}

	public void donnerprenom() {
		System.out.println(prenom);
	}

	public void donneradresse() {
		System.out.println(adressepostale.afficherAdresse());
	}
}
