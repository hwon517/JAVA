// 10-7
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DraggingColor {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Dragging Color Change");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 생성 및 배경색 설정
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.GREEN);

        // 마우스 모션 리스너 추가
        contentPane.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                contentPane.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // 마우스를 움직일 때는 다시 초록색으로 변경
                contentPane.setBackground(Color.GREEN);
            }
        });

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}
