
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class textField extends JFrame {
	private static final long serialVersionUID = 1L;

	public textField(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 120);
		setTitle(title);
		//체크박스 구성의 메소드 호출
		makeTextField();
		setVisible(true);
	}

	public void makeTextField() {
		JPanel pL = new JPanel();
		pL.setLayout(new GridLayout(0,1,20,5));
		pL.add(new JLabel("   ID:   "));
		pL.add(new JLabel("   PASSWORD:   "));
		
		JPanel pR = new JPanel();
		pR.setLayout(new GridLayout(0,1,20,5));
		JTextField tf = new JTextField();
		tf.setText("java24");
		pR.add(tf);
		
		JPasswordField pwd = new JPasswordField();
		pwd.setEchoChar('#');
		pR.add(pwd);


		JPanel pD = new JPanel();
		JTextArea ta = new JTextArea(5, 10);

		add(pL, "West");
		add(pR, "Center");
		add(pD, "South");
	}

	public static void main(String[] args) {
		textField win = new textField("ID/PW");
	}
}