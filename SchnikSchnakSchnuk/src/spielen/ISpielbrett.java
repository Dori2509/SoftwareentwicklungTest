package spielen;

/**
 * 
 * @author Dori erstellt Waffen und vergleicht im Kampf
 */

public interface ISpielbrett {
	/**
	 * 
	 * 
	 *            Waffe Papier.
	 * 
	 *            Waffe Schere.
	 * 
	 *            Waffe Stein.
	 * 
	 * @return gibt Waffentyp zurueck.
	 */
	Waffe auswahlGegenwaffe();

	/**
	 * 
	 * @param spieler
	 *            eigene Spielfigur
	 * @param gegner
	 *            gegnerische Spielfigur
	 * @return Gibt zurueck wie Kampf ausgegangen ist
	 */
	SchussTyp vergleich(Waffe spieler, Waffe gegner);

}
