package guessinggame;

/** 
 * create objects and start the game 
 * 
 */

public class Main {
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);

	}
}
