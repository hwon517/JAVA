package layout;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NoneLayoutWin extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3;

	public NoneLayoutWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(340, 180);
		setTitle(title);

		btn1 = new JButton("OK1");
		btn2 = new JButton("Cancel");
		btn3 = new JButton("OK2");
		Dimension d = btn1.getPreferredSize(); //버튼의 적당한 가로와 세로를 알아 보기
		btn1.setSize(d); 		//버튼의 적당한 크기로 지정
		//btn1.setSize(100, 30);//버튼의 가로와 세로를 각각 100, 30으로 지정
		btn2.setSize(100, 30);
		btn3.setSize(100, 30);
		btn1.setLocation(50, 100);	//버튼의 좌측상단 위치 (x, y)를 각각 50, 100으로 지정
		btn2.setLocation(170, 100); //버튼의 좌측상단 위치 (x, y)를 각각 170, 100으로 지정
		btn3.setLocation(300, 100);
		
		setLayout(null);
		add(btn1);   
		add(btn2);
		add(btn3);
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		NoneLayoutWin win = new NoneLayoutWin("배치관리자가 없는 윈도");		
	}	
}
