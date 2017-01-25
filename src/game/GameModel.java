package game;

import components.Board;

public class GameModel {
	public Board gameBoard;
	public boolean hasSelection;
	public int selectX;
	public int selectY;
	public boolean[][] moves;
	
	
	/**
	 * Constructor for GameModel
	 */
	public GameModel() {
		gameBoard = new Board();
		hasSelection = false;
		moves = new boolean[8][8];
		moves[4][4] = true;
		moves[0][0] = true;
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
