package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

public class DadosPessoaisWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textRG;
	private JTextField txtIndica;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosPessoaisWindow frame = new DadosPessoaisWindow();
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
	public DadosPessoaisWindow() {
		setTitle("Cadastro de funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 565);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Área de Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(227, 11, 314, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnDadosPessoais = new JButton("Dados Pessoais");
		btnDadosPessoais.setBounds(167, 68, 123, 23);
		contentPane.add(btnDadosPessoais);
		
		JButton btnJuridico = new JButton("Jurídico");
		btnJuridico.setBounds(300, 68, 89, 23);
		contentPane.add(btnJuridico);
		
		JButton btnBancario = new JButton("Bancário");
		btnBancario.setBounds(402, 68, 89, 23);
		contentPane.add(btnBancario);
		
		JPanel painelAllData = new JPanel();
		painelAllData.setToolTipText("");
		painelAllData.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelAllData.setBounds(21, 97, 688, 344);
		contentPane.add(painelAllData);
		painelAllData.setLayout(null);
		
		JPanel Dados = new JPanel();
		Dados.setBorder(new TitledBorder(null, "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Dados.setToolTipText("");
		Dados.setBounds(10, 11, 668, 155);
		painelAllData.add(Dados);
		Dados.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(20, 25, 46, 14);
		Dados.add(lblNome);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento");
		lblDataNasc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDataNasc.setBounds(380, 25, 145, 14);
		Dados.add(lblDataNasc);
		
		textNome = new JTextField();
		textNome.setText("*");
		textNome.setBounds(65, 24, 305, 20);
		Dados.add(textNome);
		textNome.setColumns(10);
		
		JFormattedTextField textDataNasc = new JFormattedTextField();
		textDataNasc.setText("* XX/XX/XXXX ");
		textDataNasc.setToolTipText("");
		textDataNasc.setBounds(522, 24, 124, 20);
		Dados.add(textDataNasc);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCPF.setBounds(20, 50, 46, 14);
		Dados.add(lblCPF);
		
		JLabel lblNewLabel_1 = new JLabel("RG");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(380, 50, 46, 14);
		Dados.add(lblNewLabel_1);
		
		textCPF = new JTextField();
		textCPF.setText("* XXX.XXX.XXX-XX");
		textCPF.setBounds(65, 50, 305, 20);
		Dados.add(textCPF);
		textCPF.setColumns(10);
		
		textRG = new JTextField();
		textRG.setText("* XX.XXX.XXX-X");
		textRG.setBounds(413, 50, 233, 20);
		Dados.add(textRG);
		textRG.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(20, 75, 284, 69);
		Dados.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(6, 25, 77, 23);
		panel_2.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(85, 25, 77, 23);
		panel_2.add(rdbtnFeminino);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Não informar");
		rdbtnNewRadioButton.setBounds(164, 25, 109, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setBounds(268, 11, 16, 14);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 165, 668, 168);
		painelAllData.add(panel_1);
		panel_1.setLayout(null);
		
		txtIndica = new JTextField();
		txtIndica.setBorder(null);
		txtIndica.setCaretColor(new Color(0, 255, 0));
		txtIndica.setSelectedTextColor(new Color(192, 192, 192));
		txtIndica.setBounds(419, 137, 239, 20);
		panel_1.add(txtIndica);
		txtIndica.setText("* = indica campo obrigatório de preenchimento");
		txtIndica.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Rua");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 22, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bairro");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(408, 57, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Complemento");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(408, 90, 102, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cidade");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 57, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CEP");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 90, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setText("*");
		textField.setBounds(41, 21, 357, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Nº");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(408, 24, 17, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setText("*");
		textField_1.setBounds(434, 21, 46, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("*");
		textField_2.setBounds(61, 56, 337, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("*");
		textField_3.setBounds(41, 89, 357, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("*");
		textField_4.setBounds(454, 56, 190, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(504, 89, 140, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(476, 452, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnNextPage = new JButton("Próx. página");
		btnNextPage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNextPage.setBounds(575, 452, 134, 23);
		contentPane.add(btnNextPage);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimparCampos.setBounds(333, 452, 133, 23);
		contentPane.add(btnLimparCampos);
	}
}
