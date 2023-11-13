
public class Letter
{	
	private String letter;
	private int point;
	
	public Letter(String newLetter, int newPoint)
	{
		this.letter = newLetter;
		this.point = newPoint;
	}

	public String getLetter()
	{
		return letter;
	}
	
	public int getPoint()
	{
		return point;
	}
	
	public void setLetter(String newLetter)
	{
		this.letter = newLetter;
	}
	
	public void setPoint(int newPoint)
	{
		this.point = newPoint;
	}
}
