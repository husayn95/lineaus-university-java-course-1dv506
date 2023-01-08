package sortera_orter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SorteraOrter {
	private static ArrayList<ort> listcity = new ArrayList<ort>(); // arraylist
	// type
	// of
	// city//

	public static void main(String[] args) {

		System.out.println("Läser orter från filen: /Users/admin/Desktop/zip_codes.txt");
		/* read file by Scanner */
		try {
			File codes = new File("/Users/admin/Desktop/zip_codes.txt");
			Scanner scan = new Scanner(codes);
   
         // add city object to arraylist 
			while (scan.hasNextLine()) {
				String st = scan.nextLine();
				int zipcode = Integer.parseInt(st.substring(0, 5));
				String name = st.substring(7, st.length());
				listcity.add(new ort(zipcode, name));
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(listcity);   // sort arraylist by implementing camparable

        // interface
		System.out.println("\nAntal funna orter: " + listcity.size());
		for (int i = 0; i < listcity.size(); i++) {   // print sorted arraylist
			System.out.println(listcity.get(i));
		}
	}
}
