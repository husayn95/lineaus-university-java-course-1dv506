package hg222ii__lab3;

public class DateFormat {

	private int year;
	private int month;
	private int day;
	private char punctuation;
	private char format;
	private String date;

	public DateFormat(int i, int j, int k, char c, char d) {
		year = i;
		month = j;
		day = k;
		punctuation = c;
		format = d;

	}

	public DateFormat(int i, int j, int k) { //constructor without punctuation to be used in SwedishID class
		year = i;
		month = j;
		day = k;

	}
	
	public DateFormat() {

	}

	public void setYear(int i) {
		year = i;

	}

	public void setMonth(int i) {
		month = i;

	}

	public void setDay(int i) {
		day = i;

	}

	public void setPunctuation(char c) {
		punctuation = c;

	}

	public void setFormat(char c) {
		format = c;

	}

	public String getDate(boolean fullYear) {
		String d = Integer.toString(year).substring(2, 4); // get only two last digits of the year

		String strDay = Integer.toString(day);
		String strMonth = Integer.toString(month);
		String strYear = Integer.toString(year);

		if (fullYear == false) { // returns only the last two digits of the year if fullYear is set to false.
			strYear = d;
		}

		if (day <= 9) { // prints a leading zero to day if day is set below 10
			String dayFormatted = String.format("%02d", day);
			strDay = dayFormatted;

		}

		if (month <= 9) { // prints a leading zero to month if month is set below 10
			String monthFormatted = String.format("%02d", month);
			strMonth = monthFormatted;

		}
		date = strYear + strMonth+strDay;
		


		
		if (punctuation == '!') { // sets the character ! to null so that it won't be any spaces between digits
			Character ch = Character.MIN_VALUE;
			punctuation = ch;
		}

		
		//* for some reason these two if statements gave me error in SwedishID Main, even though I used over there 
		//a constructor without punctuation or format
		
//		if (punctuation != '/' || punctuation != '!' || punctuation != '-') { // gives error message if punctuation is
//																				// set to anything than these
//			date = "Invalid punctuation";
//		}
//		if (format != 'b' || format != 'l' || format != 'm') { //// gives error message if format is set to anything
//																//// than these
//			date = "Invalid format";
//		}

		
		if (format == 'b') {
			date = strYear + "" + punctuation + strMonth + punctuation + strDay;
		}
		if (format == 'l') {
			date = strDay + "" + punctuation + strMonth + punctuation + strYear;

		}
		if (format == 'm') {
			date = strMonth + "" + punctuation + strDay + punctuation + strYear;

		}

		
		if (year < 1900 || year > 2100) { // sets the year between 1900 and 2100 and also automatically forces the year
											// input to be in 4 digits
			date = "Invalid year"; // and informs if exceeded
		}
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && month == 2) { // checks for leapyear
			if (day > 29) // warns if day exceeds 29
				date = "Invalid date! February has maximum 29 days in leapyears";
		}
	
		else if (month == 1 && day > 31 || month == 2 && day > 28 || month == 3 && day > 31 || month == 4 && day > 30
				|| month == 5 && day > 31 || month == 6 && day > 30 || month == 7 && day > 31 || month == 8 && day > 30
				|| month == 9 && day > 30 || month == 10 && day > 31 || month == 11 && day > 30
				|| month == 12 && day > 31) { //check months and their days
			
			date = "Invalid date";}
		
		
		if (month > 12 || month < 1) {
			date = "Invalid month";
		}
		if (day > 31 || day < 1) {
			day = 0;
			date = "Invalid day";
		}

		
		  

		
		
		
//		if (format == 'b' && fullYear == true && punctuation == '/') { //check format and punctuatation when fullYear is true
//			date = year + "/" + month + "/" + day;
//		}
//		else if (format == 'l' && fullYear == true && punctuation == '/') {
//			date = day + "/" + month + "/" + year;
//		} else if (format == 'm' && fullYear == true && punctuation == '/') {
//			date = month + "/" + day + "/" + year;
//		}
//
//		else if (format == 'b' && fullYear == true && punctuation == '!') {
//			date = year + "" + month + "" + day;
//		} else if (format == 'l' && fullYear == true && punctuation == '!') {
//			date = day + "" + month + "" + year;
//		} else if (format == 'm' && fullYear == true && punctuation == '!') {
//			date = month + "" + day + "" + year;
//		}
//
//		else if (format == 'b' && fullYear == true && punctuation == '-') {
//			date = year + "-" + month + "-" + day;
//		} else if (format == 'l' && fullYear == true && punctuation == '-') {
//			date = day + "-" + month + "-" + year;
//		} else if (format == 'm' && fullYear == true && punctuation == '-') {
//			date = month + "-" + day + "-" + year;
//		}
//		else if (format == 'b' && fullYear == true && punctuation == ' ') {
//			date = year + "" + month + "" + day;
//		} else if (format == 'l' && fullYear == true && punctuation == ' ') {
//			date = day + "" + month + "" + year;
//		} else if (format == 'm' && fullYear == true && punctuation == ' ') {
//			date = month + "" + day + "" + year;
//		}
//
//		else if (format == 'b' && fullYear == false && punctuation == '/') { //check format and punctuatation when fullYear is false
//			date = d + "/" + month + "/" + day;
//		} else if (format == 'l' && fullYear == false && punctuation == '/') {
//			date = day + "/" + month + "/" + d;
//		} else if (format == 'm' && fullYear == false && punctuation == '/') {
//			date = month + "/" + day + "/" + d;
//		}
//
//		else if (format == 'b' && fullYear == false && punctuation == '!') {
//			date = d + "" + month + "" + day;
//		} else if (format == 'l' && fullYear == false && punctuation == '!') {
//			date = day + "" + month + "" + d;
//		} else if (format == 'm' && fullYear == false && punctuation == '!') {
//			date = month + "" + day + "" + d;
//		}
//
//		else if (format == 'b' && fullYear == false && punctuation == '-') {
//			date = d + "-" + month + "-" + day;
//		} else if (format == 'l' && fullYear == false && punctuation == '-') {
//			date = day + "-" + month + "-" + d;
//		} else if (format == 'm' && fullYear == false && punctuation == '-') {
//			date = month + "-" + day + "-" + d;
//		}
//

//		


		return date;
	}

}
