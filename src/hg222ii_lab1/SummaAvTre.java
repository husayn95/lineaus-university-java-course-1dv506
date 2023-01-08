package hg222ii_lab1;

import java.util.Scanner;

public class SummaAvTre {
public static void main(String[] args) {
	
System.out.print("Ange ett tresiffrigt heltal: ");
Scanner in = new Scanner(System.in);
int threeDigitNumber = in.nextInt();
int firstDigit = (threeDigitNumber / 10) / 10; //skriver ut bara första siffran ur talet
int secondDigit = (threeDigitNumber / 10) % 10; // - _ -      den andra siffran
int lastDigit = (threeDigitNumber % 10);        // skriver ut den sista siffran
int sum = firstDigit + secondDigit + lastDigit;   // 
in.close();
System.out.print("Summan av siffrorna i heltalet är: " + sum);
}
}