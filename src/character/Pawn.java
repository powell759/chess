package character; 

import java.awt.Color;
import components.Piece;

public class Pawn extends Piece{

	public Pawn(Color c) {
		super(c);
	}

	@Override
	public String rep() {
		return "♟";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Pawn");
		//logic here
		if(this.color == Color.BLACK){
			if(y + 1 <= 7) moveArray[x][y+1] = true && isEmpty(y+1, x);
			if(x+1 <= 7 && y + 1 <= 7 && this.isOpponent(x+1, y+1)) moveArray[x+1][y+1] = true;
			if(x-1 >= 0 && y + 1 <= 7 && this.isOpponent(x-1, y+1)) moveArray[x-1][y+1] = true;
			if(hasNotMoved) moveArray[x][y+2] = true && isEmpty(y+2,x) && isEmpty(y+1, x);
		} else {
			if(y - 1 >= 0) moveArray[x][y-1] = true && isEmpty(y-1,x) && isEmpty(y-1,x);
			if(x+1 <= 7 && y - 1 >= 0 && this.isOpponent(x+1, y-1)) moveArray[x+1][y-1] = true;
			if(x-1 >= 0 && y - 1 >= 0 && this.isOpponent(x-1, y-1)) moveArray[x-1][y-1] = true;
			if(hasNotMoved) moveArray[x][y-2] = true&& isEmpty(y-1,x) && isEmpty(y-1,x);
		}		
	}
}
