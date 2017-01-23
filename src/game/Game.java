package game;
import components.Board;
import character.*;
import components.Piece;
import java.awt.Color;


import game.Display;
public class Game {
	public static void main(String[] args){
		boolean gameOver = false;
		new Board();
		
		//Initialize GUI
		Display gameDisplay = new Display();
		
	}
	
	private Piece getContent(int rank, int file){
		return new Piece(Color.WHITE);
	}
}