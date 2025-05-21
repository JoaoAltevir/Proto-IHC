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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;

public class BancarioWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BancarioWindow frame = new BancarioWindow();
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
	public BancarioWindow() {
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
		painelAllData.setBounds(53, 102, 596, 344);
		contentPane.add(painelAllData);
		painelAllData.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 11, 534, 150);
		panel.setBorder(new TitledBorder(null, "Banco", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelAllData.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Banco");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 22, 46, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"*", "Nubank", "Bradesco", "Picpay", "Banco do Brasil", "Itaú"}));
		comboBox.setBounds(66, 20, 64, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Agência");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 59, 78, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nº Conta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 97, 64, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Vale transporte", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(333, 24, 177, 113);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sim");
		rdbtnNewRadioButton.setBounds(19, 23, 109, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Não");
		rdbtnNewRadioButton_1.setBounds(19, 48, 109, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		textField.setText("*");
		textField.setBounds(78, 96, 245, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("*");
		textField_1.setBounds(66, 64, 257, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(36, 170, 534, 163);
		panel_1.setBorder(new TitledBorder(null, "Sa\u00FAde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelAllData.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Plano de sa\u00FAde", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(23, 22, 173, 99);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sim");
		rdbtnNewRadioButton_2.setBounds(6, 21, 109, 23);
		panel_3.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Não");
		rdbtnNewRadioButton_1_1.setBounds(6, 47, 109, 23);
		panel_3.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Planos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3_1.setBounds(228, 22, 262, 99);
		panel_1.add(panel_3_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Take Care - Plano Silver");
		rdbtnNewRadioButton_3.setBounds(6, 18, 167, 23);
		panel_3_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Unimed - Plano Gold");
		rdbtnNewRadioButton_4.setBounds(6, 45, 140, 23);
		panel_3_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Health Safe - Plano Platinum");
		rdbtnNewRadioButton_5.setBounds(6, 71, 167, 23);
		panel_3_1.add(rdbtnNewRadioButton_5);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(476, 452, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnNextPage = new JButton("Finalizar");
		btnNextPage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNextPage.setBounds(575, 452, 134, 23);
		contentPane.add(btnNextPage);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimparCampos.setBounds(333, 452, 133, 23);
		contentPane.add(btnLimparCampos);
	}

}
