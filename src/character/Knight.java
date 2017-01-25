package character;
import java.awt.Color;

import components.Piece;
public class Knight extends Piece{
	public Knight(Color c) {
		super(c);
	}

	@Override
	public String rep() {
		return "♞";
	}
	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Knight");
		if(y - 2 >= 0){
			if(x - 1 >= 0) moveArray[x - 1][y - 2] = true;
			if(x + 1 < 8) moveArray[x + 1][y - 2] = true;
		}
		if(y + 2 <= 7){
			if(x - 1 >= 0) moveArray[x - 1][y + 2] = true;
			if(x + 1 < 8) moveArray[x + 1][y + 2] = true;
		}
		if(x - 2 >= 0){
			if(y - 1 >= 0) moveArray[x - 2][y - 1] = true;
			if(y + 1 < 8) moveArray[x - 2][y + 1] = true;
		}
		if(x + 2 <= 7){
			if(y - 1 >= 0) moveArray[x + 2][y - 1] = true;
			if(y + 1 < 8) moveArray[x + 2][y + 1] = true;
		}
	}
}
