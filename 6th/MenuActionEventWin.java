import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuActionEventWin extends JFrame implements ItemListener {
//public class MenuActionEventWin extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JTextArea txtArea = new JTextArea();
	JLabel status = new JLabel("메뉴 상태");
	
	public MenuActionEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
	
		//윈도 구성과 포커스 리스너 추가
		add(txtArea, "Center");
		add(status, "South");
		makeMenuAndEventHandle(); 
		setVisible(true);		
	}

	public void makeMenuAndEventHandle() {
		JMenuBar mBar = new JMenuBar(); 
		JMenu mainMenu = new JMenu("주메뉴");
		JMenu subMenu = new JMenu("부메뉴1");
		JMenuItem subMenu2 = new JMenuItem("부메뉴2");
		subMenu2.addItemListener(this);
		//subMenu2.addActionListener(this);
		
		JMenuItem[] subMItem = new JMenuItem[3];
		subMItem[0] = new JMenuItem("부메뉴 항목 1");
		subMItem[1] = new JMenuItem("부메뉴 항목 2");
		subMItem[2] = new JMenuItem("부메뉴 항목 3");
		for (int i=0; i<subMItem.length; i++) {
			subMenu.add(subMItem[i]);
			subMItem[i].addItemListener(this);
			//subMItem[i].addActionListener(this);
		}		
		mainMenu.add(subMenu); 
		mainMenu.addSeparator(); 
		mainMenu.add(subMenu2); 
		mBar.add(mainMenu);
		setJMenuBar(mBar);    				
	}
	
	public void itemStateChanged(ItemEvent evt) {
		status.setText(evt.getItem().toString());
		txtArea.append(evt.getItem() + "\n");
	}
	
	//public void actionPerformed(ActionEvent evt) {
	//	status.setText(evt.getActionCommand());
	//	txtArea.append(evt.getActionCommand() + "\n");
	//}

	public static void main(String[] args) {
		MenuActionEventWin myWin = new MenuActionEventWin();
		myWin.setTitle("메뉴 처리");
	}
}


