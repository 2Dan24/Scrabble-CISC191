import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScrabbleGame
{
		private JFrame frame;
		private final int WINDOW_WIDTH = 900;
		private final int WINDOW_HEIGHT = 750;
		private JPanel space;
	    private JPanel score;
	    private JPanel rack;

		public void ScrabbleGame()
		{
			Board();
		}

		public void Board()
	 {
		 Color scrabble = new Color(255, 239, 191);
		 
		 frame = new JFrame();
		 frame.setTitle("Scrabble");
		 frame.setBackground(Color.red);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		 frame.setResizable(false);
		 
	
		 space = new JPanel(new GridLayout(15, 15));
		 space.setSize(100, 400);
		 space.setBackground(scrabble);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 frame.add(space, BorderLayout.CENTER);
		 
		 frame.setVisible(true);
	 }

	
	public static void main(String[] args)
	{
		ScrabbleGame scrabble = new ScrabbleGame();
		scrabble.Board();
	}

}
