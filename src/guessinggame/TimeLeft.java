package guessinggame;

import java.time.Duration;

public class TimeLeft {
	public static void main(String[] args) {
		long left = Long.MAX_VALUE - System.nanoTime();
		double timeleft = Duration.ofNanos(left).toDays() / 365.242;
		System.out.println("Timeleft: "+timeleft+" years.");
	}
}
