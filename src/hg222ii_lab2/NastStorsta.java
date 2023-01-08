package hg222ii_lab2;

import java.util.Scanner;

/** Det här programmet läser in ett antal heltal och hittar det näst största talet
 *  av dem och därefter skriver ut det
 */
public class NastStorsta {

	public static void main(String[] args) {

		System.out.println("Mata in 10 tal: ");
		Scanner numbers = new Scanner(System.in);
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		int counter = 10;
		while (true && counter >0) {
			counter--;
			int input = numbers.nextInt();
			if (input > largest) {
				secondLargest = largest;
				largest = input;}
			else if (input > secondLargest) {
				secondLargest = input;
			}		
		} numbers.close();
		System.out.println("Näststörsta talet är: " + secondLargest);
		//System.out.println("Största talet är: " + largest);


	}
}
