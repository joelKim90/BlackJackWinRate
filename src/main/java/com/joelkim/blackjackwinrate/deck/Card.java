package com.joelkim.blackjackwinrate.deck;

import com.joelkim.blackjackwinrate.exceptions.CardInfoIncorrectException;

public class Card {
	private int number;
	private String suit;
	private boolean reshuffle = false;
	
	public Card nextCard = null;
	
	public Card() throws CardInfoIncorrectException {
		throw new CardInfoIncorrectException("Card number and suit is required param.");
	}
	
	public Card(int number, String suit) throws CardInfoIncorrectException{
		if(number < 1 || number > 13) {
			throw new CardInfoIncorrectException("That card number does not exist.");
		}
		
		this.number = number;
		this.suit = suit;
	}
	
	public void setNextCardInDeck(Card nextCard) {
		this.nextCard = nextCard;
	}
	
	public void reshuffle() {
		this.reshuffle = true;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getSuit() {
		return  suit;
	}
}
