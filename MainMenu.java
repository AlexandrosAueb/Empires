import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class MainMenu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setBounds(100, 100, 1280 , 921);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Last Empire");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 50));
		lblNewLabel.setBounds(418, 10, 463, 94);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(1007, 691, 216, 63);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(400, 528, 129, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(540, 528, 193, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Player 2:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(400, 585, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(540, 585, 193, 44);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Player 3:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(400, 643, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(540, 643, 193, 44);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Player 4:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(400, 700, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(540, 700, 193, 44);
		frame.getContentPane().add(textField_3);
		
		JTextPane txtpnWelcomeTo = new JTextPane();
		txtpnWelcomeTo.setEditable(false);
		txtpnWelcomeTo.setBackground(new Color(0, 0, 0,0));
		txtpnWelcomeTo.setFont(new Font("Harrington", Font.BOLD, 25));
		txtpnWelcomeTo.setText("Welcome to 322 B.C.\r\n\r\nThe king of Macedonia Alexander led the Greeks in a successful campaign to overthrow the Persian & Egypt Empires. After Alexander's death in 323, his successors divided his empire into several kingdoms. Greek culture became widespread in the territories of these kingdoms and, after their conquest by Rome, in many parts of the Roman Empire . Do you believe you are capable of leading your army and conquer the other Empires?\r\n~Good Luck, Have Fun~\r\n");
		txtpnWelcomeTo.setBounds(252, 126, 798, 325);
		frame.getContentPane().add(txtpnWelcomeTo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Alexander.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(399, 10, 129, 119);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		img=new ImageIcon(this.getClass().getResource("/BG.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(0, 0, 1266, 845);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
