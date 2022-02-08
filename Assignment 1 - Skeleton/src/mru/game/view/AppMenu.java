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
		System.out.println("Select one of these options:\n");
		System.out.println("\t(P) Play Game");
		System.out.println("\t(S) Search");
		System.out.println("\t(E) Exit\n");
		System.out.println("Enter a choice: ");
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	
	// Sub Menu
	public char showSubMenu() {
		System.out.println("Select one of these options:\n");
		System.out.println("\t(T) Top player (Most number of wins)");
		System.out.println("\t(N) Looking for name");
		System.out.println("\t(B) Back to Main menu\n");
		System.out.println("Enter a choice: ");
		char option = input.nextLine().toLowerCase().charAt(0);
		return option;
	}
	
	// Name Prompt
	public String promptName() {
		System.out.println("Enter name: ");
		String name = input.nextLine().trim().toLowerCase();
		
		return name;
	}
	
	public void showPlayer(Player ply) {
		if(ply != null)
			System.out.println(ply);
		 else 
			System.out.println("NAME NOT FOUND");
	}

	public String promptId() {
		System.out.println("Enter your ID here: ");
		String id = input.nextLine().trim();
		
		return id;
	}

}


