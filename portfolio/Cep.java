package portfolio;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Color;

public class Cep extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JComboBox<?> cboUf;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cep dialog = new Cep();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cep() {
		setTitle("CEP");
		setBounds(100, 100, 500, 319);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(10, 37, 46, 14);
		contentPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setBounds(10, 81, 46, 14);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(10, 123, 46, 14);
		contentPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(10, 173, 46, 14);
		contentPanel.add(lblNewLabel_3);

		txtCep = new JTextField();
		txtCep.setBounds(89, 34, 86, 20);
		contentPanel.add(txtCep);
		txtCep.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setEditable(false);
		txtEndereco.setBounds(89, 78, 385, 20);
		contentPanel.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setEditable(false);
		txtBairro.setColumns(10);
		txtBairro.setBounds(89, 120, 385, 20);
		contentPanel.add(txtBairro);

		txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setColumns(10);
		txtCidade.setBounds(89, 170, 198, 20);
		contentPanel.add(txtCidade);

		JLabel lblNewLabel_1_1 = new JLabel("UF");
		lblNewLabel_1_1.setBounds(332, 173, 46, 14);
		contentPanel.add(lblNewLabel_1_1);

		cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(
				new String[] { "", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA",
						"PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
		cboUf.setBounds(413, 169, 61, 22);
		contentPanel.add(cboUf);

		JButton btnLimpar = new JButton("");
		btnLimpar.setDefaultCapable(false);
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorderPainted(false);
		btnLimpar.setIcon(new ImageIcon(Cep.class.getResource("/img/Borracha.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpar.setBounds(223, 201, 64, 64);
		contentPanel.add(btnLimpar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Informe o CEP");
					txtCep.requestFocus();
				} else {
					buscarCep(); // CEP
				}
			}
		});
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.setBounds(252, 33, 89, 23);
		contentPanel.add(btnBuscar);

		JButton btnSobre = new JButton("");
		btnSobre.setBorderPainted(false);
		btnSobre.setDefaultCapable(false);
		btnSobre.setContentAreaFilled(false);
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre2 sobre2 = new Sobre2();
				sobre2.setVisible(true);
			}
		});
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBounds(366, 19, 48, 48);
		contentPanel.add(btnSobre);
		RestrictedTextField validar = new RestrictedTextField(txtCep);

		lblStatus = new JLabel("");
		lblStatus.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblStatus.setBounds(196, 37, 20, 20);
		contentPanel.add(lblStatus);
		validar.setOnlyNums(true);
		validar.setLimit(8);

	}// FIM DO CONSTRUTOR

	private void buscarCep() {
		String logradouro = "";
		String tipoLogradouro = "";
		String resultado = null;
		String cep = txtCep.getText();
		try {
			URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&&formato=xml");
			SAXReader xml = new SAXReader();
			Document documento = xml.read(url);
			Element root = documento.getRootElement();
			for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
				Element element = it.next();
				if (element.getQualifiedName().equals("cidade")) {
					txtCidade.setText(element.getText());
				}
				if (element.getQualifiedName().equals("bairro")) {
					txtBairro.setText(element.getText());
				}
				if (element.getQualifiedName().equals("uf")) {
					cboUf.setSelectedItem(element.getText());
				}
				if (element.getQualifiedName().equals("tipo_Logradouro")) {
					tipoLogradouro = element.getText();
				}
				if (element.getQualifiedName().equals("logradouro")) {
					logradouro = element.getText();
				}
				if (element.getQualifiedName().equals("resultado")) {
					resultado = element.getText();
					if (resultado.equals("1")) {
						lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check2.png")));
					} else {
						JOptionPane.showMessageDialog(null, "CEP Não Encontrado");
					}
				}
			}

			// setar endereco
			txtEndereco.setText(tipoLogradouro + " " + logradouro);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void limpar() {
		txtCep.setText(null);
		txtEndereco.setText(null);
		txtBairro.setText(null);
		txtCidade.setText(null);
		cboUf.setSelectedItem(null);
		txtCep.requestFocus();
		lblStatus.setIcon(null);
		
	}
}// FIM DO CODIGO
