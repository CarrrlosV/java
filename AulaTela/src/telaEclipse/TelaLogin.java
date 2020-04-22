package telaEclipse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLogin {

	private JFrame frame;
	private JTextField loginTextField;
	private JTextField senhaTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel loginLabel = new JLabel("Login");
		loginLabel.setBounds(20, 33, 46, 14);
		frame.getContentPane().add(loginLabel);
		
		loginTextField = new JTextField();
		loginTextField.setBounds(20, 58, 126, 20);
		frame.getContentPane().add(loginTextField);
		loginTextField.setColumns(10);
		
		senhaTextField = new JTextField();
		senhaTextField.setColumns(10);
		senhaTextField.setBounds(20, 125, 126, 20);
		frame.getContentPane().add(senhaTextField);
		
		JButton submitButton = new JButton("Enviar");
		submitButton.setBounds(37, 177, 89, 23);
		frame.getContentPane().add(submitButton);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setBounds(20, 100, 36, 14);
		frame.getContentPane().add(senhaLabel);
	}

}
