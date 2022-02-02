package mru.game.view;

import java.util.Scanner;

import mru.game.model.Player;

public class AppMenu {

	/**
	 * This class will be used to show the menus and sub menus to the user
	 * It also prompts the user for the inputs and validates them 
	 */
	Scanner input;
	
	public AppMenu() {
		input = new Scanner(System.in);
	}
	
	// Main menu
	public char showMainMenu() {
		System.out.println("Select one of these options: ");
		System.out.println("(P) Play Game");
		System.out.println("(S)	Search");
		System.out.println("(E) Exit");
		System.out.println("Enter a choice: |");
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	
	// Sub Menu
	public char showSubMenu() {
		System.out.println("Select one of these options: ");
		System.out.println("(T) Top player (Most number of wins)");
		System.out.println("(N)	Looking for name");
		System.out.println("(B) Back to Main menu");
		System.out.println("Enter a choice: |");
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	
	// Name Prompt
	public String promptName() {
		System.out.println("Enter name: ");
		String name = input.nextLine().trim();
		
		return name;
	}
	
	public void showPlayer(Player ply) {
		System.out.println(ply);
	}

}


