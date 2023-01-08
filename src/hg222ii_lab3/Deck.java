package hg222ii_lab3;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	private int currentCard;

	
	public Deck() {
		currentCard = 0;
		for (int i = 0; i < Card.Suit.values().length; i++) {
			for (int j = 0; j < Card.Rank.values().length; j++) {
				Card deck = new Card(Card.Suit.values()[i], Card.Rank.values()[j]);
				cards.add(deck);
				
			}
		}

	}

	

	public void shuffle() {                //Blandar korten		
		Collections.shuffle((cards));  
	}
	
	public Card dishCard() { 
		if(currentCard==cards.size()-1){
			currentCard=0;
		}
		while (currentCard <= cards.size()-1) {
			return cards.get(currentCard++);
		} 
			return null;
		}
	

	public int remainingCard() { 
		int remainingCard = cards.size() - currentCard;
		return remainingCard;
	}

}

