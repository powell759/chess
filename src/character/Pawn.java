package character; 

import components.Colour.Color;
import components.Piece;

public class Pawn extends Piece{

	boolean hasMoved;
	public Pawn(Color c) {
		super(c);
		this.hasMoved = false;
	}
}
