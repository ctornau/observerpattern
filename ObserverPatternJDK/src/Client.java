/**
 * Client.java
 */
public class Client {

	public static void main(String[] args) {
		
		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();
		
		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt uebergeben und registriert.
		KonkreterBeobachter konkreterBeobachter = new KonkreterBeobachter(konkretesSubjekt);
				
		// Zustandsaenderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
	}
}
