package com.joelkim.blackjackwinrate.game;

import com.joelkim.blackjackwinrate.deck.*;
import com.joelkim.blackjackwinrate.actions.*;

public class Game {
	public Game() {
		executeGame(2, 6);
	}
	
	public Game(int numDeck, int numPlayer) {
		executeGame(numDeck, numPlayer);
	}
	
	public void executeGame(int numDeck, int numPlayer) {
		ShuffledDeck deck = new ShuffledDeck(numDeck);
		//Player
	}
}
