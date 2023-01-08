package hg222ii_lab1;

import java.util.Scanner;
public class VaxelPengar {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.print("Ange Kostnaden: ");
	double kostnaden = in.nextDouble();

	System.out.print("Ange erhållet belopp: ");
	double erhalletBelopp = in.nextDouble();	
	double tillbaka = (erhalletBelopp - kostnaden);
	long rounded = Math.round(tillbaka);      //avrundar till närmaste heltal
	in.close();
	                                      
	// systemet räknar med hjälp av modulus funktionen
	final int Tlapp = (int) (rounded / 1000);
	final int FHlapp = (int) (rounded % 1000) / 500;
	final int THlapp = (int) (rounded % 1000 % 500) / 200;
	final int Hlapp = (int) (rounded % 1000 % 500 % 200) / 100;
	final int femtiolapp = (int) (rounded % 1000 % 500 % 200 % 100) / 50;
	final int tjugolapp = (int) (rounded % 1000 % 500 % 200 % 100 % 50) / 20;
	final int tiokronor = (int) (rounded % 1000 % 500 % 200 % 100 % 50 % 20) / 10;
	final int femkronor = (int) (rounded % 1000 % 500 % 200 % 100 % 50 % 20 % 10) / 5;
	final int tvakronor = (int) (rounded % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5) / 2;
	final int enkrona = (int) (rounded % 1000 % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2) / 1;
	
	
    System.out.println("\nTillbaka: " + rounded);
	System.out.println("1000-lappar: " + Tlapp);
	System.out.println("500-lappar: " + FHlapp);
	System.out.println("200-lappar: " + THlapp);
	System.out.println("100-lappar: " + Hlapp);
	System.out.println("50-lappar: " + femtiolapp);
	System.out.println("20-lappar: " + tjugolapp);
	System.out.println("10-kronor: " + tiokronor);
	System.out.println("5-kronor: " + femkronor);
	System.out.println("2-kronor: " + tvakronor);
	System.out.println("1-kronor: " + enkrona);
}
}
