package games;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NumberGuesser {

	Random rn = new Random();

	private int guessedNum;

	private int higher = 100;

	private int lower = 1;

	private int randomNum = 0;
	
	private final String HIGHER = "higher";
	
	private final String LOWER = "lower";

	

	List<Integer> guessedNums = new LinkedList<Integer>();

	public int evaluate(String input) {

		if (input.equalsIgnoreCase(HIGHER)) {

			lower = guessedNum;

		} else if (input.equalsIgnoreCase(LOWER)) {

			higher = guessedNum;

		}

		//pick a number between higher and lower numbers
		randomNum = rn.nextInt(higher - lower) + lower;
		//as we pick numbers randomly...put a check to filter already guessed numbers
		while (guessedNums.contains(randomNum)) {
			randomNum = rn.nextInt(higher - lower) + lower;
			if (!guessedNums.contains(randomNum)) {
				break;
			}
		}
		guessedNum = randomNum;
		guessedNums.add(guessedNum);

		return guessedNum;

	}

}
