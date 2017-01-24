package components;
import character.Empty;
import java.awt.Color;

public abstract class Piece {
	
	public Color color;
	public Square position;
	
	public Piece(Color c){
		this.color = c;
	}
	public boolean emptyOrOpponent(int y, int x){
		boolean boo = false;
		if (this.color.equals(Color.WHITE) && !Board.boardArray[y][x].content.color.equals(Color.WHITE)) {
			boo = true;
		} else if (this.color.equals(Color.BLACK) && !Board.boardArray[y][x].content.color.equals(Color.BLACK)) {
			boo = true;
		}
		return boo;
	}
	
	public boolean isEmpty(int y, int x){
		return Board.boardArray[y][x].content.color.equals(null);
	}
	
	public void move(int y, int x){
		if(this.validMove(y, x)) {
			this.position.content = new Empty(null);
			Board.boardArray[y][x].content = this;
			this.position = Board.boardArray[y][x];
		}
		
	}
	public boolean validMove(int y, int x){
		return true;
	}
	
	/**
	 * Returns the string representation of a Piece
	 * 
	 * @return String representation of Piece
	 */
	public abstract String rep();
}
