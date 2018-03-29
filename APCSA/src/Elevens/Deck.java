package Elevens;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private Card[] cards;

	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new Card[ranks.length * suits.length];
		for (int i = 0; i < suits.length; i++){
		  for(int j = 0+i*ranks.length; j < (i+1)*ranks.length; j++){
			  Card newcard = new Card(ranks[j-i*ranks.length], suits[i], values[j-i*ranks.length]);
			  cards[j]= newcard;
		}

		}
		System.out.println("Creating your shuffled deck!");
		size = cards.length;
		this.shuffle();
		this.toString();
	}

	public boolean isEmpty() {
		if(size ==0){
			return true;
		}
		return false;
	}

	public int size() {
		return this.size;
	}

	public void shuffle() {
	  size = cards.length;
		Random rng = new Random();
		for(int i=this.size()-1; i > 0; i--){
			int r = rng.nextInt(i+1);
			Card temp = this.cards[r];
			this.cards[r] = this.cards[i];
			this.cards[i]= temp;
		}
		
	}

	public Card deal() {
	  if (this.size()==0){
	    System.out.println("No cards left!");
	    return null;
	  }
		Card buffer = cards[size-1];
		size --;
		return buffer;
		
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		for(int i = 0;i < this.size();i++){
			rtn+=cards[i];
		}
		rtn += "\nDealt cards: \n";
		boolean notchanged=true;
		for (int i = this.size(); i < cards.length;i++){
		  rtn+=cards[i];
		  notchanged = false;
		}
		if(notchanged){
		  rtn+="N/A";
		}
		rtn = rtn + "\n";
		return rtn;
	}
}