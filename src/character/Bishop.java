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

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Bishop");
		//up left
		int i = x - 1;
		int j = y - 1 ;
		while( i >= 0 && j >= 0){
			moveArray[i][j] = true;
			i--;
			j--;
		}
		//up right
		i = x + 1;
		j = y - 1 ;
		while( i < 8 && j >= 0){
			moveArray[i][j] = true;
			i++;
			j--;
		}
		//down left
		i = x - 1;
		j = y + 1 ;
		while( i >= 0 && j < 8){
			moveArray[i][j] = true;
			i--;
			j++;
		}
		//up left
		i = x + 1;
		j = y + 1 ;
		while( i < 8 && j < 8){
			moveArray[i][j] = true;
			i++;
			j++;
		}
		
	}

}
