package layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridWin extends JFrame{
	private static final long serialVersionUID = 1L;

	public GridWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(300, 200);
		setTitle(title);
		setLayout(new GridLayout(4, 3, 10, 5));
		add(new JButton("1")); add(new JButton("2")); add(new JButton("3"));
		add(new JButton("4")); add(new JButton("5")); add(new JButton("6"));
		add(new JButton("7")); add(new JButton("8")); add(new JButton("9"));
		add(new JButton("*")); add(new JButton("0")); add(new JButton("#"));
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		GridWin win = new GridWin("Grid 윈도");		
	}	
}