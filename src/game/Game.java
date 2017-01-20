package game;
import components.Board;
import character.*;
import components.Piece;
import components.Colour;


import game.Display;
public class Game {
	public static void main(String[] args){
		boolean gameOver = false;
		new Board();
		
		//Initialize GUI
		Display gameDisplay = new Display();
		
		
		//Keeping this because it will be helpful to have terminal output next to GUI
		//while we work
		Display.printBoardColor();
		Display.printGameBoard();
		

		while(!gameOver){
			System.out.println("Select Rank:");
			System.out.println("Select File:");
			
			//check for piece
			//select in case of non-empty square

			
			//at end condition
			gameOver = true;
		
		}
	}
	
	private Piece getContent(int rank, int file){
		return new Piece(Colour.Color.WHITE);
	}
}