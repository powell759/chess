package components;
import components.Colour.Color;
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
				if (i % 2 == 0) {					// if even number row, alternate black and white
					if (j % 2 == 0) {
						boardArray[i][j] = new Square(new Empty(Color.NONE), Color.WHITE);	
					} else {
						boardArray[i][j] = new Square(new Empty(Color.NONE), Color.BLACK);		
					}
				} else {							// if odd number row, alternate to white and black order
					if (j % 2 == 0) {
						boardArray[i][j] = new Square(new Empty(Color.NONE), Color.BLACK);
					} else {
						boardArray[i][j] = new Square(new Empty(Color.NONE), Color.WHITE);
					}
				}
			}
		}
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
