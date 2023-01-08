package hg222ii_lab4;


import java.io.File; 


import java.io.IOException;
import java.util.Scanner;

/**
 * A program showing how to read text from a file.
 * 
 */
public class Histogram {

	public static void main(String[] args) throws IOException  {
		/* Create object representing a file */
		File file = new File(args[0]);

		System.out.println("Läser heltal från filen: "+ file);

		try {
		/* Create Scanner to read from file */
		Scanner fileScan = new Scanner(file);

		
		int digit = 10;
		int other = 0;
		int[] dig = new int[digit];
		int all = 0;
		/* Read one digit at the time */

		
			while (fileScan.hasNextInt()) { // true ==> more digits available
		

			int amountDigits = fileScan.nextInt();

			if (amountDigits >= 1 && amountDigits < 100) {
				
				dig[(amountDigits-1) / 10 ]++;
				all++;
			}
				
				
			 else
				other++;
			 }
		
		fileScan.close();
		System.out.println("Antal tal i intervallet [1,100]: " + all);
		System.out.println("Övriga: " + other);
		System.out.println("\nHistogram");

		for (int i = 0; i < dig.length; i++) {

			System.out.print(((i * 10) + 1) + " - " + ((i * 10) + 10) + "  | ");

			for (int star = 0; star < dig[i]; star++) {
				System.out.print("* ");
			}

			if (i != 10) {
				System.out.println();
			}
		
		}
		}
		
		catch (Exception e) {
			System.out.println(e+"\nFile not found!");
		}
	}
}

