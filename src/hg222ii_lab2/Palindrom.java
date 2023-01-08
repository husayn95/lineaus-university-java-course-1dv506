package hg222ii_lab2;
import java.util.Scanner;
public class Palindrom {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	while (true) {
		
	System.out.print("Skriv ett ord eller mening: ");
	String userIn = input.next();
	
	if(userIn.equals("stopp")) {
		break;}	
	
	System.out.println(palindrome(userIn)+"\n");

	
	}input.close();
	
}

public static  boolean palindrome(String str) {
	// Pointers pointing to the beginning 
    // and the end of the string 
    int i = 0, j = str.length() - 1; 

    // While there are characters to compare 
    while (i < j) { 

        // If there is a mismatch 
        if (str.charAt(i) != str.charAt(j)) 
            return false; 
        // Increment first pointer and 
        // decrement the other 
        i++; 
        j--; 
    } 


    // Given string is a palindrome 
    return true;	}

}
