import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JFrame {
	private static final long serialVersionUID = 1L;

	public Rainbow(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 100);
		setTitle(title);
		//패널 구성의 메소드 호출
		makePanel();
		setVisible(true);
	}

	public void makePanel() {
		//상위 패널에 삽입할 2개의 패널을 만들어 색상 수정
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.red);
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.orange);
		JPanel pan3 = new JPanel();
		pan3.setBackground(Color.yellow);
		JPanel pan4 = new JPanel();
		pan4.setBackground(Color.green);
		JPanel pan5 = new JPanel();
		pan5.setBackground(Color.blue);
		
		//패널의 기본 배치는 FlowLayout이며 add의 기본 정렬은 중앙
		//패널의 배치관리를 가로를 읻으분하기 위해 GridLayout 설정
		JPanel p = new JPanel(new GridLayout(1,4));
		p.add(pan1);
		p.add(pan2);
		p.add(pan3);
		p.add(pan4);
		p.add(pan5);
		
		//윈도의 기본 배치는 BorderLayout이며 add는 중앙에 삽입
		add(p);
	}

	public static void main(String[] args) {
		Rainbow win = new Rainbow("패널 알아보기");
	}
}