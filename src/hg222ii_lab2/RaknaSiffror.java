package hg222ii_lab2;
import java.util.Scanner;

public class RaknaSiffror {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
int sum = 0;
while (true) {
	System.out.println("Skriv en siffra: ");
	int number = input.nextInt();
	sum += number;
	if(number == 0) break;
}
System.out.println("The sum is: " +sum);
	

}
}
