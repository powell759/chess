package game;

public class Game {
	/**
	 * Main method for Game
	 * 
	 * @param args	command-line arguments - not used
	 */
	public static void main(String[] args){
		GameModel model = new GameModel();
		GameView view = new GameView();
		GameController controller = new GameController(model, view);
		view.registerObserver(controller);
	}
}
