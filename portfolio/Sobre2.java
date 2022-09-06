package portfolio;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.SystemColor;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre2 extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sobre2 dialog = new Sobre2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre2() {
		setModal(true);
		setBounds(150, 150, 450, 184);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Buscar CEP");
			lblNewLabel.setBounds(10, 38, 187, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("@Autor Higor Ribeiro");
			lblNewLabel_1.setBounds(10, 73, 187, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("WEB Service");
			lblNewLabel_1.setBounds(10, 117, 115, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblWebService = new JLabel("republicavirtual.com.br");
			lblWebService.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					link( "https://republicavirtual.com.br/");
				}
			});
			lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblWebService.setFont(new Font("Times New Roman", Font.BOLD, 15));
			lblWebService.setForeground(SystemColor.textHighlight);
			lblWebService.setBounds(219, 116, 205, 14);
			getContentPane().add(lblWebService);
		}
		{
			JButton btnGithub = new JButton("");
			btnGithub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					link ("https://github.com/ribeirohigor");
				}
				
			});
			btnGithub.setIcon(new ImageIcon(Sobre2.class.getResource("/img/github.png")));
			btnGithub.setToolTipText("GitHub");
			btnGithub.setBounds(280, 34, 48, 48);
			getContentPane().add(btnGithub);
		}
	}// fim do construtor

	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
			
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}// fim do codigo
