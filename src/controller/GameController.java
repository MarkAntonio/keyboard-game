package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import model.KeyboardDigits;
import view.GameView;

public class GameController extends KeyAdapter {

	GameView gv;
	boolean gameStarted;

	public GameController(GameView gv) {
		super();
		this.gv = gv;
		control();
	}

	private void control() {
		gv.addKeyListener(this);
	}
	
	private void randomOpt() {
		if(gv.getLetterButton().isSelected())
			gv.getCharLabel().setText(KeyboardDigits.randomLetter());
		else
			gv.getCharLabel().setText(KeyboardDigits.randomNumber());
	}
	
	private void validateInput(KeyEvent e) {
		String typed = "" + e.getKeyChar();
		if (gv.getCharLabel().getText().equalsIgnoreCase(typed)) {
			
			if(gv.getCharLabel().getForeground() == Color.red)
				gv.getCharLabel().setForeground(Color.BLUE);
			randomOpt();	
			
		}
		else
			gv.getCharLabel().setForeground(Color.RED);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER && !gameStarted) {
			gameStarted = true;
			gv.getCharLabel().setForeground(Color.BLUE);
			gv.getCharLabel().setFont(new Font(null, Font.BOLD, 70));
			gv.getButtonsPanel().setVisible(false);
			randomOpt();
		}
		else if (gameStarted) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				gameStarted = false;
				gv.getCharLabel().setText(GameView.PAUSE_MESSAGE);
				gv.getCharLabel().setForeground(Color.DARK_GRAY);
				gv.getCharLabel().setFont(new Font(null, Font.BOLD, 30));
				gv.getButtonsPanel().setVisible(true);
			}
			else	
				validateInput(e);
			
		
		}

	}

}
