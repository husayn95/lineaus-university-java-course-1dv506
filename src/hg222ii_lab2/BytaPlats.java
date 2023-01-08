package hg222ii_lab2;
//Uppgift 10

public class BytaPlats {
	public static void main(String[] args) {
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };
		
		System.out.println("Text: ");
		System.out.println(text);
		System.out.println("\nEfter att elementerna i text har bytt plats: ");
		char[] reverse = new char[text.length];
		for(int i=0; i<reverse.length; i++) {
			reverse[i] = text[reverse.length-1-i];
			System.out.print(reverse[i]);
		}
		
//		int s=1;
//		for (int n =1; n<=7; n++)
//		{
//			s=s+n;
//			System.out.print(s + " ");
//		}

	}
}
