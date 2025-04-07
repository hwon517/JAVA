import javax.swing.*;
import java.awt.*;

public class MyFrame_err  extends JFrame {
 public MyFrame_err() {
  setSize(300,200);
  setTitle("내 frame");
  setLayout(new FlowLayout());
  JButton button = new JButton("버튼");
  add(button);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
 
 public static void main(String[] args) {
   MyFrame_err f = new MyFrame_err();
   //MyFrame f2 = new MyFrame();

 }
}
