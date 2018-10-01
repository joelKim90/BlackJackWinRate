package com.joelkim.blackjackwinrate.actions;

import java.util.ArrayList;

import com.joelkim.blackjackwinrate.deck.Card;
import com.joelkim.blackjackwinrate.deck.Deck;

public class ShuffledDeck {
	private Card firstCard = null;
	
	public ShuffledDeck() {
		Deck deck = new Deck();
		ArrayList<Card> deckArr = deck.getDeck();
		
		
	}
	
	public void shuffle(int sizeOfDeck, ArrayList<Card> deckArr) {
		for(int i = sizeOfDeck-1; i >= 0; i--) {
			int rand = (int) (Math.random()*sizeOfDeck);
			
			if(firstCard == null) {
				firstCard = deckArr.get(rand);
				deckArr.remove(rand);
			}
			else {
				Card temp = firstCard;
				firstCard = deckArr.get(rand);
				firstCard.nextCard = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i=99; i>=0; i--) { 
			System.out.println((int) (Math.random()*52));
		}
		
		
	}
}
