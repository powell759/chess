package game;

import components.Board;

public class GameModel {
	public Board gameBoard;
	public boolean hasSelection;
	public int selectX;
	public int selectY;
	
	/**
	 * Constructor for GameModel
	 */
	public GameModel() {
		gameBoard = new Board();
		hasSelection = false;
	}
	
	
	/**
	 * Gets the gameBoard
	 * 
	 * @return gameBoard
	 */
	public Board getBoard(){
		return gameBoard;
	}
}
