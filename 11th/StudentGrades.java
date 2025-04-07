import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class StudentGrades extends JFrame {
    private JTextField[] koreanFields = new JTextField[5];
    private JTextField[] englishFields = new JTextField[5];
    private JTextField[] mathFields = new JTextField[5];
    private JLabel[] averageLabels = new JLabel[5];
    private JLabel[] rankLabels = new JLabel[5];
    private String[] names = {"영수", "철수", "민희", "수영", "시우"};
    
    public StudentGrades() {
        setTitle("Student Grades");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 6));
        
        add(new JLabel("이름"));
        add(new JLabel("국어"));
        add(new JLabel("영어"));
        add(new JLabel("수학"));
        add(new JLabel("평균"));
        add(new JLabel("랭킹"));
        
        for (int i = 0; i < 5; i++) {
            add(new JLabel(names[i]));
            koreanFields[i] = new JTextField();
            englishFields[i] = new JTextField();
            mathFields[i] = new JTextField();
            averageLabels[i] = new JLabel("0.0");
            rankLabels[i] = new JLabel("0");
            add(koreanFields[i]);
            add(englishFields[i]);
            add(mathFields[i]);
            add(averageLabels[i]);
            add(rankLabels[i]);
        }
        
        JButton calculateButton = new JButton("계산하기");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResults();
            }
        });
        add(calculateButton);
        
        for (int i = 1; i < 6; i++) {
            add(new JLabel()); // To keep the grid layout aligned
        }
        
        setVisible(true);
    }
    
    private void calculateResults() {
        double[] averages = new double[5];
        Integer[] ranks = new Integer[5];
        
        for (int i = 0; i < 5; i++) {
            try {
                double korean = Double.parseDouble(koreanFields[i].getText());
                double english = Double.parseDouble(englishFields[i].getText());
                double math = Double.parseDouble(mathFields[i].getText());
                averages[i] = (korean + english + math) / 3.0;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "모든 필드에 숫자를 입력하세요", "입력 오류", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        // 랭크 계산
        Integer[] indices = {0, 1, 2, 3, 4};
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Double.compare(averages[o2], averages[o1]);
            }
        });
        
        for (int i = 0; i < 5; i++) {
            ranks[indices[i]] = i + 1;
        }
        
        // 결과 표시
        for (int i = 0; i < 5; i++) {
            averageLabels[i].setText(String.format("%.2f", averages[i]));
            rankLabels[i].setText(ranks[i].toString());
        }
    }
    
    public static void main(String[] args) {
        new StudentGrades();
    }
}
