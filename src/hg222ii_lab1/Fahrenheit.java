package hg222ii_lab1;

import java.util.Scanner;
/** This program converts and prints out Fahrenheit to Celcius.
 *
 * @author admin*/

public class Fahrenheit {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Ange en temperatur i Fahrenheit: ");
double fahrenheit = in.nextInt();
double celcius = (5.0/9) * (fahrenheit-32);  // konverterar till celcius
in.close();

System.out.print("Motsvarande temperatur i Celsius är: " + celcius);
}
}


