package junittests;

//import static org.junit.Assert.assertEquals;

//import org.junit.BeforeClass;
//import org.junit.Test;

import spielen.SchussTyp;
import spielen.Spielbrett;
import spielen.Waffe;

/**
 * Testklasse zum Model des Spiels.
 * @author Doreen
 *
 */
public class SpielbrettTest {
	/**
	 * Erstellen des Testspielbretts.
	 */
	private static Spielbrett instance1;
	/**
	 * Spielerwaffe.
	 */
	private Waffe figur1;
	/**
	 * Gegnerwaffe.
	 */
	private Waffe figur2;
	/**
	 * Welcher erwarteter Typ sollte es werden.
	 */
	private SchussTyp expected;
	/**
	 * Ergebnis der Methode.
	 */
	private SchussTyp resultat;

	/**
	 * Diese Klasse wird direkt als erste ausgefuehrt. Ersellen des Spielbretts.
	 * @throws Exception
	 */
	//@BeforeClass
	public static void setUpBeforeClass() {
		instance1 = new Spielbrett();
	}
/**
 * Testmethode.
 */
	//@Test
	public final void testVergleich() {
		this.figur1 = Waffe.PAPIER;
		this.figur2 = Waffe.PAPIER;
		this.expected = SchussTyp.UNENTSCHIEDEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.PAPIER;
		this.figur2 = Waffe.STEIN;
		this.expected = SchussTyp.GEWONNEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.PAPIER;
		this.figur2 = Waffe.SCHERE;
		this.expected = SchussTyp.VERLOREN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.SCHERE;
		this.figur2 = Waffe.PAPIER;
		this.expected = SchussTyp.GEWONNEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.SCHERE;
		this.figur2 = Waffe.SCHERE;
		this.expected = SchussTyp.UNENTSCHIEDEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.SCHERE;
		this.figur2 = Waffe.STEIN;
		this.expected = SchussTyp.VERLOREN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.STEIN;
		this.figur2 = Waffe.SCHERE;
		this.expected = SchussTyp.GEWONNEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.STEIN;
		this.figur2 = Waffe.PAPIER;
		this.expected = SchussTyp.VERLOREN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

		this.figur1 = Waffe.STEIN;
		this.figur2 = Waffe.STEIN;
		this.expected = SchussTyp.UNENTSCHIEDEN;
		this.resultat = instance1.vergleich(figur1, figur2);
		//assertEquals(this.expected, this.resultat);

	}

}
