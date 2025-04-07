// 9-2
import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("로그인 창");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ID 레이블 생성
        JLabel idLabel = new JLabel("ID :");
        idLabel.setBounds(100, 50, 30, 25);
        frame.add(idLabel);

        // ID 입력창 생성
        JTextField idField = new JTextField();
        idField.setBounds(130, 50, 100, 25);
        frame.add(idField);

        // PASS 레이블 생성
        JLabel passLabel = new JLabel("PASS :");
        passLabel.setBounds(240, 50, 50, 25);
        frame.add(passLabel);

        // PASS 입력창 생성
        JPasswordField passField = new JPasswordField();
        passField.setBounds(290, 50, 100, 25);
        frame.add(passField);

        // 로그인 버튼 생성
        JButton loginButton = new JButton("로그인");
        loginButton.setBounds(400, 50, 80, 25);
        frame.add(loginButton);

        // 프레임을 화면에 표시
        frame.setVisible(true);
    }
}
