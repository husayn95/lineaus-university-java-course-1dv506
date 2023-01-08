package sortera_orter;

import java.text.DecimalFormat;

public class ort implements Comparable<ort>{
	/** Decimal format to print leading zeros in zip code */
	static DecimalFormat zipFormat = new DecimalFormat("00000");
	/* declare fields */
	private String name;
	private int zipcode;

	/* constructor */
	public ort(int zip, String name) {
		this.name = name;
		this.zipcode = zip;
	}
	
	
	public String getName() { // represent name
		return name;
	}

	public int getZipCode() {        // represent zipcode
		return zipcode;
	}

	public void setName(String name) { //update name
		this.name = name;
	}

	public void setZipCode(int zipcode) {   // update zipcode
		this.zipcode = zipcode;
	}

	/* Represent city and its zipcode */
	public String toString() {
		return (ort.zipFormat.format(this.zipcode) + " " + this.name);
	}

	/* For Ascending order */
	public int compareTo(ort s1) {
		ort s2 = (ort) s1;
		if (getZipCode() > s2.getZipCode()) {
			return 1;
		} else if (getZipCode() < s2.getZipCode()) {
			return -1;
		} else {
			return 0;
		}

	}
}
