package character;

import java.awt.Color;
import components.Piece;

public class Queen extends Piece{

	public Queen(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String rep() {
		return "♛";
	}

	@Override
	public void getValidMoves(boolean[][] moveArray, int y, int x) {
		System.out.println("Getting valid moves for Queen");
		boolean empty = true;
		//up
		int i = y - 1;
		while(i >= 0){
			moveArray[x][i] = true && empty && this.emptyOrOpponent(x, i);
			if(isEmpty(i,x)==false)	empty = false;
			i--;
		}
		empty = true;
		//down
		i = y + 1;
		while(i < 8){
			moveArray[x][i] = true && empty && this.emptyOrOpponent(x, i);
			if(isEmpty(i,x)==false)	empty = false;
			i++;
		}
		empty = true;
		//left
		i = x - 1;
		while(i >= 0){
			moveArray[i][y] = true && empty && this.emptyOrOpponent(i, y);
			if(isEmpty(y,i)==false)	empty = false;
			i--;
		}
		empty = true;
		//right
		i = x + 1;
		while(i < 8){
			moveArray[i][y] = true&& empty && this.emptyOrOpponent(i, y);
			if(isEmpty(y,i)==false)	empty = false;
			i++;
		}
		empty = true;
		//up left
		i = x - 1;
		int j = y - 1 ;
		while( i >= 0 && j >= 0){
			moveArray[i][j] = true&& empty && this.emptyOrOpponent(i, j);
			if(isEmpty(j,i)==false)	empty = false;
			i--;
			j--;
		}
		empty = true;
		//up right
		i = x + 1;
		j = y - 1 ;
		while( i < 8 && j >= 0){
			moveArray[i][j] = true&& empty && this.emptyOrOpponent(i, j);
			if(isEmpty(j,i)==false)	empty = false;
			i++;
			j--;
		}
		empty = true;
		//down left
		i = x - 1;
		j = y + 1 ;
		while( i >= 0 && j < 8){
			moveArray[i][j] = true&& empty && this.emptyOrOpponent(i, j);
			if(isEmpty(j,i)==false)	empty = false;
			i--;
			j++;
		}
		empty = true;
		//up left
		i = x + 1;
		j = y + 1 ;
		while( i < 8 && j < 8){
			moveArray[i][j] = true&& empty && this.emptyOrOpponent(i, j);
			if(isEmpty(j,i)==false)	empty = false;
			i++;
			j++;
		}
	}

}
