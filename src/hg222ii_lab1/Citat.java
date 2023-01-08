package hg222ii_lab1;
import java.util.Scanner;
public class Citat 
{ public static void main(String[] args) 
{//System.out.println("I do not wish I was a punk rocker with flowers in my hair.");
	Scanner citat = new Scanner(System.in);
	System.out.print("Ange en citat: ");

	String input = citat.nextLine();

System.out.println("Din citat: "+ "\""+input+"\"");
//System.out.println("Din citat: +" + citat +  "");

}
}