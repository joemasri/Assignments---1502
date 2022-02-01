package mru.game.model;

public class Player {
	
	/**
	 * This class represent each player record in the Database
	 * It is basically a model class for each record in the txt file
	 */
	
	String name;
	String id;
	int numOfWins;
	
	/**
	 * Player constructor
	 * @param name
	 * @param id
	 * @param numOfWins
	 */
	public Player(String name, String id, int numOfWins) {
		this.name = name;
		this.id = id;
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
	 * Setter for id
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Setter for numOfWins
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
	 * Getter for id
	 * @return id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Getter for numOfWins
	 * @return numOfWins
	 */
	public int getNumOfWins() {
		return numOfWins;
	}
	
	public String toString() {
		return "Name: " + name + " ID: " + id + " Number of Wins: " + numOfWins;
	}
} 
