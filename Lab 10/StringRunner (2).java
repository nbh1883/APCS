//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		//add test cases
      BiggestString oof = new BiggestString("abc","cba","bca");
      System.out.println(oof);
      System.out.println();
      oof.setStrings("one","fourteen","twenty");
      System.out.println(oof);
      System.out.println();
      oof.setStrings("124323","20009","3434");
      System.out.println(oof);
      System.out.println();
      oof.setStrings("abcde","ABCDE","1234234324");
      System.out.println(oof);
      System.out.println();
	}
}