import java.util.ArrayList;
import java.util.Collections;

public class Bag
{
	private ArrayList<Tile> tiles;
	
	public Bag()
	{
		this.makeTiles();
		Collections.shuffle(tiles);
	}
	
	public ArrayList<Tile> addTile(Tile newTile)
	{
		tiles.add(newTile);
		return tiles;
	}
	
	public Tile takeTile(Tile tile)
	{
		tiles.remove(tile);
		
		return tile;
	}
	
	public void makeTiles()
	{
		Letter letter_A = new Letter("A", 1); // 9 total

		for(int i = 0; i < 9; i++)
		{
			tiles.add(new Tile(letter_A));
		}


		Letter letter_B = new Letter("B", 3); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_B));
		}

		Letter letter_C = new Letter("C", 3); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_C));
		}

		Letter letter_D = new Letter("D", 2); // 4 total
		
		for(int i = 0; i < 4; i++)
		{
			tiles.add(new Tile(letter_D));
		}

		Letter letter_E = new Letter("E", 1); // 12 total
		
		for(int i = 0; i < 12; i++)
		{
			tiles.add(new Tile(letter_E));
		}

		Letter letter_F = new Letter("F", 4); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_F));
		}

		Letter letter_G = new Letter("G", 2); // 3 total
		
		for(int i = 0; i < 3; i++)
		{
			tiles.add(new Tile(letter_G));
		}

		Letter letter_H = new Letter("H", 4); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_H));
		}

		Letter letter_I = new Letter("I", 1); // 9 total
		
		for(int ii = 0; ii < 9; ii++)
		{
			tiles.add(new Tile(letter_I));
		}


		Letter letter_J = new Letter("J", 8); // 1 total

		tiles.add(new Tile(letter_J));

		Letter letter_K = new Letter("K", 5); // 1 total

		tiles.add(new Tile(letter_K));

		Letter letter_L = new Letter("L", 1); // 4 total
		
		for(int i = 0; i < 4; i++)
		{
			tiles.add(new Tile(letter_L));
		}

		Letter letter_M = new Letter("M", 3); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_M));
		}

		Letter letter_N = new Letter("N", 1); // 6 total
		
		for(int i = 0; i < 6; i++)
		{
			tiles.add(new Tile(letter_N));
		}

		Letter letter_O = new Letter("O", 1); // 8 total
		
		for(int i = 0; i < 8; i++)
		{
			tiles.add(new Tile(letter_O));
		}

		Letter letter_P = new Letter("P", 3); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_P));

		}

		Letter letter_Q = new Letter("Q", 10); // 1 total

		tiles.add(new Tile(letter_Q));

		Letter letter_R = new Letter("R", 1); // 6 total
		
		for(int i = 0; i < 6; i++)
		{
			tiles.add(new Tile(letter_R));
		}

		Letter letter_S = new Letter("S", 1); // 4 total
		
		for(int i = 0; i < 4; i++)
		{
			tiles.add(new Tile(letter_S));
		}

		Letter letter_T = new Letter("T", 1); // 6 total
		
		for(int i = 0; i < 6; i++)
		{
			tiles.add(new Tile(letter_T));
		}

		Letter letter_U = new Letter("U", 1); // 4 total
		
		for(int i = 0; i < 4; i++)
		{
			tiles.add(new Tile(letter_U));
		}

		Letter letter_V = new Letter("V", 4); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_V));
		}

		Letter letter_W = new Letter("W", 4); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_W));
		}

		Letter letter_X = new Letter("X", 8); // 1 total

		tiles.add(new Tile(letter_X));

		Letter letter_Y = new Letter("Y", 4); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_Y));

		}

		Letter letter_Z = new Letter("Z", 10); // 1 total

		tiles.add(new Tile(letter_Z));

		Letter letter_BLANK = new Letter(" ", 0); // 2 total
		
		for(int i = 0; i < 2; i++)
		{
			tiles.add(new Tile(letter_BLANK));
		}
	}
	
	
}

