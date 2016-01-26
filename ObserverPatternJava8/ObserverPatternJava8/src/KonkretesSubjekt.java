/**
 * KonkretesSubjekt.java
 */
import java.util.ArrayList;
import java.util.List;

public class KonkretesSubjekt implements Subjekt {

	List<Beobachter> beobachterList = new ArrayList<Beobachter>();
	
	int state = 0;
	
	@Override
	public Beobachter addBeobachter(Beobachter beobachter) {
		this.beobachterList.add(beobachter);
		return beobachter;
	}

	@Override
	public void removeBeobachter(Beobachter beobachter) {
		this.beobachterList.remove(beobachter);
	}

	@Override
	public void notifyAlleBeobachter() {
		for (Beobachter beobachter : beobachterList) {
			beobachter.update(state);
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAlleBeobachter();
	}
}