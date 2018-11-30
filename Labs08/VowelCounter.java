//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class VowelCounter
{
	public VowelCounter()
	{
		String s = "";
	} 
		
		
	public static String getNumberString( String s)
	{
		int count=0;

		String output="";

		for (int i=0;  i < s.length();  i++)
		{

			char ch = s.charAt(i);
			  			  
			  if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||  ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			  {
			  					  	
			  		output = output + count;
			  		count++;
			  		if(count == 10)
			  		{
			  			count = 0;	
			  		}	
			  		count = count;
			  					  }
			  else
			  {
			  			output=output+ch;
			  			
			  }
			  
		}
		
		return output;  
      	}
}

