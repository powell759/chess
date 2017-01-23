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
import java.awt.Font;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	    class WindowCloser extends  WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
	    addWindowListener(new WindowCloser());
		
	    //post set up
		pack();
		setSize(400, 400+getInsets().top+getInsets().bottom);
		setVisible(true);
	}
	
	class BoardCanvas extends Canvas {
		public BoardCanvas(){	
			setBackground(Color.WHITE);
			setSize(400,400);
		    //graphical piece selection starts here!!
		    class PieceSelector extends MouseAdapter {
		    	@Override
				public void mouseClicked(MouseEvent e){
					System.exit(0);
				}
			}
			addMouseListener(new PieceSelector());
		}
		
		//TODO - make this function scalable.... lowwww priority
		
		public void  paint(Graphics g){
			paintBoard(g);
			paintPieces(g);
		}
		
		
		public void paintBoard(Graphics g){
			g.setColor(Color.BLACK);
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					g.fillRect(100*i,100*j, 50, 50);
					g.fillRect(50+100*i, 50+100*j, 50, 50);
				}
			}
			
		}
	}
	
	
	public static void paintPieces(Graphics g){
		g.setColor(Color.RED);
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				String output = "";
				Piece p = Board.boardArray[i][j].content;
				if (p instanceof Empty){		// for optimization, do the loop which will occur the most
					output = "";
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
				//could draw custom image here
				g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 70));
				g.drawString(output, 50*j, 50+50*i);
			}
			System.out.println();
		}
	}
	public static void printBoardColor(){
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++){
				System.out.print(Board.boardArray[i][j].tileColor);
			}
			System.out.println();
		}
	}
}
