// 9-1
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class ButtonExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("버튼 만들기");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 버튼 생성
        JButton button = new JButton("버튼");
        button.setBounds(150, 70, 100, 30); // 버튼 위치와 크기 설정
        button.setBackground(Color.GREEN); // 버튼 배경색 설정

        // 버튼을 프레임에 추가
        frame.add(button);

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}




