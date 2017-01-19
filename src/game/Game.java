package game;
import components.Board;
import game.Display;
public class Game {
	public static void main(String[] args){
		new Board();
		Display.printBoardColor();
		Display.printGameBoard();
	}
}