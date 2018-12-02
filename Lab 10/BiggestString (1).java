//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
      one = a;
      two = b;
      three = c;
	}

	public void setStrings(String a, String b, String c)
	{
      one = a;
      two = b;
      three = c;
	}

	public String getBiggest()
	{
		if(one.compareTo(two) > 0 && one.compareTo(three) > 0)
      {
         return one;
      }
      else if(two.compareTo(one) > 0 && two.compareTo(three) > 0)
      {
         return two;
      }
      else return three; 
	}

	public String toString()
	{
	   return one + " " + two + " " + three + "\n" + "biggest = " + getBiggest();
	}
}