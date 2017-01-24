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
public class GameView extends Frame{
	private GameController controller;
	private BoardCanvas bc;

	
	public GameView() {
	    setTitle("Chess");
	    setResizable(false);
	    bc = new BoardCanvas();
	    add(bc);
		pack();
		setSize(400, 400+getInsets().top+getInsets().bottom);
		setVisible(true);
		
	}

	class BoardCanvas extends Canvas {
		public BoardCanvas(){	
			setBackground(Color.WHITE);
			setSize(400,400);
		    //graphical piece selection starts here!!
			class WindowCloser extends  WindowAdapter {
				@Override
				public void windowClosing(WindowEvent e) {
					controller.windowClosed();
				}
			}
			addWindowListener(new WindowCloser());
		    class PieceSelector extends MouseAdapter {
		    	@Override
				public void mouseClicked(MouseEvent e){
					controller.processClick(e.getX() / 50, e.getY() / 50);
				}
			}
			addMouseListener(new PieceSelector());
		}
		
		public void  paint(Graphics g){
			paintBoard(g);
			paintSelection(g);
			paintPieces(g);
			System.out.println("Painting...");
		}
		
		public void paintSelection(Graphics g){
			if (controller.hasSelection()){
				g.setColor(Color.BLUE);
				g.fillRect(controller.drawX(), controller.drawY(), 50, 50);
			}
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
		
		public void paintPieces(Graphics g){
			g.setColor(Color.RED);
			Board gameBoard = controller.getBoard();
			for (int i = 0; i < 8; i++){
				for (int j = 0; j < 8; j++){
					String output = "";
					Piece p = gameBoard.boardArray[i][j].content;
					if (p instanceof Empty){		// for optimization, do the loop which will occur the most
						output = " ";
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
					//could draw custom image here
					System.out.print(output);
					g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 70));
					g.drawString(output, 50*j, 50+50*i);
				}
				System.out.println();
			}
		}
	}
    
	public void updateGraphics(){
		bc.repaint();
	}
	public void registerObserver(GameController controller){
		this.controller = controller;
	}
}
