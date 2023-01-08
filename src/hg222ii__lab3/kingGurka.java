package hg222ii__lab3;
import java.util.Random;
public class kingGurka {
Random dice = new Random();
	private int XP=50;
	private int ironTomato = 0; //3 dice rolls
	private int kingsFist=0; //3 dice rolls
	private int dice1;  
	private int dice2;
	private int dice3;

	
	
	public kingGurka() {	
		
	}

	
	public int kingsFist() {
		for (int i = 1; i<=3; i++) {
			 dice1 = 2 + dice.nextInt(4);  //random number only between 2 and 4 that equals to kings fist power
			 dice2 = 2 + dice.nextInt(4);
			 dice3 = 2 + dice.nextInt(4);
			kingsFist = dice1 + dice2 + dice3; }
		return kingsFist;
	}
	
	public int ironTomato() {
		for (int i = 1; i<=3; i++) {
			 dice1 = 1 + dice.nextInt(6); // power between 1 and 6
			 dice2 = 1 + dice.nextInt(6);
			 dice3 = 1 + dice.nextInt(6);
			 ironTomato = dice1 + dice2 + dice3;
			 
		}return ironTomato;
	}
	
	public int setWeapon() {
		return ironTomato;
	}
	
	public int getXP() {
		return XP;
	}
	
	
}
