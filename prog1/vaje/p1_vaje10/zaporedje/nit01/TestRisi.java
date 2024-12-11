import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



/**
 * Risanje zaporedja na platno
 */

public class TestRisi {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame okno = new RisiFrame("Risanje zaporedij");
				okno.setVisible(true);
			}
		});
	}
}


/**
 * Razred predstavlja ogrodje okna
 */

class RisiFrame extends JFrame {

	public RisiFrame() {
		this("Naloga 10");
	}
	
	public RisiFrame(String ime) {
		super(ime);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ss = kit.getScreenSize();
		int width = ss.width;
		int height = ss.height;
		setLocation(width / 4, height / 8);
		setSize(DEFAULT_WIDTH, 800);
		
		// [icon] image
		try {
			Image slika = kit.getImage(getClass().getClassLoader().getResource(ICON_PATH));
			setIconImage(slika);
		} catch (Exception e) {
			System.err.println("[Warning]: missing window icon...");
		}
		// [window] listener
		addWindowListener(new OknoPoslusalec());
		
		// RisiPanel risiPanel = new RisiPanel();
		Zaporedje sinus = new Sinus(15, Math.PI / 8);
		RisiPanel risiPanel = new RisiPanel(sinus);
		
		// [key] listener
		addKeyListener(new TipkaPoslusalec(risiPanel));
		Container contentPane = getContentPane();
		contentPane.add(risiPanel, BorderLayout.CENTER);
	}
	
	private static final int BALL_WIDTH = 20;
	private static final int DEFAULT_WIDTH = 800;
	private static final String ICON_PATH = "images/icon.png";
}


/** 
 *  OknoPoslusalec: window listener
 */

class OknoPoslusalec extends WindowAdapter {
	
	public OknoPoslusalec() {}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.printf("[-]");
	}
}

/** 
 *  TipkaPoslusalec: obdelava dogodkov tipkovnice
 */

class TipkaPoslusalec implements KeyListener {
	
	private RisiPanel panel;
	
	public TipkaPoslusalec(RisiPanel panel) {
		this.panel = panel;
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_RIGHT)
			this.panel.selectNext();
		else if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_LEFT)
			this.panel.selectPrev();
		this.panel.repaint();
	}
	
	public void keyReleased(KeyEvent e) { }
	public void keyTyped(KeyEvent e) { }
}


/**
 *  RisiPanel: canvas, plosca za izris zaporedja.
 */

class RisiPanel extends JPanel {

	public RisiPanel() {
		this(new LinearnaFunkcija(-5, 2));
	}

	public RisiPanel(Zaporedje zaporedje) {
		this.ixSelected = 0;
		this.ixColor = 0;
		this.zaporedje = zaporedje;
		this.zaporedja = RisiPanel.createZaporedja();
		
	}
	
	private static Zaporedje[] createZaporedja() {
		Zaporedje kvadrat = new Kvadrat();
		Zaporedje koren = new Koren();
		Zaporedje vsota = koren.vsota(koren);
		Zaporedje sinus = new Sinus(10, Math.PI / 4.0);
		Zaporedje sin = new Sinus(15, Math.PI / 8.0);
		Zaporedje linearna = new LinearnaFunkcija(-2, 2);
		Zaporedje invKvadrat = kvadrat.vsota(kvadrat).inverz(new Interval(0, 4));
		return new Zaporedje[] { kvadrat, koren, vsota, sinus, sin, linearna, invKvadrat };
	}

	/**
	 *  Metode za premik po zaporedjih.
	 *  -- metode klice poslusalec tipkovnice, ko so pritisnjene kurzorske tipke
	 */
	 
	public void selectPrev() {
		this.ixSelected = (ixSelected == 0) ? zaporedja.length - 1 : ixSelected - 1;
		this.ixColor = (ixColor == 0) ? COLORS.length - 1 : ixColor - 1;
	}
	
	public void selectNext() {
		this.ixSelected = (ixSelected == zaporedja.length - 1) ? 0 : ixSelected + 1;
		this.ixColor = (ixColor == COLORS.length - 1) ? 0 : ixColor + 1;
	}
	
	/**
	 *  Metoda za izris risalne plosce na zaslon.
	 *  -- metoda se klice vedno, ko je potreba za izris plosce
	 *  -- trigger: repaint()
	 */
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		int xSredina = getWidth() / 2;
		int ySredina = getHeight() / 2;
		
		// 1 - narisi koordinatne osi
		Stroke normalStroke = g2.getStroke();
		Stroke dottedStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0.0f, new float[] {2.0f, 2.0f}, 0);
		g2.setStroke(dottedStroke);
		g.setColor(Color.GRAY);
		g.drawLine(0, ySredina, getWidth(), ySredina);
		g.drawLine(xSredina, 0, xSredina, getHeight());
		g2.setStroke(normalStroke);
		
		int stOznak = 20;
		double enota = Math.min(getWidth(), getHeight()) / (double) (2 * stOznak);
		for (int i = -stOznak; i < stOznak; i++) {
			g.drawLine((int) (xSredina + enota * i), ySredina - 3, (int) (xSredina + enota * i), ySredina + 3);
		}
		for (int i = -stOznak; i < stOznak; i++) { 	
			g.drawLine(xSredina - 3, (int) (ySredina + enota * i), xSredina + 3, (int) (ySredina + enota * i));
		}
		
		// 2 - narisi privzeto zaporedje
		zaporedje.narisi(g2, xSredina, ySredina, enota, Color.RED, new Interval(-16, 0));
		
		// 3 - za test narisi se izbrano zaporedje
		Zaporedje zaporedje = this.zaporedja[this.ixSelected];
		zaporedje.narisi(g2, xSredina, ySredina, enota, COLORS[this.ixColor], new Interval(-10, 16));
	}
	
	private int ixSelected;
	private int ixColor;
	private Zaporedje zaporedje;	
	private Zaporedje[] zaporedja;
	
	private static final Color[] COLORS = { 
		new Color(0, 112, 184), new Color(169, 88, 36), new Color(0, 200, 0), 
		new Color(255, 165, 0), new Color(127, 0, 255), Color.BLACK, new Color(93, 163, 240)
	};
}

