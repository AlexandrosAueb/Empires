import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Mapp extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void maps() {
		try {
			Mapp dialog = new Mapp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mapp() {
		
		setBounds(100, 100, 863, 730);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/GameMap.png")).getImage();
		{
			JButton Ravenna = new JButton("125");
			Ravenna.setBounds(110, 151, 51, 23);
			contentPanel.add(Ravenna);
		}
		{
			JButton Avaris = new JButton("New button");
			Avaris.setBounds(214, 98, 51, 23);
			contentPanel.add(Avaris);
		}
		{
			JButton Florence = new JButton("New button");
			Florence.setBounds(346, 71, 51, 23);
			contentPanel.add(Florence);
		}
		{
			JButton Sparta = new JButton("New button");
			Sparta.setBounds(429, 71, 51, 23);
			contentPanel.add(Sparta);
		}
		{
			JButton thinis = new JButton("New button");
			thinis.setBounds(483, 123, 51, 23);
			contentPanel.add(thinis);
		}
		{
			JButton Babylon = new JButton("New button");
			Babylon.setBounds(483, 221, 51, 23);
			contentPanel.add(Babylon);
		}
		{
			JButton Corinth = new JButton("New button");
			Corinth.setBounds(588, 234, 51, 23);
			contentPanel.add(Corinth);
		}
		{
			JButton Memphis = new JButton("New button");
			Memphis.setBounds(588, 326, 51, 23);
			contentPanel.add(Memphis);
		}
		{
			JButton Nineveh = new JButton("New button");
			Nineveh.setBounds(684, 341, 51, 23);
			contentPanel.add(Nineveh);
		}
		{
			JButton Sardinia = new JButton("New button");
			Sardinia.setBounds(758, 363, 51, 23);
			contentPanel.add(Sardinia);
		}
		{
			JButton Crete = new JButton("New button");
			Crete.setBounds(758, 447, 51, 23);
			contentPanel.add(Crete);
		}
		{
			JButton Ashur = new JButton("New button");
			Ashur.setBounds(557, 374, 51, 23);
			contentPanel.add(Ashur);
		}
		{
			JButton Rome = new JButton("New button");
			Rome.setBounds(451, 353, 51, 23);
			contentPanel.add(Rome);
		}
		{
			JButton Persepolis = new JButton("New button");
			Persepolis.setBounds(329, 447, 51, 23);
			contentPanel.add(Persepolis);
		}
		{
			JButton Sicily = new JButton("New button");
			Sicily.setBounds(110, 495, 51, 23);
			contentPanel.add(Sicily);
		}
		{
			JButton Athens = new JButton("New button");
			Athens.setBounds(110, 581, 51, 23);
			contentPanel.add(Athens);
		}
		{
			JButton Tanis = new JButton("New button");
			Tanis.setBounds(214, 550, 51, 23);
			contentPanel.add(Tanis);
		}
		{
			JButton Alexandria = new JButton("New button");
			Alexandria.setBounds(139, 393, 51, 23);
			contentPanel.add(Alexandria);
		}
		{
			JButton Susa = new JButton("New button");
			Susa.setBounds(84, 252, 51, 23);
			contentPanel.add(Susa);
		}
		{
			JButton btnNewButton = new JButton("New button");
			btnNewButton.setBounds(275, 234, 51, 23);
			contentPanel.add(btnNewButton);
		}
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 847, 655);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("ROUNDS");
			lblNewLabel_1.setBounds(689, 11, 120, 38);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnNewButton_1 = new JButton("RULES");
				buttonPane.add(btnNewButton_1);
			}
			{
				JButton cancelButton = new JButton("EXIT");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
}
