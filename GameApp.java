import java.awt.EventQueue;

public class GameApp {

	public static void main(String[] args) {
		/**
		 * Launch the application.
		 */		
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

}
