package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class JuridicoWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtXxxxxxxx;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuridicoWindow frame = new JuridicoWindow();
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
	public JuridicoWindow() {
		setTitle("Cadastro de Funcionários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 561);
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
		lblNewLabel.setBounds(227, 11, 314, 60);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
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
		painelAllData.setBounds(21, 97, 688, 344);
		painelAllData.setToolTipText("");
		painelAllData.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(painelAllData);
		painelAllData.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Profissional", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 668, 127);
		painelAllData.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Número Carteira Profissional");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 22, 197, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Série Carteira Profissional");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(384, 22, 167, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Número PIS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 70, 147, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Número de Dependentes");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(384, 70, 167, 14);
		panel.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setText("*");
		textField.setBounds(95, 69, 279, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("*");
		textField_1.setBounds(556, 69, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("*");
		textField_2.setBounds(556, 21, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("*");
		textField_3.setBounds(195, 21, 179, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Contrato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 149, 668, 170);
		painelAllData.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Cargo *");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 109, 58, 20);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Departamento *");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(20, 69, 118, 14);
		panel_1.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Engenheiro", "Mecânico", "Analista", "Administrativo", "Gerência", "Limpeza", "Operador", "Desenvolvedor", "Eletrecista", "Supervisor"}));
		comboBox.setBounds(88, 110, 98, 22);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "RH", "P&D", "Manutenção", "Qualidade", "Logistica"}));
		comboBox_1.setBounds(148, 67, 85, 22);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_7 = new JLabel("Data de admissão *");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(20, 28, 140, 14);
		panel_1.add(lblNewLabel_7);
		
		txtXxxxxxxx = new JTextField();
		txtXxxxxxxx.setText("    XX/XX/XXXX");
		txtXxxxxxxx.setBounds(158, 27, 86, 20);
		panel_1.add(txtXxxxxxxx);
		txtXxxxxxxx.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Ramal");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(259, 28, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(315, 27, 79, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Regime de trabalho", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(253, 53, 218, 106);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mensalista");
		rdbtnNewRadioButton.setBounds(58, 21, 81, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Semanal");
		rdbtnNewRadioButton_1.setBounds(58, 40, 81, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Horista");
		rdbtnNewRadioButton_2.setBounds(58, 59, 109, 23);
		panel_2.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setBounds(192, 11, 16, 14);
		panel_2.add(lblNewLabel_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Situa\u00E7\u00E3o empregado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(482, 11, 176, 148);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("*");
		lblNewLabel_11.setBounds(158, 11, 46, 14);
		panel_3.add(lblNewLabel_11);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Ativo");
		rdbtnNewRadioButton_3.setBounds(6, 25, 109, 23);
		panel_3.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Licença maternidade");
		rdbtnNewRadioButton_4.setBounds(6, 51, 149, 23);
		panel_3.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Atestado Médico");
		rdbtnNewRadioButton_5.setBounds(6, 78, 109, 23);
		panel_3.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Férias");
		rdbtnNewRadioButton_6.setBounds(6, 104, 109, 23);
		panel_3.add(rdbtnNewRadioButton_6);
		
		JLabel lblNewLabel_9 = new JLabel("*");
		lblNewLabel_9.setBounds(302, 30, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(476, 452, 89, 23);
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnSalvar);
		
		JButton btnNextPage = new JButton("Próx. página");
		btnNextPage.setBounds(575, 452, 134, 23);
		btnNextPage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNextPage);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(333, 452, 133, 23);
		btnLimparCampos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnLimparCampos);
	}
}
