// 9-4
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("GridLayout");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GridLayout 설정 (1행, 10열)
        frame.setLayout(new GridLayout(1, 10));

        // 10개의 버튼 생성 및 추가
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            frame.add(button);
        }

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}
