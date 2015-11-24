package spielen;

/**
 * 
 * @author Dori Waffe wird zufaellig den Figuren zugeordnet an seine Position
 */
public class Spielbrett implements ISpielbrett {
	/**
	 * 
	 * @return per Zufall wird Waffentyp zurueckgegeben.
	 */
	public final Waffe auswahlGegenwaffe() {
		// Es kann passieren, dass keine Bedingung erfuellt ist, also
		// solange probieren, bis es passt.
		Waffe typ = null;
		final int randomizeCount = 99;
		while (true) {
			int i = (int) ((randomizeCount * Math.random()));
			if (i >= 0 && i <= (randomizeCount / 3)) {
				typ = Waffe.PAPIER;
			}
			if (i >= ((randomizeCount / 3) + 1) 
						&& i <= ((randomizeCount / 3) * 2)) {
				typ = Waffe.SCHERE;
			}
			if (i >= ((randomizeCount / 3) * 2 + 1) && i <= randomizeCount) {
				typ = Waffe.STEIN;
			}
			return typ;
		}
	}
	/**
	 * Waffen im Kampf werden verglichen und es wird zurueckgegeben ob ich
	 * gewonnen oder verloren habe bzw. unentschieden
	 */

	/**
	 * @param spieler
	 *            Die Waffe des eigenen Spieler wird benutzt.
	 * @param gegner
	 *            Die Waffe des gegnerischen Spieler wird benutzt.
	 * @return Es wird zurueckgegeben wie das Spiel ausgegangen ist.
	 */
	public final SchussTyp vergleich(final Waffe spieler, final Waffe gegner) {
		if (spieler == gegner) {
			return SchussTyp.UNENTSCHIEDEN;
		}
		switch (spieler) {
		case SCHERE:
			if (gegner == Waffe.STEIN) {
				return SchussTyp.VERLOREN;
			}
			break;
		case STEIN:
			if (gegner == Waffe.PAPIER) {
				return SchussTyp.VERLOREN;
			}
			break;
		case PAPIER:
			if (gegner == Waffe.SCHERE) {
				return SchussTyp.VERLOREN;
			}
			break;
		case ERROR:
			break;
		default:
		}
		return SchussTyp.GEWONNEN;
	}

}
