package bancoJava;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login {

	private JFrame frame;
	private JTextField loginTextField;
	private JPasswordField senhaPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 356, 295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(117, 32, 117, 19);
		frame.getContentPane().add(lblNewLabel);

		loginTextField = new JTextField();
		loginTextField.setBounds(117, 62, 117, 20);
		frame.getContentPane().add(loginTextField);
		loginTextField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(117, 104, 117, 14);
		frame.getContentPane().add(lblNewLabel_1);

		senhaPasswordField = new JPasswordField();
		senhaPasswordField.setBounds(117, 132, 117, 20);
		frame.getContentPane().add(senhaPasswordField);

		JButton acesssarButton = new JButton("Acesssar");
		acesssarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conecta = ConectaBD.bdJava();
					String conectaSql = "select * from user where login=? and senha=?";
					PreparedStatement preparedStatement = conecta.prepareStatement(conectaSql);
					preparedStatement.setString(1, loginTextField.getText());
					preparedStatement.setString(2, new String(senhaPasswordField.getPassword()));

					ResultSet resultSet = preparedStatement.executeQuery();

					if (resultSet.next()) {
						JOptionPane.showMessageDialog(null, "Acesso liberado!");
					} else {
						JOptionPane.showMessageDialog(null, "Acesso negado!");
					}
					preparedStatement.close();
					conecta.close();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		acesssarButton.setBounds(133, 177, 89, 23);
		frame.getContentPane().add(acesssarButton);
	}
}
