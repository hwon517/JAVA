// 10-6
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseHoverExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("마우스 올리기");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이블 생성
        JLabel label = new JLabel();
        label.setFont(new Font("Malgun Gothic", Font.BOLD, 15)); // Malgun Gothic 폰트 사용, 크기 10
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP); // 상단 정렬 설정
        label.setText("마우스를 올려보세요!");

        // 마우스 이벤트 리스너 추가
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Love Java");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("사랑해");
            }
        });

        // 프레임에 레이블 추가
        frame.add(label, BorderLayout.CENTER);

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}
