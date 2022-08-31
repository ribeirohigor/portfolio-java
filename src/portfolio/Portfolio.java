package portfolio;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Portfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portfolio frame = new Portfolio();
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
	public Portfolio() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				/******************************
				 **** EVENTO ATIVAR JANELA ****
				 ******************************/
				Date data = new Date();
				DateFormat formatador = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
				lblStatus.setText(formatador.format(data));
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Portfolio.class.getResource("/img/pc.png")));
		setResizable(false);
		setTitle("Portf\u00F3lio de projetos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 550);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Calculo IMC");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IMC imc = new IMC();
				imc.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Portfolio.class.getResource("/img/IMC (2).png")));
		btnNewButton.setSelectedIcon(new ImageIcon(Portfolio.class.getResource("/img/IMC (2).png")));
		btnNewButton.setBounds(122, 37, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setDefaultCapable(false);
		btnNewButton_1.setToolTipText("Sobre o Desenvolvedor");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon(Portfolio.class.getResource("/img/sobre.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento clicar no botão
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(299, 368, 64, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setToolTipText("Calculadora da m\u00E9dia");
		btnNewButton_2.setIcon(new ImageIcon(Portfolio.class.getResource("/img/media.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(31, 37, 64, 64);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setToolTipText("Conversor de Temperatura");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setIcon(new ImageIcon(Portfolio.class.getResource("/img/temperatura.png")));
		btnNewButton_3.setSelectedIcon(new ImageIcon(Portfolio.class.getResource("/img/temp.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversaoTemperatura conversao = new ConversaoTemperatura();
				conversao.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(299, 37, 64, 64);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setToolTipText("Calculo Porcentagem");
		btnNewButton_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setIcon(new ImageIcon(Portfolio.class.getResource("/img/porcentagem.png")));
		btnNewButton_5.setSelectedIcon(new ImageIcon(Portfolio.class.getResource("/img/porcentagem.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoPorcentagem porcentagem = new CalculoPorcentagem();
				porcentagem.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(213, 37, 64, 64);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setDefaultCapable(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setIcon(new ImageIcon(Portfolio.class.getResource("/img/appServico.png")));
		btnNewButton_6.setToolTipText("App Servi\u00E7o");
		btnNewButton_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppServico servico = new AppServico();
				servico.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(299, 112, 64, 64);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Etanol x Gasolina");
		btnNewButton_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setIcon(new ImageIcon(Portfolio.class.getResource("/img/combustivel.png")));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combustivel combustivel = new Combustivel();
				combustivel.setVisible(true);
			}
		});
		btnNewButton_7.setBounds(31, 112, 64, 64);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setToolTipText("Eleitor");
		btnNewButton_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setIcon(new ImageIcon(Portfolio.class.getResource("/img/urna64.png")));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleitor eleitor = new Eleitor();
				eleitor.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(122, 112, 64, 64);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_9.setToolTipText("Dado");
		btnNewButton_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_9.setDefaultCapable(false);
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Dado dado = new Dado();
			dado.setVisible(true);
			}
			
		});
		btnNewButton_9.setIcon(new ImageIcon(Portfolio.class.getResource("/img/icons8-dado-60.png")));
		btnNewButton_9.setBounds(213, 112, 64, 64);
		contentPane.add(btnNewButton_9);
		
		JButton btnTabuada = new JButton("");
		btnTabuada.setContentAreaFilled(false);
		btnTabuada.setBorderPainted(false);
		btnTabuada.setIcon(new ImageIcon(Portfolio.class.getResource("/img/multiplication.png")));
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnTabuada.setBounds(31, 187, 64, 64);
		contentPane.add(btnTabuada);
		
		JButton btnJokenpo = new JButton("");
		btnJokenpo.setContentAreaFilled(false);
		btnJokenpo.setBorderPainted(false);
		btnJokenpo.setIcon(new ImageIcon(Portfolio.class.getResource("/img/pedra-papel-tesoura.png")));
		btnJokenpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TelaJogo telajogo = new TelaJogo();
				telajogo.setVisible(true);
			}
		});
		btnJokenpo.setBounds(122, 187, 64, 64);
		contentPane.add(btnJokenpo);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setIcon(new ImageIcon(Portfolio.class.getResource("/img/botaocarta.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cartas cartas = new Cartas ();
				cartas.setVisible(true);
			}
		});
		btnNewButton_4.setToolTipText("Sorteio de Carta");
		btnNewButton_4.setBounds(213, 187, 64, 64);
		contentPane.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 466, 373, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Snap ITC", Font.BOLD, 20));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 11, 353, 23);
		panel.add(lblStatus);
	}// fim do construtor
}
