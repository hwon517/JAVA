import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionWin4 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public ActionWin4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);		
		JButton btn = new JButton("Button");
		//버튼의 이벤트 처리를 위해 리스너를 추가 
		btn.addActionListener(new MyActionListener(this));
		add(btn);
		setVisible(true);
	}
	public static void main(String[] args) {
		ActionWin4 myWin = new ActionWin4();
		myWin.setTitle("외부에 새로운 리스너를 구현");
	}
}

class MyActionListener implements ActionListener {
	ActionWin4 win; 
	private int count = 0;
	
	public MyActionListener(ActionWin4 win) {
		this.win = win;
	}
	public void actionPerformed(ActionEvent evt) {
		//클릭된 버튼의 이름과 클릭 횟수를 윈도 캡션에 출력
		((JFrame)win).setTitle(evt.getActionCommand() + ": " + ++count); 		
	}
}