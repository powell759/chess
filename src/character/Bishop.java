package character;

import java.awt.Color;

import components.Board;
import components.Piece;

public class Bishop extends Piece{

	public Bishop(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean validMove(int y, int x) {
		// TODO Auto-generated method stub
		System.out.println("Valid move for Bishop");
		return true;
	}

	@Override
	public String rep() {
		return "♝";
	}

}
