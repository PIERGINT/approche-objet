package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays hab1, Pays hab2) {

		if (hab1.getNbhab() > hab2.getNbhab()) {

			return 1;

		}
		if (hab1.getNbhab() < hab2.getNbhab()) {

			return -1;
		}

		else {
			return 0;
		}
	}

}
