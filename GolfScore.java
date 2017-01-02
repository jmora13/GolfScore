//Jose Mora
//CIS 256
//02-04-2016
//Project 1

import java.util.*;

public class GolfScore {
	
	private int[] golfScoreCard; // array to store golf scores
	
	public GolfScore() {
		golfScoreCard = new int[18]; //18 holes in golf game
		for (int x = 0; x <= 17; x++){
			golfScoreCard[x] = 0; //initializes all scores to zero 		
		}
	}
	
	public GolfScore copy(GolfScore obj) { //makes GolfScore copy
		GolfScore temp = new GolfScore(); // stores new golf score in temp object
	 	for (int x = 0; x <= golfScoreCard.length; x++) { //iterate through score card to input values
	 	    temp.golfScoreCard[x] = golfScoreCard[x];
	 	}
	 	return temp; //return value of temp 
	}
	
	public void add(int holeNumber) {	 //adds stroke for indicated hole number
		if (validHole(holeNumber)) { //checks to see if user input is valid
		   golfScoreCard[holeNumber - 1] += 1; // -1 bc counter starts at 0
		} else {
		      System.out.println("Hole " + holeNumber + " does not exist!"); //if hole number too high or low
		   }
	}
	
	public void remove(int holeNumber) { //removes one stroke
		if (validHole(holeNumber)){
		    golfScoreCard[holeNumber-1] -= 1;
		} else {
		    try {
			 throw new GolfException(); // throw new exception
		     } catch (GolfException e) { 
				System.out.println(e.getMessage()); //prints message 
			   }  
		  }
	 }
	
	public boolean validHole(int holeNumber){ //checks to see if hole is between 1-18
		if (holeNumber > 0 && holeNumber <= 18) {
			return true; //true if between 1-18
		} else {
			return false; //false if not between 1-18
		  } 	
	}
	
	public int getScore(int holeNumber) { //gets score for a specific hole
		if(validHole(holeNumber)){
		return golfScoreCard[holeNumber-1]; // - 1 bc counter begins at 0
		} else {
			return 0;
		  }
	 }
	
	public static GolfScore winner(GolfScore score1, GolfScore score2 ) { //compares total of two golfscores
		if (score1.total() > score2.total()) {                            // and determines higher number
			return score1; //if scores 1 is higher, return score 1
		} else if(score1.total() < score2.total()) {
			return score2; // return score 2 if its higher 
		} else {
			return null; //if tie, no winner and return null
		}
	}
	
	public int total() { //gets total score of golf score card 
		int total = 0;
		for(int x = 0; x < golfScoreCard.length; x++) {
			total = golfScoreCard[x] + total; // sums up total score of 18 holes
		}
		return total; // return sum
	
	}
	
	public boolean equals (Object obj) { //checks equality of two golf score objects
		if (obj instanceof GolfScore) {  //check if obj is golf score object
			GolfScore temp = (GolfScore) obj; // put value into temp golf score obj
		   return total() == temp.total(); //check to see if total is same value as temp
		}	
		else {
	       return false; //return false if not golf score object 
		}
	}
	public String toString(){ //outputs all scores onto one line
		return Arrays.toString(golfScoreCard);
		}

	public void reset() { //resets all scores back to zero
	 for (int i = 0; i < golfScoreCard.length; i++)
	            golfScoreCard[i] = 0;
    }
}
	
	
	

