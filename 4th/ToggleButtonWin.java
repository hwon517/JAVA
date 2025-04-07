package component;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ToggleButtonWin extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JPanel pCheck = new JPanel(); //체크박스가 배치될 패널
	JPanel pRadio = new JPanel(); //래디오버튼이 배치될 패널

	public ToggleButtonWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setTitle(title);
		
		//체크박스와 래디오버튼을 구성
		makeCheckBox();
		makeRadioButton();
		//윈도의 높이를 이등분하여 위에 체크박스, 아래에 래디오버튼 삽입
		setLayout(new GridLayout(0, 1));
		add(pCheck);
		add(pRadio);
		setVisible(true);
	}

	public void makeCheckBox() {		
		//패널의 기본 배치는 FlowLayout이며 add의 기본 정렬은 중앙
		//패널 색상을 수정하여 래디오버튼을 삽입 
		pCheck.setBackground(Color.cyan);
		JCheckBox box = new JCheckBox("갈비");
		pCheck.add(box);
		pCheck.add(new JCheckBox("햄버거"));
		pCheck.add(new JCheckBox("고래밥"));
		pCheck.add(new JCheckBox("홈런볼"));
		
	}

	public void makeRadioButton() {		
		//3개의 래디오 버튼 생성
		JRadioButton r1 = new JRadioButton("20대");
		JRadioButton r2 = new JRadioButton("30대", true);
		JRadioButton r3 = new JRadioButton("40대");
		
		//3개의 중에서 하나만 선택되도록 버튼 그룹에 삽입
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1); bg.add(r2); bg.add(r3);
		
		//패널 색상을 수정하여 래디오버튼을 삽입 
		pRadio.setBackground(Color.yellow);
		pRadio.add(r1); pRadio.add(r2); pRadio.add(r3);
	}

	
	public static void main(String[] args) {
		ToggleButtonWin win = new ToggleButtonWin("토글버튼");
	}
}