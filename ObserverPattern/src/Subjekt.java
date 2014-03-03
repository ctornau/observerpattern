/**
 * Subjekt.java
 */
public interface Subjekt {
	public abstract void addBeobachter(Beobachter beobachter);
	public abstract void removeBeobachter(Beobachter beobachter);
	public abstract void notifyAlleBeobachter();
}
