package character;

import components.Colour.Color;
import components.Piece;

public class Empty extends Piece {

	public Empty(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	// this will be important for piece movement (making sure nothing gets in the way of their movement)
	// I take it back, maybe remove
	@Override
	public boolean validMove(int y, int x) {
		// TODO Auto-generated method stub
		return false;
	}

}
