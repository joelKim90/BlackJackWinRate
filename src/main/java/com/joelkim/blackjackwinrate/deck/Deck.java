package com.joelkim.blackjackwinrate.deck;

import java.util.ArrayList;

import com.joelkim.blackjackwinrate.exceptions.CardInfoIncorrectException;

public class Deck {
	private String[] suits = {"Club", "Clover", "Diamond", "Heart"};
	public int reshuffleIndicator;
	private int numberOfDecks;
	
	public ArrayList<Card> deck = new ArrayList<Card>();

	
	//default # of decks = 2
	public Deck() {
		setNumberOfDeck(2);
		setReshuffleIndicator();
		for(int decks = 0; decks < numberOfDecks; decks++) {
			createDeck();
		}
	}
	
	public Deck(int numberOfDecks) {
		setNumberOfDeck(numberOfDecks);
		setReshuffleIndicator();
		for(int decks = 0; decks < numberOfDecks; decks++) {
			createDeck();
		}
	}
	
	public void createDeck() {
		for(int numIndex = 1; numIndex <= 13; numIndex++) {
			for(int suitIndex = 0; suitIndex < 4; suitIndex++) {
				try {
					deck.add(new Card(numIndex, suits[suitIndex]));
				} catch (CardInfoIncorrectException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Card> getDeck() {
		return this.deck;
	}
	public void setNumberOfDeck(int numberOfDeck) {
		this.numberOfDecks = numberOfDeck;
	}
	
	public int getNumDeck() {
		return numberOfDecks;
	}

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		//deck.createDeck();
		
		ArrayList<Card> one = deck.getDeck();
		
		for(int i = 0; i<one.size(); i++) {
			Card c = one.get(i);
			System.out.println(c.getNumber() + " of " + c.getSuit());
		}
		
	}
	
	public void setReshuffleIndicator() {
		//Give min value at 104 since you don't want to reshuffle with less than 2 dekcs
		this.reshuffleIndicator = (int) (Math.random() * (this.numberOfDecks * 52)-1) + 104;
	}
	
	public int getReshuffleIndicator() {
		return this.reshuffleIndicator;
	}
}
