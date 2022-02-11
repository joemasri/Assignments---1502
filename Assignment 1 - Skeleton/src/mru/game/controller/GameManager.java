package mru.game.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import mru.game.model.Player;
import mru.game.view.AppMenu;

public class GameManager {
	
	/* In this class toy'll need these methods:
	 * A constructor
	 * A method to load the txt file into an arraylist (if it exists, so you check if the txt file exists first)
	 * A save method to store the arraylist into the the txt file 
	 * A method to search for a player based their name
	 * A method to find the top players
	 * Depending on your designing technique you may need and you can add more methods here 
	 */
	
	private final String FILE_PATH = "res/CasinoInfo.txt";
	ArrayList<Player> players;
	AppMenu appLaun;
	AppMenu appLaunc;
	PuntoBancoGame pbGame;
	private int initalNumOfWinners = 0;

	public GameManager() throws Exception {
		players = new ArrayList<>();
		appLaun = new AppMenu();
		loadData();
		launchApplication();
	}

	private void launchApplication() throws IOException {
		
		boolean isMenu = true;
		char option;
		
		while(isMenu) {
		option = appLaun.showMainMenu();
			switch (option) {
			case 'p':
				playGame();
				break;
			case 's':
				Search();
				break;
			case 'e':
				Exit();
				isMenu = false;
			default:
				break;
			}
		}
	}
	
	private void playGame() {
		String name = appLaun.promptName();
		Player p = lookForName(name);
		
		if(p == null) {
			String id = appLaun.promptId();
			players.add(new Player (name, id, initalNumOfWinners));
			System.out.print("New player created, \n");
            System.out.print("Welcome " + name + " your balance is: $" + 100 + "\n");
		} else {
			 System.out.print("Welcome back " + name + "\nYour balance is: $" + p.getBalance() + "\n");
		}

		//running the method to 
		appLaun = new AppMenu();
		appLaunc = new AppMenu();
		appLaunc.betAmount();
		appLaun.showPlayerBet();

		pbGame = new PuntoBancoGame();
		pbGame.runGame();
	}
	

	// LAUNCHES SUB MENU
	private void Search() {
	char option = appLaun.showSubMenu();
		switch (option) {
		case 't':
			findTopPlayer();
			break;
		case 'n':
			String name = appLaun.promptName();
			Player ply = lookForName(name);
			appLaun.showPlayer(ply);
			break;
		case 'b':
			break;
		}
		
	}
	
	// Print to file writer and close program
	private void Exit() throws IOException {
		File casInf = new File(FILE_PATH);
		PrintWriter pw = new PrintWriter(casInf);
		
		System.out.println("Saving");
		
		// for each player, inside the players(array list) do this
		for (Player p: players) {
			pw.println(p.format());
		}
		pw.close();
	}
	
	// Find Name of Top Player
	private void findTopPlayer() {
		//Player play = new Player(FILE_PATH, 0, 0);
		Player play = new Player(FILE_PATH,"0", 0);

        for(Player p: players) {
            if(p.getNumOfWins()>play.getNumOfWins()) {
                play=p;
                if(p.getNumOfWins()==play.getNumOfWins()) {

                }
            }
        }
      
        System.out.println(play);
	}

	// LAUNCHES NAME SEARCH FROM SUBMENU
	private Player lookForName(String name) {
		Player ply = null;
		
		for (Player p: players) {
			if (p.getName().equals(name)) {
			ply = p;
			break;
		}
	}
	return ply;
}

	// Loads data
	private void loadData() throws IOException {
		File casInf = new File(FILE_PATH);
		
		// Current Line
		String currentLine;
		
		// Array to split certain characters from line
		String[] splittedLine;
		
		// Checks if txt file exists
		if(casInf.exists()) {
			
			// Reads each line and splits based on the semi colon
			Scanner fileReader = new Scanner(casInf);
			while (fileReader.hasNextLine()) {
				
				// Reads the first line
				currentLine = fileReader.nextLine();
				
				// Splits line after reading - when program sees semi colon it chops it off
				splittedLine = currentLine.split(";");
				
				// Name, balance, numOfWins from player class
				Player p = new Player(splittedLine[0], splittedLine[1], Integer.parseInt(splittedLine[2]));
				players.add(p);
			}
			
			fileReader.close();
		}
		
	}

}
