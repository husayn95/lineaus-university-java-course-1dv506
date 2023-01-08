package hg222ii_lab2;
import java.util.Scanner;

public class triangle2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Ange ett positivt heltal: ");
	int number = input.nextInt();
	if (number < 0) {
		System.out.println("Du måste ange ett positivt heltal! inget annat!");
	}
	
	for (int i = number; i>0; i--) {
		for (int j =1; j<=number-i; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	System.out.println("\nLikbent triangel:");
	for (int i = 1; i <=number; i = i+ 2) {
		int space = (number - i) / 2;
		while(space>0) {
			System.out.print(" ");
			space--;
		}
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	
}
}
