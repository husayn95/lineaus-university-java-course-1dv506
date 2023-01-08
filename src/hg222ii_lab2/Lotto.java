package hg222ii_lab2;
import java.util.Arrays;  
import java.util.Collections;
import java.util.Random;
public class Lotto {
public static void main(String[] args) {
	Random rand = new Random();
	int[] array = new int[8];
	
	  int[] arr = new int[7];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = 1+rand.nextInt(35);
	    }
	    Collections.shuffle(Arrays.asList(arr));
	    System.out.println(Arrays.toString(arr));

	
//	System.out.println("Veckans lottorad: ");
//	
//	
//		for (int i=0; i<array.length-1; i++) {
//		int a = array[i];
//		
//		array[i]=1+rand.nextInt(35);
//		   Collections.shuffle(Arrays.asList(array[i]));
//
//		System.out.print(array[i] + " ");
//		for (int j=i+1;j<array.length;j++) {
//		
//		   
//		
//		int b = array[j];
//		if (a == b)
//			a--;
//		b--;
//			
//				
//
//		}
		
//	for (int i =1; i < array.length; i++) {
//		array[i]=1+rand.nextInt(35);
//		System.out.print(array[i] + " ");
//	}
//}
//	Integer[] arr = new Integer[7];
//    for (int i = 0; i < arr.length; i++) {
//        arr[i] = 1+rand.nextInt(35);
//    }
}
}
