/**
 * KonkreterBeobachter.java
 */
public class KonkreterBeobachter implements Beobachter {

	private KonkretesSubjekt konkretesSubjekt;

	public KonkreterBeobachter(KonkretesSubjekt konkretesSubjekt) {
		this.konkretesSubjekt = konkretesSubjekt;
		
		// Durchführung der Registrierung beim übergebenen Subjekt
		this.konkretesSubjekt.addBeobachter(this);
	}
	
	@Override
	public void update() {
		int newState = konkretesSubjekt.getState();
		// ...auf neuen Status reagieren
	}
}
