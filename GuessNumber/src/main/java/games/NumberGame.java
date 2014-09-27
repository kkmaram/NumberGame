package games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberGame {
	
	

	public static void main(String[] args) {
		int qtnsCnt = 0;
		String qtn = "Is the number NUM ?";
		List<String> validInputs = Arrays.asList("higher","lower","yes","end");
		BufferedReader br = null;
		String input = null;
		
		try {
			System.out
			.print("Choose a number between 1-100 and enter ready to play :  ");
	
			// open up standard input
			br = new BufferedReader(new InputStreamReader(
					System.in));

			input = br.readLine();

			if ("ready".equalsIgnoreCase(input)) {
				NumberGuesser guess = new NumberGuesser();
				while (!(input.equalsIgnoreCase("end") || input
						.equalsIgnoreCase("yes"))) {

					System.out.println(qtn.replaceFirst("NUM", String.valueOf(guess.evaluate(input))));				
					
					
					input = br.readLine();
					
					//if input is NOT higher/lower..display message
					if(!(validInputs.contains(input))){
						System.out.println("******* INVALID input, please enter 'higher' or 'lower' ********");
						break;
					}
					qtnsCnt++;

				}
			}
		} catch (IOException ioe) {
			try {
				br.close();
			} catch (IOException e) {
				
			}
			System.out.println("IO error trying to read your inputs!");
			System.exit(1);
		}

		System.out.println("no of qtns :: " + qtnsCnt);

	}

}
