import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyImageMove extends JFrame implements ActionListener {
    static int x = 230, y = 40;
    JPanel panel1 = new MyPanel();
    JPanel panel2 = new JPanel();
    JButton button1, button2, button3, button4;

    class MyPanel extends JPanel {
        Image image;

        public MyPanel() {
            image = new ImageIcon("./뚱이.png").getImage();  // 뚱이.png 파일의 경로
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, x, y, this);
        }
    }

    MyImageMove() {
        setSize(500, 500);
        setTitle("뚱이 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 버튼 패널 설정
        panel2.setLayout(new GridLayout(2, 2));

        button1 = new JButton("왼쪽으로 이동");
        button2 = new JButton("오른쪽으로 이동");
        button3 = new JButton("위로 이동");
        button4 = new JButton("아래로 이동");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        // 버튼 색상 설정
        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.MAGENTA);
        button3.setBackground(Color.GRAY);
        button4.setBackground(Color.PINK);

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            x -= 20;
            panel1.repaint();
        } else if (e.getSource() == button2) {
            x += 20;
            panel1.repaint();
        } else if (e.getSource() == button3) {
            y -= 20;
            panel1.repaint();
        } else if (e.getSource() == button4) {
            y += 20;
            panel1.repaint();
        }
    }

    public static void main(String[] args) {
        new MyImageMove();
    }
}
