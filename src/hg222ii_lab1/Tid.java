package hg222ii_lab1;

import java.util.Scanner;

public class Tid {

	public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
System.out.print("Ange antal sekunder: ");
int amountSeconds = in.nextInt();
int hour = (amountSeconds / 60) / 60;
int minute = ((amountSeconds / 60) % 60);
int seconds = (amountSeconds % 60);
in.close();

System.out.print("Detta motsvarar: " + hour + " timmar, " + minute + " minuter, " + seconds + " sekunder");
}
}
