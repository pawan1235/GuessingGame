package guessing_game;

import java.util.Random; //for random numbers

/**
 * Game of guessing a secret number.
 * 
 * @author Pawan Intawongsa
 *
 */

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count = 0;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */

	public GuessingGame(int upperbound) { // This is a constructor
		this.upperBound = upperbound;
		secret = getRandomNumber(upperbound);
		this.hint = "I'm thinking of a number between 1 and " + upperbound;
		System.out.println(this.hint);
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */

	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	/**
	 * test whether the user's guess matches the secret.
	 * 
	 * @return if user's answer match the random number return true if not
	 *         return false.
	 */

	public boolean guess(int number) {
		if (number == secret) {
			setHint("Correct.The secret is " + secret + ".\nCorrect. You used " + count + " guesses.");
			count++;
			return true;
		} else if (number < secret) {
			setHint("Sorry, your guess is too small.");
			count++;
			return false;
		} else {
			setHint("Sorry, your guess is too large.");
			count++;
			return false;
		}
	}

	/**
	 * Return a hint base on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */

	public String getHint() {
		return hint;
	}

	/**
	 * set hint
	 * 
	 * @param hint
	 *            to be set
	 */

	private void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Get secret number
	 * 
	 * @return secret number
	 */

	public int getSecret() {
		return secret;
	}

	/**
	 * Get number of count
	 * 
	 * @return number of count
	 */

	public int getCount() {
		return count;
	}

}
