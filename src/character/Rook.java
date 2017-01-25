package character;

import java.awt.Color;
import components.Piece;

public class Rook extends Piece{

	public Rook(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String rep() {
		return "♜";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Rook");
		boolean empty = true;
		//up
		int i = y - 1;
		while(i >= 0){
			moveArray[x][i] = true && this.emptyOrOpponent(x, i) && empty;
			if(isEmpty(i,x)==false)	empty = false;
			i--;
		}
		empty = true;
		//down
		i = y + 1;
		while(i < 8){
			moveArray[x][i] = true && this.emptyOrOpponent(x,i) && empty;
			if(isEmpty(i,x)==false)	empty = false;
			i++;
		}
		empty = true;
		//left
		i = x - 1;
		while(i >= 0){
			moveArray[i][y] = true && this.emptyOrOpponent(i, y) && empty;
			if(isEmpty(y,i)==false)	empty = false;
			i--;
		}
		empty = true;
		//right
		i = x + 1;
		while(i < 8){
			moveArray[i][y] = true && this.emptyOrOpponent(i, y) && empty;
			if(isEmpty(y,i)==false)	empty = false;
			i++;
		}
	}
}
