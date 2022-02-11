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
	 
	 ArrayList<Card> bankHand;
	 ArrayList<Card> playerHand;
	 
	 Card firstCardPlayer;
	 Card firstCardBank;
	 
	 int pCardValue = 0;
	 int bCardValue = 0;
	 
	public PuntoBancoGame() {
		bankHand = new ArrayList<>();
		playerHand = new ArrayList<>();
	}
	
	Scanner uInput = new Scanner(System.in);
	   
    public String runGame() {
        boolean winner;
        int bank = 0;
        int playerH = 0;
        String title = "\n                        -- PLAYER INFO -- \n"+
                        "++"+" = ".repeat(10) + "+"+" = ".repeat(10)+"++\n\n";
        System.out.println(title);
        

        step1();
        


        return "";    
     }
   
	//step 1 player and bank gets card
	public void step1() {
		Card pFirstCard = myDeck.getDeck().get(0);
		Card bFirstCard = myDeck.getDeck().get(1);
		
		playerHand.add(pFirstCard);
		bankHand.add(bFirstCard);

		
		//adding the cards of the player
		addingPlayersCard();
		addingBankerCard();

	}	
	
	public int addingPlayersCard() {
		
		//adding the cards of the player
		String playersCards1 = playerHand.get(0).toString();
		Scanner parsePlayer1 = new Scanner(playersCards1);
		
		if(parsePlayer1.hasNextInt()) {
			pCardValue += parsePlayer1.nextInt();
		} else if (playersCards1.contains("King") || playersCards1.contains("Queen") || playersCards1.contains("Jack")) {
			pCardValue += 10;
		} else if (playersCards1.contains("Ace")) {
			pCardValue +=  1;
		}
		System.out.println("Player card value: " + pCardValue);
		parsePlayer1.close();
		return pCardValue;
	}
	
	public int addingBankerCard() {
		//adding the cards of the banker
				String bankersCards1 = bankHand.get(0).toString();
				Scanner parseBanker1 = new Scanner(bankersCards1);	
				if(parseBanker1.hasNextInt()) {
					bCardValue += parseBanker1.nextInt();
				} else if (bankersCards1.contains("King") || bankersCards1.contains("Queen") || bankersCards1.contains("Jack")) {
					bCardValue += 10;
				} else if (bankersCards1.contains("Ace")) {
					bCardValue += 1;
				}
				System.out.println("Bank card value: " + bCardValue);
				parseBanker1.close();
				return bCardValue;
	}
	
	//step 3 if player OR banker card total adds to 8 or 9, no cards are dealt skip to 6
	//step 4 if player has card total value 0-5, give player third card
	
	//step 5 if step 4 is true, give banker 3rd card
	
 /* a. If the Player did not draw a card, the Banker draws if he (the Banker) has 0-5, and stands if 
	he has 6-7.
	
	b. If the Player drew a 2 or 3, the Banker draws if he (the Banker) has 0-4, and stands if he has 
	5-7.
	
	c. If the Player drew a 4 or 5, the Banker draws if he has 0-5, and stands if he has 6-7.
	
	d. If the Player drew a 6 or 7, the Banker draws if he has 0-6, and stands if he has 7.
	
	e. If the Player drew an 8, the Banker draws if he has 0-2, and stands if he has 3-7.
	
	f. If the Player drew an Ace, 9, 10, or face card (Jack, Queen or King), the Banker draws if he 
	has 0-3, and stands if he has 4-7
*/
	
	//step 6 player wins if his total beats banker and vice versa. if tie result is tie


    
}