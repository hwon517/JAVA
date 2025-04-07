import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class MouseInputWin extends JFrame {
	private static final long serialVersionUID = 1L;
	
	JLabel s1 = new JLabel("Pressed/Released");
	JLabel s2 = new JLabel("Entered/Exited/Clicked");
	JLabel s3 = new JLabel("Dragged/Moved");
	Container pane;
	
	public MouseInputWin() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane = getContentPane();

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		p.add(s1); 		p.add(s2);
		add(s3, "North");
		add(p, "South");
		
		//register mouse event handler, motion event handler
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseListener());
		
		setSize(300, 150);		
		setVisible(true);
	}
	
//class MyMouseListener implements MouseListener, MouseMotionListener {
class MyMouseListener implements MouseInputListener {
	//       MouseListener의 메소드 구현     
	public void mousePressed(MouseEvent e) {
		s1.setText("mousePressed");
	}
	public void mouseReleased(MouseEvent e) {
		s1.setText("mouseReleased");
	}
	public void mouseEntered(MouseEvent e) {
		pane.setBackground(Color.pink);
		s2.setText("mouseEntered: ");
	}
	public void mouseExited(MouseEvent e) {
		pane.setBackground(Color.white);
		s2.setText("mouseExited: ");
	}
	public void mouseClicked(MouseEvent e) {
		s2.setText("mouseClicked: " + e.getClickCount() + "회 클릭");
	}

	//       MouseMotionListener의 메소드 구현    
	public void mouseDragged(MouseEvent e) {
		s3.setText("mouseDragged:   좌표(" + e.getX() + ", "+ e.getY() + ")");
	}
	public void mouseMoved(MouseEvent e) {
		s3.setText("mouseMoved:   좌표(" + e.getX() + ", "+ e.getY() + ")");
	}
}
	
	public static void main(String [] args) {
		MouseInputWin myWin = new MouseInputWin();
		myWin.setTitle("마우스의 다양한 조작");		
	}
}
