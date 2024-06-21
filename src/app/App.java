package app;

import controller.GameController;
import model.KeyboardDigits;
import view.GameView;

public class App {
	public static void main(String[] args) {
		GameView gv = new GameView();
		GameController gc = new GameController(gv);
		
	}
}
