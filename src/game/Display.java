package game;

import character.Bishop;
import character.Empty;
import character.King;
import character.Knight;
import character.Pawn;
import character.Queen;
import character.Rook;
import components.Board;

public class Display extends Board{
	public static void printGameBoard(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				String output = "";
				if (Board.boardArray[i][j].content instanceof Empty){		// for optimization, do the loop which will occur the most
					output = "-";
				} else if (Board.boardArray[i][j].content instanceof Pawn){	// and the pieces as well
					output = "♙";
				} else if (Board.boardArray[i][j].content instanceof Rook){
					output = "♖";
				} else if (Board.boardArray[i][j].content instanceof Bishop){
					output = "♗";
				} else if (Board.boardArray[i][j].content instanceof Knight) {
					output = "♘";
				} else if (Board.boardArray[i][j].content instanceof King){
					output = "♔";
				} else if (Board.boardArray[i][j].content instanceof Queen){
					output = "♕";
				}
				System.out.print(output + " ");
			}
			System.out.println();
		}
	}
	public static void printBoardColor(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++){
				System.out.print(boardArray[i][j].color);
			}
			System.out.println();
		}
	}
}
