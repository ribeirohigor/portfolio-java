package portfolio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;

public class SorteioEstadio extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblEstadio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SorteioEstadio dialog = new SorteioEstadio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SorteioEstadio() {
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 440, 591);
		getContentPane().setLayout(null);
		{
			JButton btnSorteio = new JButton("");
			btnSorteio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnSorteio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/champions.png")));
			btnSorteio.setToolTipText("Sortear Estadio");
			btnSorteio.setContentAreaFilled(false);
			btnSorteio.setForeground(Color.WHITE);
			btnSorteio.setBackground(Color.WHITE);
			btnSorteio.setBorderPainted(false);
			btnSorteio.setDefaultCapable(false);
			btnSorteio.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnSorteio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sortear();
				}
			});
			btnSorteio.setBounds(173, 177, 64, 64);
			getContentPane().add(btnSorteio);
		}

		lblEstadio = new JLabel("");
		lblEstadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/logo2.png")));
		lblEstadio.setBounds(4, 252, 410, 300);
		getContentPane().add(lblEstadio);
		
		JLabel lblNewLabel = new JLabel("SORTEIO DO ESTADIO QUE IR\u00C1 SEDIAR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(14, 11, 400, 57);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A FINAL DA");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(14, 63, 400, 37);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("COPA LIBERTADORES DA AM\u00C9RICA");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 111, 400, 40);
		getContentPane().add(lblNewLabel_2);
	}// fim do construtor

	void sortear() {
		Random random = new Random();
		int sorteio = random.nextInt(9);

		switch (sorteio) {
		case 1:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/argentina.png")));
			break;
		case 2: 
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/bolivia.png")));
			break;
		case 3:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/brasil.png")));
			break;
		case 4:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/chile.png")));
			break;
		case 5:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/colombia.png")));
			break;
		case 6:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/equador.png")));
			break;
		case 7:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/paraguai.png")));
			break;
		case 8:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/peru.png")));
			break;
		case 9:
			lblEstadio.setIcon(new ImageIcon(SorteioEstadio.class.getResource("/img/uruguai.png")));
			break;
		}
		
	}

}
