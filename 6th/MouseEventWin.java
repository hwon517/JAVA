import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseEventWin extends JFrame {
	private static final long serialVersionUID = 1L;
	MouseEventWin childWin = null;
	static int countChild;
	
	public MouseEventWin() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 150);
		setVisible(true);
		
		//register mouse event handler, motion event handler
		addMouseListener(new MouseEventwin());		 
	}
	
	class MouseEventWin implements MouseEventwin {
		public void mousePressed(MouseEvent e) {
			Rectangle bounds = getBounds();
			int x = e.getX() + bounds.x;
			int y = e.getY() + bounds.y;
			
			if (childWin == null) 
				childWin = new MouseEventWin();
			childWin.setLocation(x, y);
			childWin.setTitle(++countChild + "번째 자식 윈도");
			childWin.setSize(getSize().width*2/3, getSize().height*2/3);
			childWin.setVisible(true);    
		}
		
		
		//처리하지 않은 이벤트에 대한 메소드도 기능 없이 구현 필요
		public void mouseEntered(MouseEvent e) {
			Rectangle bounds = getBounds();
			int x = e.getX() + bounds.x;
			int y = e.getY() + bounds.y;
			
			if (childWin == null) 
				childWin = new MouseEventWin();
			childWin.setLocation(x, y);
			childWin.setTitle(++countChild + "번째 자식 윈도");
			childWin.setSize(getSize().width*2/3, getSize().height*2/3);
			childWin.setVisible(true);    
		}
		
		public void mouseExited(MouseEvent e) {
			if (childWin != null) childWin.setVisible(false);
		}
		
	}
	
	public static void main(String [] args) {
		MouseEventWin myWin = new MouseEventWin();
		myWin.setTitle("마우스를 누르세요");		
	}
}
