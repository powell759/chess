package game;
import components.Board;
import character.*;
import components.Piece;
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
	 * Handles piece selection
	 * 
	 * @param x	the x coordinate of the selection click
	 * @param y the y coordinate of the selection click
	 */
	public void selector(int x, int y){
		//Diagnostics
		System.out.println("attempting selection at" + x + "," + y);
		//Selecting
		model.hasSelection = true;
		model.selectX = x;
		model.selectY = y;
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
	
	/**
	 * Gets Piece at specified location
	 * 
	 * @param rank	rank of Piece instance
	 * @param file	file of Piece instance
	 * @return		Piece at location
	 */
	private Piece getContent(int rank, int file){
		return new Piece(Color.WHITE);
	}
}