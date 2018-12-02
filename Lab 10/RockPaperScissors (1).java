//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
      playChoice = "";
      compChoice = "";
	}

	public RockPaperScissors(String player)
	{
      playChoice = player; 
	}

	public void setPlayers(String player)
	{
      playChoice = player;
      int oof = (int)Math.random();
      switch(oof)
      {
         case 0 : compChoice = "R"; break;
         case 1 : compChoice = "P"; break;
         case 2 : compChoice = "S"; break;
      }   
	}

	public String determineWinner()
	{
		String winner = "";
      if(playChoice.equals(compChoice))
      {
         winner = "!Draw";
      }
      if((playChoice == "R" && compChoice == "S") || (playChoice == "S" && compChoice == "P") || (playChoice == "P" && compChoice == "R"))
      {
         winner = "!Player";
      }
      if((compChoice == "R" && playChoice == "S") || (compChoice == "S" && playChoice == "P") || (compChoice == "P" && playChoice == "R"))
      {
         winner = "!Computer";
      }
		return winner;
	}

	public String toString()
	{
      String output = "";
      if((playChoice == "R" && compChoice == "S") || (playChoice == "S" && compChoice == "R"))
      {
         output = "Rock Breaks Scissors";
      }
      if((playChoice == "R" && compChoice == "P") || (playChoice == "P" && compChoice == "R"))
      {
         output = "Paper Covers Rock";
      }
      if((playChoice == "P" && compChoice == "S") || (playChoice == "S" && compChoice == "P"))
      {
         output = "Scissors Cuts Paper";
      }    
		return output;
	}
}