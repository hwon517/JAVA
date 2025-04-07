import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Vector;

public class ContainerEventWin extends JFrame implements ContainerListener, ActionListener {	
	private static final long serialVersionUID = 1L;

	JButton btnAdd = new JButton("Add button");
	JButton btnRemove = new JButton("Remove button");
	JLabel  lbl = new JLabel();
	JPanel  p1 = new JPanel(); 
	JButton recentBtn;	//가장 최근에 삽입 또는 삭제되는 버튼
	int btnCount = 0;
	
	Vector<JButton> aryBtn = new Vector<JButton>();
	
	public ContainerEventWin() {
		JPanel p2 = new JPanel(new GridLayout(0, 2)); 		
		p2.add(btnAdd);
		p2.add(btnRemove);  
		add(lbl, BorderLayout.NORTH);  
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		// 버튼이 추가되는 패널은 콘테이너 리스너 등록
		p1.addContainerListener(this);
		// 버튼은 액션 리스너 등록
		btnAdd.addActionListener(this);
		btnRemove.addActionListener(this);

		setSize(300, 200); 
		setVisible(true);
	}
	
	//ActionListener's method implementation
	public void actionPerformed(ActionEvent evt) {
		String strBtn = evt.getActionCommand();		
		if ( strBtn.equals("Add button") ){ 
			recentBtn = new JButton("button " + (++btnCount));
			recentBtn.setName("button " + btnCount);
			if (btnCount%3==0) {
				recentBtn.setBackground(Color.YELLOW);
			}
			recentBtn.addActionListener(this);
			p1.add(recentBtn);
			aryBtn.addElement(recentBtn);
		} else if ( strBtn.equals("Remove button") ){
			if (!aryBtn.isEmpty()) {
				recentBtn = (JButton) aryBtn.lastElement();
				aryBtn.removeElementAt(--btnCount);
				p1.remove(recentBtn);
				update(getGraphics());
			}
		}
	}
	
	//ComponentListener's method implementation
	public void componentAdded(ContainerEvent evt) {
		String str = "총" + btnCount + "개: " + evt.getChild().getName() + " added";
		lbl.setText(str);
	}
	
	public void componentRemoved(ContainerEvent evt) {
		String str = "총" + btnCount + "개: " + evt.getChild().getName() + " removed";
		lbl.setText(str);    
	}
	
	public static void main(String [] args) {
		ContainerEventWin myWin = new ContainerEventWin();
		myWin.setTitle("Container event handle");
	}
}
