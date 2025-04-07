import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionWin2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private int count = 0;
	
	public ActionWin2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);		
		JButton btn = new JButton("Button");
		//버튼의 이벤트 처리를 위해 리스너를 추가 
		btn.addActionListener(new MyActionListener());
		add(btn);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {		
		public void actionPerformed(ActionEvent evt) {
			//클릭된 버튼의 이름과 클릭 횟수를 윈도 캡션에 출력
			setTitle(evt.getActionCommand() + ": " + ++count); 		
		}
	}	
	
	public static void main(String[] args) {
		ActionWin2 myWin = new ActionWin2();
		myWin.setTitle("내부 리스너를 새롭게 정의");
	}
}

