package character;

import java.awt.Color;
import components.Piece;

public class Empty extends Piece {

	public Empty(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	// this will be important for piece movement (making sure nothing gets in the way of their movement)
	// I take it back, maybe remove

	@Override
	public String rep() {
		return "";
	}
	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Empty");
		// TODO Auto-generated method stub
		
	}

}
