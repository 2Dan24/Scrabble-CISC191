import java.util.ArrayList;

public class Bag
{
	private Bag bag;
	private ArrayList<Tile> tiles;
	
	public Bag(Bag newBag)
	{
		bag = newBag;
		tiles = new ArrayList<Tile>();
	}
	
	public ArrayList<Tile> addTile(Tile newTile)
	{
		tiles.add(newTile);
		return tiles;
	}
	
}

