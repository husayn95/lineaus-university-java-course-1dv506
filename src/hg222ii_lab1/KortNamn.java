package hg222ii_lab1;

import java.util.Scanner;
public class KortNamn {
public static void main(String[] args) {
	System.out.print("Ditt förnamn: ");
	Scanner in = new Scanner(System.in);
	String fName = in.next(); 
	String fsub = fName.substring(0,1);  //Första bokstaven i förnamnet
	System.out.print("Ditt efternamn: ");
	String sName = in.next();
	String asub = sName.substring(0,4);   //De fyra bokstäverna i efternamnet
	in.close();

	System.out.print("Kort namn: " + fsub + ". " + asub);
}
}
