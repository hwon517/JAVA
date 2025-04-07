import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActionWin1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private int count = 0;
	
	public ActionWin1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);		
		JButton btn = new JButton("Button");
		//버튼의 이벤트 처리를 위해 리스너를 추가 
		btn.addActionListener(this);
		add(btn);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent evt) {
		//클릭된 버튼의 이름과 클릭 횟수를 윈도 캡션에 출력
		setTitle(evt.getActionCommand() + ": " + ++count); 		
	}

	public static void main(String[] args) {
		ActionWin1 myWin = new ActionWin1();
		myWin.setTitle("리스너를 상속받아 구현");
	}
}
