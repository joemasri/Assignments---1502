package mru.testAssignmentOne;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mru.game.controller.Card;
import mru.game.controller.CardDeck;
import mru.game.controller.PuntoBancoGame;
import mru.game.model.Player;

class AssignmentOneTests {

	@Test
	void newCardTest() {
		Card newCard = new Card(1, "Hearts");
		int rank = newCard.getRank();
		String suit = newCard.getSuit();
		
		if (rank !=1) {
			fail();
		} else if (suit == null) {
			fail();
		}
		
	}
	
	@Test
	void randCard() {
		CardDeck deck = new CardDeck();
		deck.getRandomCard();
		
		assertNotEquals(null, deck);
	}
	
	@Test
	void testshuffleDeck() {
		CardDeck deck = new CardDeck();
		CardDeck deck1 = new CardDeck();
		
		deck.shuffleDeck();
		deck1.shuffleDeck();
		assertNotEquals(deck, deck1);
	}
	
	@Test
	void diamondsNewCardTest() {
		Card newCard = new Card(5, "Diamonds");
		int rank = newCard.getRank();
		String suit = newCard.getSuit();
		
		if (rank != 5) {
			fail();
		} else if (suit == null) {
			fail();
		}
		
	}
	
	@Test
	void testnewDeck() {
		CardDeck deck = new CardDeck();
		assertNotNull(deck);
		
	}
	
	@Test
	void acesValueTest() {
		
		boolean isAce = true;
		
		Card aceC = new Card(1, "Clubs");
		if (!aceC.toString().equals("Ace of Clubs")) {
			isAce = false;
		}
		
		Card aceH = new Card(1, "Hearts");
		if (!aceH.toString().equals("Ace of Hearts")) {
			isAce = false;
		}
		
		Card aceS = new Card(1, "Spades");
		if (!aceS.toString().equals("Ace of Spades")) {
			isAce = false;
		}

		Card aceD = new Card(1, "Diamonds");
		if (!aceD.toString().equals("Ace of Diamonds")) {
			isAce = false;
		}


		}
	
	
	@Test
	void getBalanceTest() {
		Player balance = new Player(null, 100.0, 0);
		assertEquals(balance.getBalance(), 100.0);
	}
	
	@Test
	void getNumOfWinsTest() {
		Player numOfWins = new Player(null, 100.0, 0);
		assertEquals(numOfWins.getNumOfWins(), 0);
	}
	
	@Test
	void getPlayerNameTest() {
		Player name = new Player(null, 100.0, 0);
		assertEquals(name.getName(), null);
	}
}
