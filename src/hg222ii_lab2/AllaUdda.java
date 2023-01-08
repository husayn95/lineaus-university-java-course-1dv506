package hg222ii_lab2;
import java.util.Random;
public class AllaUdda {
public static void main(String[] args) {
	Random n = new Random();
	int[] array = new int[10];
	System.out.print("Hela arrayen:  ");
	for (int i =0; i < array.length; i++) {
		array[i] = 1 + n.nextInt(100);
		System.out.print(array[i]+" ");
		
		
	}
	System.out.println("\nUdda tal i arrayen: ");
	for(int i =0; i <array.length; i++) {
		if(array[i] % 2 != 0)
			System.out.print(array[i]+" ");
	}
}
}
