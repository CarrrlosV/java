package telaEclipse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class TelaSobre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobre frame = new TelaSobre();
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
	public TelaSobre() {
		setTitle("Sobre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu opcoesMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(opcoesMenu);
		
		JMenuItem retornarMenuItem = new JMenuItem("Retornar");
		retornarMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   TelaMenu.main(null);
			}
		});
		retornarMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.CTRL_MASK));
		opcoesMenu.add(retornarMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sobre");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(176, 11, 99, 28);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(335, 205, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnEclipseIdeFor = new JTextPane();
		txtpnEclipseIdeFor.setText("Eclipse IDE for Enterprise Java Developers.Eclipse IDE for Enterprise Java Developers.");
		txtpnEclipseIdeFor.setBounds(115, 77, 199, 64);
		contentPane.add(txtpnEclipseIdeFor);
	}
}
