import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Map {

	private static JFrame frame;
	static String infoText;
	static String playerInput;

	/**
	 * Launch the application.
	 */
	public static void map() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map window = new Map();
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
	public Map() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(0, 0, 1001, 850);
		
		/*
		 * Creates the Buttons takes as parameter the number of warriors takes the color
		 * of the Empires
		 */

		JButton SpartaButton = new JButton(String.valueOf(GameApp.r2.getRegionSoldiers()));
		SpartaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sparta \n Soldiers: "+ GameApp.r2.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		SpartaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SpartaButton.setBackground(new Color(51, 204, 255));
		SpartaButton.setBounds(509, 148, 46, 36);
		frame.getContentPane().add(SpartaButton);

		JButton BabylonButton = new JButton(String.valueOf(GameApp.r20.getRegionSoldiers()));
		BabylonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Babylon \n Soldiers: "+ GameApp.r20.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		BabylonButton.setFont(new Font("Arial", Font.PLAIN, 12));
		BabylonButton.setBackground(new Color(255, 0, 0));
		BabylonButton.setBounds(576, 326, 46, 36);
		frame.getContentPane().add(BabylonButton);

		JButton RomeButton = new JButton(String.valueOf(GameApp.r6.getRegionSoldiers()));
		RomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Rome \n Soldiers: "+ GameApp.r6.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		RomeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RomeButton.setBackground(new Color(255, 255, 0));
		RomeButton.setBounds(537, 471, 46, 36);
		frame.getContentPane().add(RomeButton);

		JButton RavennaButton = new JButton(String.valueOf(GameApp.r7.getRegionSoldiers()));
		RavennaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The origins of Ravenna are uncertain. However, the oldest archaeological evidence found allows us to date the presence of Ravenna at least to the 5th century BC, where they remained undisturbed until the 3rd century BC, when the first contacts with Roman civilization began to take place. Later in history, Ravenna became the capital of the West Roman Empire after the transference of Rome to the East. Ravenna had been the host of the exiled poet named Dante, who is widely considered one of the most important poets of the Middle Ages. ";
				RegionInfo.InfoDialog();
			}
		});
		RavennaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RavennaButton.setBackground(new Color(255, 255, 0));
		RavennaButton.setBounds(146, 237, 46, 36);
		frame.getContentPane().add(RavennaButton);

		JButton AlexandriaButton = new JButton(String.valueOf(GameApp.r13.getRegionSoldiers()));
		AlexandriaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Alexandria \n Soldiers: "+ GameApp.r13.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AlexandriaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AlexandriaButton.setBackground(Color.GREEN);
		AlexandriaButton.setBounds(168, 494, 46, 36);
		frame.getContentPane().add(AlexandriaButton);

		JButton ThinisButton = new JButton(String.valueOf(GameApp.r11.getRegionSoldiers()));
		ThinisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Thinis \n Soldiers: "+ GameApp.r11.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		ThinisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ThinisButton.setBackground(Color.GREEN);
		ThinisButton.setBounds(555, 207, 46, 36);
		frame.getContentPane().add(ThinisButton);

		JButton CorinthButton = new JButton(String.valueOf(GameApp.r3.getRegionSoldiers()));
		CorinthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Corinth \n Soldiers: "+ GameApp.r3.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		CorinthButton.setFont(new Font("Arial", Font.PLAIN, 12));
		CorinthButton.setBackground(new Color(51, 204, 255));
		CorinthButton.setBounds(699, 339, 46, 36);
		frame.getContentPane().add(CorinthButton);

		JButton SusaButton = new JButton(String.valueOf(GameApp.r17.getRegionSoldiers()));
		SusaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Susa \n Soldiers: "+ GameApp.r17.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		SusaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SusaButton.setBackground(new Color(255, 0, 0));
		SusaButton.setBounds(101, 339, 46, 36);
		frame.getContentPane().add(SusaButton);

		JButton TanisButton = new JButton(String.valueOf(GameApp.r12.getRegionSoldiers()));
		TanisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Tanis \n Soldiers: "+ GameApp.r12.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		TanisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		TanisButton.setBackground(Color.GREEN);
		TanisButton.setBounds(264, 676, 46, 36);
		frame.getContentPane().add(TanisButton);

		JButton AvarisButton = new JButton(String.valueOf(GameApp.r14.getRegionSoldiers()));
		AvarisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Avaris \n Soldiers: "+ GameApp.r14.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AvarisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AvarisButton.setBackground(Color.GREEN);
		AvarisButton.setBounds(264, 178, 46, 36);
		frame.getContentPane().add(AvarisButton);

		JButton SicilyButton = new JButton(String.valueOf(GameApp.r8.getRegionSoldiers()));
		SicilyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sicily \n Soldiers: "+ GameApp.r8.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		SicilyButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SicilyButton.setBackground(new Color(255, 255, 0));
		SicilyButton.setBounds(146, 605, 46, 36);
		frame.getContentPane().add(SicilyButton);

		JButton FlorenceButton = new JButton(String.valueOf(GameApp.r9.getRegionSoldiers()));
		FlorenceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Florence \n Soldiers: "+ GameApp.r9.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		FlorenceButton.setFont(new Font("Arial", Font.PLAIN, 12));
		FlorenceButton.setBackground(new Color(255, 255, 0));
		FlorenceButton.setBounds(409, 159, 46, 36);
		frame.getContentPane().add(FlorenceButton);

		JButton SardiniaButton = new JButton(String.valueOf(GameApp.r10.getRegionSoldiers()));
		SardiniaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sardinia \n Soldiers: "+ GameApp.r10.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		SardiniaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SardiniaButton.setBackground(new Color(255, 255, 0));
		SardiniaButton.setBounds(883, 471, 46, 36);
		frame.getContentPane().add(SardiniaButton);

		JButton CreteButton = new JButton(String.valueOf(GameApp.r4.getRegionSoldiers()));
		CreteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Crete \n Soldiers: "+ GameApp.r4.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		CreteButton.setFont(new Font("Arial", Font.PLAIN, 12));
		CreteButton.setBackground(new Color(51, 204, 255));
		CreteButton.setBounds(893, 557, 46, 36);
		frame.getContentPane().add(CreteButton);

		JButton AthensButton = new JButton(String.valueOf(GameApp.r1.getRegionSoldiers()));
		AthensButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Athens \n Soldiers: "+ GameApp.r1.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AthensButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AthensButton.setBackground(new Color(51, 204, 255));
		AthensButton.setBounds(146, 709, 46, 36);
		frame.getContentPane().add(AthensButton);

		JButton PersepolisButton = new JButton(String.valueOf(GameApp.r19.getRegionSoldiers()));
		PersepolisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Persepolis \n Soldiers: "+ GameApp.r19.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		PersepolisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		PersepolisButton.setBackground(new Color(255, 0, 0));
		PersepolisButton.setBounds(392, 557, 46, 36);
		frame.getContentPane().add(PersepolisButton);

		JButton NinevehButton = new JButton(String.valueOf(GameApp.r16.getRegionSoldiers()));
		NinevehButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Nineveh \n Soldiers: "+ GameApp.r16.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		NinevehButton.setFont(new Font("Arial", Font.PLAIN, 12));
		NinevehButton.setBackground(new Color(255, 0, 0));
		NinevehButton.setBounds(814, 450, 46, 36);
		frame.getContentPane().add(NinevehButton);

		JButton MemphisButton = new JButton(String.valueOf(GameApp.r15.getRegionSoldiers()));
		MemphisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Memphis \n Soldiers: "+ GameApp.r15.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		MemphisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MemphisButton.setBackground(Color.GREEN);
		MemphisButton.setBounds(699, 435, 46, 36);
		frame.getContentPane().add(MemphisButton);

		JButton AshulButton = new JButton(String.valueOf(GameApp.r18.getRegionSoldiers()));
		AshulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Ashur \n Soldiers: "+ GameApp.r18.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AshulButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AshulButton.setBackground(new Color(255, 0, 0));
		AshulButton.setBounds(654, 494, 46, 36);
		frame.getContentPane().add(AshulButton);

		JButton MacedoniaButton = new JButton(String.valueOf(GameApp.r5.getRegionSoldiers()));
		MacedoniaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Makedonia \n Soldiers: "+ GameApp.r5.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		MacedoniaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MacedoniaButton.setBackground(new Color(51, 204, 255));
		MacedoniaButton.setBounds(347, 339, 46, 36);
		frame.getContentPane().add(MacedoniaButton);

		/*
		 * The Map as a png file
		 */

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, 6, 1124, 841); 
		frame.getContentPane().add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("GameMap.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton PersiaButton = new JButton(GameApp.p4.getPlayerName());
		PersiaButton.setBackground(GameApp.red);
		PersiaButton.setFont(new Font("Georgia", Font.PLAIN, 16));
		PersiaButton.setBounds(665, 754, 182, 31);
		frame.getContentPane().add(PersiaButton);
		
		JButton btnEmpireOfRome = new JButton(GameApp.p3.getPlayerName());
		btnEmpireOfRome.addActionListener(new ActionListener() {
			// Event when you click player Buttom
			public void actionPerformed(ActionEvent arg0) {
				Map.infoText= "Emperor of Rome owns the following states";
				RegionInfo.InfoDialog();
			}
		});
		btnEmpireOfRome.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfRome.setBackground(GameApp.yellow);
		btnEmpireOfRome.setBounds(665, 708, 181, 36);
		frame.getContentPane().add(btnEmpireOfRome);
		
		JButton btnEmpireOfEgypt = new JButton(GameApp.p2.getPlayerName());
		btnEmpireOfEgypt.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfEgypt.setBackground(GameApp.green);
		btnEmpireOfEgypt.setBounds(665, 660, 181, 36);
		frame.getContentPane().add(btnEmpireOfEgypt);
		
		JButton btnEmpireOfMacedonia = new JButton(GameApp.p1.getPlayerName());
		btnEmpireOfMacedonia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Map.infoText= "Emperor of Macedonia owns the following states";
				RegionInfo.InfoDialog();
			}
		});
		btnEmpireOfMacedonia.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfMacedonia.setBackground(GameApp.blue);
		btnEmpireOfMacedonia.setBounds(665, 617, 182, 36);
		frame.getContentPane().add(btnEmpireOfMacedonia);
		
		JLabel rounds = new JLabel(String.valueOf("ROUND: "+Function.i));
		rounds.setFont(new Font("Algerian", Font.PLAIN, 28));
		rounds.setHorizontalAlignment(SwingConstants.CENTER);
		rounds.setBounds(726, 25, 203, 44);
		frame.getContentPane().add(rounds);
		

	}
	public static void refresh() {
		frame.dispose();
		Map.map();
	}
}
