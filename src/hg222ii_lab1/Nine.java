package hg222ii_lab1;
import java.util.Scanner;   
import java.util.Random;
public class Nine {
public static void main(String[] args) {
	int dice1;
	int dice2;
	Random randNr = new Random();
	dice1 = 1 + randNr.nextInt(6);
	System.out.println("Spela ett spel\n--------------\n--------------");
	Scanner input = new Scanner(System.in);
	System.out.print("Redo att spela? (Ja=1/Nej=2): ");
	int userInput = input.nextInt();
	
	if (userInput == 1) {
//		dice1 = 1 + randNr.nextInt(6);
		System.out.println("Du slog "+dice1);
	System.out.print("Vill du slå igen? (Ja=1/Nej=2): ");
	int userInput2 = input.nextInt();
	if(userInput2 == 1) {
	dice1 = 1 + randNr.nextInt(6);

	System.out.println("Du slog "+dice1);
	int sum = dice1+ dice1;
	System.out.println("Du fick totalt "+ sum);
	}
	else if(userInput2== 2) {
		System.out.println("Du har totalt "+dice1);
	}
		
		}
//	else if(userInput== "n") 
//		System.out.println("Du slog "+dice1 +"och totalt har du nu");
//	
	
		
}
}
