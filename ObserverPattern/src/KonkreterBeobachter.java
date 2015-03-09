/**
 * KonkreterBeobachter.java
 */
public class KonkreterBeobachter implements Beobachter {

	private KonkretesSubjekt konkretesSubjekt;

	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
		
		// Durchfuehrung der Registrierung beim uebergebenen Subjekt
		this.konkretesSubjekt.addBeobachter(this);
	}
	
	@Override
	public void update() {
		int newState = konkretesSubjekt.getState();
		// ...auf neuen Status reagieren
	}
}
