//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MultTable
{
	// instance variables number and stop are declared
	// remember that these variables are permanent
	private int number;
	private int stop;




	// default constructor
	// SAME NAME AS THE CLASS and no return type
	public MultTable()
	{
		number = stop = 0;
	}




	// initializer constructor 
	// SAME NAME AS THE CLASS and no return type
	// int variables num and end are created and receive beginning values 
	//    to store in our instance variables number and stop
	public MultTable(int num, int end)
	{
		setTable(num, end);	
	} // int variables num and end are erased or destroyed at the end of this constructor



	// modifier or setter method
	// int variables num and end are created and receive new values 
	//    to store in our instance variables number and stop
	public void setTable(int num, int end)
	{
		number = num;
		stop = end;	
	}  // int variables num and end are erased or destroyed at the end of this method




	public void printTable( )
	{
		// STEP 1:  *****************************************************************
		// print out  Multiplication table for ? 
		//     where ? is the value of your variable number
		
		out.println("Multiplication table for " + number);
		
		
		
		// STEP 2:  *****************************************************************
		// You will need a loop that goes from 1 to end (inclusive)
		// each time through the loop you will need to print out
		//     your loop value, some spaces, and your loop value * number
		
		
		for (int i = 0;   i <= stop;  i++)
		// {
				// println your loop value, some spaces, and your loop value * number
				System.out.println( i + "     " + i*number);
		// }
		
		
		
		// STEP 3:  *****************************************************************
		System.out.println();
		System.out.println();
		
		
		
		
		
	}
}