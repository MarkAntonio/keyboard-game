package model;

import java.util.Random;

import view.GameView;

public class KeyboardDigits {
	public static final String[] LETTERS = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	public static final String[] NUMBERS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	public static String randomLetter() {
		Random r = new Random();
		int index = r.nextInt(LETTERS.length);
		return LETTERS[index];
	}
	
	public static String randomNumber() {
		Random r = new Random();
		int index = r.nextInt(NUMBERS.length);
		return NUMBERS[index];
	}
}
