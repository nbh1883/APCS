//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class WordRunner
{
	public static void main ( String[] args )
	{

		
		Word word = new Word("Hello");
		
		
		out.println("Original Word: " + word);
		
		
		
		out.println("First Letter:  " + word.getFirstChar());
		
		
		
		out.println("Last Letter:   " + word.getLastChar());
		
		
		
		
		out.println("Backwards:     " + word.getBackWards());
		
		
		

		out.println("");
		   out.println("");
		
		
		word.setString("World");
			   out.println("Original Word: " + word);
			      out.println("First Letter:  " + word.getFirstChar());
			         out.println("Last Letter:   " + word.getLastChar());
			            out.println("Backwards:     " + word.getBackWards());
			               out.println("");
			                  out.println("");
		
		word.setString("JukeBox");
			   out.println("Original Word: " + word);
			      out.println("First Letter:  " + word.getFirstChar());
			         out.println("Last Letter:   " + word.getLastChar());
			            out.println("Backwards:     " + word.getBackWards());
			               out.println("");
			out.println("");
			
		word.setString("TCEA");
			   out.println("Original Word: " + word);
			      out.println("First Letter:  " + word.getFirstChar());
			         out.println("Last Letter:   " + word.getLastChar());
			            out.println("Backwards:     " + word.getBackWards());
			               out.println("");
			                  out.println("");
		
		word.setString("UIL");
			   out.println("Original Word: " + word);
			      out.println("First Letter:  " + word.getFirstChar());
			         out.println("Last Letter:   " + word.getLastChar());
			            out.println("Backwards:     " + word.getBackWards());
			               out.println("");
			                  out.println("");
		
				
	}
}