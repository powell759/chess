package character; 

import java.awt.Color;
import components.Piece;

public class Pawn extends Piece{

	boolean hasMoved;
	public Pawn(Color c) {
		super(c);
		this.hasMoved = false;
	}
}
