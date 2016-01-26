/**
 * Client.java
 */
public class Client {

	public static void main(String[] args) {
		
		// Erzeugung des Subjektes
		KonkretesSubjekt konkretesSubjekt = new KonkretesSubjekt();
	
		// Ein Beobachter implementiert als anonyme Klasse.
		// Die Klasse KonkreterBeobachter exisitiert in diesem Projekt nicht mehr.
		Beobachter anonymeKlasseBeobachter = konkretesSubjekt.addBeobachter(new Beobachter() {
			@Override
			public void update(int pushvalue) {
				System.out.println ("State changed to " + pushvalue);
			}
		});
		
		// Ein Beobachter implementiert mit einem Lambda-Ausdruck (Java 8)
		Beobachter lambda1Beobachter = konkretesSubjekt.addBeobachter((pushvalue) -> System.out.println ("State changed to " + pushvalue));
		
		// Es muss nicht unbedingt der pushvalue genutzt werden, sondern die Daten koennen auch ueber einen Pull geholt werden. (Java 8)
		Beobachter lambda2Beobachter = konkretesSubjekt.addBeobachter((pushvalue) -> System.out.println ("State changed to " + konkretesSubjekt.getState()));
				
		// Zustandsaenderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		konkretesSubjekt.setState(1);
		
		// Durch die Rueckgabe der Beobachter ist es auch hier moeglich, die
		// Beobachter wieder zu entfernen.
		konkretesSubjekt.removeBeobachter(anonymeKlasseBeobachter);
		konkretesSubjekt.removeBeobachter(lambda1Beobachter);
		konkretesSubjekt.removeBeobachter(lambda2Beobachter);
		
		konkretesSubjekt.setState(2);
	}
}