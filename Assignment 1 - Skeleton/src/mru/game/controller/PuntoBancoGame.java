package mru.game.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	CardDeck myDeck = new CardDeck();
	
	Scanner uInput = new Scanner(System.in);
	ArrayList<Card> bank = new ArrayList<>();
	ArrayList<Card> playerH = new ArrayList<>();
	
	public void runGame() {
		boolean winner;
		
		int bank = 0;
		int playerH = 0;
		
		String title = "\n              		 PUNTO --- BANCO \n"+
						"++"+" = ".repeat(10) + "+"+" = ".repeat(10)+"++";
		System.out.println(title);
	}
}


/*//CardDeck set up, make into class
CardDeck myDeck = new CardDeck();
Card currentCard = myDeck.getDeck().remove(0);

System.out.println(currentCard);

currentCard = myDeck.getDeck().remove(0);
System.out.println(currentCard);

System.out.println(myDeck.getDeck().size());*/