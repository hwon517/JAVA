import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
      
        JButton b1 = new JButton("Red");
        b1.setBackground(Color.RED);
        b1.setBounds(270, 330, 100, 50); 

        JButton b2 = new JButton("Blue");
        b2.setBackground(Color.BLUE);
        b2.setBounds(270, 390, 100, 50); 

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.RED);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLUE);
            }
        });

        frame.add(b1);
        frame.add(b2);

        frame.setVisible(true);
    }
}