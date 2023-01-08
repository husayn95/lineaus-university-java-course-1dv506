package hg222ii_lab3;

public class Pnr {

	public static void main(String[] args) {
		String personnr = "9505045550";
		String personnr2 = "6523761234";
		System.out.println("1) Första delen är: " + getFirstPart(personnr));
		System.out.println("1) Andra delen är: " + getSecondPart(personnr));


		System.out.println("\n2) Personnummret är kvinnligt: " + isFemaleNumber(personnr));

		System.out.println("\n3) Jämför två personnummer och skriver ut antigen true om de är samma ");
		System.out.print("   eller false om de inte är samma. Svar: " + areEqual(personnr2, "9505045550"));
	}

	public static String getFirstPart(String pnr) {
		String personNr = "950504-5550";
		String firstPart = personNr.substring(0, 6); //använder substring metoden för att få ut de 6 första
		return firstPart;                             // bokstäverna i personNr
	}

	public static String getSecondPart(String pnr) {
		String personNr = "950504-5550";
		String secondPart = personNr.substring(7, 11);
		return secondPart;
	}

	public static boolean isFemaleNumber(String pnr) {
		if (Integer.parseInt(pnr.substring(8,9)) % 2 == 0) { //kollar om nästsista siffran i personnummret är
			return true;                                   // udda eller jämnt och returnerar svar till det
		} else 
			return false;
	}

	
	public static boolean areEqual(String pnr1, String pnr2) {
		if (pnr1 == pnr2) {
			return true;
		} 
		else
			return false;
		
		public static boolean isCorrect()
		
	}
}
