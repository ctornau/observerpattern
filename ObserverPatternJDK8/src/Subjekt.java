/**
 * Subjekt.java
 */
public interface Subjekt {
	public abstract Beobachter addBeobachter(Beobachter beobachter);
	public abstract void removeBeobachter(Beobachter beobachter);
	public abstract void notifyAlleBeobachter();
}
