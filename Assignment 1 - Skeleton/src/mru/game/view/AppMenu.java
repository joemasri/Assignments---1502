package mru.game.view;

import java.util.Scanner;

public class AppMenu {

	/**
	 * This class will be used to show the menus and sub menus to the user
	 * It also prompts the user for the inputs and validates them 
	 */
	Scanner input;
	
	public AppMenu() {
		input = new Scanner(System.in);
	}
	
	public void showMainMenu() {
		System.out.println("Select one of these options: ");
		System.out.println("	(P) Play Game");
		System.out.println("	(S)	Search");
		System.out.println("	(E) Exit");
		System.out.println("Enter a choice: |");
	}
	
	public void showSubMenu() {
		System.out.println("Select one of these options: ");
		System.out.println("	(T) Top player (Most number of wins)");
		System.out.println("	(N)	Looking for name");
		System.out.println("	(B) Back to Main menu");
		System.out.println("Enter a choice: |");
	}
	
	public String promptName() {
		System.out.println("Enter name: ");
		String name = input.nextLine();
		
		return name;
	}
}
