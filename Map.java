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
import javax.swing.SwingConstants;

public class Map {

	static JFrame frame;
	static String infoText;
	static String playerInput;

	/**
	 * Launch the application.
	 */
	public void map() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map.frame.setVisible(true);
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
				infoText="Memphis was the ancient capital of Lower Egypt, which was known as Inebu-hedj (White Walls), one of the 42 names of ancient Egypt. In the Bible Memphis is mentioned as Noph or Moph. There are now 6 cities in its periphery and its ruins are located near the west bank of the river Nile.";
				RegionInfo.InfoDialog();
			}
		});
		SpartaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SpartaButton.setBackground(new Color(51, 204, 255));
		SpartaButton.setBounds(437, 134, 46, 36);
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
		BabylonButton.setBounds(497, 282, 46, 36);
		frame.getContentPane().add(BabylonButton);

		JButton RomeButton = new JButton("4");
		RomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Rome \n Soldiers: "+ GameApp.r6.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		RomeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RomeButton.setBackground(new Color(255, 255, 0));
		RomeButton.setBounds(466, 415, 46, 36);
		frame.getContentPane().add(RomeButton);

		JButton RavennaButton = new JButton("4");
		RavennaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The origins of Ravenna are uncertain. However, the oldest archaeological evidence found allows us to date the presence of Ravenna at least to the 5th century BC, where they remained undisturbed until the 3rd century BC, when the first contacts with Roman civilization began to take place. Later in history, Ravenna became the capital of the West Roman Empire after the transference of Rome to the East. Ravenna had been the host of the exiled poet named Dante, who is widely considered one of the most important poets of the Middle Ages. ";
				RegionInfo.InfoDialog();
			}
		});
		RavennaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RavennaButton.setBackground(new Color(255, 255, 0));
		RavennaButton.setBounds(115, 207, 46, 36);
		frame.getContentPane().add(RavennaButton);

		JButton AlexandriaButton = new JButton("5");
		AlexandriaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Alexandria \n Soldiers: "+ GameApp.r13.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AlexandriaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AlexandriaButton.setBackground(Color.GREEN);
		AlexandriaButton.setBounds(134, 450, 54, 36);
		frame.getContentPane().add(AlexandriaButton);

		JButton ThinisButton = new JButton("2");
		ThinisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Thinis \n Soldiers: "+ GameApp.r11.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		ThinisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ThinisButton.setBackground(Color.GREEN);
		ThinisButton.setBounds(497, 183, 46, 36);
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
		CorinthButton.setBounds(607, 302, 46, 36);
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
		SusaButton.setBounds(78, 313, 46, 36);
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
		TanisButton.setBounds(225, 619, 46, 36);
		frame.getContentPane().add(TanisButton);

		JButton AvarisButton = new JButton(String.valueOf(GameApp.r14.getRegionSoldiers()));
		AvarisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="In the ancient Egyptian city of Egypt, Avaris, elements of Minoan civilization have been found, such as wall paintings similar to those found in the palace of Knossos.";
				RegionInfo.InfoDialog();
			}
		});
		AvarisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AvarisButton.setBackground(Color.GREEN);
		AvarisButton.setBounds(225, 159, 46, 36);
		frame.getContentPane().add(AvarisButton);

		JButton SicilyButton = new JButton("6");
		SicilyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sicily \n Soldiers: "+ GameApp.r8.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		SicilyButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SicilyButton.setBackground(GameApp.blue);
		SicilyButton.setBounds(115, 557, 46, 36);
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
		FlorenceButton.setBounds(357, 148, 46, 36);
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
		SardiniaButton.setBounds(773, 425, 46, 36);
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
		CreteButton.setBounds(773, 509, 46, 36);
		frame.getContentPane().add(CreteButton);

		JButton AthensButton = new JButton("2");
		AthensButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Athens \n Soldiers: "+ GameApp.r1.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AthensButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AthensButton.setBackground(new Color(51, 204, 255));
		AthensButton.setBounds(115, 642, 46, 36);
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
		PersepolisButton.setBounds(347, 509, 46, 36);
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
		NinevehButton.setBounds(695, 397, 46, 36);
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
		MemphisButton.setBounds(607, 397, 46, 36);
		frame.getContentPane().add(MemphisButton);

		JButton AshulButton = new JButton("1");
		AshulButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Ashur \n Soldiers: "+ GameApp.r18.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		AshulButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AshulButton.setBackground(new Color(255, 0, 0));
		AshulButton.setBounds(565, 450, 46, 36);
		frame.getContentPane().add(AshulButton);

		JButton MacedoniaButton = new JButton("9");
		MacedoniaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Makedonia \n Soldiers: "+ GameApp.r5.getRegionSoldiers()+".";
				RegionInfo.InfoDialog();
			}
		});
		MacedoniaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MacedoniaButton.setBackground(GameApp.green);
		MacedoniaButton.setBounds(299, 302, 46, 36);
		frame.getContentPane().add(MacedoniaButton);

		/*
		 * The Map as a png file
		 */

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -36, 1124, 843); 
		frame.getContentPane().add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("GameMap.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton PersiaButton = new JButton(GameApp.p4.getPlayerName());
		PersiaButton.setBackground(GameApp.red);
		PersiaButton.setFont(new Font("Georgia", Font.PLAIN, 16));
		PersiaButton.setBounds(545, 702, 182, 31);
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
		btnEmpireOfRome.setBounds(545, 656, 181, 36);
		frame.getContentPane().add(btnEmpireOfRome);
		
		JButton btnEmpireOfEgypt = new JButton(GameApp.p2.getPlayerName());
		btnEmpireOfEgypt.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfEgypt.setBackground(GameApp.green);
		btnEmpireOfEgypt.setBounds(545, 608, 181, 36);
		frame.getContentPane().add(btnEmpireOfEgypt);
		
		JButton btnEmpireOfMacedonia = new JButton(GameApp.p1.getPlayerName());
		btnEmpireOfMacedonia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function.alliedStates.clear(); // Removes all elements
				for (int counter = 0; counter <= 19; counter++) {
					if (GameApp.p1.getPlayerColor().equals(GameApp.tabler[counter].getRegionColor())) {
						Function.alliedStates.add(GameApp.tabler[counter].getRegionName());
					}
				}
				Map.infoText= "Emperor of Macedonia owns the following " + GameApp.p1.getPlayerRegions() +" states:\n" +  Function.alliedStates;
				RegionInfo.InfoDialog();
			}
		});
		btnEmpireOfMacedonia.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfMacedonia.setBackground(GameApp.blue);
		btnEmpireOfMacedonia.setBounds(545, 565, 182, 36);
		frame.getContentPane().add(btnEmpireOfMacedonia);
		
		JLabel rounds = new JLabel("ROUND: 2");
		rounds.setFont(new Font("Algerian", Font.PLAIN, 28));
		rounds.setHorizontalAlignment(SwingConstants.CENTER);
		rounds.setBounds(726, 25, 203, 44);
		frame.getContentPane().add(rounds);
		

	}
}
