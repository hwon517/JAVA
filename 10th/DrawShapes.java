import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import A.*;
public class DrawShapes extends JPanel {
  public sooyeon mc = new sooyeon();
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int shapeIndex = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        switch (shapeIndex) {
            case 0:
            	mc.sooyeon1(g);
                break;
            case 1:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
                break;
            case 2:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
            	mc.sooyeon3(g);
            	break;
            case 3:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
            	mc.sooyeon3(g);
            	mc.sooyeon4(g);
            	break;
            case 4:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
            	mc.sooyeon3(g);
            	mc.sooyeon4(g);
            	mc.sooyeon5(g);
            case 5:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
            	mc.sooyeon3(g);
            	mc.sooyeon4(g);
            	mc.sooyeon5(g);
            	mc.sooyeon6(g);
            case 6:
            	mc.sooyeon1(g);
            	mc.sooyeon2(g);
            	mc.sooyeon3(g);
            	mc.sooyeon4(g);
            	mc.sooyeon5(g);
            	mc.sooyeon6(g);
            	mc.sooyeon7(g);
                
          
                break;
        }
    }

    public void startDrawing() {
        // 1초 간격으로 도형 변경
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeIndex++;
                if (shapeIndex > 2) {
                    ((Timer)e.getSource()).stop(); // 타이머 종료
                }
                repaint(); // 패널 다시 그리기
            }
        }).start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");
        DrawShapes panel = new DrawShapes();

       


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(panel);
        frame.setVisible(true);

        // 도형 그리기 시작
        panel.startDrawing();
    }
}
