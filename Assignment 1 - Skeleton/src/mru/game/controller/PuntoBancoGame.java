package mru.game.controller;

import java.util.ArrayList;

import mru.game.model.Player;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	
	public static void main(String[] args) {
	
	//CardDeck set up
	CardDeck myDeck = new CardDeck();
	Card currentCard = myDeck.getDeck().remove(0);
	
	System.out.println(currentCard);
	
	currentCard = myDeck.getDeck().remove(0);
	System.out.println(currentCard);

	System.out.println(myDeck.getDeck().size());
	
	}
}
