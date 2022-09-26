/*Program/Project: Lab2b - Calculating Area
 * *Name: William Spencer
 * Date: September 22, 2021
 * Instructor: Sister Kristi Hays
 * Description: Calculating the area of squares and rectangles.
 */

package week2;
import java.util.Scanner;

public class lb2b {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner for the user input
		Scanner in = new Scanner(System.in);
		
		//Ask the user for the width of the square
		System.out.println("Please enter the width of the square: ");
			int sqWidth = in.nextInt();
			
		//Ask the user for the width of the rectangle
		System.out.println("Please enter the width of the rectangle: ");
			int recWidth = in.nextInt();
			
		//Ask the user for the height of the rectangle
		System.out.println("Please enter the height of the rectangle: ");
			int recHeight = in.nextInt();
			
		//Calculate the areas
		int sqArea = sqWidth * sqWidth;
		int recArea = recWidth * recHeight; 
		
		//Display results to the console
		System.out.println("The area of a square with a width of "  +  sqWidth  + " is "  + sqArea +  ".");
		
		System.out.println("The area of a rectangle with a width of "  +  recWidth +  " and a height of "  + recHeight  + " is "  +  recArea + ". ");
		
	}//end of main

}//end of lab2b
