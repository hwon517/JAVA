package wk_12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfFirstName;
	private JTextField textField;
	private JLabel lbWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(12, 10, 410, 20);
		contentPane.add(lblNewLabel);
		
		tfFirstName = new JTextField();
		tfFirstName.setBounds(12, 35, 410, 21);
		contentPane.add(tfFirstName);
		tfFirstName.setColumns(10);
		
		JLabel tfLastName = new JLabel("Last Name");
		tfLastName.setBounds(12, 66, 410, 20);
		contentPane.add(tfLastName);
		
		textField = new JTextField();
		textField.setBounds(12, 91, 410, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lbWelcome = new JLabel("");
		lbWelcome.setBounds(12, 173, 410, 20);
		contentPane.add(lbWelcome);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = tfFirstName.getText();
				String lastName = textField.getText();
				lbWelcome.setText("Welcome " + firstName + " " + lastName);
			}
		});
		btnOK.setBounds(12, 228, 198, 23);
		contentPane.add(btnOK);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstName.setText("");
				textField.setText("");
				lbWelcome.setText("");
			}
		});
		btnClear.setBounds(222, 228, 200, 23);
		contentPane.add(btnClear);
	}
}
