package bsf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class PesquisaDoador {

	private JFrame frmDoadorMaisPrximo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisaDoador window = new PesquisaDoador();
					window.frmDoadorMaisPrximo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PesquisaDoador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDoadorMaisPrximo = new JFrame();
		frmDoadorMaisPrximo.setTitle("DOADOR MAIS PR\u00D3XIMO");
		frmDoadorMaisPrximo.setBounds(100, 100, 450, 300);
		frmDoadorMaisPrximo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDoadorMaisPrximo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cidade");
		lblNewLabel.setBounds(195, 59, 46, 14);
		frmDoadorMaisPrximo.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.setBounds(173, 238, 89, 23);
		frmDoadorMaisPrximo.getContentPane().add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(197, 132, 1, 1);
		frmDoadorMaisPrximo.getContentPane().add(list);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Permitir Localização");
		rdbtnNewRadioButton_3.setBounds(165, 34, 109, 23);
		frmDoadorMaisPrximo.getContentPane().add(rdbtnNewRadioButton_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(173, 76, 89, 22);
		frmDoadorMaisPrximo.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(173, 128, 89, 22);
		frmDoadorMaisPrximo.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("Bairro");
		lblNewLabel_1.setBounds(195, 109, 46, 14);
		frmDoadorMaisPrximo.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Roupa");
		chckbxNewCheckBox.setBounds(177, 182, 97, 23);
		frmDoadorMaisPrximo.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Casaco");
		chckbxNewCheckBox_1.setBounds(177, 208, 97, 23);
		frmDoadorMaisPrximo.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cobertor");
		chckbxNewCheckBox_2.setBounds(177, 156, 97, 23);
		frmDoadorMaisPrximo.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("PESQUISA DOADOR MAIS PRÓXIMO");
		lblNewLabel_2.setBounds(128, 11, 175, 14);
		frmDoadorMaisPrximo.getContentPane().add(lblNewLabel_2);
	}
}
