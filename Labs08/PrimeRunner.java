//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

// Lab Chapter 8 - #9  Prime    2016

// Uses files PrimeRunner.java and Prime.java


public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime prime = new Prime(24);
		out.println(prime);
		out.println();
		
		prime.setPrime(7);
		out.println(prime);
		out.println();
		
		prime.setPrime(100);
		out.println(prime);
		out.println();
		
		prime.setPrime(113);
		out.println(prime);
		out.println();
		
		prime.setPrime(113);
		out.println(prime);
		out.println();
		
		prime.setPrime(65535);
		out.println(prime);
		out.println();
		
		prime.setPrime(2);
		out.println(prime);
		out.println();
		
		prime.setPrime(7334);
		out.println(prime);
		out.println();
		
		prime.setPrime(7919);
		out.println(prime);
		out.println();
		
		prime.setPrime(1115125003);
		out.println(prime);
		out.println();	
	}	
}