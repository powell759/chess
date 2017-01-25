package components;
import character.Empty;
import java.awt.Color;

public abstract class Piece {
	
	public Color color;
	public Square position;
	public boolean hasNotMoved;
	
	public Piece(Color c){
		this.color = c;
		hasNotMoved = true;
	}
	public boolean emptyOrOpponent(int x, int y){
		boolean boo = false;
		if (this.color.equals(Color.WHITE)){
			if( !Board.boardArray[y][x].content.color.equals(Color.WHITE)) {
				boo = true;
			}
		} else if (this.color.equals(Color.BLACK)){
			if(!Board.boardArray[y][x].content.color.equals(Color.BLACK)) {
				boo = true;
			}
		}
		return boo;
	}
	
	public boolean isOpponent(int y, int x){
		boolean boo = false;
		if (this.color.equals(Color.BLACK)){
			if (Board.boardArray[x][y].content.color.equals(Color.WHITE)) boo = true;
		} else if (this.color.equals(Color.WHITE)){
			if (Board.boardArray[x][y].content.color.equals(Color.BLACK)) boo = true;
		}
		return boo;
	}
	
	public static boolean isEmpty(int y, int x){
		return !(Board.boardArray[y][x].content.color.equals(Color.BLACK) || Board.boardArray[y][x].content.color.equals(Color.WHITE));
	}

	public abstract void getValidMoves(boolean[][] moveArray, int y, int x);
	
	/**
	 * Returns the string representation of a Piece
	 * 
	 * @return String representation of Piece
	 */
	public abstract String rep();
}
