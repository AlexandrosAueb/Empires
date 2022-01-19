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
	public static void map() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Map map = new Map();
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
		frame.setBounds(600, 0, 1001, 850);
		
		/*
		 * Creates the Buttons takes as parameter the number of warriors takes the color
		 * of the Empires
		 */

		JButton SpartaButton = new JButton(String.valueOf(GameApp.r2.getRegionSoldiers()));
		SpartaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sparta is known to be the second most powerful city-state of ancient Greece. Undoubtedly, the protagonist of the Peloponnesian War and the homeland of the beautiful Helen of Troy. ";
				RegionInfo.InfoDialog();
			}
		});
		SpartaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SpartaButton.setBackground(GameApp.r2.getRegionColor());
		SpartaButton.setBounds(437, 134, 54, 36);
		frame.getContentPane().add(SpartaButton);

		JButton BabylonButton = new JButton(String.valueOf(GameApp.r20.getRegionSoldiers()));
		BabylonButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="It is known that the Babylonian kings built imposing palaces, which were decorated with representations of animals, mainly lions, the symbol of Babylonian power.";
				RegionInfo.InfoDialog();
			}
		});
		
		BabylonButton.setFont(new Font("Arial", Font.PLAIN, 12));
		BabylonButton.setBackground(GameApp.r20.getRegionColor());
		BabylonButton.setBounds(497, 282, 54, 36);
		frame.getContentPane().add(BabylonButton);

		JButton RomeButton = new JButton(String.valueOf(GameApp.r6.getRegionSoldiers()));
		RomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The famous capital Rome (SPQR) of the Roman Empire was founded around 753 BC by two twin brothers, Romulus and Remus. Like brothers, they had an argument about who would be the ruler of the city, and Remus was killed. Romulus became ruler and named the city after himself: Rome. Ancient Romans, who worshipped a lot of different gods and goddesses, are known for their military, political, and social institutions. They conquered vast amounts of land in Europe and northern Africa, built roads and aqueducts, and spread Latin, their language, all over the world.";
				RegionInfo.InfoDialog();
			}
		});
		
		RomeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RomeButton.setBackground(GameApp.r6.getRegionColor());
		RomeButton.setBounds(466, 415, 54, 36);
		frame.getContentPane().add(RomeButton);

		JButton RavennaButton = new JButton(String.valueOf(GameApp.r7.getRegionSoldiers()));
		RavennaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The origins of Ravenna are uncertain. However, the oldest archaeological evidence found allows us to date the presence of Ravenna at least to the 5th century BC, where they remained undisturbed until the 3rd century BC, when the first contacts with Roman civilization began to take place. Later in history, Ravenna became the capital of the West Roman Empire after the transference of Rome to the East. Ravenna had been the host of the exiled poet named Dante, who is widely considered one of the most important poets of the Middle Ages. ";
				RegionInfo.InfoDialog();
			}
		});
		
		RavennaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		RavennaButton.setBackground(GameApp.r7.getRegionColor());
		RavennaButton.setBounds(115, 207, 54, 36);
		frame.getContentPane().add(RavennaButton);

		JButton AlexandriaButton = new JButton(String.valueOf(GameApp.r13.getRegionSoldiers()));
		AlexandriaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Alexandria was one of the biggest ancient cities, the birthplace of culture. Founded around 331 BC by Alexander the Great, Alexandria was famous for its library and lighthouse, one of the seven wonders of the world.";
				RegionInfo.InfoDialog();
			}
		});
		
		AlexandriaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AlexandriaButton.setBackground(GameApp.r13.getRegionColor());
		AlexandriaButton.setBounds(134, 450, 54, 36);
		frame.getContentPane().add(AlexandriaButton);

		JButton ThinisButton = new JButton(String.valueOf(GameApp.r11.getRegionSoldiers()));
		ThinisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="What’s interesting about Thinis is that it remains undiscovered, although it is well attested by ancient writers. Even if the precise location of Thinis is unknown, the Egyptological consensus places it in the vicinity of ancient Abydos and modern Girga. Also, in ancient Egyptian religious cosmology, as seen, for instance, in the Book of the Dead, Thinis had been a mythical place in heaven. ";
				RegionInfo.InfoDialog();
			}
		});
		ThinisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ThinisButton.setBackground(GameApp.r11.getRegionColor());
		ThinisButton.setBounds(497, 183, 54, 36);
		frame.getContentPane().add(ThinisButton);

		JButton CorinthButton = new JButton(String.valueOf(GameApp.r3.getRegionSoldiers()));
		CorinthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Corinth was a rich and influential city. It organized the “Isthmia”, ancient games that took place in the 6th and 7th century BC. In 52 AD, the apostle Paul founded in Corinth the first Christian church.";
				RegionInfo.InfoDialog();
			}
		});
		CorinthButton.setFont(new Font("Arial", Font.PLAIN, 12));
		CorinthButton.setBackground(GameApp.r3.getRegionColor());
		CorinthButton.setBounds(607, 302, 54, 36);
		frame.getContentPane().add(CorinthButton);

		JButton SusaButton = new JButton(String.valueOf(GameApp.r17.getRegionSoldiers()));
		SusaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Susa was located in the present-day Iran region. The mausoleum of Susa, where the relics of the old testament prophet Daniel are said to be located, is a pole of attraction for visitors. The ancient city Susa was destroyed three times in its history: initially in 647 BC from Ashurbanipal, then in 638 AD, when the Muslim army first conquered the Persian Empire, and finally in 1218 AD, when it was completely destroyed by a Mongol invasion.";
				RegionInfo.InfoDialog();
			}
		});
		SusaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SusaButton.setBackground(GameApp.r17.getRegionColor());
		SusaButton.setBounds(78, 313, 60, 36);
		frame.getContentPane().add(SusaButton);

		JButton TanisButton = new JButton(String.valueOf(GameApp.r12.getRegionSoldiers()));
		TanisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="This ancient city of Egypt is known from the Bible. In the psalms it’s written that the story of Moses being found in the marshes of the Nile River is set at Tanis. Moses performed miracles in front of Pharaoh in order to persuade him liberate the Jews. An additional fun fact about Tanis is that in the 1981 Indiana Jones film, it is fictitiously portrayed as a lost city which was buried in antiquity by a massive sandstorm, before being rediscovered by a Nazi expedition.";
				RegionInfo.InfoDialog();
			}
		});
		TanisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		TanisButton.setBackground(GameApp.r12.getRegionColor());
		TanisButton.setBounds(225, 619, 60, 36);
		frame.getContentPane().add(TanisButton);

		JButton AvarisButton = new JButton(String.valueOf(GameApp.r14.getRegionSoldiers()));
		AvarisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="In the ancient Egyptian city of Egypt, Avaris, elements of Minoan civilization have been found, such as wall paintings similar to those found in the palace of Knossos.";
				RegionInfo.InfoDialog();
			}
		});
		AvarisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AvarisButton.setBackground(GameApp.r14.getRegionColor());
		AvarisButton.setBounds(225, 159, 60, 36);
		frame.getContentPane().add(AvarisButton);

		JButton SicilyButton = new JButton(String.valueOf(GameApp.r8.getRegionSoldiers()));
		SicilyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Sicily was called “Magna Grecia” (The Great Greece), because it had been a colony of the ancient Greeks, who are said to have founded the ancient city during the Trojan War.";
				RegionInfo.InfoDialog();
			}
		});
		SicilyButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SicilyButton.setBackground(GameApp.r8.getRegionColor());
		SicilyButton.setBounds(115, 557, 54, 36);
		frame.getContentPane().add(SicilyButton);

		JButton FlorenceButton = new JButton(String.valueOf(GameApp.r9.getRegionSoldiers()));
		FlorenceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The history of Florence is widely interwoven with subsequent world history. Florence played a significant role in the Renaissance, as it was the birthplace of the artist Leonardo da Vinci in 1452, but also the main place of action of Michael Angelos, Botticelli, Dante and Machiavelli.";
				RegionInfo.InfoDialog();
			}
		});
		FlorenceButton.setFont(new Font("Arial", Font.PLAIN, 12));
		FlorenceButton.setBackground(GameApp.r9.getRegionColor());
		FlorenceButton.setBounds(357, 148, 54, 36);
		frame.getContentPane().add(FlorenceButton);

		JButton SardiniaButton = new JButton(String.valueOf(GameApp.r10.getRegionSoldiers()));
		SardiniaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Here the mythical hero Hercules erected two huge stones, the Pillars of Hercules, to secure the passage of the straits from the ships and founded Gadera, the farthest point he reached to kill Geryon and his oxen, so that he completed the Tenth Labour of Heracles.";
				RegionInfo.InfoDialog();
			}
		});
		SardiniaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		SardiniaButton.setBackground(GameApp.r10.getRegionColor());
		SardiniaButton.setBounds(773, 425, 54, 36);
		frame.getContentPane().add(SardiniaButton);

		JButton CreteButton = new JButton(String.valueOf(GameApp.r4.getRegionSoldiers()));
		CreteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="In Creta was born the well-known Minoan civilization. Specifically, the Minoan civilization was a Bronze Age Aegean civilization primarily on the island of Crete and other Aegean Islands. It represents the first advanced civilization in Europe, leaving behind several massive building complexes, sophisticated art and writing systems. ";
				RegionInfo.InfoDialog();
			}
		});
		CreteButton.setFont(new Font("Arial", Font.PLAIN, 12));
		CreteButton.setBackground(GameApp.r4.getRegionColor());
		CreteButton.setBounds(773, 509, 54, 36);
		frame.getContentPane().add(CreteButton);

		JButton AthensButton = new JButton(String.valueOf(GameApp.r1.getRegionSoldiers()));
		AthensButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Athens, as the birthplace of democracy, theater, rhetoric and philosophy, has undoubtedly been the most important city of ancient Greece. On the sacred rock of the Acropolis, the Parthenon reminds us of the era of the Golden Age of Pericles and the glorious ancient Greek civilization.";
				RegionInfo.InfoDialog();
			}
		});
		AthensButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AthensButton.setBackground(GameApp.r1.getRegionColor());
		AthensButton.setBounds(115, 642, 54, 36);
		frame.getContentPane().add(AthensButton);

		JButton PersepolisButton = new JButton(String.valueOf(GameApp.r19.getRegionSoldiers()));
		PersepolisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="In 331 BC, Alexander the Great invaded the Persian state and sent an army to Persepolis. Alexander captured the Persian Gates and then turned to the city. During the celebration, a fire broke out in the eastern palace of Xerxes and spread to the rest of the city, without it still being ascertained whether it was an accident or an act of revenge for the fire on the Acropolis of Athens during the Persian Wars.";
				RegionInfo.InfoDialog();
			}
		});
		PersepolisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		PersepolisButton.setBackground(GameApp.r19.getRegionColor());
		PersepolisButton.setBounds(347, 509, 56, 36);
		frame.getContentPane().add(PersepolisButton);

		JButton NinevehButton = new JButton(String.valueOf(GameApp.r16.getRegionSoldiers()));
		NinevehButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="In Nineveh, the capital of the Assyrian state, King Sardanapalus founded in the 7th century BC a large library, the first of its kind in the Middle East. The famous Epic of Gilgamesh was also found there. Epic of Gilgamesh is an epic poem from ancient Mesopotamia, regarded as the earliest surviving notable literature and the second oldest religious text, after the Pyramid Texts.";
				RegionInfo.InfoDialog();
			}
		});
		NinevehButton.setFont(new Font("Arial", Font.PLAIN, 12));
		NinevehButton.setBackground(GameApp.r16.getRegionColor());
		NinevehButton.setBounds(695, 397, 54, 36);
		frame.getContentPane().add(NinevehButton);

		JButton MemphisButton = new JButton(String.valueOf(GameApp.r15.getRegionSoldiers()));
		MemphisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="Memphis was the ancient capital of Lower Egypt, which was known as Inebu-hedj (White Walls), one of the 42 names of ancient Egypt. In the Bible Memphis is mentioned as Noph or Moph. There are now 6 cities in its periphery and its ruins are located near the west bank of the river Nile.";
				RegionInfo.InfoDialog();
			}
		});
		MemphisButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MemphisButton.setBackground(GameApp.r15.getRegionColor());
		MemphisButton.setBounds(607, 397, 54, 36);
		frame.getContentPane().add(MemphisButton);

		JButton AshurButton = new JButton(String.valueOf(GameApp.r18.getRegionSoldiers()));
		AshurButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The city Ashur of the Persian Empire was the first capital of the Assyrian Empire and the main colony of the Sumers, the earliest known civilization in the historical region of southern Mesopotamia. ";
				RegionInfo.InfoDialog();
			}
		});
		AshurButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AshurButton.setBackground(GameApp.r18.getRegionColor());
		AshurButton.setBounds(565, 450, 54, 36);
		frame.getContentPane().add(AshurButton);

		JButton MacedoniaButton = new JButton(String.valueOf(GameApp.r5.getRegionSoldiers()));
		MacedoniaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				infoText="The ancient city of Macedonia was the homeland of the Macedonian Kings, Philip II and his son, Alexander the Great. In the year 342 BC the King Philip II invited in the area of Naoussa the great philosopher Aristoteles to teach his 13 years old son, Alexander. Aristotle taught Alexander and his friends about medicine, philosophy, morals, religion, logic, and art. Therefore, Macedonia had been an important place of Aristotle's teachings, which have survived centuries later. ";
				RegionInfo.InfoDialog();
			}
		});
		MacedoniaButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MacedoniaButton.setBackground(GameApp.r5.getRegionColor());
		MacedoniaButton.setBounds(299, 302, 54, 36);
		frame.getContentPane().add(MacedoniaButton);

		/*
		 * The Map as a png file
		 */

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -36, 1124, 843); 
		frame.getContentPane().add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("GameMap.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JButton btnEmpireOfPersia = new JButton(GameApp.p4.getPlayerName());
		btnEmpireOfPersia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function.alliedStates.clear(); // Removes all elements
				for (int counter = 0; counter <= 19; counter++) {
					if (GameApp.p4.getPlayerColor().equals(GameApp.tabler[counter].getRegionColor())) {
						Function.alliedStates.add(GameApp.tabler[counter].getRegionName());
					}
				}
				Map.infoText= "Emperor of Persia owns the following " + GameApp.p4.getPlayerRegions() +" states:\n" +  Function.alliedStates;
				RegionInfo.InfoDialog();
			}
		});
		btnEmpireOfPersia.setBackground(GameApp.red);
		btnEmpireOfPersia.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfPersia.setBounds(545, 702, 182, 31);
		frame.getContentPane().add(btnEmpireOfPersia);
		
		JButton btnEmpireOfRome = new JButton(GameApp.p3.getPlayerName());
		btnEmpireOfRome.addActionListener(new ActionListener() {
			// Event when you click player Buttom
			public void actionPerformed(ActionEvent arg0) {
				Function.alliedStates.clear(); // Removes all elements
				for (int counter = 0; counter <= 19; counter++) {
					if (GameApp.p3.getPlayerColor().equals(GameApp.tabler[counter].getRegionColor())) {
						Function.alliedStates.add(GameApp.tabler[counter].getRegionName());
					}
				}
				Map.infoText= "Emperor of Rome owns the following " + GameApp.p3.getPlayerRegions() +" states:\n" +  Function.alliedStates;
				RegionInfo.InfoDialog();
			}
		});
		btnEmpireOfRome.setFont(new Font("Georgia", Font.PLAIN, 16));
		btnEmpireOfRome.setBackground(GameApp.yellow);
		btnEmpireOfRome.setBounds(545, 656, 181, 36);
		frame.getContentPane().add(btnEmpireOfRome);
		
		JButton btnEmpireOfEgypt = new JButton(GameApp.p2.getPlayerName());
		btnEmpireOfEgypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Function.alliedStates.clear(); // Removes all elements
				for (int counter = 0; counter <= 19; counter++) {
					if (GameApp.p2.getPlayerColor().equals(GameApp.tabler[counter].getRegionColor())) {
						Function.alliedStates.add(GameApp.tabler[counter].getRegionName());
					}
				}
				Map.infoText= "Emperor of Egypt owns the following " + GameApp.p2.getPlayerRegions() +" states:\n" +  Function.alliedStates;
				RegionInfo.InfoDialog();
			}
		});
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
		
		JLabel rounds = new JLabel("ROUND: " + Function.i);
		rounds.setFont(new Font("Algerian", Font.PLAIN, 28));
		rounds.setHorizontalAlignment(SwingConstants.CENTER);
		rounds.setBounds(726, 25, 203, 44);
		frame.getContentPane().add(rounds);
		

	}
	public static void refresh() {
		frame.dispose();
		map();
	}
}
