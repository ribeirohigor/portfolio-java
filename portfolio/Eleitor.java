package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

public class Eleitor extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleitor dialog = new Eleitor();
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
	public Eleitor() {
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Eleitor.class.getResource("/img/Eleitor24.png")));
		setTitle("Eleitor");
		setModal(true);
		setBounds(100, 100, 250, 211);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Idade");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 35, 46, 14);
		getContentPane().add(lblNewLabel);

		txtIdade = new JTextField();
		txtIdade.setBounds(82, 32, 64, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setIcon(new ImageIcon(Eleitor.class.getResource("/img/check.png")));
		btnNewButton.setToolTipText("Verificar ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verificar();
			}
		});
		btnNewButton.setBounds(26, 97, 64, 64);
		getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setIcon(new ImageIcon(Eleitor.class.getResource("/img/Borracha.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(145, 97, 64, 64);
		getContentPane().add(btnLimpar);

		RestrictedTextField validar = new RestrictedTextField(txtIdade, "0123456789");
		validar.setLimit(6);
		
	}// fim do construtor

	void verificar() {
		// validação
		if (txtIdade.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Idade!");
			txtIdade.requestFocus();
		} else {
			// variáveis
			int idade;
			// entrada
			idade = Integer.parseInt(txtIdade.getText());
			// processamento + saída
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Proibido votar");
			} else if (idade > 17 && idade < 71) {
				JOptionPane.showMessageDialog(null, "Obrigatório votar");
			} else {
				JOptionPane.showMessageDialog(null, "Voto facultativo");
			}
		}

	}
	void limpar( ) {
		txtIdade.setText(null);
	}
}// fim do código
