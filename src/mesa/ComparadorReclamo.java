package mesa;

import java.util.Comparator;

public class ComparadorReclamo implements Comparator<Reclamo>{

	@Override
	public int compare(Reclamo r1, Reclamo r2) {
		if (r1.getNivelUrgencia() == r2.getNivelUrgencia()){
			return 0;
		}
		if (r1.getNivelUrgencia().ordinal() > r2.getNivelUrgencia().ordinal()) {
			return 1;
		}
		else {
			return -1;
		}
	}

	

}
