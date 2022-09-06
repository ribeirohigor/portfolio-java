package portfolio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Atxy2k.CustomTextField.RestrictedTextField;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Cursor;

public class IMC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JLabel lblImagem;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setTitle("Calculo IMC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(IMC.class.getResource("/img/peso32px.png")));
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 482, 466);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);

		txtPeso = new JTextField();
		txtPeso.setBounds(305, 106, 86, 20);
		getContentPane().add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(305, 202, 86, 20);
		getContentPane().add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setToolTipText("Calcular");
		btnNewButton.setIcon(new ImageIcon(IMC.class.getResource("/img/Verificar.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnNewButton.setBounds(255, 352, 64, 64);
		getContentPane().add(btnNewButton);

		lblImagem = new JLabel("");
		lblImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc.png")));
		lblImagem.setBounds(0, 0, 213, 425);
		getContentPane().add(lblImagem);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(IMC.class.getResource("/img/Borracha.png")));
		btnNewButton_1.setToolTipText("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnNewButton_1.setBounds(357, 352, 64, 64);
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("PESO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(321, 75, 46, 20);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("ALTURA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(305, 158, 86, 17);
		getContentPane().add(lblNewLabel_2);

		txtResultado = new JTextField();
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setEditable(false);
		txtResultado.setBounds(292, 290, 107, 20);
		getContentPane().add(txtResultado);
		txtResultado.setColumns(10);

		JLabel lblNewLabel = new JLabel("Seu IMC \u00E9:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(305, 265, 86, 14);
		getContentPane().add(lblNewLabel);
		
		// Uso da Biblioteca
		RestrictedTextField validar = new RestrictedTextField(txtPeso, "0123456789.");
		validar.setLimit(6);
		RestrictedTextField validar2 = new RestrictedTextField(txtAltura, "0123456789.");
		validar2.setLimit(4);

	}// Fim do Construtor

	void calcular() {
		// validação
		if (txtPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha Peso");
			txtPeso.requestFocus();
		} else if (txtAltura.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Preencha a altura");
			txtAltura.requestFocus();
		} else {

			// Variaveis
			double peso, altura, imc;

			// Entrada
			peso = Double.parseDouble(txtPeso.getText());
			altura = Double.parseDouble(txtAltura.getText());

			// Formatação
			DecimalFormat formatador = new DecimalFormat("#	0.00");
			// Processamento

			imc = peso / (altura * altura);
			// Saida
			txtResultado.setText(String.valueOf(formatador.format(imc)));

			if (imc < 17) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc1.png")));
			} else if (imc >= 17.0 && imc < 18.5) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc2.png")));
			} else if (imc >= 18.5 && imc < 25.0) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc3.png")));
			} else if (imc >= 25 && imc < 30.0) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc4.png")));
			} else if (imc >= 30 && imc < 35.0) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc5.png")));
			} else if (imc >= 35 && imc < 40.0) {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc6.png")));
			} else {
				lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc7.png")));
			}
		}
	}

	// Limpar Campos
	void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtResultado.setText(null);
		lblImagem.setIcon(new ImageIcon(IMC.class.getResource("/img/imc.png")));
		txtPeso.requestFocus();

	}

}
