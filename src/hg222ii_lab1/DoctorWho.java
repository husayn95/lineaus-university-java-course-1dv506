package hg222ii_lab1;
import java.util.Scanner;

public class DoctorWho {
	public static void main(String[] args) {
			System.out.println("Vilket år? ");

Scanner re = new Scanner(System.in);
int year = re.nextInt();

if (year >= 1963 & year  < 1989)
System.out.println("Det var originalserien.");

if(year >= 1989 & year < 2005)
	System.out.println("Det året var det paus.");

if(year >= 2005 & year <= 2020)
	System.out.println("Det är den moderna doktorn.");
if( year > 2020)
	System.out.println("vet ej");
}
}