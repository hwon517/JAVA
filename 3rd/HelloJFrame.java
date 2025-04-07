import javax.swing.JFrame;
import java.awt.*;

public class HelloJFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public HelloJFrame(String title) {
		setSize(300, 200);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		Container pane = getContentPane();
		pane.setBackground(Color.YELLOW);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		HelloJFrame f = new HelloJFrame("Hello JFrame!");
	}
}
