public class GameApp {
	public static String name1=MainMenu.getText1();
	public static String name2=MainMenu.getText2();
	public static String name3=MainMenu.getText3();
	public static String name4=MainMenu.getText4();

	public static void main(String[] args) {
		/*
		 * Starts the Main Menu Window
		 */
		MainMenu.main(args);
		Players player1=new Players (MainMenu.getText1(),"blue");
		Players player2=new Players (MainMenu.getText2(),"green");
		Players player3=new Players (MainMenu.getText3(),"yellow");
		Players player4=new Players (MainMenu.getText4(),"brown");
		}
}
