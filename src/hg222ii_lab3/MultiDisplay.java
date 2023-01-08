package hg222ii_lab3;

public class MultiDisplay {

	private int totalCount;
	private String str;
	public static void main(String[] args) {

		MultiDisplay md = new MultiDisplay();

		md.setDisplayMessage("Hello World");
		md.setDisplayCount(3);
		md.display(); // ==> print-out

		md.display("Goodbye cruel world!", 2); // ==> print-out

		System.out.println("Current Message: " + md.getDisplayMessage());
	}
	
	
/** Konstruerar en multi display med tomma string.
 * 
 */
	public MultiDisplay() {
		totalCount = 0;
		str = "";
		
	}

	
	/**
	 * Konstruerar en multi display som kan läsa en sträng och en variabel.
	 * @param str2: gör en ny sträng
	 * @param count2: gör en ny variabel
	 */
	public MultiDisplay(String str2, int count2) {
		str = str2;

	}

	/**
	 * Sätter antal räkningar
	 * @param count: variabel som sätter antal räkningar
	 * @return totala antal räkningar
	 */
	public int setDisplayCount(int count) {
		totalCount = totalCount + count;
		return totalCount;
	}
	
	
/** 
 * Sätter str2 som en sträng istället för str. Mutator/set method.
 * @param str2
 */
	public void setDisplayMessage(String str2) {
		str = str2;
	}

	
	/**
	 * Skriver ut en strängen str2 så många gånger som count2 är.
	 * @param str2: en ny sträng
	 * @param count2: ny variabel
	 */
	public void display(String str2, int count2) {
		for (int i = 0; i < count2; i++)
			System.out.printf(str2 + "\n", count2);
	}

	
	/**
	 * Skriver ut en sträng så många gånger som setDisplayCount anger
	 */
	public void display() {
		// TODO Auto-generated method stub
		for (int i = 0; i < setDisplayCount(0); i++)
			System.out.println(str);
	}
	
	
	/**
	 * Accessor/get method
	 * @return returnerar den skrivna strängen
	 */
    public String getDisplayMessage() {       
		return str;
	}
	

	

}