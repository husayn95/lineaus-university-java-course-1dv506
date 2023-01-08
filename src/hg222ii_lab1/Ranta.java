package hg222ii_lab1;

import java.util.Scanner;

public class Ranta {

	public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
System.out.print("Besparingar år noll: ");
double savings = in.nextInt();
System.out.print("Årsränta i procent: ");
double interestInPercent = in.nextInt();
double valueOfPercent = 1.0 + (interestInPercent / 100);  // totala procent
double savingsAfterFiveYears = savings * Math.pow(valueOfPercent, 5); // exponentialfunktion
long rounded = Math.round(savingsAfterFiveYears);     // avrundar till närmaste heltal
in.close();
System.out.print("Värdet på besparingarna efter fem år är: " + rounded);
	}
}
