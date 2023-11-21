import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScrabbleGame
{
	private JFrame frame;
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 775;
	private JPanel space;
	private JPanel score;
	private JPanel rack;
	private JButton[][] spaces = new JButton[15][15];
	private Color lb = new Color(128, 243, 255);

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

		space = new JPanel(new GridLayout(15, 15, 2, 3));

		space.setSize(100, 400);
		space.setBackground(scrabble);

		for (int row = 0; row < spaces.length; row++)
		{
			for (int column = 0; column < spaces.length; column++)
			{
				spaces[row][column] = new JButton();
				space.add(spaces[row][column]);

			}
		}

		spaces[0][0].setText("TW");
		spaces[0][0].setBackground(Color.red);
		spaces[0][0].setOpaque(true);

		spaces[0][3].setText("DL");
		spaces[0][3].setBackground(lb);
		spaces[0][3].setOpaque(true);

		spaces[0][7].setText("TW");
		spaces[0][7].setBackground(Color.red);
		spaces[0][7].setOpaque(true);

		spaces[0][11].setText("DL");
		spaces[0][11].setBackground(lb);
		spaces[0][11].setOpaque(true);

		spaces[0][14].setText("TW");
		spaces[0][14].setBackground(Color.red);
		spaces[0][14].setOpaque(true);

		spaces[1][1].setText("DW");
		spaces[1][1].setBackground(Color.pink);
		spaces[1][1].setOpaque(true);

		spaces[1][5].setText("TL");
		spaces[1][5].setBackground(Color.blue);
		spaces[1][5].setOpaque(true);

		spaces[1][9].setText("TL");
		spaces[1][9].setBackground(Color.blue);
		spaces[1][9].setOpaque(true);

		spaces[1][13].setText("DW");
		spaces[1][13].setBackground(Color.pink);
		spaces[1][13].setOpaque(true);

		spaces[2][2].setText("DW");
		spaces[2][2].setBackground(Color.pink);
		spaces[2][2].setOpaque(true);

		spaces[2][6].setText("DL");
		spaces[2][6].setBackground(lb);
		spaces[2][6].setOpaque(true);

		spaces[2][8].setText("DL");
		spaces[2][8].setBackground(lb);
		spaces[2][8].setOpaque(true);

		spaces[2][12].setText("DW");
		spaces[2][12].setBackground(Color.pink);
		spaces[2][12].setOpaque(true);

		spaces[3][0].setText("DL");
		spaces[3][0].setBackground(lb);
		spaces[3][0].setOpaque(true);

		spaces[3][3].setText("DW");
		spaces[3][3].setBackground(Color.pink);
		spaces[3][3].setOpaque(true);

		spaces[3][7].setText("DL");
		spaces[3][7].setBackground(lb);
		spaces[3][7].setOpaque(true);

		spaces[3][11].setText("DW");
		spaces[3][11].setBackground(Color.pink);
		spaces[3][11].setOpaque(true);

		spaces[3][14].setText("DL");
		spaces[3][14].setBackground(lb);
		spaces[3][14].setOpaque(true);

		spaces[4][4].setText("DW");
		spaces[4][4].setBackground(Color.pink);
		spaces[4][4].setOpaque(true);

		spaces[4][10].setText("DW");
		spaces[4][10].setBackground(Color.pink);
		spaces[4][10].setOpaque(true);

		spaces[5][1].setText("TL");
		spaces[5][1].setBackground(Color.blue);
		spaces[5][1].setOpaque(true);

		spaces[5][5].setText("TL");
		spaces[5][5].setBackground(Color.blue);
		spaces[5][5].setOpaque(true);

		spaces[5][9].setText("TL");
		spaces[5][9].setBackground(Color.blue);
		spaces[5][9].setOpaque(true);

		spaces[5][13].setText("TL");
		spaces[5][13].setBackground(Color.blue);
		spaces[5][13].setOpaque(true);

		spaces[6][2].setText("DL");
		spaces[6][2].setBackground(lb);
		spaces[6][2].setOpaque(true);

		spaces[6][6].setText("DL");
		spaces[6][6].setBackground(lb);
		spaces[6][6].setOpaque(true);

		spaces[6][8].setText("DL");
		spaces[6][8].setBackground(lb);
		spaces[6][8].setOpaque(true);

		spaces[6][12].setText("DL");
		spaces[6][12].setBackground(lb);
		spaces[6][12].setOpaque(true);

		spaces[7][0].setText("TW");
		spaces[7][0].setBackground(Color.red);
		spaces[7][0].setOpaque(true);

		spaces[7][3].setText("DL");
		spaces[7][3].setBackground(lb);
		spaces[7][3].setOpaque(true);

		spaces[7][7].setText("*");
		spaces[7][7].setBackground(Color.pink);
		spaces[7][7].setOpaque(true);

		spaces[7][11].setText("DL");
		spaces[7][11].setBackground(lb);
		spaces[7][11].setOpaque(true);

		spaces[7][14].setText("TW");
		spaces[7][14].setBackground(Color.red);
		spaces[7][14].setOpaque(true);

		spaces[8][2].setText("DL");
		spaces[8][2].setBackground(lb);
		spaces[8][2].setOpaque(true);

		spaces[8][6].setText("DL");
		spaces[8][6].setBackground(lb);
		spaces[8][6].setOpaque(true);

		spaces[8][8].setText("DL");
		spaces[8][8].setBackground(lb);
		spaces[8][8].setOpaque(true);

		spaces[8][12].setText("DL");
		spaces[8][12].setBackground(lb);
		spaces[8][12].setOpaque(true);

		spaces[9][1].setText("TL");
		spaces[9][1].setBackground(Color.blue);
		spaces[9][1].setOpaque(true);

		spaces[9][5].setText("TL");
		spaces[9][5].setBackground(Color.blue);
		spaces[9][5].setOpaque(true);

		spaces[9][9].setText("TL");
		spaces[9][9].setBackground(Color.blue);
		spaces[9][9].setOpaque(true);

		spaces[9][13].setText("TL");
		spaces[9][13].setBackground(Color.blue);
		spaces[9][13].setOpaque(true);

		spaces[10][4].setText("DW");
		spaces[10][4].setBackground(Color.pink);
		spaces[10][4].setOpaque(true);

		spaces[10][10].setText("DW");
		spaces[10][10].setBackground(Color.pink);
		spaces[10][10].setOpaque(true);

		spaces[11][0].setText("DL");
		spaces[11][0].setBackground(lb);
		spaces[11][0].setOpaque(true);

		spaces[11][3].setText("DW");
		spaces[11][3].setBackground(Color.pink);
		spaces[11][3].setOpaque(true);

		spaces[11][7].setText("DL");
		spaces[11][7].setBackground(lb);
		spaces[11][7].setOpaque(true);

		spaces[11][11].setText("DW");
		spaces[11][11].setBackground(Color.pink);
		spaces[11][11].setOpaque(true);

		spaces[11][14].setText("DL");
		spaces[11][14].setBackground(lb);
		spaces[11][14].setOpaque(true);

		spaces[12][2].setText("DW");
		spaces[12][2].setBackground(Color.pink);
		spaces[12][2].setOpaque(true);

		spaces[12][6].setText("DL");
		spaces[12][6].setBackground(lb);
		spaces[12][6].setOpaque(true);

		spaces[12][8].setText("DL");
		spaces[12][8].setBackground(lb);
		spaces[12][8].setOpaque(true);

		spaces[12][12].setText("DW");
		spaces[12][12].setBackground(Color.pink);
		spaces[12][12].setOpaque(true);

		spaces[13][1].setText("DW");
		spaces[13][1].setBackground(Color.pink);
		spaces[13][1].setOpaque(true);

		spaces[13][5].setText("TL");
		spaces[13][5].setBackground(Color.blue);
		spaces[13][5].setOpaque(true);

		spaces[13][9].setText("TL");
		spaces[13][9].setBackground(Color.blue);
		spaces[13][9].setOpaque(true);

		spaces[13][13].setText("DW");
		spaces[13][13].setBackground(Color.pink);
		spaces[13][13].setOpaque(true);

		spaces[14][0].setText("TW");
		spaces[14][0].setBackground(Color.red);
		spaces[14][0].setOpaque(true);

		spaces[14][3].setText("DL");
		spaces[14][3].setBackground(lb);
		spaces[14][3].setOpaque(true);

		spaces[14][7].setText("TW");
		spaces[14][7].setBackground(Color.red);
		spaces[14][7].setOpaque(true);

		spaces[14][11].setText("DL");
		spaces[14][11].setBackground(lb);
		spaces[14][11].setOpaque(true);

		spaces[14][14].setText("TW");
		spaces[14][14].setBackground(Color.red);
		spaces[14][14].setOpaque(true);

		rack = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JLabel value = new JLabel();
		value.setText(
				"<html>  A = 1,  B = 3, C = 3, D = 2, E = 1, F = 4, G = 2, H = 4 <br>  I = 1, J = 8, K = 5, L = 1, M = 3, N = 1, O = 1, P = 3, Q = 10 <br>  R = 1, S = 1, T = 1, U = 1, V = 4, W = 4, X = 8, Y = 4, Z = 10 </html>");
		rack.add(value);
		
		score = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel tally = new JLabel();
		tally.setText("PLAYER SCORE");
		score.add(tally);

		frame.add(space, BorderLayout.CENTER);
		frame.add(rack, BorderLayout.SOUTH);
		frame.add(score, BorderLayout.EAST);

		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		ScrabbleGame scrabble = new ScrabbleGame();
		scrabble.Board();
	}

}
