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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class MainMenu {

	private JFrame frame;
	private JTextField player1;
	private JTextField player2;
	private JTextField player3;
	private JTextField player4;
	private static String text1,text2,text3,text4;
	private final Action action = new SwingAction();
	

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
		System.out.println("Player 1:"+text1);
		System.out.println("Player 2:"+text2);
		System.out.println("Player 3:"+text3);
		System.out.println("Player 4:"+text4);
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
		frame.setBounds(100, 100, 1286, 769);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Last Empire");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 50));
		lblNewLabel.setBounds(418, 10, 463, 94);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1=player1.getText();
				text2=player2.getText();
				text3=player3.getText();
				text4=player4.getText();
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(1007, 638, 216, 63);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(45, 421, 129, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		player1 = new JTextField();
		player1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		player1.setBounds(185, 421, 193, 44);
		frame.getContentPane().add(player1);
		player1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Player 2:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(45, 478, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		player2 = new JTextField();
		player2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		player2.setColumns(10);
		player2.setBounds(185, 478, 193, 44);
		frame.getContentPane().add(player2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Player 3:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(45, 536, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		player3 = new JTextField();
		player3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		player3.setColumns(10);
		player3.setBounds(185, 536, 193, 44);
		frame.getContentPane().add(player3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Player 4:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(45, 593, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		player4 = new JTextField();
		player4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		player4.setColumns(10);
		player4.setBounds(185, 593, 193, 44);
		frame.getContentPane().add(player4);
		
		JTextPane txtpnWelcomeTo = new JTextPane();
		txtpnWelcomeTo.setEditable(false);
		txtpnWelcomeTo.setBackground(new Color(222, 184, 135));
		txtpnWelcomeTo.setFont(new Font("Harrington", Font.PLAIN, 25));
		txtpnWelcomeTo.setText("Welcome to 322 B.C.\r\n\r\nThe king of Macedonia Alexander led the Greeks in a successful campaign to overthrow the Persian & Egypt Empires. After Alexander's death in 323, his successors divided his empire into several kingdoms. Greek culture became widespread in the territories of these kingdoms and, after their conquest by Rome, in many parts of the Roman Empire . Do you believe you are capable of leading your army and conquer the other Empires?\r\n~Good Luck, Have Fun~\r\n");
		txtpnWelcomeTo.setBounds(85, 126, 1101, 247);
		frame.getContentPane().add(txtpnWelcomeTo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Alexander.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(399, 10, 129, 119);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

	public static String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public static String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public static String getText3() {
		return text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

	public static String getText4() {
		return text4;
	}

	public void setText4(String text4) {
		this.text4 = text4;
	}
}
