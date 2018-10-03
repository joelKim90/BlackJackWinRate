package com.joelkim.blackjackwinrate.actions;

import java.util.ArrayList;

import com.joelkim.blackjackwinrate.deck.Card;
import com.joelkim.blackjackwinrate.deck.Deck;

public class ShuffledDeck {
	private Card firstCard = null;
	
	public ShuffledDeck() {
		Deck deck = new Deck();
		ArrayList<Card> deckArr = deck.getDeck();
		shuffle(deckArr.size(), deckArr);
	}
	
	public ShuffledDeck(int numbDeck) {
		Deck deck = new Deck(numbDeck);
		ArrayList<Card> deckArr = deck.getDeck();
		shuffle(deckArr.size(), deckArr);
	}
	
	public void shuffle(int sizeOfDeck, ArrayList<Card> deckArr) {
		for(int i = sizeOfDeck-1; i >= 0; i--) {
			int rand = (int) (Math.random()*i);
			//System.out.println("at " + i + "rand : " + rand);
			if(firstCard == null) {
				firstCard = deckArr.get(rand);
				deckArr.remove(rand);
			}
			else {
				Card temp = firstCard;
				firstCard = deckArr.get(rand);
				firstCard.nextCard = temp;
				deckArr.remove(rand);
			}
		}
	}
	
	public Card dealCard() {
		Card temp = firstCard;
		firstCard = temp.nextCard;
		return temp;
	}
	
	public boolean checkNull() {
		return firstCard != null ? true : false;
	}
	
	public static void main(String[] args) {
		ShuffledDeck deck = new ShuffledDeck();
		int i = 1;
		while(deck.checkNull()) {
			Card card = deck.dealCard();
			System.out.println(i + ". " + card.getNumber() + " of " + card.getSuit());
			i++;
		}
		
		
	}
}
