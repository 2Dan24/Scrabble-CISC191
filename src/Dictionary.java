import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dictionary
{
	Set<String> words = new HashSet<>();
	
	
	public void load()
	{
		try {
		BufferedReader dictionary = new BufferedReader(new FileReader("sowpods.txt"));
		String line;
		
		while((line = dictionary.readLine()) != null)
		{
			dictionary.readLine();
		}
		
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public void lookUpWord()
	{
		
	}
}
