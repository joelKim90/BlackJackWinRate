package com.joelkim.blackjackwinrate.actions;

import java.util.ArrayList;

import com.joelkim.blackjackwinrate.players.*;

public class PlayersOnTable {
	//private Player firstPlayer = null;
	
	private ArrayList<Player> playersOnTable = new ArrayList<Player>();
	
	public PlayersOnTable() {
		//default 5 players and you will be the first player (leftmost)
		setPlayersOnTable(5, 1);
	}
	
	public PlayersOnTable(int numPlayers, int whereYouAt) {
		setPlayersOnTable(numPlayers, whereYouAt);
	}
	
	public void setPlayersOnTable(int numPlayers, int whereYouAt) {
		for(int i=0; i<numPlayers; i++) {
			if(i == whereYouAt-1) {
				Player you = new Player(true);
				playersOnTable.add(i, you);
			}
			else {
				Player player = new Player();
				playersOnTable.add(i, player);
			}	
		}
	}
	
	public ArrayList<Player> getPlayersOnTable() {
		return this.playersOnTable;
	}
}
