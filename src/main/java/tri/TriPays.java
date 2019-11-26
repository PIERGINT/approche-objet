package tri;

import java.util.List;

import org.apache.commons.io.comparator.PathFileComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import sets.Pays;
import java.lang.Comparable;
/*
 * Créez une classe ComparatorHabitant qui implémente l’interface Comparator<Pays>.
Implémentez la méthode compareTo pour faire un tri sur le nombre d’habitants
Créer une classe ComparatorPibHabitant qui tri sur le PIB/hab.
Réalisez un tri avec un des 2 comparators et affichez le résultat
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