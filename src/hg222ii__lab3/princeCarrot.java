package hg222ii__lab3;
import java.util.Random;
public class princeCarrot {
Random dice = new Random();
	private int XP=30;
	private int carrotsFist =3; //3 dice rolls
	private int dice1;
	private int dice2;
	private int dice3;
	private int sum;
	
	public princeCarrot() {
		
	}
	
	public int carrotsFists() {
		for (int i = 1; i<=carrotsFist; i++) {
			 dice1 = 1 + dice.nextInt(5); //power between 1 and 5
			 dice2 = 1 + dice.nextInt(5);
			 dice3 = 1 + dice.nextInt(5);
			sum = dice1 + dice2 + dice3;
			 
		}return sum;
	}
	
	public int getXP() {
		return XP;
		
	}
	
	
	
}
