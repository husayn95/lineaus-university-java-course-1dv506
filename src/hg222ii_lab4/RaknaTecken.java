package hg222ii_lab4;

import java.io.File; 


import java.io.IOException;
import java.util.Scanner;

public class RaknaTecken {
	public static void main(String[] args)  {
		/* Create object representing a file */
		File file = new File(args[0]);

		System.out.println("Läser text från filen: " + file);

		/* Create Scanner to read from file */
		try {
			Scanner fileScan = new Scanner(file);
		

		int a = 0;
		int A = 0;
		int D = 0;
		int W = 0;

		
		while (fileScan.hasNext()) {
			String str = fileScan.next();

			System.out.print(str + " ");
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isUpperCase(ch)) {
					A++;}
			
				if (Character.isLowerCase(ch)) {
					a++;
				}
				if (Character.isSpaceChar(str.charAt(i))) {
					W++;
				}
				
				if (Character.isAlphabetic(ch) == false) {
					D++;
				}
				
				
			}

		
		}
		fileScan.close();
		System.out.println("\n\nStora bokstäver: " + A);
		System.out.println("Små bokstäver: " + a);
		System.out.println("Antal 'whitespaces': " + W);
		System.out.println("Antal övriga: " + D);
		}
		
		catch (Exception w) {
			System.out.println(w+"\nFile not found!");
		}
		
	}
}
