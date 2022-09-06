package portfolio;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Cursor;

public class Media extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtDiciplina;
	private JTextField txtNotaUm;
	private JTextField txtNotaDois;
	private JTextField txtNotaTres;
	private JTextField txtNotaQuatro;
	private JButton btnSalvar;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media dialog = new Media();
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
	public Media() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Media.class.getResource("/img/media48.png")));
		setTitle("Calculo da Media ");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 66, 14);
		getContentPane().add(lblNewLabel);

		txtNome = new JTextField();
		txtNome.setBounds(86, 8, 338, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Diciplina");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 49, 66, 14);
		getContentPane().add(lblNewLabel_1);

		txtDiciplina = new JTextField();
		txtDiciplina.setBounds(86, 46, 338, 20);
		getContentPane().add(txtDiciplina);
		txtDiciplina.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Nota 1\u00B0 Bi");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 94, 61, 14);
		getContentPane().add(lblNewLabel_2);

		txtNotaUm = new JTextField();
		txtNotaUm.setBounds(101, 91, 86, 20);
		getContentPane().add(txtNotaUm);
		txtNotaUm.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Nota 2\u00B0 Bi");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(216, 94, 61, 14);
		getContentPane().add(lblNewLabel_3);

		txtNotaDois = new JTextField();
		txtNotaDois.setBounds(318, 91, 86, 20);
		getContentPane().add(txtNotaDois);
		txtNotaDois.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Nota 3\u00B0 Bi");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 140, 67, 14);
		getContentPane().add(lblNewLabel_4);

		txtNotaTres = new JTextField();
		txtNotaTres.setBounds(101, 137, 86, 20);
		getContentPane().add(txtNotaTres);
		txtNotaTres.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Nota 4\u00B0 Bi");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(216, 140, 61, 14);
		getContentPane().add(lblNewLabel_5);

		txtNotaQuatro = new JTextField();
		txtNotaQuatro.setBounds(318, 137, 86, 20);
		getContentPane().add(txtNotaQuatro);
		txtNotaQuatro.setColumns(10);

		btnSalvar = new JButton("");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setDefaultCapable(false);
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setBorderPainted(false);
		btnSalvar.setIcon(new ImageIcon(Media.class.getResource("/img/save.png")));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnSalvar.setBounds(106, 186, 64, 64);
		getContentPane().add(btnSalvar);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setDefaultCapable(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(Media.class.getResource("/img/Borracha.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_2.setToolTipText("Limpar");
		btnNewButton_2.setBounds(251, 186, 64, 64);
		getContentPane().add(btnNewButton_2);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(194, 227, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		RestrictedTextField validar = new RestrictedTextField(txtNotaUm, "0123456789.");
		validar.setLimit(6);
		RestrictedTextField validar2 = new RestrictedTextField(txtNotaDois, "0123456789.");
		validar2.setLimit(6);
		RestrictedTextField validar3 = new RestrictedTextField(txtNotaTres, "0123456789.");
		validar3.setLimit(6);
		RestrictedTextField validar4 = new RestrictedTextField(txtNotaQuatro, "0123456789.");
		validar4.setLimit(6);
		
		
		
	}// Fim do construtor

	void calcular() {
	
		// Validação de Campos
		if (txtNome.getText().isEmpty()){
		JOptionPane.showMessageDialog(null, "Preencha o Nome");
		txtNome.requestFocus();
		}else if (txtDiciplina.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Preencha a Diciplina");
			txtDiciplina.requestFocus();
		}else if (txtNotaUm.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Nota do Primeiro Bimestre");
			txtNotaUm.requestFocus();
		}else if (txtNotaDois.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Nota do Segundo Bimestre");
			txtNotaDois.requestFocus();
		}else if (txtNotaTres.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Nota do Terceiro Bimestre");
			txtNotaTres.requestFocus();
		}else if (txtNotaQuatro.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a Nota do Quarto Bimestre");
			txtNotaQuatro.requestFocus();
		}else {
			// Variaveis
			String nome, diciplina;
			double bim1, bim2, bim3, bim4, media;

			// Entrada
			nome = txtNome.getText();
			diciplina = txtDiciplina.getText();
			bim1 = Double.parseDouble(txtNotaUm.getText());
			bim2 = Double.parseDouble(txtNotaDois.getText());
			bim3 = Double.parseDouble(txtNotaTres.getText());
			bim4 = Double.parseDouble(txtNotaQuatro.getText());

			// Processamento
			media = (bim1 + bim2 + bim3 + bim4) / 4;
			// Saida
			if (media < 5) {
				JOptionPane.showMessageDialog(null,
						"Nome: " + nome + "\ndiciplina: " + diciplina + "\nbim1: " + bim1 + "\nbim2: " + bim2 + "\nbim3: "
								+ bim3 + "\nbim4: " + bim4 + "\nmedia: " + media
						+ "\nStatus: REPROVADO", "Boletim Escolar", JOptionPane.ERROR_MESSAGE);


			} else {
				JOptionPane.showMessageDialog(null,
						"Nome: " + nome + "\ndiciplina: " + diciplina + "\nbim1: " + bim1 + "\nbim2: " + bim2 + "\nbim3: "
								+ bim3 + "\nbim4: " + bim4 + "\nmedia: " + media
						+ "\nStatus: APROVADO", "Boletim Escolar", JOptionPane.INFORMATION_MESSAGE);

			}
		}
	

		// Fim da Linha de comando
		// By Higor Ribeiro
	}
	void limpar() {
		txtNome.setText(null);
		txtDiciplina.setText(null);
		txtNotaUm.setText(null);
		txtNotaDois.setText(null);
		txtNotaTres.setText(null);
		txtNotaQuatro.setText(null);
		// HABILITAR BOTÃO
		btnSalvar.setEnabled(true);
	}
}
