//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
      RockPaperScissors game = new RockPaperScissors();
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
      char yesOrNo = 'Y';
      do
      {		
			String player = "";
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			response = keyboard.next().charAt(0);
			//read in the player value
         game.setPlayers(player);
         game.determineWinner();
         System.out.println("player had " + response + "\n" + "computer had " + compChoice + "\n" + determineWinner() + " wins " + "<<" + beat + ">>!");
      } 
      while(yesOrNo != 'N');   		
	}
}




/*String beats = "";
      if((playChoice == "R" && compChoice == "S") || (playChoice == "S" && compChoice == "R"))
      {
         beats = "Rock Breaks Scissors";
      }
      if((playChoice == "R" && compChoice == "P") || (playChoice == "P" && compChoice == "R"))
      {
         beats = "Paper Covers Rock";
      }
      if((playChoice == "P" && compChoice == "S") || (playChoice == "S" && compChoice == "P"))
      {
         beats = "Scissors Cuts Paper";
      }
		String compChoiceSpelledOut = "";
      String playChoiceSpelledOut = "";      
      String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + " wins " + "<<" + beats + ">>!";
		return output;
      String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner() + " wins " + "<<" + beats + ">>!";
       */