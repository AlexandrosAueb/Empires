import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class RegionInfo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7853539963977043000L;
	/**
	 * 
	 */
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void InfoDialog() {
		try {
			RegionInfo dialog = new RegionInfo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegionInfo() {
		setResizable(false);
		setBounds(600, 300, 849, 358);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel InfoIcon = new JLabel("");
		InfoIcon.setHorizontalAlignment(SwingConstants.CENTER);
		InfoIcon.setBounds(-30, 58, 186, 152);
		Image img = new ImageIcon(this.getClass().getResource("InfoIcon2.png")).getImage();
		InfoIcon.setIcon(new ImageIcon(img));
		contentPanel.add(InfoIcon);
		
		JTextArea txtrTheOriginsOf = new JTextArea(Map.infoText);
		txtrTheOriginsOf.setWrapStyleWord(true);
		txtrTheOriginsOf.setBackground(Color.WHITE);
		txtrTheOriginsOf.setLineWrap(true);
		txtrTheOriginsOf.setFont(new Font("Arial", Font.PLAIN, 20));
		txtrTheOriginsOf.setEditable(false);
		txtrTheOriginsOf.setBounds(111, 6, 726, 270);
		contentPanel.add(txtrTheOriginsOf);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton exitButton = new JButton("Exit");
				exitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				exitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
				exitButton.setActionCommand("Exit");
				buttonPane.add(exitButton);
			}
		}
	}
}
