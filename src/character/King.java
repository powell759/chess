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
		return true;
	}

	@Override
	public String rep() {
		return "♚";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for King");
		int i;
		int j;
		
		//up
		j = y - 1;
		if(j >= 0){
			moveArray[x][j] = true;
			//left
			i = x - 1;
			if(i >= 0) moveArray[i][j] = true;
			//right
			i = x + 1;
			if(i < 8 ) moveArray[i][j] = true;
		}
		
		//down
		j = y + 1;
		if(j < 8){
			moveArray[x][j] = true;
			//left
			i = x - 1;
			if(i >= 0) moveArray[i][j] = true;
			//right
			i = x + 1;
			if(i < 8 ) moveArray[i][j] = true;
		}
		//left
		i = x - 1;
		if(i >= 0) moveArray[i][y] = true;
		//right
		i = x + 1;
		if(i < 8) moveArray[i][y] = true;
	}
	
}
