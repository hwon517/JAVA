import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class ButtonActionWin extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	JButton btnUndecide = new JButton("Undecide");
	JLabel dLb = new JLabel("클릭한 버튼의 제목이 보입니다.");

	public ButtonActionWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);
		
		//윈도 구성과 버튼의 이벤트 리스너 추가
		makeButtonAndEventHandle(); 
		setVisible(true);
	}

	public void makeButtonAndEventHandle() {
		JPanel p = new JPanel(new GridLayout(0, 3));
		p.add(btnOk);
		p.add(btnCancel);
		p.add(btnUndecide);
		add(p, BorderLayout.CENTER);
		add(dLb, BorderLayout.SOUTH);
		
		//2개 버튼의 이벤트 처리를 위해 리스너를 추가 
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		btnUndecide.addActionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		//클릭된 버튼의 이름을 저장
		String strCmd = evt.getActionCommand(); 
		
		// 레이블에 클릭된 버튼의 이름을 지정
		if (strCmd.equals("OK")) {
			dLb.setText(" OK Button");
		} else if (strCmd.equals("Cancel")) {
			dLb.setText(" Cancel Button");
		} else if (strCmd.equals("Undecide")) {
			dLb.setText(" Undecide Button");
		}
	}

	public static void main(String[] args) {
		ButtonActionWin myWin = new ButtonActionWin();
		myWin.setTitle("버튼 액션 이벤트 처리");
	}
}
