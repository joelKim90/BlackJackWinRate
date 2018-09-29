package com.joelkim.blackjackwinrate.deck;

public class Deck {
	private String[] suits = {"Club", "Clover", "Diamond", "Heart"};
	
	private int numberOfDecks;
	
	//default # of decks = 2
	public Deck() {
		setDeck(2);
	}
	
	
	public void setDeck(int numberOfDeck) {
		this.numberOfDecks = numberOfDeck;
	}
}
