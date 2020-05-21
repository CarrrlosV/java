package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ControlaCliente;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteTela extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTextField;
	private JTextField telefoneTextField;
	private JTextField emailTextField;
	private JTextField enderecoTextField;
	private JTextField cidadeTextField;
	private JTextField estadoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteTela frame = new ClienteTela();
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
	public ClienteTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(142, 24, 214, 20);
		contentPane.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JLabel nomeLabel = new JLabel("Nome");
		nomeLabel.setBounds(69, 27, 46, 14);
		contentPane.add(nomeLabel);
		
		telefoneTextField = new JTextField();
		telefoneTextField.setBounds(142, 86, 134, 20);
		contentPane.add(telefoneTextField);
		telefoneTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeTextField.setText("");
				telefoneTextField.setText("");
				emailTextField.setText("");
				enderecoTextField.setText("");
				cidadeTextField.setText("");
				estadoTextField.setText("");
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(69, 58, 46, 14);
		contentPane.add(emailLabel);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(142, 55, 214, 20);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		enderecoTextField = new JTextField();
		enderecoTextField.setBounds(142, 123, 134, 20);
		contentPane.add(enderecoTextField);
		enderecoTextField.setColumns(10);
		
		cidadeTextField = new JTextField();
		cidadeTextField.setBounds(142, 154, 134, 20);
		contentPane.add(cidadeTextField);
		cidadeTextField.setColumns(10);
		
		estadoTextField = new JTextField();
		estadoTextField.setBounds(142, 185, 134, 20);
		contentPane.add(estadoTextField);
		estadoTextField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = nomeTextField.getText();
				String telefone = telefoneTextField.getText();
				String email = emailTextField.getText();
				String endereco = enderecoTextField.getText();
				String cidade = cidadeTextField.getText();
				String estado = estadoTextField.getText();
				
				ControlaCliente cliente = new ControlaCliente();
				cliente.salvar(nome, email,telefone,endereco, cidade, estado);
			}
		});
		btnNewButton_1.setBounds(335, 182, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel telefoneLabel = new JLabel("Telefone");
		telefoneLabel.setBounds(69, 89, 46, 14);
		contentPane.add(telefoneLabel);
		
		JLabel enderecoLabel = new JLabel("Endereco");
		enderecoLabel.setBounds(69, 126, 46, 14);
		contentPane.add(enderecoLabel);
		
		JLabel cidadeLabel = new JLabel("Cidade");
		cidadeLabel.setBounds(69, 157, 46, 14);
		contentPane.add(cidadeLabel);
		
		JLabel estadoLabel = new JLabel("Estado");
		estadoLabel.setBounds(69, 188, 46, 14);
		contentPane.add(estadoLabel);
	}
}
