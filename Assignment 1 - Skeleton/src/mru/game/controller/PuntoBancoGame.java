package mru.game.controller;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	
	public void runGame() {
		
		
		//CardDeck set up, make into class
		System.out.println("Your Deck");
		CardDeck myDeck = new CardDeck();
		Card currentCard = myDeck.getDeck().remove(0);
		
		System.out.println(currentCard);
		
		currentCard = myDeck.getDeck().remove(0);
		System.out.println(currentCard);

		System.out.println(myDeck.getDeck().size());
		
		
		
		//Bankers card deck 
		System.out.println("Bankers Deck");
		CardDeck bankDeck = new CardDeck();
		Card bankCurrent = myDeck.getDeck().remove(0);
		
		System.out.println(bankCurrent);
		
		currentCard = bankDeck.getDeck().remove(0);
		System.out.println(bankCurrent);

		System.out.println(bankDeck.getDeck().size());
	}
}
