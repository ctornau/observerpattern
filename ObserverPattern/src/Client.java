/**
 * Client.java
 */
public class Client {

	public static void main(String[] args) {
		
		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();
		
		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt übergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
				
		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
	}
}
