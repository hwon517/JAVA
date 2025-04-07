package component;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldWin_color extends JFrame {
	private static final long serialVersionUID = 1L;

	public TextFieldWin_color(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 240);
		setTitle(title);
		//체크박스 구성의 메소드 호출
		makeTextField();
		setVisible(true);
	}

	public void makeTextField() {
		JPanel pL = new JPanel();
		pL.setLayout(new GridLayout(0,1,20,5));
		pL.add(new JLabel("   이 름:   "));
		pL.add(new JLabel("   암 호:   "));
		pL.add(new JLabel("   생 일:   "));
		pL.setBackground(Color.yellow);
		pL.setForeground(Color.blue);
		
		JPanel pR = new JPanel();
		pR.setLayout(new GridLayout(0,1,20,5));
		JTextField tf = new JTextField();
		tf.setText("홍 길동");
		pR.add(tf);
		
		JPasswordField pwd = new JPasswordField();
		pwd.setEchoChar('#');
		pR.add(pwd);

		JFormattedTextField date = new JFormattedTextField();
		date.setValue(new Date());
		pR.add(date);

		JPanel pD = new JPanel();
		JTextArea ta = new JTextArea(5, 30);
		ta.setText("JTextComponent\n");
		ta.append("	JTextFiled\n");
		ta.append("	JTextArea\n");
		ta.append("	JEditorPane\n");
		pD.add(new JLabel("  메 모:  "));
		pD.add(ta);
		
		add(pL, "West");
		add(pR, "Center");
		add(pD, "South");
	}

	public static void main(String[] args) {
		TextFieldWin win = new TextFieldWin("텍스트필드 알아보기");
	}
}