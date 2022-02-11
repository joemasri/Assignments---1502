package mru.game.model;

public class Player {
	
	/**
	 * This class represent each player record in the Database
	 * It is basically a model class for each record in the txt file
	 */
	// change balance to double
	
	String name;
	double balance;
	int numOfWins;
	
	/**
	 * Player constructor
	 * @param name
	 * @param splittedLine
	 * @param numOfWins
	 */
	public Player(String name, double balance, int numOfWins) {
		this.name = name;
		this.balance = balance;
		this.numOfWins = numOfWins;
	}
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Setter for balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Setter for numOfWin
	 * @param numOfWins
	 */
	public void setNumOfWins(int numOfWins) {
		this.numOfWins = numOfWins;
	}
	
	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter for balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Getter for numOfWins
	 * @return numOfWins
	 */
	public int getNumOfWins() {
		return numOfWins;
	}
	
	public String toString() {
		return "=".repeat(20) +"\nName \n" + "-".repeat(20) +"\n" + name  +"\n"   
				 +"=".repeat(20) + "\nBalance \n " + "-".repeat(10) + "\n" + balance + "\n" +"=".repeat(20) + 
				" \nNumber of Wins \n "+ "-".repeat(20) + "\n" + numOfWins  +"\n"+ "=".repeat(20);
		
	}
	
	public String format() {
		return name + ";" + balance + ";" + numOfWins;
	}
} 
