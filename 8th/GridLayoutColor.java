// 9-5
import javax.swing.*;
import java.awt.*;

public class GridLayoutColor {
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

            // 각 버튼의 배경색 설정
            switch (i) {
                case 0:
                    button.setBackground(Color.RED);
                    break;
                case 1:
                    button.setBackground(Color.ORANGE);
                    break;
                case 2:
                    button.setBackground(Color.YELLOW);
                    break;
                case 3:
                    button.setBackground(Color.GREEN);
                    break;
                case 4:
                    button.setBackground(Color.CYAN);
                    break;
                case 5:
                    button.setBackground(Color.BLUE);
                    break;
                case 6:
                    button.setBackground(Color.MAGENTA);
                    break;
                case 7:
                    button.setBackground(Color.GRAY);
                    break;
                case 8:
                    button.setBackground(Color.PINK);
                    break;
                case 9:
                    button.setBackground(Color.LIGHT_GRAY);
                    break;
            }

            frame.add(button);
        }

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}

