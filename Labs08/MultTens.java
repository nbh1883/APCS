//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
    String answer="";		
    
      if (x <= 0)
         return "aplus";
      for(int ten = 10;ten <= x*10; ten+=10)
      {
         answer += ten;
      }
      return answer;
     
	}
}