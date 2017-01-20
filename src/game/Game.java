package game;
import java.util.Scanner;

import components.Board;
import game.Display;
public class Game {
	static boolean gameOver;
	public Game(){
		gameOver = false;
		new Board();
	}
	
	public static void main(String[] args){
		new Game();
		Display.printBoardColor();
		Display.printGameBoard();
		
		while(!gameOver){
			Scanner read = new Scanner(System.in);
			System.out.println("Select Rank:");
			System.out.println("Select File:");
			System.out.print("Select piece's row: ");
			int oldRow = read.nextInt();
			System.out.print("Select piece's column: ");
			int oldColumn = read.nextInt();
			System.out.print("Move piece's to row: ");
			int newRow = read.nextInt();
			System.out.print("Move piece's to column: ");
			int newColumn = read.nextInt();
			Board.boardArray[oldRow][oldColumn].content.move(newRow, newColumn);
			Display.printGameBoard();
			read.close();
			//check for piece
			//select in case of non-empty square
		}
	}
	
	
}