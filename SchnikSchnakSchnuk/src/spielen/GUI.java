package spielen;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Dori
 *
 */

/*public class GUI implements ActionListener {

	/**
	 * Frame, in dem das Spiel dargestellt wird.
	 */
	private JFrame frame;
	/**
	 * Spiel wird aufgerufen.
	 */
	private Spielbrett neuesSpiel = new Spielbrett();
	/**
	 * Textfeld wird erstellt.
	 */
	private JTextArea textArea;
	/**
	 * Button Spiel starten im Menu Datei wird erstellt.
	 */
	private JMenuItem menuSpielStarten = new JMenuItem("spiel starten");
	/**
	 * Button Spiel beendenstarten im Menu Datei wird erstellt.
	 */
	private JMenuItem menuSpielbeenden = new JMenuItem("spiel beenden");
	/**
	 * Button fuer Waffe Stein.
	 */
	private JButton eigeneWaffeStein = new JButton("Stein");
	/**
	 * Button fuer Waffe Schere.
	 */
	private JButton eigeneWaffeSchere = new JButton("Schere");
	/**
	 * Button fuer Waffe Papier.
	 */
	private JButton eigeneWaffePapier = new JButton("Papier");

	/**
	 * Eigene Waffe wird initialisiert.
	 */
	private Waffe spielerWaffe;
	/**
	 * Gegnerische Waffe wird initialisiert.
	 */
	private static Waffe gegnerWaffe;
	/**
	 * Spielfeldgroesse wird definiert.
	 */
	private final int spielbrettGroesse = 400;

	/**
	 * @param args
	 *            Programm startet sich
	 */

	public static void main(final String[] args) {

		GUI proj = new GUI();
		proj.GUI();

	}

	/**
	 * Eigenschaften des Spielbrettes wird gesetzt.
	 */

	private void GUI() { // Methode

		// Hauptfenster

		frame = new JFrame("Schnik Schnak Schnuk"); // Fenster erstellen

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setSize(spielbrettGroesse, spielbrettGroesse);
		textArea = new JTextArea();
		frame.add(textArea);

		// Menueleiste

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu menu1 = new JMenu("Datei");
		menuBar.add(menu1);

		// Dateiunterpunkte

		menuSpielStarten.addActionListener(this);
		menuSpielStarten.setActionCommand("menuSpielStarten");
		menu1.add(menuSpielStarten);

		menu1.add(menuSpielbeenden);
		menuSpielbeenden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				System.exit(0);
			}
		});

		// Buttons unterm Textfeld

		eigeneWaffeStein.addActionListener(this);
		eigeneWaffeStein.setActionCommand("eigeneWaffeStein");
		eigeneWaffeSchere.addActionListener(this);
		eigeneWaffeSchere.setActionCommand("eigeneWaffeSchere");
		eigeneWaffePapier.addActionListener(this);
		eigeneWaffePapier.setActionCommand("eigeneWaffePapier");
		menuBar.add(eigeneWaffeStein);
		menuBar.add(eigeneWaffeSchere);
		menuBar.add(eigeneWaffePapier);
		eigeneWaffePapier.setEnabled(false);
		eigeneWaffeStein.setEnabled(false);
		eigeneWaffeSchere.setEnabled(false);

		frame.setVisible(true); // Fenster anzeigen

	}

	/**
	 * @param a
	 *            Klickbefehle.
	 */
	@Override
	public final void actionPerformed(final ActionEvent a) {

		// Dateiunterpunkte
		if (a.getActionCommand().equals("menuSpielStarten")) {
			// System.out.println("spiel starten");
			eigeneWaffePapier.setEnabled(true);
			eigeneWaffeStein.setEnabled(true);
			eigeneWaffeSchere.setEnabled(true);
		}

		// Buttons
		if (a.getActionCommand().equals("eigeneWaffeStein")) {

			spielerWaffe = Waffe.STEIN;
			gegnerWaffe = neuesSpiel.auswahlGegenwaffe();
			SchussTyp schuss = neuesSpiel.vergleich(spielerWaffe, gegnerWaffe);
			textArea.setText(spielerWaffe + " HAT GEGEN " + gegnerWaffe + " " + schuss.name());

		}
		if (a.getActionCommand().equals("eigeneWaffeSchere")) {
			spielerWaffe = Waffe.SCHERE;
			gegnerWaffe = neuesSpiel.auswahlGegenwaffe();
			SchussTyp schuss = neuesSpiel.vergleich(spielerWaffe, gegnerWaffe);
			textArea.setText(spielerWaffe + " HAT GEGEN " + gegnerWaffe + " " + schuss.name());
		}
		if (a.getActionCommand().equals("eigeneWaffePapier")) {
			spielerWaffe = Waffe.PAPIER;
			gegnerWaffe = neuesSpiel.auswahlGegenwaffe();
			SchussTyp schuss = neuesSpiel.vergleich(spielerWaffe, gegnerWaffe);
			textArea.setText(spielerWaffe + " HAT GEGEN " + gegnerWaffe + " " + schuss.name());
		}

	}

}
