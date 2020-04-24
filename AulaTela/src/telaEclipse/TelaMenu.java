package telaEclipse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class TelaMenu {

	private JFrame frmTelaMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
					window.frmTelaMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaMenu = new JFrame();
		frmTelaMenu.setTitle("Tela com Menu");
		frmTelaMenu.setBounds(100, 100, 450, 300);
		frmTelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmTelaMenu.setJMenuBar(menuBar);
		
		JMenu opcaoMenu = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(opcaoMenu);
		
		JMenuItem cadastroMenuItem = new JMenuItem("Cadastro");
		cadastroMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				cadastro.setVisible(true);
			}
		});
		cadastroMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_MASK));
		opcaoMenu.add(cadastroMenuItem);
		
		JMenuItem sairMenuItem = new JMenuItem("Sair");
		sairMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}
		});
		sairMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_MASK));
		opcaoMenu.add(sairMenuItem);
		
		JSeparator separator = new JSeparator();
		opcaoMenu.add(separator);
		
		JMenu ferramentasMenu = new JMenu("Ferramentas");
		menuBar.add(ferramentasMenu);
		
		JMenuItem calculadoraMenuItem = new JMenuItem("Calculadora");
		calculadoraMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCalc.main(null);
			}
		});
		calculadoraMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.CTRL_MASK));
		ferramentasMenu.add(calculadoraMenuItem);
		
		JMenu ajudaMenu = new JMenu("Ajuda");
		menuBar.add(ajudaMenu);
		
		JMenuItem sobreMenuItem = new JMenuItem("Sobre");
		sobreMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSobre.main(null);
			}
		});
		sobreMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.CTRL_MASK));
		ajudaMenu.add(sobreMenuItem);
		frmTelaMenu.getContentPane().setLayout(null);
		
		JLabel boasVindasLabel = new JLabel("Bem Vindo !!!");
		boasVindasLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		boasVindasLabel.setBounds(148, 87, 160, 39);
		frmTelaMenu.getContentPane().add(boasVindasLabel);
	}

}
