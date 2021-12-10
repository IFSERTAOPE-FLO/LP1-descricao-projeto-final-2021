package bsf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class DevolveRoupa {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DevolveRoupa window = new DevolveRoupa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DevolveRoupa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pesquisa nome da roupa");
		lblNewLabel.setBounds(153, 27, 123, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Roupa");
		chckbxNewCheckBox.setBounds(153, 79, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Cobertor");
		chckbxNewCheckBox_1.setBounds(153, 105, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Casaco");
		chckbxNewCheckBox_2.setBounds(153, 131, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Motivo");
		lblNewLabel_1.setBounds(153, 161, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(153, 174, 109, 45);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Devolver");
		btnNewButton.setBounds(161, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(153, 52, 109, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
