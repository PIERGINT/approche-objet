package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pibhab1, Pays pibhab2) {
		if (pibhab1.getPibhab() > pibhab2.getPibhab()) {

			return 1;

		}
		if (pibhab1.getPibhab() < pibhab2.getPibhab()) {

			return -1;
		}

		else {
			return 0;
		}
	}

}
