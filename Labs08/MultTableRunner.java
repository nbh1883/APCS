//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;




public class MultTableRunner
{
	public static void main ( String[] args )
	{
				
		MultTable table = new MultTable(5, 5);
		
		
		
		table.printTable();
		
		table.setTable(3, 7);
		   table.printTable();
		      table.setTable(1, 6);
		          table.printTable();
		         	table.setTable(9, 9);
		               table.printTable();
                        table.setTable(7, 8);
		                      table.printTable();
		

		
	}
}