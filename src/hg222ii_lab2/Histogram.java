package hg222ii_lab2;
import java.util.Random;
public class Histogram {
public static void main(String[] args) {
	Random roll = new Random();
	int dice;
	int count1 = 0;
	int count2= 0;
	
	for (int i =1; i <500; i++) {
		dice = 1 + roll.nextInt(6);
	
			if(dice == 1) {
				count1++;	
			}
			
			if (dice ==2) {
				count2++;
			}
		
}
	System.out.print("Ettor"+" (" +count1+"): ");
	for(int i =0; i<count1; i++) {
	System.out.print("*");
	}
	
	System.out.print("\nTvåor"+" (" +count2+"): ");
	for(int i =0; i<count2; i++) {
	System.out.print("*");
	}

}
}
