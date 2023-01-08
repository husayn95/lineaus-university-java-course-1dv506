package hg222ii_lab3;
public class FractionMain {
	
	    public static void main(String[] args) {
	        Fraction fraction1 = new Fraction(6,3);
	        Fraction fraction2 = new Fraction(3,3);
	       
	        
	        System.out.println("\nThe fractions are: F1: " + fraction1.toString() + ",   F2: " + fraction2.toString() + "\n");

	        System.out.println("Is F1 negative?: " + fraction1.isNegative());
	        System.out.println("Is F2 is negative?: " + fraction2.isNegative() + "\n");

	        System.out.println("Are the the fractions equal?: " + fraction1.isEqualTo(fraction2) + "\n");
	        
	        System.out.println("F1: " + fraction1.getFraction() + "  Dec: " + fraction1.getFractionDecimal());
	        System.out.println("F2: " + fraction2.getFraction() + "  Dec: " + fraction2.getFractionDecimal() + "\n");
	        System.out.println("F1 + F2: " + fraction1.add(fraction2) + "\n");
	        System.out.println("F1 - F2: " + fraction1.subtract(fraction2) + "\n");
	        System.out.println("F1 * F2: " + fraction1.multiply(fraction2) + "\n");
	        System.out.println("F1 / F2: " + fraction1.divide(fraction2));
	    }
	}

