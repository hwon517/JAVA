import java.awt.Color;

import javax.swing.JFrame;

public class FirstWindow {
	public static void main(String[] args) {
		//윈도를 위한 JFrame 객체 생성
		JFrame fw = new JFrame();
		//윈도의 가로와 세로 지정
		fw.setSize(300, 200);
		//윈도 캡션(제목) 지정 
		fw.setTitle("윈도 색상");
		(fw.getContentPane()).setBackground(Color.pink);
		//화면에 표시
		fw.setVisible(true);		
	}
}
