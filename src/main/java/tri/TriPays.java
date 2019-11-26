package tri;

import java.util.List;

import org.apache.commons.io.comparator.PathFileComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sets.Pays;
import java.lang.Comparable;
/*
 * Creez un package tri.
Reprenez la classe Pays du TP précédent et implémentez l’interface Comparable<Pays>.
Implémentez la méthode compareTo de manière à ce que le tri se fasse sur le nom du
pays (par ordre alphabétique)
Creez une ArrayList et remplissez là avec l’ensemble des pays du TP précédent
Triez la liste
Affichez le résultat afin de vérifier que les pays sont bien triés dans l’ordre alphabétique.
Réalisez le second tri avec le second comparator et affichez le résultat
 */
public class TriPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pays> listepays = new ArrayList();
		listepays.add(new Pays("USA", 328286400, 59495));
		listepays.add(new Pays("France", 66992699, 43551));
		listepays.add(new Pays("Allemagne", 82850000, 50206));
		listepays.add(new Pays("UK", 66040229, 43620));
		listepays.add(new Pays("Italie", 60483973, 37970));
		listepays.add(new Pays("Japon", 126420000, 42659));
		listepays.add(new Pays("Chine", 1415045928, 16624));
		listepays.add(new Pays("Russie", 146544710, 27900));
		listepays.add(new Pays("Inde", 1355621800, 5174));
		
		System.out.println("Affichage des pays par ordre alphabétique :");
		int i = 0;
		for (i = 0; i < listepays.size(); i++) {

			Collections.sort(listepays);

			System.out.println(listepays.get(i).getNom());
		}
		
			}
}