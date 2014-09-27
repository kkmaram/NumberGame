package games;



import games.NumberGuesser;

import org.junit.Assert;
import org.junit.Test;



public class NumberGuesserTest {

	NumberGuesser guessEng = new NumberGuesser();
	String input = "ready";

	@Test
	public final void testEvaluate() {
		int userPick = 45;
		int qtnsCnt = 1;
		int engineGuess = guessEng.evaluate(input);
		while(userPick != engineGuess){
			if(userPick > engineGuess){
				input = "higher";				
			}else{
				input = "lower";
			}
			engineGuess = guessEng.evaluate(input);
			qtnsCnt++;
		}
		System.out.println(String.format("Guessed Num %s :: no of qtns :: %s", engineGuess,qtnsCnt));
		Assert.assertEquals(userPick, engineGuess);
	}

}
