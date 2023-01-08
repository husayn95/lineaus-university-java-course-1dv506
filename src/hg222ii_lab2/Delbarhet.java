package hg222ii_lab2;

public class Delbarhet {
	public static void main(String[] args) {

		System.out.println(
				"Tal mellan 100 och 200 som är jämnt delbara med 4 eller 5, men som inte är delbara med både 4 och 5: ");

		final int numbersPerLine = 10;
		int counter = 0;
		for (int i =100; i<200; i++) {
			if (i % 4 == 0 ^ i % 5 == 0) {
				counter++;
				
				if (counter % numbersPerLine == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}
		
	}
}
