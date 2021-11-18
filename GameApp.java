public class GameApp {
	public static void main(String[] args) {
		/*
		 * Starts the Main Menu Window
		 */
		MainMenu.main(args);
		Players player1=new Players (MainMenu.player1,"blue");
		Players player2=new Players (MainMenu.player2,"green");
		Players player3=new Players (MainMenu.player3,"yellow");
		Players player4=new Players (MainMenu.player4,"brown");
		}
}
