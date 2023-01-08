package hg222ii_lab2;
import java.util.Random;	
public class TvaTarningar {
public static void main(String[] args) {
	Random randNr = new Random();
	int dice1;
	int dice2;
	int[] sum = new int[13];
	
	//initialize sum to 0
	for (int i = 0; i < sum.length; i++) {
		sum[i]=0;
	}
	
	System.out.println("Frequency table (sum,count) for rolling two dices 10000 times");

	//roll the dice and save the results
	for (int i = 1; i<=10000; i++) {
		 dice1 = 1 + randNr.nextInt(6);
		 dice2 = 1 + randNr.nextInt(6);
		 sum[dice1 + dice2]++;
	}
	//print the table
	System.out.printf("%3s%12s\n", "Sum", "Frequency");
	
	//ignore subscripts 0 and 1
	for(int k=2; k <sum.length; k++) {
		System.out.printf("%2d%9d\n", k, sum[k]);
	}
}
}
