import java.util.Scanner;

public class guessingGameApp {

	public static int getWithinRange (int guess) {
	
		int limit = 100;
		if (guess < 1 || guess > limit) {
		System.out.println("Invalid guess. Try again.");
		}
		return guess;	
		
	}
	
	
	public static void main(String[] args) {
		
		  System.out.println("Welcome to the Guess the Number Game");
		  System.out.println("====================================");
		  System.out.println();
	      System.out.println("I'm thinking of a number from 1 to 100");
	      System.out.println("Try to guess it.");
	      System.out.println();
	      
	      int guess = 0;
	      int limit = 100;
	      
	      double d = Math.random() * limit; // d is >= 0.0 and < limit
	      int number = (int) d; 
	      number++;
	      System.out.println(number);
	      int guessNum = 0;
	     
	      Scanner sc = new Scanner (System.in);
	      String choice = "y";

	      while (choice.equalsIgnoreCase("y")) {
	      
		      while (guess != number) {
		        
		    	  Scanner sc1 = new Scanner(System.in);  
		    	  System.out.println("Enter Number:   ");
		      		guess = sc1.nextInt();
		      		
		      		getWithinRange(guess);
		      		
	///	      	  if (guess < 1 || guess > limit) {
	///	               System.out.println("Invalid guess. Try again.");
	///	               continue;
	///	      	  }
		      	
		      	  if ((guess - 10) > (number)) {
		      			System.out.println("Way Too High");	}   
		      			
		      	  		else if (guess > number) {
		      	  			System.out.println("Too High");}
	
		      	  if ((guess + 10) < (number))  {    
		      		  System.out.println("Way Too Low");  }
		      	   else if (guess < number) {
		    	      System.out.println("Too Low"); 	  }
		      	  
		      	  guessNum ++;
		      
		      	  if (guess == number) {
		      		  System.out.print("You got it in " + guessNum + " tries.");  }
		      
		      
		      	}
	      	 
	      if (guessNum <= 3) {
      		  System.out.println("Great work! You are a mathematical wizard");
      		  }	  
	   
			 if (guessNum > 3 || guessNum <= 7) {
     	  		System.out.println("Not too bad! You've got some potential.");
      	  		}
      	
      	  	else {	      	  		System.out.println("What took you so long? Maybe you should take some lessons");
	      	  		
	      	  	}
	      
	
	      	System.out.println();
			System.out.print("Try Again (y/n): ");
			String choice1 = sc.next();
				while (!choice1.equals("y") || !choice1.equals ("n")) {
			System.out.print("Please enter y or n. ");}
	      }	

	} 
	
}
