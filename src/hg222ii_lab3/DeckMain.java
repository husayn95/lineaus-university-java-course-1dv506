package hg222ii_lab3;

public class DeckMain {
	 
		public static void main(String[] args) {
			Deck newDeck=new Deck();
			newDeck.shuffle();
			System.out.println("The cards that have been dished out:");
			for(int i=0;i<4;i++){    //Skriver ut 4 kort
				
				System.out.println(newDeck.dishCard());
				
			}
			
			int remaincard = newDeck.remainingCard();
			System.out.println("The amount of cards remaining: "+remaincard+" cards");
		}
		
}
