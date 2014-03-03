/**
 * KonkretesSubjekt.java
 */
import java.util.Observable;

public class KonkretesSubjekt extends Observable {
	
	int state = 0;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.setChanged();
		this.notifyObservers();
	}
}