package hg222ii_lab1;

import java.util.Scanner;    
import java.lang.Math;                 //för att kunna använda Math.pow senare

public class VindAvkylning {
public static void main(String[] args) {
		
System.out.print("Ange temperatur (C): ");
Scanner in = new Scanner(System.in);
double T = in.nextDouble();              //tar in temperaturvärdet


System.out.print("Ange vindhastigheten (m/s): ");
double wind = in.nextDouble();
double V = wind * 3.6;               // omvandlar m/s till km/h
in.close();

double Twc = 13.12 + 0.6215 * T - 11.37 * Math.pow(V, 0.16) + 0.3965 * T * Math.pow(V, 0.16);
System.out.printf("Upplevd temperatur (C): " + "%.1f", Twc);      // skriver ut svaret med en decimal


}
}