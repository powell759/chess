package game;
import components.Board;
import game.Display;
public class Game {
	static boolean gameOver;
	public Game(){
		gameOver = false;
		new Board();
		//Initialize GUI
		new Display();
	}
	
	public static void main(String[] args){
		new Game();
		
		/**while(!gameOver){
			System.out.println("Select Rank:");
			System.out.println("Select File:");
			//check for piece
			//select in case of non-empty square
		}**/
	}
}