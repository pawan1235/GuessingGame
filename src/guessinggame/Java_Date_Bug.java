package guessinggame;

import java.util.Date;

public class Java_Date_Bug {
	public static void main(String[] args) {
		Date d1 = new Date(Long.MAX_VALUE);
		System.out.println(d1);
		System.out.println(System.nanoTime());
	}
}
