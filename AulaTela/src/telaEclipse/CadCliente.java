package telaEclipse;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class CadCliente {

	private JFrame frmCadastroCliente;
	private JTextField ufTextField;
	private JRadioButton radioFeminino;
	private JRadioButton radioMasculino;
	private JRadioButton radioOutro;
	private boolean box01= false;
	private boolean box02= false;
	private boolean box03= false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadCliente window = new CadCliente();
					window.frmCadastroCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroCliente = new JFrame();
		frmCadastroCliente.setResizable(false);
		frmCadastroCliente.setTitle("Cadastro Cliente");
		frmCadastroCliente.getContentPane().setBackground(new Color(255, 255, 255));
		frmCadastroCliente.setBounds(100, 100, 559, 318);
		frmCadastroCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroCliente.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 553, 32);
		frmCadastroCliente.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		radioOutro = new JRadioButton("Outro");
		radioOutro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioOutro.isSelected()) {
					radioFeminino.setSelected(false);
					radioMasculino.setSelected(false);
				}
			}
		});
		radioOutro.setBounds(97, 122, 82, 23);
		frmCadastroCliente.getContentPane().add(radioOutro);
		
		radioFeminino = new JRadioButton("Feminino");
		radioFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioFeminino.isSelected()) {
					radioMasculino.setSelected(false);
					radioOutro.setSelected(false);
				}
			}
		});
		radioFeminino.setBounds(97, 70, 82, 23);
		frmCadastroCliente.getContentPane().add(radioFeminino);
		
		radioMasculino = new JRadioButton("Masculino");
		radioMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (radioMasculino.isSelected()) {
					radioFeminino.setSelected(false);
					radioOutro.setSelected(false);
				}
			}
		});
		radioMasculino.setBounds(97, 96, 82, 23);
		frmCadastroCliente.getContentPane().add(radioMasculino);
		
		JLabel lblNewLabel_1 = new JLabel("Sexo ");
		lblNewLabel_1.setBounds(97, 49, 46, 14);
		frmCadastroCliente.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBackground(new Color(128, 128, 128));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(185, 49, 1, 96);
		frmCadastroCliente.getContentPane().add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Linguas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(196, 74, 238, 55);
		frmCadastroCliente.getContentPane().add(panel_1);
		
		boxIngles = new JCheckBox("Ingles");
		boxIngles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(((Object) e).getStateChange() == ItemEvent.SELECTED) {
					box04=true;
				}else {
					box04=false;
				}
			}
		});
		panel_1.add(boxIngles);
		
		JCheckBox boxAlemao = new JCheckBox("Alemao");
		panel_1.add(boxAlemao);
		
		JCheckBox boxEspanhol = new JCheckBox("Espanhol");
		panel_1.add(boxEspanhol);
		
		JButton botaoGenero = new JButton("Genero");
		botaoGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioFeminino.isSelected()) {
					JOptionPane.showMessageDialog(null, radioFeminino.getText());
				}
				if(radioMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, radioMasculino.getText());
				} 
				if(radioOutro.isSelected()) {
					JOptionPane.showMessageDialog(null, radioOutro.getText());
				} 
			}
		});
		botaoGenero.setBounds(97, 152, 89, 23);
		frmCadastroCliente.getContentPane().add(botaoGenero);
		
		JButton btnNewButton = new JButton("Linguas Extrangeiras");
		btnNewButton.setBounds(276, 133, 133, 23);
		frmCadastroCliente.getContentPane().add(btnNewButton);
		
		final JComboBox ufComboBox = new JComboBox();
		ufComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ufTextField.setText(ufComboBox.getSelectedItem().toString());
			}
		});
		ufComboBox.setModel(new DefaultComboBoxModel(new String[] {"", "BA", "CE", "PI", "MA", "TO", "GO", "DF"}));
		ufComboBox.setBounds(251, 196, 78, 22);
		frmCadastroCliente.getContentPane().add(ufComboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(196, 183, 249, 2);
		frmCadastroCliente.getContentPane().add(separator_1);
		
		JLabel ufLabel = new JLabel("UF");
		ufLabel.setBounds(228, 200, 24, 14);
		frmCadastroCliente.getContentPane().add(ufLabel);
		
		ufTextField = new JTextField();
		ufTextField.setBounds(354, 197, 86, 20);
		frmCadastroCliente.getContentPane().add(ufTextField);
		ufTextField.setColumns(10);
	}
}
