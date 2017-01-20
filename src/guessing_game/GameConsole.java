package guessing_game;

import java.util.Scanner;

/**
 * 
 * @author Pawan Intawongsa
 *
 */

public class GameConsole {
	Scanner sc = new Scanner(System.in);
	private int guessNum;
	private GuessingGame game;

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game
	 *            is the GuessingGame's object call by this class
	 */

	public int play(GuessingGame game) {
		String title = "Gussing Game";
		String prompt = "Your guess?: ";
		System.out.println(title);
		while (true) {
			game.getHint();
			System.out.print(prompt);
			guessNum = sc.nextInt();
			game.guess(guessNum);
			System.out.println(game.getHint());
			if (guessNum == game.getSecret()) {
				return guessNum;
			}
		}

	}

}
