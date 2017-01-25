package character;

import java.awt.Color;
import components.Piece;

public class Queen extends Piece{

	public Queen(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public boolean validMove(int y, int x) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String rep() {
		return "♛";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Queen");
		// TODO Auto-generated method stub
		
	}

}
