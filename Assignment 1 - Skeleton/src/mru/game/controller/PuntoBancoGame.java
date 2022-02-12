package mru.game.controller;

import java.util.ArrayList;

public class PuntoBancoGame {
	
	/**
	 * In this class you implement the game
	 * You should use CardDeck class here
	 * See the instructions for the game rules
	 */
	private CardDeck deck;
	private ArrayList<Card> playerCards;
	private ArrayList<Card> bankCards;
	
	
	public PuntoBancoGame() {
		deck = new CardDeck();
		playerCards = new ArrayList<>();
		bankCards = new ArrayList<>();
	}
	
	/**
	 * Will run entire program through here and return string to gameManager to see if bet is correct
	 * @return
	 */
	public String runGame() {
		pGame();
		return "";
	}
	
	/**
	 * Checks who has higher score and returns int
	 * @param playerScore
	 * @param bankerScore
	 * @return whoWon
	 */
	public int findWinner(int playerScore, int bankerScore) {
		int whoWon = 0;
		
		if(playerScore < bankerScore) {
			System.out.println("Banker won");
			return whoWon = 1;
		
		} else if (bankerScore < playerScore) {
			System.out.println("Player won");
			return whoWon = 2;
		
		} else {
			System.out.println("Tie both scores were equal");
		}
		
		return whoWon;
	}
	
	/**
	 * getScore of card
	 * @param hand
	 * @return total value modulo 10
	 */
	private int getScore(ArrayList<Card> hand) {
		int totalValue = 0;
		for (Card card: hand) {
			totalValue += getCardValue(card);
		}
		System.out.println(totalValue);
		return totalValue % 10;
	}
	
	/**
	 * getting card value
	 * @param card
	 * @return
	 */
	private int getCardValue(Card card) {
		int rank = card.getRank();
		// checks if rank is between 2-9. No face value cards
		if (rank >= 2 && rank <= 9) {
			return rank;
		}
		// Face value cards
		if (rank >= 10) {
			return 0;
		}
		
		// Ace value
		if (rank == 1) {
			return 1;
		}
		return rank;
	}
	

	/**
	 * Run game itself
	 * @return findWinner
	 */
	public int pGame() {
		
		int pbFirstCards = 0;
		
		// Deal first 2 cards to bank and player
		while (pbFirstCards < 2) {
			playerCards.add(deck.getRandomCard());
			bankCards.add(deck.getRandomCard());
			pbFirstCards++;
		}

		// get scores
		int playerScore = getScore(playerCards);
		int bankScore = getScore(bankCards);
		
		// Check scores, sequence 5
		if(playerScore >= 8 || bankScore >= 8) {
			System.out.println("PLAYER POINTS" + getScore(playerCards));
			System.out.println("BANKER POINTS" + getScore(bankCards));
			System.out.println("\n");
			return findWinner(playerScore, bankScore);
		}
	
		return findWinner(getScore(playerCards), getScore(bankCards));
	}
}


