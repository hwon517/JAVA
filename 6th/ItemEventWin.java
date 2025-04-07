import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ItemEventWin extends JFrame implements ItemListener {
	private static final long serialVersionUID = 1L;

	JPanel pCheck = new JPanel(); //체크박스가 배치될 패널
	JTextArea txtArea = new JTextArea();
	JLabel status = new JLabel("메뉴 상태");
	
	public ItemEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
	
		makeCheckBox();
		makeMenuAndEventHandle(); 
		add(pCheck, "North");
		add(txtArea, "Center");
		add(status, "South");
		setVisible(true);		
	}

	public void makeCheckBox() {		
		JCheckBox box1 = new JCheckBox("수영");
		JCheckBox box2 = new JCheckBox("골프");
		JCheckBox box3 = new JCheckBox("축구");
		JCheckBox box4 = new JCheckBox("야구");
		box1.addItemListener(this); box2.addItemListener(this);
		box3.addItemListener(this); box4.addItemListener(this);
		pCheck.add(box1); pCheck.add(box2); pCheck.add(box3); pCheck.add(box4);
	}
	
	public void makeMenuAndEventHandle() {
		//음식 폴더
		JMenuBar mBar = new JMenuBar(); 
		JMenu mainMenu = new JMenu("음식");
		JMenu subMenu1 = new JMenu("한식");
		JCheckBoxMenuItem subCheck1 = new JCheckBoxMenuItem("불고기");
		JCheckBoxMenuItem subCheck2 = new JCheckBoxMenuItem("비빔밥");
		subMenu1.add(subCheck1);
		subMenu1.add(subCheck2);
		subCheck1.addItemListener(this);
		subCheck2.addItemListener(this);
		
		mainMenu.add(subMenu1); 
		mBar.add(mainMenu);
		setJMenuBar(mBar);   
		
		JMenu subMenu2 = new JMenu("중식");
		JCheckBoxMenuItem subCheck3 = new JCheckBoxMenuItem("짜장면");
		JCheckBoxMenuItem subCheck4 = new JCheckBoxMenuItem("탕수육");
		subMenu2.add(subCheck3);
		subMenu2.add(subCheck4);
		subCheck3.addItemListener(this);
		subCheck4.addItemListener(this);
		
		mainMenu.add(subMenu2); 
		mBar.add(mainMenu);
		setJMenuBar(mBar);
		
		//여행 폴더
		JMenuBar mBar2 = new JMenuBar(); 
		JMenu mainMenu2 = new JMenu("여행");
		JMenu subMenu3 = new JMenu("일본");
		JCheckBoxMenuItem subCheck5 = new JCheckBoxMenuItem("오사카");
		JCheckBoxMenuItem subCheck6 = new JCheckBoxMenuItem("도쿄");
		subMenu3.add(subCheck5);
		subMenu3.add(subCheck6);
		subCheck5.addItemListener(this);
		subCheck6.addItemListener(this);
		
		mainMenu2.add(subMenu3); 
		mBar.add(mainMenu2);
		setJMenuBar(mBar);   
		
		JMenu subMenu4 = new JMenu("유럽");
		JCheckBoxMenuItem subCheck7 = new JCheckBoxMenuItem("프랑스");
		JCheckBoxMenuItem subCheck8 = new JCheckBoxMenuItem("독일");
		subMenu4.add(subCheck7);
		subMenu4.add(subCheck8);
		subCheck7.addItemListener(this);
		subCheck8.addItemListener(this);
		
		mainMenu2.add(subMenu4); 
		mBar.add(mainMenu2);
		setJMenuBar(mBar);
	}
		
	public void itemStateChanged(ItemEvent evt) {		
		String str = ((AbstractButton) evt.getItem()).getText();
		if (evt.getStateChange() == ItemEvent.SELECTED)
			str += ": 선택\n";
		else 
			str += ": 비선택\n";
		status.setText(str);
		txtArea.append(str);
	}
	
	public static void main(String[] args) {
		ItemEventWin myWin = new ItemEventWin();
		myWin.setTitle("아이템이벤트 처리");
	}
}
