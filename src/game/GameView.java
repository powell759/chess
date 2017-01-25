package game;

import character.Bishop;
import character.Empty;
import character.King;
import character.Knight;
import character.Pawn;
import character.Queen;
import character.Rook;
import components.Board;
import components.Colors;
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
		private Color whiteSquare = new Color(229, 212, 165);
		private Color whitePiece = new Color(198, 179, 125);
		private Color blackSquare = new Color(132, 82, 51);
		private Color blackPiece = new Color(68, 34, 13);
		private Color highlight = new Color(0, 0, 255, 100);
		private Color moves = new Color(255, 255, 0, 100);
		
		public BoardCanvas(){	
			setBackground(whiteSquare);
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
			paintMoves(g);
			paintPieces(g);
			System.out.println("Painting...");
		}
		
		private void paintMoves(Graphics g) {
			boolean[][] arr = controller.getMoves();
			g.setColor(moves);
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(arr[i][j]){
						g.fillRect(50*i, 50*j, 50, 50);
					}
				}
			}
		}

		public void paintSelection(Graphics g){
			if (controller.hasSelection()){
				g.setColor(highlight);
				g.fillRect(controller.drawX(), controller.drawY(), 50, 50);
			}
		}
		
		public void paintBoard(Graphics g){
			g.setColor(blackSquare);
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					g.fillRect(100*i,100*j, 50, 50);
					g.fillRect(50+100*i, 50+100*j, 50, 50);
				}
			}
			
		}
		
		/**
		 * Paints the pieces to the screen
		 * Is poorly written but will be replaced with image drawing
		 * 
		 * @param g	Graphics Object
		 */
		public void paintPieces(Graphics g){
			for (int i = 0; i < 8; i++){
				for (int j = 0; j < 8; j++){
					String output = "";
					Piece p = Board.boardArray[i][j].content;
					if(p.color == Color.WHITE){
						g.setColor(whitePiece);
					} else {
						g.setColor(blackPiece);
					}
					output = p.rep();
					g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 70));
					g.drawString(output, 50*j, 50+50*i);
				}
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
