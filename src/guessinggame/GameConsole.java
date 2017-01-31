package guessinggame;

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
		System.out.println(title);
		while (true) {
			System.out.println(game.getHint());
			System.out.print("Your guess: ");
			guessNum = sc.nextInt();
			if (game.guess(guessNum)) {
				System.out.println(game.getHint());
				return guessNum;
			}

		}

	}

}
