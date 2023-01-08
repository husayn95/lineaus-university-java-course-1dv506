package hg222ii_lab2;

import java.util.Scanner;

/** Det här programmaet skriver ut 2 st olika trianglar beroende på vilken 
 * storlek som användaren skriver in. Storleken måste dock vara ett udda heltal t,ex 7,
 * annars får användaren ett felmeddelande om att det inmatade talet inte är ett positivt udda heltal
 */
public class Triangle {
//	private  int width;
//	public Triangle(int aWidth)
//	{
//		width = aWidth;
//	}
//	
//	public int getArea()
//	{
//		if (width == 1)
//		{
//			return 1;
//		}
//		else
//		{
//			Triangle smallerTriangle = new Triangle(width - 1);
//			int smallerArea = smallerTriangle.getArea();
//			return smallerArea + width;
//		}
//	}
//	
	public static void main(String[] args) {
//
//		Triangle smallerTriangle = new Triangle(5-1);
//		int smallerArea = smallerTriangle.getArea();
//		System.out.println(smallerArea);
		Scanner in = new Scanner(System.in);
		System.out.println("Ange ett udda nummer: ");
		int size = in.nextInt();
		if (size % 2 == 0) {
			System.out.print("Det inmatade talet måste vara ett udda positivt heltal!\n");
		} else {
			System.out.println("Rätvinklig triangel:");

			for (int r = size; r > 0; r--) {

				for (int c = 1; c <= size - r; c++) {
					System.out.print(" ");
				}

				for (int i = 1; i <= r; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
//			for (int k = size; k>0; k--) {
//				
//				for (int t = 1; t<=size-k; t++) {
//					System.out.print(" ");
//				}
//				for (int u = 0; u<k; u++) {
//					System.out.print("*");
//				} System.out.println();
//			}

			System.out.println("\nLikbent triangel:");
			for (int i = 1; i <= size; i = i + 2) {
				int space = (size - i) / 2;
				while (space > 0) {
					System.out.print(" ");
					space--;
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}in.close();
	}
}

