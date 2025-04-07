package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontWin extends JFrame {
	private static final long serialVersionUID = 1L;

	Color[] manyColors = { Color.black, Color.blue, Color.cyan, Color.gray,
			Color.green, Color.lightGray, Color.magenta, Color.orange,
			Color.pink, Color.red, Color.yellow, Color.darkGray };
	int[] styles = { Font.PLAIN, Font.ITALIC, Font.BOLD, Font.BOLD | Font.ITALIC };
	String[] styleNames = { "plain", "bold", "italic", "bold/italic" };

	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String[] fontNames = ge.getAvailableFontFamilyNames();

	public FontWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());

		setSize(400, 200);
		setVisible(true);
	}
	
	private int random(int r) {
		return (int) Math.floor(Math.random() * r);
	}

	class MyPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		
		public void paint(Graphics g) {
			// get window size
			Dimension d = getSize();
			// get client rectangle
			int clientWidth = d.width;

			int yPrev = 20;
			// for (int i = 0; i < fontNames.length; i++) {
			for (int i = 0; i < 6; i++) {
				int sIndex = random(styleNames.length);
				int fIndex = random(fontNames.length);
				// set font
				Font curFont = new Font(fontNames[fIndex], styles[sIndex], 12);
				// make string printed
				String curStr = fontNames[fIndex] + " " + styleNames[sIndex] + " ("
						+ curFont.getFamily() + ")";
				// get exact string width using FontMetrics
				g.setFont(curFont);
				FontMetrics curFontMet = g.getFontMetrics(curFont);
				int strWidth = curFontMet.stringWidth(curStr);
				// set color
				g.setColor(manyColors[random(manyColors.length)]);
				// set start location
				int xStart = (clientWidth - strWidth) / 2;
				int yStart = curFontMet.getHeight();
				yPrev += yStart;
				// draw string
				g.drawString(curStr, xStart, yPrev);
			}
		}
	}

	public static void main(String[] args) {
		new FontWin().setTitle("  Ʈ ó  ");
	}
}
