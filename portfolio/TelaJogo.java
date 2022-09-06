package portfolio;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Cursor;

public class TelaJogo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnPedra;
	private JRadioButton rdbtnPapel;
	private JRadioButton rdbtnTesoura;
	private JLabel lblPc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaJogo.class.getResource("/img/pedra-papel-tesoura.png")));
		setTitle(" Joken Po");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 474);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pedra.png")));
		lblNewLabel.setBounds(30, 11, 64, 64);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/papel.png")));
		lblNewLabel_1.setBounds(169, 11, 64, 64);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tesoura.png")));
		lblNewLabel_2.setBounds(325, 11, 64, 64);
		contentPane.add(lblNewLabel_2);

		lblPc = new JLabel("");
		lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
		lblPc.setBounds(127, 285, 171, 139);
		contentPane.add(lblPc);

		rdbtnPedra = new JRadioButton("");
		buttonGroup.add(rdbtnPedra);
		rdbtnPedra.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPedra.setBackground(Color.WHITE);
		rdbtnPedra.setBounds(40, 82, 44, 23);
		contentPane.add(rdbtnPedra);

		rdbtnPapel = new JRadioButton("");
		buttonGroup.add(rdbtnPapel);
		rdbtnPapel.setBackground(Color.WHITE);
		rdbtnPapel.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnPapel.setBounds(179, 82, 44, 23);
		contentPane.add(rdbtnPapel);

		rdbtnTesoura = new JRadioButton("");
		buttonGroup.add(rdbtnTesoura);
		rdbtnTesoura.setBackground(Color.WHITE);
		rdbtnTesoura.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnTesoura.setBounds(335, 82, 44, 23);
		contentPane.add(rdbtnTesoura);

		JButton btnPow = new JButton("");
		btnPow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPow.setDefaultCapable(false);
		btnPow.setContentAreaFilled(false);
		btnPow.setBorderPainted(false);
		btnPow.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pedra-papel-tesoura (1).png")));
		btnPow.setToolTipText("POW");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pow();
			}
		});
		btnPow.setBounds(179, 188, 64, 64);
		contentPane.add(btnPow);
	}// Fim do Construtor

	void pow() {
		// validação
		if (!rdbtnPedra.isSelected() && !rdbtnPapel.isSelected() && !rdbtnTesoura.isSelected()) {
			JOptionPane.showMessageDialog(null, "Selecione uma Opção");
		} else {
			// logica principal
			Random random = new Random();
			int pc = random.nextInt(3);
			System.out.println(pc);
			// Substituir a imagem
			switch (pc) {
			case 0:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpedra.png")));
				break;
			case 1:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pcpapel.png")));
				break;
			case 2:
				lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pctesoura.png")));
				break;
			}
			// Comparações para determinar o vencedor ou o empate
			if ((rdbtnPedra.isSelected() && pc == 0) || (rdbtnPapel.isSelected() && pc == 1)
					|| (rdbtnTesoura.isSelected() && pc == 2)) {
				JOptionPane.showMessageDialog(null, "Empate");
			} else if ((rdbtnPedra.isSelected() && pc == 2) || (rdbtnPapel.isSelected() && pc == 0)
					|| (rdbtnTesoura.isSelected() && pc == 1)) {
				JOptionPane.showMessageDialog(null, "Jogador VENCEU");

			} else {
				JOptionPane.showMessageDialog(null, "PC VENCEU");
			}
			// limpar os campos
			lblPc.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/pc.png")));
			buttonGroup.clearSelection();
		}
	}
}
// Fim do Código
