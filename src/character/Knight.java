package character;
import components.Colour.Color;
import components.Piece;
public class Knight extends Piece{
	public Knight(Color c) {
		super(c);
	}
	public boolean validMove(int y, int x){
		return this.emptyOrOpponent(y, x) && (	// tile needs to be empty or legal eat
			  (this.position.row+2==y && this.position.column+1==x)||
			  (this.position.row+2==y && this.position.column-1==x)||
			  (this.position.row-2==y && this.position.column-1==x)||
			  (this.position.row-2==y && this.position.column+1==x)||
			  (this.position.row+1==y && this.position.column-2==x)||
			  (this.position.row+1==y && this.position.column+2==x)||
			  (this.position.row-1==y && this.position.column-2==x)||
			  (this.position.row-1==y && this.position.column+2==x));
	}
}
