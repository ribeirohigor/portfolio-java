package portfolio;

import java.awt.BorderLayout;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Dado extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblFace;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dado dialog = new Dado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dado() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dado.class.getResource("/img/icons8-dado-30.png")));
		setBounds(100, 100, 229, 336);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JButton btnNewButton = new JButton("Lan\u00E7ar");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dado();
			}
		});
		btnNewButton.setBounds(51, 41, 115, 23);
		contentPanel.add(btnNewButton);

		lblFace = new JLabel("");
		lblFace.setHorizontalAlignment(SwingConstants.CENTER);
		lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/dadocapa.png")));
		lblFace.setBounds(51, 124, 115, 119);
		contentPanel.add(lblFace);
	}// Fim do Construtor

	void dado() {

		Random random = new Random();
		int face = random.nextInt(6) + 1;

		switch (face) {
		case 1:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face1.png")));
			break;
		case 2:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face2.png")));
			break;
		case 3:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face3.png")));
			break;
		case 4:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face4.png")));
			break;
		case 5:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face5.png")));
			break;
		case 6:
			lblFace.setIcon(new ImageIcon(Dado.class.getResource("/img/face6.png")));
			break;
	
		}
	}
}
