package layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowWin extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

	public FlowWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(300, 180);
		setTitle(title);
		//setLayout(new FlowLayout());
		//setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		//setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
		btn1 = new JButton("버튼 1");
		btn2 = new JButton("버튼 2");
		btn3 = new JButton("버튼 3");
		btn4 = new JButton("버튼 4");
		btn5 = new JButton("버튼 5");
		btn6 = new JButton("버튼 6");
		btn7 = new JButton("버튼 7");
		btn8 = new JButton("버튼 8");
		btn9 = new JButton("버튼 9");
		btn10 = new JButton("버튼 10");
		add(btn1); 		add(btn2);
		add(btn3); 		add(btn4);
		add(btn5); 		add(btn6);
		add(btn7); 		add(btn8);
		add(btn9); 		add(btn10);
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		FlowWin win = new FlowWin("FlowLayout 윈도");		
	}	
}