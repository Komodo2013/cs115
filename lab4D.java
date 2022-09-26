/*Program/Project: Lab4d - Guessing Game
 * Name: William Spencer
 * Date: October 6, 2021
 * Instructor: Sister Kristi Hays
 * Description: Responding to Non-numeric user input.
 */

package week4;
import java.util.Scanner;
import java.util.Random;

public class lab4D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sIn = new Scanner(System.in); //Scanner for integers
		Scanner iIn= new Scanner(System.in); //scanner for strings
	
		  //Variables (Int,Boolean,Strings
	    Random randomNumber = new Random();
	    Scanner kbd = new Scanner(System.in);
	    int computerValue;
	    int Tries = 0;
	    int win = 0;
	    int guess;
	    boolean playagain;
	    String input = "";
	    
	    //While Loop
	    do {
	        computerValue = randomNumber.nextInt(100);
	        guess = 0;
	        playagain = false;
	        while (guess != computerValue) {
	            System.out.println("Please guess a whole number betwen 1 and 100: ");
	            guess = kbd.nextInt();
	            Tries++;
	            if (guess < 1 || guess > 100) {
	                System.out.println("Error: Please guess a number between 1 and 100. ");
	                
	            } else if (guess < computerValue) {
	                System.out.println("Your guess is too low! Please guess again. ");
	                
	            } else if (guess > computerValue) {
	                System.out.println("Your guess is too high! Please guess again. ");
	            }
	        }
	        
	        //if block - play again
	        System.out.println("Do you want to play again? ");
	        if(input.equalsIgnoreCase("Y")) {
				playagain = true;
				System.out.println("\n\n");
				
	        } else if (input.equalsIgnoreCase("N")) {
				System.out.println("Thank you for playing!");
				playagain = false;
			}		
					
	        	 
	   }while (playagain);
	    
	}//end of main
}//end of lab 4D

	


