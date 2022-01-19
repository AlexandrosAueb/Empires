import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rules extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void rules() {
		try {
			Rules dialog = new Rules();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rules() {
		setBounds(100, 100, 949, 537);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextArea txtrInTheBegging = new JTextArea();
		txtrInTheBegging.setLineWrap(true);
		txtrInTheBegging.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtrInTheBegging.setText("In the begging of each round, every player receives soldiers according to the number of his regions. You can place your given soldiers in any way you want.\r\nIn his round, each player can make one of the following moves :  Attack, Fortify , Skip\r\nAttack\r\nChoose from which region you want to attack. Then choose the region you want to attack (you can only attack to your borders). \r\nThe result of the attack is random and depends on dice. The more soldiers you have, the higher your chances. \r\nFortify\r\nChoose the regions from which you want to move soldiers. You can only move soldiers between neighboring regions. (Note! Every region must have at least one soldier)\r\nSkip\r\nYou can skip your round without attacking or moving troops to other regions. Save soldiers and wait for your turn. Keep your strategy secret from other players!\r\n\r\nThe purpose of the game is to conquer all the world (capture the 20 regions from the 4 different Empires), in 50 rounds. If a player captures the world earlier than the 50th rounds he wins the game. If none has captured the 20 regions after 50 rounds, the winner is the player with the most regions. If a player loses all of his regions, he is being eliminated from the game.\r\nGood Luck emperor !");
		txtrInTheBegging.setBounds(10, 11, 913, 443);
		contentPanel.add(txtrInTheBegging);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Understandable");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
