package hg222ii_lab3;

public class Card {

	

	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	}

	public enum Rank {
		Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
	}

	public Rank rank; 
	public Suit suit;
	
	public Rank getRank() { 
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {   //Uppdaterar suit
		this.suit = suit;
	}

	public void setRank(Rank rank) { // Uppdaterar rank
		this.rank = rank;
	}


	public Card(Suit suit, Rank rank) { //Konstruktorn tar parametrar
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() { 
		return rank + ": " + suit;
	}

}


