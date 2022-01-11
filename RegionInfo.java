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
		setBounds(600, 300, 685, 173);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(Map.infoText);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 23));
			lblNewLabel.setBounds(116, 10, 545, 85);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel InfoIcon = new JLabel("");
		InfoIcon.setHorizontalAlignment(SwingConstants.CENTER);
		InfoIcon.setBounds(10, 10, 96, 85);
		Image img = new ImageIcon(this.getClass().getResource("InfoIcon2.png")).getImage();
		InfoIcon.setIcon(new ImageIcon(img));
		contentPanel.add(InfoIcon);
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
