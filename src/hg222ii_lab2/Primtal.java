package hg222ii_lab2;
import java.util.Scanner;
public class Primtal {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	while (true) {
		System.out.print("Skriv en siffra: ");
		int userInput = input.nextInt();
		
		if(userInput < 0) {
			System.out.println("Bye!");
			break;
		}
		primtal(userInput);
		System.out.println();
		
	}
}

public static void primtal(int n) {
	int i,m=0,flag=0;      
	  m=n/2;      
	  if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }
	  else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }      
	   }      
	   if(flag==0)  { 
		   System.out.println(n+" is prime number"); }
	   }
}
}
