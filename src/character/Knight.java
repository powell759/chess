package character;
import java.awt.Color;

import components.Piece;
public class Knight extends Piece{
	public Knight(Color c) {
		super(c);
	}
	public boolean validMove(int y, int x){
		return this.emptyOrOpponent(y, x); /**&& (	// tile needs to be empty or legal eat
			  (this.position.row+2==y && this.position.column+1==x)||
			  (this.position.row+2==y && this.position.column-1==x)||
			  (this.position.row-2==y && this.position.column-1==x)||
			  (this.position.row-2==y && this.position.column+1==x)||
			  (this.position.row+1==y && this.position.column-2==x)||
			  (this.position.row+1==y && this.position.column+2==x)||
			  (this.position.row-1==y && this.position.column-2==x)||
			  (this.position.row-1==y && this.position.column+2==x));**/
	}
	public boolean[][] validMoves(int y, int x){
		boolean[][] array = new boolean[8][8];
		java.util.Arrays.fill(array, false);
		int currentRow = this.position.row;
		int currentColumn = this.position.column;
		if (this.emptyOrOpponent(y, x) && currentRow+2==y && currentColumn+1==x) array[currentRow+2][currentColumn+1] = true;
		if (this.emptyOrOpponent(y, x) && currentRow+2==y && currentColumn-1==x) array[currentRow+2][currentColumn-1] = true;
		if (this.emptyOrOpponent(y, x) && currentRow-2==y && currentColumn+1==x) array[currentRow-2][currentColumn+1] = true;
		if (this.emptyOrOpponent(y, x) && currentRow-2==y && currentColumn-1==x) array[currentRow-2][currentColumn-1] = true;
		if (this.emptyOrOpponent(y, x) && currentRow-1==y && currentColumn+2==x) array[currentRow-1][currentColumn+2] = true;
		if (this.emptyOrOpponent(y, x) && currentRow-1==y && currentColumn-2==x) array[currentRow-1][currentColumn-2] = true;
		if (this.emptyOrOpponent(y, x) && currentRow+1==y && currentColumn+2==x) array[currentRow+1][currentColumn+2] = true;
		if (this.emptyOrOpponent(y, x) && currentRow+1==y && currentColumn-2==x) array[currentRow+1][currentColumn-2] = true;
		return array;
	}
	@Override
	public String rep() {
		return "♞";
	}
}
