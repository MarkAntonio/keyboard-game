package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GameView extends JFrame{
	private JLabel titleLabel, charLabel, footerLabel;
	private JRadioButton letterButton, numberButton;
	private JPanel buttonsPanel;
	public static final String PAUSE_MESSAGE = "Press Enter to start";
	
	public GameView() {
		super("Keyboard Game");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setIconImage(new ImageIcon("img/icon2.png").getImage());
		
		titleLabel = new JLabel("Keyboard Game", JLabel.CENTER);
		titleLabel.setFont(new Font(null, Font.BOLD, 20));
		charLabel = new JLabel(PAUSE_MESSAGE, JLabel.CENTER);
		charLabel.setFont(new Font(null, Font.BOLD, 30));
//		footerLabel = new JLabel("₢ monitoria MPOO 2024 all rights reserved");
		
		buttonsPanel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		letterButton = new JRadioButton("Letters", true);
		letterButton.setFocusable(false);
		numberButton = new JRadioButton("Numbers");
		numberButton.setFocusable(false);
		bg.add(letterButton);
		bg.add(numberButton);
		buttonsPanel.add(letterButton);
		buttonsPanel.add(numberButton);
		
		add(titleLabel, BorderLayout.NORTH);
		add(charLabel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.SOUTH);
//		add(footerLabel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public JLabel getCharLabel() {
		return charLabel;
	}

	public JRadioButton getLetterButton() {
		return letterButton;
	}

	public JRadioButton getNumberButton() {
		return numberButton;
	}

	public JPanel getButtonsPanel() {
		return buttonsPanel;
	}
}
