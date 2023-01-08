package hg222ii_lab3;

public class Fraction {
    private final int numerator;
    private final int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        } else {
            this.denominator = denominator;
        }
    }

 
    
    
    public String toString() {
    	return getFraction();
    }
    
    
    /**
     * Metoden isNegative som ger true om det är ett negativt bråktal.
     * @return
     */
    public boolean isNegative() {
    	return (denominator < 0 || numerator < 0);
    }
    
    /**
     * isEqualTo som jämför två Fraction-instanser och ser om de representerar samma bråktal.
     * @param otherFraction
     * @return
     */
    public boolean isEqualTo(Fraction otherFraction) {
    	return (numerator == otherFraction.getNumerator() && denominator == otherFraction.getDenominator());

    }
    
    
    public String getFraction() {
        return numerator + "/" + denominator;
    }
    
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator(){
    	return denominator;
    }
    
    /**
     * 
     * @return returnerar svaret i decimalform
     */
    public double getFractionDecimal() {
        return ((double) numerator) / denominator;
    }


    public String add(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subtract(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String multiply(Fraction otherFraction) {
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*c) + "/" + (b*d);
    }

    public String divide(Fraction otherFraction) {
    	int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*d) + "/" + (b*c);
    }
}

