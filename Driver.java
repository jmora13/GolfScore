//Jose Mora
//CIS 256
//02-04-2016
//Project 1

import java.util.Scanner; //Program uses scanner 

public class Driver {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		GolfScore golfscore1 = new GolfScore(); //creates golf score card for player 1
		GolfScore golfscore2 = new GolfScore(); //creates golf score card for player 2
	  	 
		  System.out.print("Player 1 add stroke to which hole? "); //prompts user to add stroke
		  int a = keyboard.nextInt(); //reads input
	      golfscore1.add(a); //calls add method
	      
	      System.out.print("Player 2 add stroke to which hole? "); //prompts user to add stroke
	      int b = keyboard.nextInt(); //reads input
	      golfscore2.add(b); //calls add method
	      
	      System.out.print("Player 1 remove stroke from which hole? "); //prompts user to remove stroke
	      int c = keyboard.nextInt(); //reads input
	      golfscore1.remove(c); //calls remove method
	      
	      System.out.print("Player 2 remove stroke from which hole? "); //prompts user to remove stroke
	      int d = keyboard.nextInt(); //reads input
	      golfscore2.remove(d); // calls remove method
	      
	      System.out.println("\nGolfscores:"); //golf score header
	      System.out.println(golfscore1.toString()); //calls toString to output total golf scores
	      System.out.println(golfscore2.toString());
	      
	      System.out.println("\nPlayer 1 which hole do you want to see score of?"); //see score for specific hole
	      int e = keyboard.nextInt(); 
	      System.out.println(golfscore1.getScore(e));	 
		
		  System.out.println("\nTotal scores for both players: "); //total score header
		  System.out.println("Player 1 score: " + golfscore1.total()); //calls total score for player 1
		  System.out.println("Player 2 score:" + golfscore2.total()); //calls total score for player 2 
		  
		  GolfScore.winner(golfscore1, golfscore2); //outputs winner by calling winner method
		  
		  if (golfscore1.equals(golfscore2))
		  	   System.out.println( "\n" + golfscore1 + " and \n" + golfscore2 + " are equal");
		  	else
		  	      System.out.println( "\n" + golfscore1 + " and " + golfscore2 + " are NOT equal");
		  
		  golfscore1.reset();
		  golfscore2.reset();
	}

}
