package random.java;

import java.util.Random;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */
		int array[] = new int[50];
		int total = 0;
		    
		    //note a single Random object is reused here
		    Random randomGenerator = new Random();
		    for (int i = 0; i < 50; ++i){
		      int randomInt = randomGenerator.nextInt(500);
		      array[i] = randomInt;
		      System.out.println(array[i] );
		     
		    }
		    
		    for (int i = 0; i < 50; ++i){
			      int evenNumber  = array[i];
			      total = array[i]+ total;
			      if((evenNumber%2) == 0){
			      System.out.println(array[i] );
			      }
			    } 
		    System.out.println(" Total :"+total);
		   
		  }
		  
		 
		
	}


