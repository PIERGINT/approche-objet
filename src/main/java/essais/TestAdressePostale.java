package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			AdressePostale a= new AdressePostale(11, "rue des myosotis", 29280, "Plouzane");
			a.afficherAdresse();
			
			AdressePostale b= new AdressePostale(12, "rue de Coat Edern", 29280, "Plouzane");
			b.afficherAdresse();
				}

}
