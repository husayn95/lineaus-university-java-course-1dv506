package hg222ii_lab1;

import java.util.Scanner;
public class Area {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Ange en cilkelradie: ");
	double cirkelradie = in.nextInt();
	double cirkelArea = Math.PI * cirkelradie * cirkelradie;
	in.close();

	System.out.printf("Cirkelns area är: " +  "%.1f", cirkelArea);  // svar med en decimal
}
}
