// Julia Magalhaes 16/10/18
// 

import java.util.Scanner; // must import in order to use a scanner
import java.util.*; // must import in order to generate random number

public class quiz
{
	public static void main (String[] p)
	{
		System.out.println("");
		System.out.println("");
		System.out.println("JULIA'S MUSIC QUIZ");		
		System.out.println("");	
		question1(); // method where the question is asked
		
	}	


	public static int question1 ()
	{
		int score=0;
		String answer1; // declaring the string corresponding to the users first answer
		
		
		
		Scanner scanner = new Scanner(System.in); // creating the scanner
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Your Score is: " + score);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. What famous band sang the song 'Come Together'?"); // asking the first question
		System.out.println("A: The Rolling Stones");
		System.out.println("B: ABBA");
		System.out.println("C: The Beatles");
		System.out.println("D: Nirvana");
		
		answer1 = scanner.nextLine(); //getting the users answer
		int score1 = markq1(answer1);
		
		return score;

				
	}

	public static int markq1(String q1)
	{
		int score=0; // the user's initial score is 0
		int Low = 1;
		int High = 6; // used to generate dice roll if answer is correct. Ensures the mark awarded cannot be 0

	
		Random dice = new Random();		
		
		if (q1.equals("C"))
		{
			score = dice.nextInt(High-Low) + Low; // a "dice is rolled", and a random score is generated for the user
			System.out.println("That is the correct answer!"); // if the user gets the answer correct they are told
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Your Score is now: " + score);
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
		}
		else if (q1.equals("c"))
		{
			score = dice.nextInt(High-Low) + Low; // a "dice is rolled", and a random score is generated for the user
			System.out.println("That is the correct answer!"); // if the user gets the answer correct they are told
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Your Score is now: " + score);
			System.out.println("~~~~~~~~~~~~~~~~~~~~");		
		}		
		else
		{
			System.out.println("Sorry, the correct answer was C"); // the user is told they were wrong and what the correct answer is
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Your Score is still: " + score);
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
		}

		return score;
	}

}



