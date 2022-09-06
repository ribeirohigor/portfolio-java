package portfolio;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		JButton btnInsta = new JButton("");
		btnInsta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link ("https://www.instagram.com/_ribeirohigor/");
			}
		});
		btnInsta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInsta.setIcon(new ImageIcon(Sobre.class.getResource("/img/insta.png")));
		btnInsta.setBounds(20, 70, 24, 24);
		getContentPane().add(btnInsta);

		JLabel lblLinkedin = new JLabel("Higor Ribeiro");
		lblLinkedin.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblLinkedin.setBounds(56, 120, 75, 14);
		getContentPane().add(lblLinkedin);

		JButton btnLinkedin = new JButton("");
		btnLinkedin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link ("https://www.linkedin.com/in/higor-ribeiro-252438226/");
			}
		});
		btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin2.png")));
		btnLinkedin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLinkedin.setBounds(20, 110, 24, 24);
		getContentPane().add(btnLinkedin);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Sobre.class.getResource("/img/pngegg.png")));
		lblNewLabel_5.setBounds(288, 110, 147, 64);
		getContentPane().add(lblNewLabel_5);

		JButton btnGithub = new JButton("");
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link ("https://github.com/ribeirohigor");
			}
		});
		btnGithub.setDefaultCapable(false);
		btnGithub.setContentAreaFilled(false);
		btnGithub.setBorderPainted(false);
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github2.png")));
		btnGithub.setBounds(20, 150, 24, 24);
		getContentPane().add(btnGithub);

		JLabel lblGithub = new JLabel("GitHub");
		lblGithub.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblGithub.setBounds(56, 160, 75, 14);
		getContentPane().add(lblGithub);

	}// Fim do construtor

	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);

		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
