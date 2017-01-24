package character;

import java.awt.Color;
import components.Piece;

public class King extends Piece{

	public King(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(int y, int x) {
		// TODO Auto-generated method stub
		System.out.println("Invalid move for King");
		return false;
	}

	@Override
	public String rep() {
		return "♚";
	}
	
}
