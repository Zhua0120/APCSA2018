package Elevens;

public class Card {

	private String suit;

	private String rank;

	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) {
    rank  = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;	}

	public String suit() {
	  return suit;	
	}	

	public String rank() {
    return rank;
  }

	public int pointValue() {
    return pointValue;
  }

	public boolean matches(Card otherCard) {
	if(rank == otherCard.rank() && suit == otherCard.suit() && pointValue == otherCard.pointValue()){
			return true;	
	  }
	 else {
	   return false;
	 }
	}

	@Override
	public String toString() {
    String output = "";
		output = output + rank + " of " + suit + " (point value = "+pointValue +")\n";
		return output;
	}
}

	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int pointValue() {
		return pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		boolean match = false;
		if (suit.equals(otherCard.suit) && rank.equals(otherCard.rank) && pointValue==otherCard.pointValue){
			match = true;
		}
		return match;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		String output = rank + " of " + suit + " (point value = " + pointValue + ")";
		return output;
	}
}