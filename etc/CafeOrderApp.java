import javax.swing.*;
import java.awt.*;

public class CafeOrderApp extends JFrame {

    private JLabel L1, L2, L3, L4, L5, L6, L7;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    private JButton b1;

    public CafeOrderApp() {
        setTitle("Cafe Order App");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        // 커피 메뉴 항목 라벨
        L1 = new JLabel("아메리카노");
        L1.setBounds(100, 100, 100, 30);
        add(L1);

        L2 = new JLabel("카페모카");
        L2.setBounds(100, 150, 100, 30);
        add(L2);

        L3 = new JLabel("딸기에이드");
        L3.setBounds(100, 200, 100, 30);
        add(L3);

        L4 = new JLabel("바나나에이드");
        L4.setBounds(100, 250, 100, 30);
        add(L4);

        L5 = new JLabel("카푸치노");
        L5.setBounds(100, 300, 100, 30);
        add(L5);

        // 디저트 메뉴 항목 라벨
        L6 = new JLabel("타르트");
        L6.setBounds(100, 350, 100, 30);
        add(L6);

        L7 = new JLabel("스콘");
        L7.setBounds(100, 400, 100, 30);
        add(L7);

        // 각 메뉴의 수량을 입력받을 텍스트 필드
        t1 = new JTextField();
        t1.setBounds(200, 100, 50, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(200, 150, 50, 30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(200, 200, 50, 30);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(200, 250, 50, 30);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(200, 300, 50, 30);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(200, 350, 50, 30);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(200, 400, 50, 30);
        add(t7);

        // 항목별 수량 및 가격을 표시할 텍스트 필드
        t8 = new JTextField();
        t8.setBounds(500, 100, 250, 250);
        t8.setBackground(Color.YELLOW);
        t8.setEditable(false);
        add(t8);

        // 계산 버튼
        b1 = new JButton("계산하기");
        b1.setBounds(500, 400, 100, 30);
        b1.addActionListener(e -> calculateTotal());
        add(b1);

        // 총 가격을 표시할 텍스트 필드
        t8 = new JTextField();
        t8.setBounds(600, 500, 100, 30);
        t8.setEditable(false);
        add(t8);

        setVisible(true);
    }

    // 주문된 수량을 계산하고 결과를 표시하는 메서드
    private void calculateTotal() {
        int americanoQty = Integer.parseInt(t1.getText());
        int cafeMochaQty = Integer.parseInt(t2.getText());
        int strawberryAdeQty = Integer.parseInt(t3.getText());
        int bananaAdeQty = Integer.parseInt(t4.getText());
        int cappuccinoQty = Integer.parseInt(t5.getText());
        int tartQty = Integer.parseInt(t6.getText());
        int sconeQty = Integer.parseInt(t7.getText());

        int americanoPrice = 2000;
        int cafeMochaPrice = 3500;
        int strawberryAdePrice = 5000;
        int bananaAdePrice = 5000;
        int cappuccinoPrice = 5000;
        int tartPrice = 3500;
        int sconePrice = 3500;

        // 총 주문 수량 및 가격 계산
        int totalQty = americanoQty + cafeMochaQty + strawberryAdeQty + bananaAdeQty + cappuccinoQty + tartQty + sconeQty;
        int totalPrice = (americanoQty * americanoPrice) +
                         (cafeMochaQty * cafeMochaPrice) +
                         (strawberryAdeQty * strawberryAdePrice) +
                         (bananaAdeQty * bananaAdePrice) +
                         (cappuccinoQty * cappuccinoPrice) +
                         (tartQty * tartPrice) +
                         (sconeQty * sconePrice);

        // 결과를 텍스트 필드에 표시
        t8.setText("아메리카노: " + americanoQty + "\n" +
                   "카페모카: " + cafeMochaQty + "\n" +
                   "딸기에이드: " + strawberryAdeQty + "\n" +
                   "바나나에이드: " + bananaAdeQty + "\n" +
                   "카푸치노: " + cappuccinoQty + "\n" +
                   "타르트: " + tartQty + "\n" +
                   "스콘: " + sconeQty + "\n" +
                   "\n" +
                   "아메리카노 가격: " + (americanoQty * americanoPrice) + "원\n" +
                   "카페모카 가격: " + (cafeMochaQty * cafeMochaPrice) + "원\n" +
                   "딸기에이드 가격: " + (strawberryAdeQty * strawberryAdePrice) + "원\n" +
                   "바나나에이드 가격: " + (bananaAdeQty * bananaAdePrice) + "원\n" +
                   "카푸치노 가격: " + (cappuccinoQty * cappuccinoPrice) + "원\n" +
                   "타르트 가격: " + (tartQty * tartPrice) + "원\n" +
                   "스콘 가격: " + (sconeQty * sconePrice) + "원\n" +
                   "\n" +
                   "총 가격: " + totalPrice + "원");
    }

    public static void main(String[] args) {
        new CafeOrderApp();
    }
}
