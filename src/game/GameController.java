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
		if(!model.hasSelection){
			selector(x, y);
		}
		else {
			mover(x, y);
		}
	}
	
	/**
	 * Handles piece selection
	 * 
	 * @param x	the x coordinate of the selection click
	 * @param y the y coordinate of the selection click
	 */
	public void selector(int x, int y){
		//Diagnostics
		System.out.println("Selecting " + x + "," + y);
		//Selecting
		model.hasSelection = true;
		model.selectX = x;
		model.selectY = y;
		view.updateGraphics();
	}
	
	/**
	 * Handles piece moving (NOT WORKING)
	 * 
	 * @param x	the x coordinate of selection click
	 * @param y	the y coordinate of selection click
	 */
	public void mover(int x, int y){
		Square squareFrom = model.gameBoard.boardArray[model.selectX][model.selectY];
		System.out.println("Moving to " + x + ", " + y);
		squareFrom.content.move(x,y);
		model.hasSelection = false;
		view.updateGraphics();
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
}