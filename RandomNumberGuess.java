// comments
package test;

import java.util.Scanner;

public class RandomNumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String playAgain = "";		
		do {
			System.out.println("Input a positive integer:");
			int intRange = scan.nextInt();
			int theNumber = (int)(Math.random() * intRange + 1);
			int guess = 0;
			int numberOfTries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 "+ intRange+ ":");
				guess = scan.nextInt();
				numberOfTries ++;
				if (guess < theNumber)
					System.out.println(guess + " is too low. Try again.");
				else if (guess > theNumber)
					System.out.println(guess + " is too high. Try again.");
				else {
					System.out.println(guess + " is correct. You win!");
				    System.out.println("It only took you "+  numberOfTries + " tries! Good work!");
				}
			} // End of while loop for guessing
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}
}
