import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame{
	
	JFrame frame = new JFrame();
	public Main() {

		
		JPanel main = new JPanel();
		JPanel atas = new JPanel();

		
		
		JLabel login = new JLabel("Login");
		atas.add(login);
		frame.add(atas, BorderLayout.NORTH);
		
		
		JPanel tengah = new JPanel();
		tengah.setLayout(new GridLayout(2,2));
		JLabel email = new JLabel("Email");
		JTextField fEmail = new JTextField(10);
		JLabel password = new JLabel("Password");
		JPasswordField fPass = new JPasswordField(10);
		
		JPanel emailField = new JPanel();
		emailField.add(fEmail);
		JPanel passField = new JPanel();
		passField.add(fPass);
		tengah.add(email);
		tengah.add(emailField);
		tengah.add(password);
		tengah.add(passField);
		frame.add(tengah, BorderLayout.CENTER);
		
		JPanel bawah = new JPanel();
		JButton loginB = new JButton("Login");
		bawah.add(loginB);
		frame.add(bawah, BorderLayout.SOUTH);
		
		frame.setTitle("Register");
		frame.pack();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
