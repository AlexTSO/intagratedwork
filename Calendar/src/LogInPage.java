
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/*import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;*/
import javax.swing.border.LineBorder;
/*Qais Al-Hatmi Sn:11848659
 * Nikolaos Alexandropoulos Sn:13830689
 * Alex Osbourne Sn:13815859
 */
 
public class LogInPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInPage frame = new LogInPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//	Connection conn=null;

	
	/**
	 * Create the frame.
	 */
	public LogInPage() {
		
	
		//conn=**path I think**sqliteConnection.ConnectDb();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 523);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Log in");
		//on click???
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(87, 378, 103, 34);
		contentPane.add(btnNewButton_1);
		
		JLabel label1 = new JLabel("Username:");
		label1.setFont(new Font("AR CENA", Font.BOLD, 21));
		label1.setBounds(58, 203, 132, 34);
		contentPane.add(label1);
		
		textField = new JTextField();
		textField.setBounds(58, 236, 142, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 319, 142, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(450, 319, 142, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(450, 236, 142, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(450, 155, 142, 22);
		contentPane.add(textField_4);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("AR CENA", Font.BOLD, 21));
		lblPassword.setBounds(58, 284, 132, 34);
		contentPane.add(lblPassword);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnSignUp.setBounds(484, 378, 103, 34);
		contentPane.add(btnSignUp);
		
		JLabel label = new JLabel("Password:");
		label.setFont(new Font("AR CENA", Font.BOLD, 21));
		label.setBounds(450, 284, 132, 34);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Username:");
		label_1.setFont(new Font("AR CENA", Font.BOLD, 21));
		label_1.setBounds(450, 203, 132, 34);
		contentPane.add(label_1);
		
		JLabel lblEmployeeid = new JLabel("EmployeeID");
		lblEmployeeid.setFont(new Font("AR CENA", Font.BOLD, 21));
		lblEmployeeid.setBounds(450, 120, 132, 34);
		contentPane.add(lblEmployeeid);
		
		JLabel lblWelcomeToYour = new JLabel("Welcome to your personal");
		lblWelcomeToYour.setForeground(Color.WHITE);
		lblWelcomeToYour.setFont(new Font("AR CENA", Font.BOLD, 31));
		lblWelcomeToYour.setBounds(12, 38, 391, 43);
		contentPane.add(lblWelcomeToYour);
		
		JLabel lblCalendarSystem = new JLabel("Calendar System !");
		lblCalendarSystem.setForeground(Color.WHITE);
		lblCalendarSystem.setFont(new Font("AR CENA", Font.BOLD, 32));
		lblCalendarSystem.setBounds(46, 78, 293, 43);
		contentPane.add(lblCalendarSystem);
	}
}