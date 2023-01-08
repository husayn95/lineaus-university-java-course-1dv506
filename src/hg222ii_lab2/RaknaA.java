package hg222ii_lab2;
/** 
 * Det här programmet räknar och skrivet ut antalet små a och stora A i en text 
 */
import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("Mata in en textrad: " );
		String str = scan.nextLine();
int A = 0;		int a = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				a++;            // räknaren a ökar varje gång den matchas med 'a' i texten
			}
			else if (ch == 'A') {
				A++;            // räknaren A ökar varje gång den matchas med 'A' i texten
			}
		}
scan.close();
		
		System.out.println("Antal a: " + a);
		System.out.println("Antal A: " + A);

	}
}
