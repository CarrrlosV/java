package telaEclipse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaTeste {

	private JFrame frame;
	private JTextField nomeTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTeste window = new TelaTeste();
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
	public TelaTeste() {
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
		
		JLabel nomeLabel = new JLabel("nome");
		nomeLabel.setBounds(27, 33, 46, 14);
		frame.getContentPane().add(nomeLabel);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(27, 58, 118, 20);
		frame.getContentPane().add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Boa noite " + nomeTextField.getText() + "!");
			}
		});
		button.setBounds(27, 89, 89, 23);
		frame.getContentPane().add(button);
	}
}
