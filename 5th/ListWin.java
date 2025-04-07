package component;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ListWin extends JFrame {
	private static final long serialVersionUID = 1L;

	public ListWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 200);
		setTitle(title);
		//다양한 목록 구성의 메소드 호출
		makeList();
		setVisible(true);
	}

	public void makeList() {
		//JList 목록에 입력될 안드로이드 버전별 코드이름 문자열
		String code[] = {"Cupcake 1.5", "Donut 1.6", "Eclair 2.0", "Froyo 2.2",
		         "Gingerbread 2.3", "Honeycomb 3.0", "Icecream Sandwich 4.0"};
		//JList 목록에 입력되는 항목이 문자열이 이므로 JList<String>으로 선언
		JList<String> lst = new JList<String>(code); 
		JPanel pan1 = new JPanel();
		pan1.add(lst);
		
		//JList 목록에 입력될 스윙 관련 패키지 이름 문자열
		String swing[] = {"javax.accessibility", "javax.swing", "javax.swing.border",
				"javax.swing.event", "javax.swing.filechooser", "javax.swing.plaf", 
				"javax.swing.plaf.basic", "javax.swing.plaf.metal"};
		JList<String> pkg = new JList<String>(swing); 
		//JList 목록을 스크롤팬을 사용하므로 보이는 항목 수를 지정
		pkg.setVisibleRowCount(4);
		//JList 목록 객체를 인자로 스크롤팬 생성
		JScrollPane sp = new JScrollPane(pkg);
		//스크롤팬에서 항목 수가 많으면 스크롤바가 생성되도록
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		//JComboBox 목록에 입력될 갤럭시 시리즈 이름 문자열
		String ph[] = {"Galaxy S", "Galaxy S2", "Galaxy Note", "Galaxy S3"};
		JComboBox<String> cb = new JComboBox<String>(ph);
		//JComboBox 목록에 일일이 항목을 삽입하는 방법
		cb.addItem(new String("Galaxy Note2"));
		//JComboBox 필드를 편집 가능하도록 하는 방법
		cb.setEditable(true);
		//JComboBox 목록 중에서 4번째 항목을 선택하는 방법
		cb.setSelectedIndex(3);
		
		JPanel pan2 = new JPanel();
		pan2.add(sp);
		pan2.add(cb);
		
		//패널의 배치관리를 가로로 이등분하기 위해 GridLayout 설정
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(pan1);
		p.add(pan2);
		
		//윈도의 기본 배치는 BorderLayout이며 add는 중앙에 삽입
		add(p);
	}

	public static void main(String[] args) {
		ListWin win = new ListWin("목록 선택을 위한 콘트롤");
	}
}
