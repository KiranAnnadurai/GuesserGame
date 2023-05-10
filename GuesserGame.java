package coreJava;

import java.util.Scanner;

class Guesser
{
	// guessNumber method will return the number guessed by this Guesser class
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello Guesser, please guess a number: ");
		int guessedNumber = scan.nextInt();
		return guessedNumber;	
	}
}

class Player
{
	// guessNumber method will return the number guessed by this Player class
	public int guessNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello Player, please guess a number: ");
		int numberFromPlayer = scan.nextInt();	
		return numberFromPlayer;
	}
}

class Umpire
{
	// Object creation for Guesser class
	Guesser guesser = new Guesser();
	
	// Object creation for Player class. Here we create three player objects which involves 3 players in this game
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromGuesser;
	
	// CollectTheGuessedNumbers method will store the guessed numbers from Guesser and Players
	
	public void CollectTheGuessedNumbers()
	{
		numFromGuesser = guesser.guessNumber();
		numFromPlayer1 = p1.guessNumber();
		numFromPlayer2 = p2.guessNumber();
		numFromPlayer3 = p3.guessNumber();
	}
	
	public void CompareTheGuessedNumbers()
	{
		if(numFromPlayer1 == numFromGuesser)
		{
			if((numFromPlayer3 == numFromGuesser) && (numFromPlayer2 == numFromGuesser))
			{
				System.out.println("All won the game");
			}
			else if(numFromPlayer2 == numFromGuesser)
			{
				System.out.println("Player 1 and player 2 won the game");
			}
			else if(numFromPlayer3 == numFromGuesser)
			{
				System.out.println("Player 1 and player 3 won the game");
			}
			else
			{
				System.out.println("Player 1 won the game");
			}
		}
		else if(numFromPlayer2 == numFromGuesser)
		{
			if(numFromPlayer3 == numFromGuesser)
			{
				System.out.println("Player 2 and player 3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		else if(numFromPlayer3 == numFromGuesser)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("None of the players guessed the correct number, Play Again");
		}
	}
	
}
public class GuesserGame {

	public static void main(String[] args) {
		// Object creation for Umpire class which will check the validity of the number guessed by Guesser and Player
		Umpire u = new Umpire();
		System.out.println("The player who guessed correctly will win the game");
		u.CollectTheGuessedNumbers();
		u.CompareTheGuessedNumbers();
	}

}
