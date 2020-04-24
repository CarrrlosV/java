package telaEclipse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class TelaCalc {

	private JFrame frame;
	private JTextField numero1TextField;
	private JTextField numero2TextField;
	private JTextField resultadoTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalc window = new TelaCalc();
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
	public TelaCalc() {
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

		numero1TextField = new JTextField();
		numero1TextField.setBounds(10, 101, 56, 20);
		frame.getContentPane().add(numero1TextField);
		numero1TextField.setColumns(10);

		numero2TextField = new JTextField();
		numero2TextField.setBounds(116, 101, 56, 20);
		frame.getContentPane().add(numero2TextField);
		numero2TextField.setColumns(10);

		resultadoTextField = new JTextField();
		resultadoTextField.setBounds(261, 101, 56, 20);
		frame.getContentPane().add(resultadoTextField);
		resultadoTextField.setColumns(10);

		JLabel adicaoLabel = new JLabel("+");
		adicaoLabel.setBounds(91, 104, 15, 14);
		frame.getContentPane().add(adicaoLabel);

		JLabel numero1Label = new JLabel("n\u00B0 1");
		numero1Label.setBounds(20, 76, 46, 14);
		frame.getContentPane().add(numero1Label);

		JLabel resultadoLabel = new JLabel("Resultado");
		resultadoLabel.setBounds(261, 76, 56, 14);
		frame.getContentPane().add(resultadoLabel);

		JLabel numero2Label = new JLabel("n\u00B0 2");
		numero2Label.setBounds(126, 76, 46, 14);
		frame.getContentPane().add(numero2Label);

		JButton botaoCalculaSoma = new JButton("=");
		botaoCalculaSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1, numero2, resultado;
				numero1 = Integer.parseInt(numero1TextField.getText());
				numero2 = Integer.parseInt(numero2TextField.getText());
				if (numero1 != 0 && numero2 != 0) {
					resultado = numero1 + numero2;
					resultadoTextField.setText(Integer.toString(resultado));
				}

			}
		});
		botaoCalculaSoma.setBounds(194, 101, 46, 20);
		frame.getContentPane().add(botaoCalculaSoma);

		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		botaoSair.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(botaoSair);

		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1TextField.setText("");
				numero2TextField.setText("");
				resultadoTextField.setText("");
			}
		});
		botaoLimpar.setBounds(335, 193, 89, 23);
		frame.getContentPane().add(botaoLimpar);

		JLabel tituloLabel = new JLabel("Calculadora");
		tituloLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		tituloLabel.setBounds(125, 31, 192, 23);
		frame.getContentPane().add(tituloLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 424, 22);
		frame.getContentPane().add(menuBar);
		
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
	}
}
