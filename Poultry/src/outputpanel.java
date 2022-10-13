import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class outputpanel extends JPanel {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	public static project fn;

	/**
	 * Create the panel.
	 */
	public outputpanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Average Weight");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(91, 97, 182, 31);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		textField.setBounds(333, 97, 182, 31);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mortality Percentage ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(91, 156, 172, 29);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(333, 157, 182, 31);
		add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FCR");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(91, 224, 172, 29);
		add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(333, 225, 182, 31);
		add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Rupees Per kilogram");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(91, 285, 172, 29);
		add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(333, 286, 182, 31);
		add(textField_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Total Amount");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(91, 348, 172, 29);
		add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setBounds(333, 349, 182, 31);
		add(textField_4);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainclass.panel.removeAll();
				Mainclass.panel.add(Mainclass.inp);
				Mainclass.panel.updateUI();
			}
		});
		btnNewButton.setBounds(378, 406, 85, 21);
		add(btnNewButton);
	}
	
	void getDetails() {
		textField.setText(Inputpanel.fn.avgwt());
		textField_1.setText(Inputpanel.fn.mrtpercentage());
		textField_2.setText(Inputpanel.fn.FCR());
		textField_4.setText(Inputpanel.fn.totalamt());
		textField_3.setText(Inputpanel.fn.rpkgs());
	}
}
