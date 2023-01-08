package hg222ii_lab1;

import java.lang.Math;       		   
import java.text.DecimalFormat;
import java.util.Scanner;
public class Avstand {
	public static void main(String[] args) {
 Scanner in = new Scanner(System.in);

System.out.print("Ange första koordinaten (x,y): ");
String input1 = in.next();
String[] strings = input1.split(",");    // delar inputten i mitten
String koor1 = strings[0].substring(1,strings[0].length()); // tar bort parentesen, X utan parentes
System.out.print(koor1 + ",");

String Y1 = strings[1].substring(0,strings[1].length()-1);  // Y utan parentes
System.out.println(Y1);
 

System.out.print("Ange andra koordinaten (x,y): ");
String input2 = in.next();
String[] strings2 = input2.split(",");
String koor3 = strings2[0].substring(1,strings2[0].length());
System.out.print(koor3 + ",");

String koor4 = strings2[1].substring(0,strings2[1].length()-1);
System.out.println(koor4);
in.close();
 
Float x1 = Float.parseFloat(koor1);  //"parsar" koordinaterna
Float y1 = Float.parseFloat(Y1);
Float x2 = Float.parseFloat(koor3);
Float y2 = Float.parseFloat(koor4);

double x1x2 = Math.pow(x1-x2, 2);
double y1y2 = Math.pow(y1-y2, 2);
double d = Math.sqrt( (x1x2) + (y1y2) );

DecimalFormat dFormat = new DecimalFormat("0.###");
String three_decimals = dFormat.format(d);
System.out.println("Avstand = " + three_decimals);
		}
	}
