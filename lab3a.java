/*Program/Project: Lab3a - Determine Shirt Size
 * *Name: William Spencer
 * Date: September 27, 2021
 * Instructor: Sister Kristi Hays
 * Description: Determine customers shirt size.
 */

package week3;
import java.util.Scanner;

public class lab3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scanner for user input
		Scanner in = new Scanner(System.in);
		
		//Description of program
		System.out.println("This program will determine your shirt size.");
		
		//Asking the user for information
		System.out.println("Please enter your chest size in inches, and we will determine your shirt size");
		
		int chestsize = in.nextInt();
		
		//If and else statements to determine the shirt size
		if (chestsize < 38) {
			System.out.println("A customer customer with a chest measurement of " + chestsize + " inches needs to order a size S. ");
			
		} else if (chestsize >= 38 && chestsize < 40) {
			System.out.println("A customer with a chest measurement of " + chestsize + " inches needs to order a size M.");
			
		} else if (chestsize >= 40 && chestsize < 43) {
			System.out.println("A customer with a chest measurement of " + chestsize + " inches needs to order a size L.");
			
		} else if (chestsize >= 43 && chestsize < 48) {
			System.out.println("A customer with a chest measurement of " + chestsize + " inches needs to order a size XL.");
			
		} else {
			System.out.println("A customer with a chest measurment of " + chestsize + " inches needs to order a size XXL");
			
			
		}//End of if statements
		
		
	}//end of main

}// end of lab3a
