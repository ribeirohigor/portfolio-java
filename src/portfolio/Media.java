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
	private JButton btnNewButton_1;

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

		btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton_1.setBounds(181, 227, 89, 23);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(194, 227, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

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
}
