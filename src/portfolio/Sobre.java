package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;


public class Sobre extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/pc.png")));
		setTitle("Sobre");
		setModal(true);
		setBounds(100, 100, 451, 232);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Portif\u00F3lio de Projetos da UC9  do Curso Tecnico em Inform\u00E1tica");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 415, 24);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Criado e Desenvolvido por Higor Ribeiro");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 38, 219, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Sob a licen\u00E7a MIT");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(312, 169, 99, 24);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("_ribeirohigor");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNewLabel_3.setBounds(56, 80, 75, 14);
		getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				instagram();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setIcon(new ImageIcon(Sobre.class.getResource("/img/insta.png")));
		btnNewButton.setBounds(20, 70, 24, 24);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Higor Ribeiro");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(56, 120, 75, 14);
		getContentPane().add(lblNewLabel_4);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin2.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(20, 110, 24, 24);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Sobre.class.getResource("/img/pngegg.png")));
		lblNewLabel_5.setBounds(288, 110, 147, 64);
		getContentPane().add(lblNewLabel_5);

	}// Fim do construtor

	void instagram() {
		
	}
}
