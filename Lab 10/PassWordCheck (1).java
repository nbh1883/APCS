//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
      password = "mrs. woody rocks";
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
      String input = "";
      do
      {
         System.out.print("Enter the password :: ");
         input = keyboard.nextLine();
         if(!(password.equals(input)))
         {
            System.out.println("INVALID");   
         }
         else
         {
            System.out.println("VALID");
         }
      }
      while(!(password.equals(input)));
	}
}