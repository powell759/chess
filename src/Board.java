public class Board {
	public Square boardArray[][];
	
	public Board() {
		boardArray = new Square[8][8];
		//All Pawns
		for (int i = 0; i < 8; i++){
			boardArray[1][i] = new Square(Square.Content.PAWN, Square.Color.WHITE);
			boardArray[6][i] = new Square(Square.Content.PAWN, Square.Color.BLACK);
		}
		//All Pieces
		boardArray[0][0] = new Square(Square.Content.ROOK, Square.Color.WHITE);
		boardArray[0][7] = new Square(Square.Content.ROOK, Square.Color.WHITE);
		boardArray[7][0] = new Square(Square.Content.ROOK, Square.Color.BLACK);
		boardArray[7][7] = new Square(Square.Content.ROOK, Square.Color.BLACK);
		boardArray[0][1] = new Square(Square.Content.KNIGHT, Square.Color.WHITE);
		boardArray[0][6] = new Square(Square.Content.KNIGHT, Square.Color.WHITE);
		boardArray[7][1] = new Square(Square.Content.KNIGHT, Square.Color.BLACK);
		boardArray[7][6] = new Square(Square.Content.KNIGHT, Square.Color.BLACK);
		boardArray[0][2] = new Square(Square.Content.BISHOP, Square.Color.WHITE);
		boardArray[0][5] = new Square(Square.Content.BISHOP, Square.Color.WHITE);
		boardArray[7][2] = new Square(Square.Content.BISHOP, Square.Color.BLACK);
		boardArray[7][5] = new Square(Square.Content.BISHOP, Square.Color.BLACK);
		boardArray[0][3] = new Square(Square.Content.KING, Square.Color.WHITE);
		boardArray[0][4] = new Square(Square.Content.QUEEN, Square.Color.WHITE);
		boardArray[7][3] = new Square(Square.Content.KING, Square.Color.BLACK);
		boardArray[7][4] = new Square(Square.Content.QUEEN, Square.Color.BLACK);
		//All Empty
		for (int i = 2; i < 6; i++){
			for(int j = 0; j < 8; j++){
				boardArray[i][j] = new Square(Square.Content.EMPTY, Square.Color.NONE );
			}
		}
	}
}
