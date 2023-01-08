package hg222ii_lab2;

import java.util.Scanner;      

import java.util.ArrayList;

public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Mata in positiva heltal. Avsluta med ett negativt tal.");
		int number = 1;
		ArrayList<Integer> listNr = new ArrayList<Integer>();
		int e = 0;
		while (number >= 0) {
			System.out.print("\ntal " + (e + 1) + ": ");
			number = sc.nextInt();
			e++;
			listNr.add(number);
		}
				listNr.remove(listNr.size() - 1);  //deletes the negative input number from printing out

		System.out.println("\nAntal positiva tal: " + listNr.size());
		System.out.println("I omvänd ordning: ");
		for (int t = listNr.size() - 1; t >= 0; t--) {
			System.out.print(listNr.get(t) + "  ");
		}		

		while (number < 0) {
			System.exit(-1);

		}
		sc.close();
	}

}
