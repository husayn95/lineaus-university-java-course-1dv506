package hg222ii_lab1;
 
import java.util.Random;
public class Slumptal {

		public static void main(String[] args) {
			/* Create random generator */
			Random rand = new Random(); 
			
			int randInt = rand.nextInt(100); // Random integer mellan 0 and 100
			int rand2Int = rand.nextInt(100); // andra random talet...
			int rand3Int = rand.nextInt(100);
			int rand4Int = rand.nextInt(100);
			int rand5Int = rand.nextInt(100);
			int sum = randInt + rand2Int + rand3Int + rand4Int + rand5Int;
			
System.out.println("Fem genererade slumptal: "+ randInt + " " + rand2Int + " " + rand3Int + " " + rand4Int + " " + rand5Int);    	
 System.out.println("Slumptalens summa är: " + sum);
    	 } 	 
     }
	