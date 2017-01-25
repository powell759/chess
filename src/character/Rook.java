package character;

import java.awt.Color;
import components.Piece;

public class Rook extends Piece{

	public Rook(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validMove(int y, int x) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String rep() {
		return "♜";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Rook");
		//up
		int i = y - 1;
		while(i >= 0){
			moveArray[x][i] = true;
			i--;
		}
		//down
		i = y + 1;
		while(i < 8){
			moveArray[x][i] = true;
			i++;
		}
		//left
		i = x - 1;
		while(i >= 0){
			moveArray[i][y] = true;
			i--;
		}
		//right
		i = x + 1;
		while(i < 8){
			moveArray[i][y] = true;
			i++;
		}
	}
}
