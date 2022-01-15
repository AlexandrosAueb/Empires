import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class RegionInfo extends JDialog {

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
		setBounds(600, 300, 754, 257);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel InfoIcon = new JLabel("");
		InfoIcon.setHorizontalAlignment(SwingConstants.CENTER);
		InfoIcon.setBounds(0, 37, 86, 85);
		Image img = new ImageIcon(this.getClass().getResource("InfoIcon2.png")).getImage();
		InfoIcon.setIcon(new ImageIcon(img));
		contentPanel.add(InfoIcon);
		
		JTextArea txtrTheOriginsOf = new JTextArea();
		txtrTheOriginsOf.setLineWrap(true);
		txtrTheOriginsOf.setFont(new Font("Arial", Font.PLAIN, 16));
		txtrTheOriginsOf.setText("The origins of Ravenna are uncertain. \nHowever, the oldest archaeological evidence found allows us to date the presence of \nRavenna at least to the 5th century BC, where they remained undisturbed until the \n3rd century BC, when the first contacts with Roman civilization began to take place. \nLater in history, Ravenna became the capital of the West Roman Empire after the \ntransference of Rome to the East. Ravenna had been the host of the exiled poet \nnamed Dante, who is widely considered one of the most important poets of the Middle Ages. ");
		txtrTheOriginsOf.setEditable(false);
		txtrTheOriginsOf.setBounds(84, 11, 654, 163);
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
