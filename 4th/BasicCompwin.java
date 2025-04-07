package component;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BasicCompwin extends JFrame {
	private static final long serialVersionUID = 1L;

	public BasicCompwin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle(title);
		
		JLabel lb = new JLabel("레이블의 글자");
		lb.setForeground(Color.blue);	//색상 수정
		lb.setHorizontalAlignment(SwingConstants.CENTER); //가로정렬 수정
		add(lb);
		setVisible(true);
	}

	public static void main(String[] args) {
		BasicCompwin win = new BasicCompwin("레이블 알아보기");
	}
}