import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class MainMenu {

	public static String playerName1="Player 1";
	public static String playerName2="Player 2";
	public static String playerName3="Player 3";
	public static String playerName4="Player 4";
	private JFrame frame;
	private JTextField Input1;
	private JTextField Input2;
	private JTextField Input3;
	private JTextField Input4;
	protected String[] args;

	/**
	 * Launch the application.
	 */
	public static void menu() {
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
	Thread thread1 = new Thread() {
		public void run() {
			Map.map(); 
		}
	};
	Thread thread2 = new Thread() {
		public void run() {
		Function.gameStart();
		}
	};

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//set up the window
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(222, 184, 135));
		frame.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(140, 0, 1270, 850);
		
		//Title
		JLabel lblNewLabel = new JLabel("The Divided Empires");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 50));
		lblNewLabel.setBounds(337, 22, 545, 94);
		frame.getContentPane().add(lblNewLabel);
		
		// Start Button
		JButton btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(888, 699, 216, 63);
		frame.getContentPane().add(btnNewButton);
		
		//Event when toy click Start Button
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GameApp.initializePlayers();
				frame.dispose();
				thread1.start();
				thread2.start();
			}
		});
		
		// Text Player1
		JLabel lblNewLabel_1 = new JLabel("Player 1:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(399, 472, 129, 44);
		frame.getContentPane().add(lblNewLabel_1);
		
		// Player 1 enters his name to that field
		Input1 = new JTextField();
		Input1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Input1.setBounds(539, 472, 193, 44);
		frame.getContentPane().add(Input1);
		Input1.setColumns(10);
		
		//Text Player2
		JLabel lblNewLabel_1_1 = new JLabel("Player 2:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(399, 529, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		// Player 2 enters his name to that field
		Input2 = new JTextField();
		Input2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Input2.setColumns(10);
		Input2.setBounds(539, 529, 193, 44);
		frame.getContentPane().add(Input2);
		
		// Text Player3
		JLabel lblNewLabel_1_2 = new JLabel("Player 3:");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(399, 587, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		// Player 3 enters his name to that field
		Input3 = new JTextField();
		Input3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Input3.setColumns(10);
		Input3.setBounds(539, 587, 193, 44);
		frame.getContentPane().add(Input3);
		
		// Text Player4
		JLabel lblNewLabel_1_3 = new JLabel("Player 4:");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(399, 644, 129, 44);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		// Player 4 enters his name to that field
		Input4 = new JTextField();
		Input4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		Input4.setColumns(10);
		Input4.setBounds(539, 644, 193, 44);
		frame.getContentPane().add(Input4);
		
		//The Story
		JTextPane Story = new JTextPane();
		Story.setEditable(false);
		Story.setBackground(new Color(0, 0, 0,0));
		Story.setFont(new Font("Harrington", Font.BOLD, 25));
		Story.setText("Welcome to 322 B.C.\r\n\r\nThe king of Macedonia Alexander The Great led the Greeks in a successful campaign to overthrow the Persian & Egypt Empires. After Alexander's death in 323 B.C., his successors divided his empire into several kingdoms. Greek culture became widespread in the territories of these kingdoms and, after their conquest by Rome, in many parts of the Roman Empire . Do you believe you are capable of leading your army and conquer the other Empires?\r\n~Good Luck, Have Fun~\r\n");
		Story.setBounds(252, 126, 798, 325);
		frame.getContentPane().add(Story);
		
		//Submit Button 
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_1.setBounds(486, 711, 187, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		//When user click to Submit, creates Objects with the input of text-fields
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Input1.getText().equals("")) {
					playerName1="Emperor of Macedonia"; // The Default name
				}else {
					playerName1=Input1.getText(); // The Input Name
				}
				if(Input2.getText().equals("")) {
					playerName2="Emperor of Egypt";
				}else {
					playerName2=Input2.getText();
				}
				if(Input3.getText().equals("")) {
					playerName3="Emperor of Rome";
				}else {
					playerName3=Input3.getText();
				}
				if(Input4.getText().equals("")) {
					playerName4="Emperor of Persia";
				}else {
					playerName4=Input4.getText();
				}
			}
		});
		Image img = new ImageIcon(this.getClass().getResource("/BG.jpg")).getImage();
		
		JButton btnNewButton_2 = new JButton("RULES (!)");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rules.rules();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_2.setBounds(978, 37, 129, 44);
		frame.getContentPane().add(btnNewButton_2);
		
		//BG image
		JLabel lblNewLabel_3 = new JLabel("BG");
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(0, 0, 1266, 884);
		frame.getContentPane().add(lblNewLabel_3);
		
	}
}
