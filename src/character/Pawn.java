package character; 

import java.awt.Color;
import components.Piece;

public class Pawn extends Piece{

	boolean hasMoved;
	public Pawn(Color c) {
		super(c);
		this.hasMoved = false;
	}
	
	public boolean validMove(int y, int x){
		/**
		boolean boo = false;
		if(this.position.column == y){				// pawn can only move straight
			if(this.color.equals(Color.BLACK)){		// BLACK pawn moves down matrix
				if (x - this.position.row <= 2){	// check to see if pawn could make move two forward
					if(this.hasMoved & x - this.position.row == 1){
						boo = true;					// pawn has already moved and therefore can only move if moving forward a single space
					} else if (!this.hasMoved) {	// pawns can take two moves forward if they haven't moved
						boo = true;
					}
				}
			} else {								// WHITE pawn moves up matrix
				if (this.position.row - x <= 2){
					if(this.hasMoved & this.position.row - x == 1){
						boo = true;
					} else if (!this.hasMoved){
						boo = true;
					}
				}
			}
		} 
		**/
		return true; //boo;
	}
	
	public boolean canEat(int y, int x){
		boolean boo = false;
		if(this.color.equals(Color.BLACK)){
			
		} else {
			
		}
		return boo;
	}

	@Override
	public String rep() {
		return "♟";
	}
}
