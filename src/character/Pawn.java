package character; 

import java.awt.Color;
import components.Piece;

public class Pawn extends Piece{

	public boolean hasNotMoved;
	public Pawn(Color c) {
		super(c);
		this.hasNotMoved = true;
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
			moveArray[x][y+1] = true;
			if(hasNotMoved) moveArray[x][y+2] = true;
		} else {
			moveArray[x][y-1] = true;
			if(hasNotMoved) moveArray[x][y-2] = true;
		}		
	}
}
