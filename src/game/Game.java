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
		
	}
}