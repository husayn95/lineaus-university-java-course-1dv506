package hg222ii__lab3;

import java.util.ArrayList; 
import java.util.Arrays;

public class SwedishID {

	private int checkSum;
	private boolean valid;
	private String fullID;
	private String birthdayPart;
	private DateFormat birthday;
	private int year;
	private int month;
	private int day;	
	private int birthdaypart;

	public SwedishID(String str) {
		 year = Integer.parseInt(str.substring(0, 4));
		 month = Integer.parseInt(str.substring(4,6));
		 day = Integer.parseInt(str.substring(6, 8));
		  birthday = new DateFormat(year, month, day);
		 checkSum = Integer.parseInt(str.substring(9, 13));

		 birthdayPart = birthday.getDate(true);
		 str = birthday.getDate(true)+"-"+checkSum;
		 fullID = str; birthdaypart = Integer.parseInt(birthdayPart);
	}

	public void checkBirthdayPart() {
	System.out.println(fullID);

	}

	public boolean isFemale() {
		if (Character.isDigit(fullID.charAt(11)) && fullID.charAt(11) % 2 == 0) {
			return true;
		}

		return false;
	}

	public int comparedTo(SwedishID dates) {
		
		if(birthdaypart == dates.birthdaypart) { //returns 0 if they are both equal
			return 0;}
		else if (birthdaypart > dates.birthdaypart) { //returns 1 if first id is larger
			return 1;
		}
		else // else returns -1 if first id is smaller
		return -1; 

			
			}

	public String showID() {
		return fullID;
	}

	public boolean validID() { //Uses the Luhn algoritm to calculate
		
		StringBuilder date1 = new StringBuilder(fullID);
				date1.delete(0, 2); //deletes first two digits

		date1.deleteCharAt(6); // deletes the "-"
		date1.deleteCharAt(9); // also removes the last digit out of the equation



		String[] integerStrings = date1.toString().split(""); // converts from string to string array which will return
		                                                      // each string in a string array.
		//	System.out.println(Arrays.toString(integerStrings)); //This string array would also include 
			                                                     // the punctuation from DateFormat	between the dates 
																 // for some weird reason

		int[] integers = new int[integerStrings.length];  // Makes the integer array.
		
		
		for (int i = 0; i < integers.length; i++) {
			integers[i] = Integer.parseInt(integerStrings[i]);
		}

		for (int j = 0; j < integers.length; j += 2) { // multiplies the every other digit in integers (ie in ID) by 2, starting
														// from the first one
			integers[j] = integers[j] * 2;
		}

		ArrayList<Integer> test2 = new ArrayList<Integer>();
		for (int i = integers.length - 1; i >= 0; i--) { // seperate all the numbers in integers to individual digits
			int temp = integers[i];
			while (temp > 0) {
				test2.add(0, temp % 10); // place low order digit in array
				temp = temp / 10; // remove low order digit from temp;
			}
		}

		int sum1 = 0;
		for (int i = 0; i < test2.size(); i++) { // sum of all the digits in test2, ie all the digits in the ID except
													// the last one
			sum1 += test2.get(i);
		}

		String s = Integer.toString(checkSum); 
		int lastNumber = Integer.parseInt(s.substring(3)); //takes out last digit of checksum/ID
		lastNumber = (10 - (sum1 % 10)) % 10;  // The sum is then subtracted from the nearest tens, or from itself if it is
											// evenly divisible by 10.
		                                     // This can be described as a modulus operation.
		                                      // This module is the last part of the Luhn algorithm to calculate the controlNumber.

		if (lastNumber == Character.getNumericValue(fullID.charAt(12))) // checks if controlNumber is equal to the last digit of
																	// the ID
		{
			valid = true;
		} 
		else
			valid = false;

		return valid;
	}

	public static void main(String[] args) {
		String i = "hello" + "fss";
		String[] o = i.split("");

		System.out.println(Arrays.toString(o));
	}
}