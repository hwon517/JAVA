import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionWin3 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int count = 0;
	
	public ActionWin3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);		
		JButton btn = new JButton("Button");
		//버튼의 이벤트 처리를 위해 익명 리스너를 바로 구현하여 추가 
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//클릭된 버튼의 이름과 클릭 횟수를 윈도 캡션에 출력
				setTitle(evt.getActionCommand() + ": " + ++count); 		
			}			
		}
		);
		add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ActionWin3 myWin = new ActionWin3();
		myWin.setTitle("익명의 ActionListener()를 인자로 구현");
	}
}
