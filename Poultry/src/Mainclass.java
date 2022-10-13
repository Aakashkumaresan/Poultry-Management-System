import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFormattedTextField;

public class Mainclass extends JFrame {

	private JPanel contentPane;
	public static Inputpanel inp;
	public static outputpanel oup;
	public static JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainclass frame = new Mainclass();
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
	public Mainclass() {
		inp=new Inputpanel();
		oup=new outputpanel();
		
		setResizable(false);
		setFont(new Font("Dialog", Font.BOLD, 30));
		setTitle("Poultry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 755, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel = new JPanel();
		panel.setBounds(0, 0, 741, 453);
		panel.setLayout(new GridLayout(1,1));
		contentPane.add(panel);
		panel.add(inp);
		panel.updateUI();
		contentPane.updateUI();
	}
}
