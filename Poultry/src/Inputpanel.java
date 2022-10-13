import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inputpanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public static project fn;
	
	
	/**
	 * Create the panel.
	 */
	public Inputpanel() {
		setLayout(null);
		fn=new project();
		
		
		JLabel lblNewLabel_5 = new JLabel("Enter the correct data and get FCR and Credit amount");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(124, 37, 506, 24);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Enter Total Number of chicks");
		lblNewLabel.setBounds(150, 103, 199, 13);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(372, 100, 152, 19);
		add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Total Number of Feed Bags");
		lblNewLabel_1.setBounds(150, 154, 206, 13);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(372, 151, 152, 19);
		add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Birds catched");
		lblNewLabel_2.setBounds(150, 212, 152, 13);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(372, 209, 152, 19);
		add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total Weigth of the Birds");
		lblNewLabel_3.setBounds(150, 265, 159, 13);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(372, 262, 152, 19);
		add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number Of Mortality");
		lblNewLabel_4.setBounds(150, 318, 152, 13);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(372, 315, 152, 19);
		add(textField_4);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().length() ==0 || textField_1.getText().length() ==0 || textField_2.getText().length() ==0 || textField_3.getText().length() ==0 ||textField_4.getText().length() ==0) {
					System.out.println("some are empty");
				}
				else {
					if(Inputpanel.checkInput(textField.getText()) && Inputpanel.checkInput(textField_1.getText()) && Inputpanel.checkInput(textField_2.getText())  && Inputpanel.checkInput(textField_3.getText()) && Inputpanel.checkInput(textField_4.getText())) {
						
						
						fn.input(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText());
						
						Mainclass.oup.getDetails();
						Mainclass.panel.removeAll();
						Mainclass.panel.add(Mainclass.oup);
						Mainclass.panel.updateUI();
						
					}
					else {
						System.out.println("Enter only numbers");
					}
				}
			}
		});
		btnNewButton.setBounds(277, 392, 152, 21);
		add(btnNewButton);

	}
	
	static boolean checkInput(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

}
