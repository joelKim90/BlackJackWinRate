package com.joelkim.blackjackwinrate.players;

import java.util.ArrayList;

import com.joelkim.blackjackwinrate.deck.*;

public class Player {
	private ArrayList<Card> hands = new ArrayList<Card>();
	
	private int initialHand;
	private int handTotal;
	private boolean you = false;
	private boolean soft;
	private boolean split;
	
	public Player() {
		
	}
	
	public Player(boolean whereYouAt) {
		you = whereYouAt;
	}
	
	public void setInitialHandTotal() {
		int first = hands.get(0).getNumber();
		int second = hands.get(1).getNumber();
		
		if(first > 10) {
			first = 10;
		}
		
		if(second > 10) {
			second = 10;
		}
		
		if(first == 0 && second != 0) {
			first = 11;
			soft = true;
		}
		else if(first != 0 && second == 0) {
			second = 11;
			soft = true;
		}

		if(first == second && first != 10) {
			split = true;
		}
	}
	
	public void setHand(Card card) {
		hands.add(card);
	}
	
	public void setTotal() {
		for(int numHand=0; numHand<hands.size(); numHand++) {
			int currHand = hands.get(numHand).getNumber();
			
			if(currHand > 10) {
				handTotal+=10;
			}
			else if(currHand == 0) {
				
			}
		}
	}
}
