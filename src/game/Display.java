package game;

import character.Bishop;
import character.Empty;
import character.King;
import character.Knight;
import character.Pawn;
import character.Queen;
import character.Rook;
import components.Board;
import components.Colour.Color;
import components.Piece;

public class Display extends Board{
	public static void printGameBoard(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				String output = "";
				Piece p = Board.boardArray[i][j].content;
				if (p instanceof Empty){		// for optimization, do the loop which will occur the most
					output = "-";
				} else if (p instanceof Pawn){	// and the pieces as well
					if(p.color.equals(Color.BLACK)){
						output = "♟";
					} else {
						output = "♙";
					}
				} else if (p instanceof Rook){
					if(p.color.equals(Color.BLACK)){
						output = "♜";
					} else {
						output = "♖";
					}
				} else if (p instanceof Bishop){
					if(p.color.equals(Color.BLACK)){
						output = "♝";
					} else {
						output = "♗";
					}
				} else if (p instanceof Knight) {
					if(p.color.equals(Color.BLACK)){
						output = "♞";
					} else {
						output = "♘";
					}
				} else if (p instanceof King){
					if(p.color.equals(Color.BLACK)){
						output = "♚";
					} else {
						output = "♔";
					}
				} else if (p instanceof Queen){
					if(p.color.equals(Color.BLACK)){
						output = "♛";
					} else {
						output = "♕";
					}
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
