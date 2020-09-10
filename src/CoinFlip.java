import java.util.Random;
import java.util.Scanner;

/*Deliverable Two for Java Bootcamp Fall 2020
 * Coin Flip App
 * 
 * Tim Stetter
 *  
 * 
 */


public class CoinFlip {

	public static void main(String[] args) {
		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount = 0;
		Random randFlip = new Random();	
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Guess which will have more: heads or tails? ");
		headsOrTailsGuess = scnr.next();
		
		System.out.print("How many times shall we flips the coin? ");
		numberOfFlips = scnr.nextInt();
				
		int totalFlips = numberOfFlips; 
		while (numberOfFlips != 0) {
		int result = randFlip.nextInt(2);
		if (result == 0) {
			System.out.println("heads");
			if (headsOrTailsGuess.equalsIgnoreCase("heads")) {
				correctCount++;
			}
		}else {
			System.out.println("tails");
			if (headsOrTailsGuess.equalsIgnoreCase("tails")) {
				correctCount++;
			}			
		}
			
		numberOfFlips--;
		}		
					
			System.out.println("Your guess " + headsOrTailsGuess + ", came up " + correctCount + " out of " + totalFlips + " flip(s).");			
			System.out.println("That's " + ((correctCount * 100 )/totalFlips) +"%");		
		
		scnr.close();
	}

}
