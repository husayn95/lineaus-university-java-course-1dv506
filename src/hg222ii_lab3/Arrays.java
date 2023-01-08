package hg222ii_lab3;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 5 };
		int sum = sum(arr); // adderar ihop alla elementen i arr
		System.out.println("1) the sum of all elements in array arr is: " + sum);

		int[] n = { 3, 4, 5, 6, 7 };
		String str = Arrays.toString(n);
		System.out.println("\n2) Arrays utskrift: " + str);

		int[] arr3 = { 3, 7, 17 };
		int[] falt = addN(arr3, 2); // Ny array, fylls med talen 5, 9, 19.
		System.out.print("\n3) De nya siffrorna är följande: ");
		for (int i = 0; i < falt.length; i++) {
			System.out.print((falt[i] + ","));
		}

		int[] arrNew = { 2, 4, 5, 6, 8, 7 };
		int[] reversedArr = reverse(arrNew);

		System.out.print("\n\n4) Elementerna baklänges i arrayen: ");
		for (int i : reversedArr) { // skriver ut elementen i arrNew baklänges
			System.out.print(i + ", ");
		}

		int g = 4;
		int[] arr4 = { 4, 3, 2, 5 };
		System.out.println("\n\n5) boolean metoden: " + hasN(arr4, g));

		int[] arr2 = { 5, 4, 2 };
		int old = 4;
		int nw = 7;
		replaceAll(arr2, old, nw);
		System.out.println("\n6) arr2 när elementen old har ersatts med nw: " + toString(arr2));

		int[] number = { 3, 5, 2, 1, 7 };
		int[] hi = sort(number);
		System.out.print("\n7) Arrayen number efter att ha sorterats i storleksordning: ");
		for (int i = 0; i < hi.length; i++) // itererar tills talen är i storleksordning
			System.out.print(hi[i] + ","); // Skriver ut talen i storleksordning
		
		
		int[] a = {7, 5, 3, 1};
		int[] d = { 5, 3, 1};
		System.out.println("\n\n8) Does a have subsequence of d?: " + hasSubsequence(a, d) + "\n");

		int[] c = {1,4,3};
		int[] e = {1,2,3,5};
		//isLarger(c, e);
		System.out.print("9) ");
		System.out.println("   "+isLarger(c,e));
	}

	
	
	
	
	
	
	public static int sum(int[] arr2) {
		int sum = 0;
		for (int i : arr2) {
			sum += i;
		}
		return sum;
	}

	public static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for (int i = 0; i < reverse.length; i++) {
			reverse[i] = arr[arr.length - 1 - i];
		}
		return reverse;
	}

	public static int[] addN(int[] arr, int n) {

		int[] addN2 = new int[arr.length];
		for (int k = 0; k < addN2.length; k++) {
			addN2[k] = arr[k] + n;
		}
		return addN2;
	}

	public static int[] replaceAll(int[] arr, int old, int nw) {

		for (int i = 0; i < arr.length; i++) { // itererar genom all elementen i arr
			if (arr[i] == old) { // och kollar om den är lika med old eller nw
				arr[i] = nw; // om de är lika så byter den plats på dem
			}
		}
		return arr;
	}

	public static String toString(int[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) // Omvandlar varje element i arr
			str += arr[i] + ","; // till sträng
		return str;
	}

	public static boolean hasN(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) { // itererar genom alla elementen i arr
			if (arr[i] == n) // och kollar om nån av de är lika med n
				return true;
		}
		return false;
	}

	public static int[] sort(int[] arr) {
		int[] number = { 3, 5, 2, 1, 7 };
		int temp;
		boolean fixed = false;
		while (fixed == false) {
			fixed = true;

			for (int i = 0; i < number.length - 1; i++) {
				if (number[i] > number[i + 1]) {
					temp = number[i + 1];
					number[i + 1] = number[i];
					number[i] = temp;
					fixed = false;
				}
			}
		}
		return number;

	}


	public static boolean hasSubsequence(int[] arr, int[] sub) { 

		String array = ""; /* bilda två sträng*/

		String subsequence = "";

		for (int i = 0; i < arr.length; i++) { 

			array = array + arr[i]; //addera elementerna från parametern int[] arr till strängen array
		}

		for (int i = 0; i < sub.length; i++) {

			subsequence = subsequence + sub[i]; //addera elementerna från parametern int[] sub till subsequence
		}

		return array.contains(subsequence); //returnerar true om strängen array har sekvens som subsequence
	}
	
	public static boolean isLarger(int[] a1, int[] a2)
	{
		
		for (int i = 0; i < a1.length; i++) {				
			if (a1[i] > a2[i]) {
				System.out.println("{"+Arrays.toString(a1)+"}" +" is larger since " + a1[i] + " > " + a2[i]);
				return true;
				}	
			else if (a1[i] == a2[i]) {
				;}

			else if(a1[i] < a2[i]) {
					System.out.println("The second array is larger");
				return false;}
				
		}
		
		if (a1.length > a2.length) {
			System.out.println("{"+Arrays.toString(a1)+"}"+" is larger because it is longer");
			return true;	
		}
		else if (a1.length < a2.length) {
			System.out.println("{"+Arrays.toString(a2)+"}" + " is larger because it is longer");
		return false;
		}
//		else if (a1.length == a2.length) {
//		System.out.println("They are equal!");
		//}
		return false;
	} 
}