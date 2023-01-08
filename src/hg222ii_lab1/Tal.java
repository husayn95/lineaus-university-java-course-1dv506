package hg222ii_lab1;
import java.util.Scanner;

public class Tal {
public static void main(String[] args) {
	System.out.println("Ange tre tal ");
	Scanner hu = new Scanner(System.in);
	//int digit = hu.nextInt();
		//System.out.print(digit);
		
//			System.out.print("Första talet: ");

//		if (tal1 < tal2 & tal2 < tal3) {
			System.out.print("Första talet: " );
				int tal1 = hu.nextInt();

//		if(tal2 > tal1 & tal2 < tal3) {
			System.out.print("Andra talet: ");
				int tal2=hu.nextInt();

//		if(tal3 > tal2 & tal3 > tal1) {
			System.out.print("Tredje talet: ");		
			int tal3=hu.nextInt();;

			int smallest = 0;
			int middleOne = 0;
			int largest = 0;
			
			System.out.print("Korrekt ordning: ");
			if (tal1 < tal2 && tal1 < tal3) {
				tal1=smallest;
			}
			 if (tal2>tal1 && tal2 < tal3) {
				middleOne = tal2;
			}
			 if (tal3 > tal2 && tal3 >tal1) {
					largest = tal3;}
			
			System.out.print(smallest+" "+middleOne+" "+largest);
				
}
}
