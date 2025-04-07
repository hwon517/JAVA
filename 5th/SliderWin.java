package component;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;

public class SliderWin extends JFrame {
	private static final long serialVersionUID = 1L;

	public SliderWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setTitle(title);
		//패널 구성의 메소드 호출
		makeSlider();
		setVisible(true);
	}

	public void makeSlider() {
		//JSlider의 객체(수평, 0에서 100까지이며 초기 설정은 평균인 50으로)를 생성
		JSlider sdr = new JSlider();
		
		//JSlider의 객체(수평, 0에서 50까지이며 초기 설정은 10으로)를 생성
		JSlider hSdr = new JSlider(0, 50, 10);
		//JSlider의 눈금 그리기 설정 
		hSdr.setPaintTicks(true);
		//JSlider의 주 눈금 간격 설정 
		hSdr.setMajorTickSpacing(10);
		//JSlider의 주 눈금 글자 보이기 설정 
		hSdr.setPaintLabels(true);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 1));
		p.add(sdr); p.add(hSdr);
		
		//JSlider의 객체(수평, 0에서 200까지이며 초기 설정은 20으로)를 생성
		JSlider sdr1 = new JSlider(JSlider.HORIZONTAL, 0, 200, 20);
		sdr1.setPaintTicks(true);
		sdr1.setPaintTrack(true);		//JSlider의 트랙 그리기 설정 
		sdr1.setMajorTickSpacing(50);	//JSlider의 주 눈금 간격 설정 
		sdr1.setMinorTickSpacing(10);	//JSlider의 부 눈금 간격 설정 
		sdr1.setPaintLabels(true);		//JSlider의 주 눈금 글자 보이기 설정
		sdr1.setForeground(Color.blue);	//JSlider의 눈금과 글자의 색상 설정 

		//JSlider의 객체(수평, 0에서 100까지이며 초기 설정은 20으로)를 생성
		JSlider vSdr = new JSlider(JSlider.VERTICAL, 0, 80, 30);
		vSdr.setPaintTicks(true);
		vSdr.setPaintTrack(false);
		vSdr.setMajorTickSpacing(40);
		vSdr.setMinorTickSpacing(20);
		vSdr.setPaintLabels(true);
		vSdr.setValue(30);
		vSdr.setForeground(Color.red);
		
		//JTabbedPane를 생성하여 탭패인을 생성 
		JTabbedPane tp = new JTabbedPane();
		//"슬라이더" 이름으로 객체 p가 추가된된 탭을 생성 
		tp.add("슬라이더", p);
		//"수직 슬라이더" 이름으로 객체 vSdr이 추가된 탭을 생성 
		tp.addTab("수직 슬라이더", vSdr);
		//첫 번째 탭의 제목을 수정 
		tp.setTabComponentAt(0, new JLabel("수평 슬라이더 1"));
		//두 번째 탭으로 새로운 탭을 추가하며, "색상 슬라이더"가 말 풍선으로 표시  
		tp.insertTab("수평 슬라이더 2", null, sdr1, "색상 슬라이더", 1); 
		
		add(tp);
	}

	public static void main(String[] args) {
		SliderWin win = new SliderWin("슬라이더와 탭");
	}
}