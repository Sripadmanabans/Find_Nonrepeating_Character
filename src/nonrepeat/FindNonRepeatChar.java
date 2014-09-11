package nonrepeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindNonRepeatChar 
{
	private static Character findChar(String inputString) 
	{
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		Character c;
		for(int i = 0; i < inputString.length(); i++)
		{
			c = inputString.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, 2);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for( int i = 0; i < inputString.length(); i++)
		{
			c = inputString.charAt(i);
			if(map.get(c) == 1)
			{
				return c;
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException
	{
		String inputString;
		Character c;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String : ");
		inputString = input.readLine();
		c = findChar(inputString);
		System.out.println("The First non repeated character is ' " + c + " '");
	}
}
