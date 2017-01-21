package game;

import character.Bishop;
import character.Empty;
import character.King;
import character.Knight;
import character.Pawn;
import character.Queen;
import character.Rook;
import components.Board;
import components.Piece;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Display extends Frame{
	
	public Display() {
		//set up GUI here
	    setTitle("Chess");
	    setResizable(false);
	    
	    //adding canvas
	    add(new BoardCanvas());
	    
	    //close condition
	    addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent we) { System.exit(0);}});
		//post set up
		pack();
		setSize(400, 400+getInsets().top);
		setVisible(true);
	}
	
	class BoardCanvas extends Canvas {
		public BoardCanvas(){	
			setBackground(Color.WHITE);
			setSize(400,400);
		}
		
		//TODO - make this function scalable.... lowwww priority
		public void  paint(Graphics g){
			g.setColor(Color.BLACK);
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					g.fillRect(100*i,100*j, 50, 50);
					g.fillRect(50+100*i, 50+100*j, 50, 50);
				}
			}
		}
	}
	
	
	public static void printGameBoard(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				String output = "";
				Piece p = Board.boardArray[i][j].content;
				if (p instanceof Empty){		// for optimization, do the loop which will occur the most
					output = "-";
				} else if (p instanceof Pawn){	// and the pieces as well
					if(p.color.equals(Color.BLACK)){
						output = "♟";
					} else {
						output = "♙";
					}
				} else if (p instanceof Rook){
					if(p.color.equals(Color.BLACK)){
						output = "♜";
					} else {
						output = "♖";
					}
				} else if (p instanceof Bishop){
					if(p.color.equals(Color.BLACK)){
						output = "♝";
					} else {
						output = "♗";
					}
				} else if (p instanceof Knight) {
					if(p.color.equals(Color.BLACK)){
						output = "♞";
					} else {
						output = "♘";
					}
				} else if (p instanceof King){
					if(p.color.equals(Color.BLACK)){
						output = "♚";
					} else {
						output = "♔";
					}
				} else if (p instanceof Queen){
					if(p.color.equals(Color.BLACK)){
						output = "♛";
					} else {
						output = "♕";
					}
				}
				System.out.print(output + " ");
			}
			System.out.println();
		}
	}
	public static void printBoardColor(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++){
				System.out.print(Board.boardArray[i][j].color);
			}
			System.out.println();
		}
	}
}
