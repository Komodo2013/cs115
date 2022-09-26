/*Program/Project: Lab4C - Non-numeric Input Validation
 * Name: William Spencer
 * Date: October 6, 2021
 * Instructor: Sister Kristi Hays
 * Description: Responding to Non-numeric user input.
 */

package week4;
import java.util.Scanner;


public class lab4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner
		Scanner sIn = new Scanner(System.in);
		
		String ansString="";
		
		boolean valid = false;
		
		do {//validate the user input
			//The user input needs to be inside of the loop
			System.out.println("Do you enjoy coding Java?: ");
			
			ansString = sIn.nextLine();//user's answer
			
			if(ansString.equalsIgnoreCase("Y") || ansString.equalsIgnoreCase("N")) {
			valid = true;
			
		} else {
			System.out.println("Error. Please answer with Y for yes or N for no.");
		}
			
		} while(!valid);
			//! - not valid
		
	if(ansString.equalsIgnoreCase("Y")) {
		System.out.println("That's great! I do too!");
		
	} else {
		System.out.println("That is okay! There are many other things that you can look foreward to.");
	}
	
	sIn.close();
		

	}//end of main

}//end of lab4c
