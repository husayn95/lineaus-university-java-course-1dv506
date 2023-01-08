package hg222ii_lab2;
import java.util.Scanner;

public class VarannanSiffra {
public static void main(String[] args) {
	
	
	Scanner number = new Scanner(System.in);
		System.out.print("Första siffran: ");

	int input = number.nextInt();
	
	
		System.out.print("Andra siffran: ");

	int input2 = number.nextInt();
	
	for (int i=input; i<=input2; i+=2) {
	System.out.print(i + " ");}
}
}
