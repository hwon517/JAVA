import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quest03 extends JFrame implements ActionListener {
    static int x = 230, y = 40;
    JPanel panel1 = new MyPanel();
    JPanel panel2 = new JPanel();
    JButton button1, button2, button3, button4;

    class MyPanel extends JPanel {
        public MyPanel() {
            addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    System.out.println("키가 눌려졌다! ");
                    int keycode = e.getKeyCode();
                    switch (keycode) {
                        case KeyEvent.VK_LEFT:
                            x -= 20;
                            repaint();
                            break;
                        case KeyEvent.VK_RIGHT:
                            x += 20;
                            repaint();
                            break;
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    // System.out.println("키가 눌려졌다! ");
                }

                @Override
                public void keyTyped(KeyEvent e) {
                    // System.out.println("키가 눌려졌다! ");
                }
            });
            this.requestFocus();
            setFocusable(true);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // 그래픽 그리기 코드
            g.setColor(Color.black);
            g.fillOval(x + 78, y + 60, 220, 200); // 머리
            g.fillOval(x + 35, y + 27, 80, 90); // 왼쪽머리
            g.fillOval(x + 260, y + 27, 80, 90); // 오른쪽머리
            g.setColor(new Color(250, 224, 212));
            g.fillOval(x + 87, y + 90, 200, 200); // 흰얼굴
            g.setColor(Color.black);
            g.fillRect(x + 160, y + 85, 18, 18);
            g.fillRect(x + 175, y + 85, 18, 18);// 왼쪽이빨
            g.fillRect(x + 190, y + 85, 18, 18);
            g.fillRect(x + 210, y + 85, 18, 18);// 오른쪽이빨

            g.setColor(Color.black);
            g.fillRect(x + 210, y + 160, 55, 5); // 오른쪽눈
            g.fillRect(x + 120, y + 160, 55, 5); // 왼쪽눈
            // 눈동자
            g.fillOval(x + 210, y + 160, 30, 40);
            g.fillOval(x + 120, y + 160, 30, 40);

            g.setColor(Color.black);
            g.drawArc(x + 175, y + 180, 20, 70, 0, 180);// 코
            g.setColor(Color.red);
            g.fillArc(x + 118, y + 180, 140, 90, 180, 180);// 입
            g.setColor(Color.white);
            g.fillRect(x + 160, y + 225, 18, 18);// 왼쪽이빨
            g.fillRect(x + 190, y + 225, 18, 18);// 오른쪽이빨
        }
    }

    Quest03() {
        setSize(500, 400);
        setTitle("박스 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 패널설정
        panel1.setSize(500, 400);
        panel1.setBackground(Color.yellow);
        panel2.setSize(500, 100);
        panel2.setBackground(Color.red);
        panel2.setLayout(new FlowLayout());

        // 패널2설정
        button1 = new JButton("왼쪽으로 이동");
        button2 = new JButton("오른쪽으로 이동");
        button3 = new JButton("위로 이동");
        button4 = new JButton("아래로 이동");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        // 버튼 색상 설정
        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.MAGENTA);
        button3.setBackground(Color.GRAY);
        button4.setBackground(Color.PINK);

        // 최종 실행
        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("왼쪽으로 이동 입력됨");
            x -= 20;
            repaint();
        }
        if (e.getSource() == button2) {
            System.out.println("오른쪽으로 이동 입력됨");
            x += 20;
            repaint();
        }
        if (e.getSource() == button3) {
            System.out.println("위로 이동 입력됨");
            y -= 20;
            repaint();
        }
        if (e.getSource() == button4) {
            System.out.println("아래로 이동 입력됨");
            y += 20;
            repaint();
        }
    }

    public static void main(String[] args) {
        new Quest03();
    }
}
