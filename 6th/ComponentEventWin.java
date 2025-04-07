import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ComponentEventWin extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextArea txtArea = new JTextArea();
	
	class MyComponentAdapter extends ComponentAdapter {
		public void componentResized(ComponentEvent evt) {
			String str = evt.getSource().getClass() + " 콤포넌트 크기 재조정: ";
			str += evt.getComponent().getBounds() + "\n";
			txtArea.append(str);		
		}
	}
	
	public ComponentEventWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
	
		add(txtArea, "Center");		
		txtArea.addComponentListener(new MyComponentAdapter());
		setVisible(true);
	}

	public static void main(String[] args) {
		ComponentEventWin myWin = new ComponentEventWin();
		myWin.setTitle("콤포넌트 이벤트 처리");
	}
}
