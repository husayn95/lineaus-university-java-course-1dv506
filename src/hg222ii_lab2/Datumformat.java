package hg222ii_lab2;
import java.util.Scanner;
public class Datumformat {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Skriv ett år: ");
	int input = s.nextInt();
	System.out.print("Skriv en månad (nummer): ");
	int input2 = s.nextInt();
    System.out.print("Skriv en dag (nummer): ");
    int input3 = s.nextInt();
    System.out.print("Ange format (b/l/m): ");
    String input4 = s.next();
    
    datumformat(input, input2, input3, input4);
    s.close();
}

public static String datumformat(int year, int month, int day, String format) {
	
//	if(month < 10 || day < 10) {
////		System.out.print("0"+month);
//	format = "0"+month;
//	
//	}
		
	if(format.equals("b")) {
		format = year+"/"+month+"/"+day;
	System.out.println(format);}
	
	else if (format.equals("l")) {
		format = day+"/"+month+"/"+year;
		System.out.println(format);
	}
	else if (format.equals("m")) {
		format = month+"/"+day+"/"+year;
		System.out.println(format);
	}
	
		return format;
}

}
