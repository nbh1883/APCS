//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;



	public Word()
	{
		word = "";
	}



	public Word(String s)
	{
		setString(s);
	}



	public void setString(String s)
	{
		word = s;
	}



	public char getFirstChar()
	{
		char ch = 0;
		ch = word.charAt(0);
		return ch;
	}



	public char getLastChar()
	{
		char ch = 0;
		ch = word.charAt(word.length() - 1);
		return ch;
	}



	public String getBackWards()
	{
		String back="";
		
		for(int i = (word.length() - 1); i > -1 ; i--)
			{
				back = back + word.charAt(i);	
			}		return back;
	}



 	public String toString()
 	{
 		 		return word; 
	}
}