
public class Game {
	public static void main(String[] args){
		
		Board gameBoard = new Board();
		printBoard(gameBoard);
	}

	private static void printBoard(Board gameBoard) {
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				String output;
				switch (gameBoard.boardArray[i][j].content) {
				case PAWN: output = "♙";
				break;
				case KNIGHT: output = "♘";
				break;
				case BISHOP: output = "♗";
				break;
				case ROOK: output = "♖";
				break;
				case KING: output = "♔";
				break;
				case QUEEN: output = "♕";
				break;
				default: output = "-";
				break;
				}
				System.out.print(output + " ");
				
				
			}
			System.out.println();
		}
		
	}
}
