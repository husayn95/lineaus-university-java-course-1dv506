package hg222ii_lab2;
/** 
 * Det här programmet läser in en text och skriver ut den baklänges.   
 * */
import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Mata in en textrad: " );
		String s = scan.nextLine();
		scan.close();
		
		//int len = s.length();
		String baklänges = "";                     
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			baklänges = baklänges + s.charAt(i);  
		   /** De 4 raderna ovan plockar ut bosktaven i slutet
			 * av texten/strängen och skriver ut den först istället, 
			 * och fortsätter så tills den har skrivit ut alla bokstäverna omvänd */
		}
		System.out.println("Baklänges: " + baklänges);

	}
}