package hg222ii_lab2;

import java.util.Scanner;   
import java.util.Random;

/**Det här programmet låter användaren gissa ett tal mellan 1 och 100 som datorn slumpmässist väljer.
 * Användaren får 10 chanser max för att gissa rätt, annars "förlorar" den spelet. 
 */
public class HighLow {
	public static void main(String[] args) {
		Random rand = new Random();
		int randNr = rand.nextInt(100) + 1;

		int guessCount = 0; // Håller koll på antalet gissningar som användaren gör
		int guessLimit = 10; // Max antalet gissningar som användaren har på sig

		Scanner guessNr = new Scanner(System.in);
		int userguess = 0;

		while (guessCount < guessLimit) {
			System.out.println("Välj ett tal mellan 1 och 100 för att gissa talet: ");
			userguess = guessNr.nextInt();

			guessCount++;

			if (userguess < randNr) {
				System.out.println("Gissning " + guessCount + ": " + userguess);
				System.out.println("Fel svar! Ledtråd: svara högre\n ");
			} else if (userguess > randNr) {
				System.out.println("Gissning " + guessCount + ": " + userguess);
				System.out.println("Fel svar! Ledtråd: svara lägre \n");
			} else if (userguess == randNr) {
				System.out.println("Rätt svar efter bara " + guessCount + " gissningar - Strålande!");
				break;
			}
		}
		if (userguess != randNr) {
			System.out.println("Du förlorade! Försök igen från början!");
		}
		guessNr.close();
	}
}
