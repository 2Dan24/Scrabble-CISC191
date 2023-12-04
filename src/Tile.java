
public class Tile extends Letter
{
	private Letter letter;
	
	public Tile(String newLetter, int newPoint)
	{
		super(newLetter, newPoint);
	}

	

	public Tile(Letter letter)
	{
		super(letter.getLetter(), letter.getPoint());
		this.letter= letter;
	}

}
