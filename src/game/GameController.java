package game;

import components.Board;
import character.*;
import components.Piece;
import components.Square;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import game.GameView;
public class GameController {
	
	GameModel model;
	GameView view;
	
	/**
	 * Constructor for GameController
	 * 
	 * @param model - instance of GameModel
	 * @param view - instance of GameView
	 */
	public GameController(GameModel model, GameView view){
		this.model = model;
		this.view = view;
	}

	/**
	 * Handles window closing event
	 */
	public void windowClosed(){
		view.dispose();
		System.exit(0);
	}
	
	/**
	 * Processes click event
	 * 
	 * @param x	the x coordinate of the selection click
	 * @param y	the y coordinate of the selection click
	 */
	public void processClick(int x, int y){
		if(model.hasSelection){
			if(x == model.selectX && y == model.selectY){
				deselector(x, y);
			} else if(model.moves[x][y]){
				mover(x, y);
			} else {
				System.out.println("Not in valid moves");
			}
		}
		else {
			selector(x, y);
		}
	}
	
	/**
	 * Handles piece deselection
	 * 
	 * @param x	the x coo	 * @param x
	 * @param yrdinate of the deselection click
	 * @param y the y coordinate of the deselection click
	 */
	public void deselector(int x, int y){
		model.hasSelection = false;
		System.out.println("Deselecting " + x + ", " + y);
		clearMoves();
		view.updateGraphics();
	}
	
	
	/**
	 * Handles piece selection
	 * 
	 * @param x	the x coordinate of the selection click
	 * @param y the y coordinate of the selection click
	 */
	public void selector(int x, int y){
		if(!(Board.boardArray[y][x].content instanceof Empty)){
			model.hasSelection = true;
			model.selectX = x;
			model.selectY = y;
			System.out.println("Selecting " + x + "," + y);
			setMoves();
			view.updateGraphics();
		}
	}
	
	/**
	 * Send moves[][] to selected Piece for move generation
	 */
	private void setMoves() {
		Board.boardArray[model.selectY][model.selectX].content.getValidMoves(model.moves, model.selectY, model.selectX);
	}

	/**
	 * Moves piece if the move is valid
	 * 
	 * @param x	the x coordinate of selection click
	 * @param y	the y coordinate of selection click
	 */
	public void mover(int x, int y){
		Square from = Board.boardArray[model.selectY][model.selectX];
		Square to = Board.boardArray[y][x];
		
		//Clear
		
		to.content = from.content;
		from.content = new Empty(Color.GREEN);
		System.out.println("Moving to " + x + ", " + y);
	    model.hasSelection = false;
	    to.content.hasNotMoved = false;
	    view.updateGraphics();
		clearMoves();
	}
	
	public Board getBoard(){
		return model.getBoard();
	}
	
	public boolean hasSelection(){
		return model.hasSelection;
	}
	
	public int drawX(){
		return model.selectX * 50;
	}
	
	public int drawY(){
		return model.selectY * 50;
	}
	
	public boolean[][] getMoves(){
		return model.moves;
	}
	
	public void clearMoves(){
		//Clearing Moves
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				model.moves[i][j] = false;
			}
		}
	}
}