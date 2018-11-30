//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Factorial
{
	private int number;



	public Factorial()
	{
		number = 0;
	}



	public Factorial(int num)
	{
		setNum(num);
	}



	public void setNum(int num)
	{
		number = num;
	}



	public int getNumber()
	{
		return number;
	}



	public long getFactorial( )
	{
		long factorial= 1 ;
		
		for(int i = number; i > 0; i--)
			factorial = factorial * i;

		return factorial;
	}



	public String toString()
	{
		return "factorial of " + getNumber() + " is "+ getFactorial()+"\n";
	}
}