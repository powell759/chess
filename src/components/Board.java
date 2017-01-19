package components;
import components.Colour.Color;
import components.Piece.Content;
public class Board {
	public static Square boardArray[][];
	
	public Board() {
		boardArray = new Square[8][8];
		//All Pawns
		for (int i = 0; i < 8; i++){
			boardArray[1][i] = new Square(Content.PAWN, Color.WHITE);
			boardArray[6][i] = new Square(Content.PAWN, Color.BLACK);
		}
		//All Pieces
		boardArray[0][0] = new Square(Content.ROOK, Color.WHITE);
		boardArray[0][7] = new Square(Content.ROOK, Color.WHITE);
		boardArray[7][0] = new Square(Content.ROOK, Color.BLACK);
		boardArray[7][7] = new Square(Content.ROOK, Color.BLACK);
		boardArray[0][1] = new Square(Content.KNIGHT, Color.WHITE);
		boardArray[0][6] = new Square(Content.KNIGHT, Color.WHITE);
		boardArray[7][1] = new Square(Content.KNIGHT, Color.BLACK);
		boardArray[7][6] = new Square(Content.KNIGHT, Color.BLACK);
		boardArray[0][2] = new Square(Content.BISHOP, Color.WHITE);
		boardArray[0][5] = new Square(Content.BISHOP, Color.WHITE);
		boardArray[7][2] = new Square(Content.BISHOP, Color.BLACK);
		boardArray[7][5] = new Square(Content.BISHOP, Color.BLACK);
		boardArray[0][3] = new Square(Content.KING, Color.WHITE);
		boardArray[0][4] = new Square(Content.QUEEN, Color.WHITE);
		boardArray[7][3] = new Square(Content.KING, Color.BLACK);
		boardArray[7][4] = new Square(Content.QUEEN, Color.BLACK);
		//All Empty
		for (int i = 2; i < 6; i++){
			for(int j = 0; j < 8; j++){
				boardArray[i][j] = new Square(Content.EMPTY, Color.NONE );
			}
		}
	}
}
