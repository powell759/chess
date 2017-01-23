package components;

import java.awt.Color;
import character.Bishop;
import character.Empty;
import character.Knight;
import character.Pawn;
import character.Queen;
import character.Rook;
import character.King;
public class Board {
	public static Square boardArray[][];
	
	public Board() {
		boardArray = new Square[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++){
				Square tile;
				if (i % 2 == 0) {					// if even number row, alternate black and white
					if (j % 2 == 0) {
						boardArray[i][j] = tile = new Square(new Empty(null), Color.WHITE);	
					} else {
						boardArray[i][j] = tile = new Square(new Empty(null), Color.BLACK);		
					}
				} else {							// if odd number row, alternate to white and black order
					if (j % 2 == 0) {
						boardArray[i][j] = tile = new Square(new Empty(null), Color.BLACK);
					} else {
						boardArray[i][j] = tile = new Square(new Empty(null), Color.WHITE);
					}
				}
				tile.row = i;
				tile.column = j;
			}
		}
		setSquareCardinality();
		setupPieces();
	}
		
	public void setSquareCardinality(){				// a potentially smarter, more OOP way of navigating through the board
		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 8; column++){
				Square current = boardArray[row][column];
				if (row > 0) current.north = boardArray[row-1][column];
				if (column > 0) current.west = boardArray[row][column-1];
				if (row < 7) current.south = boardArray[row+1][column];
				if (column < 7) current.east = boardArray[row][column+1];
				if (row > 0 && column < 7) current.northeast = boardArray[row-1][column+1];
				if (row > 0 && column > 0) current.northwest = boardArray[row-1][column-1];
				if (row < 7 && column > 0) current.southwest = boardArray[row+1][column-1];
				if (row < 7 && column < 7) current.southeast = boardArray[row+1][column+1];
			}
		}
	}
	
	public void setupPieces(){
		//All Pawns
		for (int i = 0; i < 8; i++){
			boardArray[1][i].content = new Pawn(Color.BLACK);
			boardArray[6][i].content = new Pawn(Color.WHITE);
		}
		//All Pieces
		boardArray[0][0].content = new Rook(Color.BLACK);
		boardArray[0][7].content = new Rook(Color.BLACK);
		boardArray[7][0].content = new Rook(Color.WHITE);
		boardArray[7][7].content = new Rook(Color.WHITE);
		boardArray[0][1].content = new Knight(Color.BLACK);
		boardArray[0][6].content = new Knight(Color.BLACK);
		boardArray[7][1].content = new Knight(Color.WHITE);
		boardArray[7][6].content = new Knight(Color.WHITE);
		boardArray[0][2].content = new Bishop(Color.BLACK);
		boardArray[0][5].content = new Bishop(Color.BLACK);
		boardArray[7][2].content = new Bishop(Color.WHITE);
		boardArray[7][5].content = new Bishop(Color.WHITE);
		boardArray[0][3].content = new King(Color.BLACK);
		boardArray[0][4].content = new Queen(Color.BLACK);
		boardArray[7][3].content = new King(Color.WHITE);
		boardArray[7][4].content = new Queen(Color.WHITE);		
	}
}
