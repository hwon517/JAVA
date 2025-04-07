package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawStringWin extends JFrame {
	private static final long serialVersionUID = 1L;

	public DrawStringWin() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		setSize(300, 150);		
		setVisible(true);
	}

	public void paint(Graphics g) {
		//윈도를 구성하는 콘텐트페인의 크기를 반환
		Dimension d = getSize();			
		//그래픽의 색상을 지정
		g.setColor(new Color(255, 90, 180));
		g.drawString("자바 그래픽 프로그래밍", d.width/3, 2*d.height/3  );
		g.setColor(new Color(178, 204, 255));
		g.drawString("23730058 박혜원", d.width/3, 2*d.height/4  );
	}	
	
	public static void main(String[] args) {
		new DrawStringWin().setTitle("문자열 그리기");		
	}
}
