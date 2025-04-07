package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderWin extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public BorderWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(300, 180);
		setTitle(title);
		//setLayout(null);
		//setLayout(new BorderLayout()); //배치관리를 지정하지 않은 방법
		setLayout(new BorderLayout(30, 20));
		btn1 = new JButton("North1");
		btn2 = new JButton("South1");
		btn3 = new JButton("West1");
		btn4 = new JButton("East1");
		btn5 = new JButton("Center1");
		add(btn1, "West");   
		add(btn2, BorderLayout.SOUTH);
		add(btn3, "North");    
		add(btn4, "East");
		add(btn5, "Center");	
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		BorderWin win = new BorderWin("BorderLayout 윈도");		
	}	
}
