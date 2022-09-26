/*Program/Project: Lab3c - Sunday Classes
 * *Name: William Spencer
 * Date: September 29, 2021
 * Instructor: Sister Kristi Hays
 * Description: Determine the class members should attend on sunday.
 */

package week3;
import java.util.Scanner;

public class lab3C {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner for integers
		Scanner iIn = new Scanner(System.in);
		
		//Scanner for strings
		Scanner sIn = new Scanner(System.in);
		
		//Display program message
		System.out.println("This program will as a member's age and gender to determine the class");
		
		//Ask the user for their age
		System.out.println("Please enter your age: ");
		int age = iIn.nextInt();
		
		//nested if statement for information
		if (age >= 18) {//Priestood or Relief Society
			//Determine class based on gender
			System.out.println("Please enter the member's gender: ");
			String gender = sIn.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Priesthood. ");
				
			} else if (gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend Relief Society. ");
				
			} else {
				System.out.println("Invalid repsonse, please enter M or F for gender");
				
			}//end of 18 years or older if statements
		
		} else if (age >= 12) {//Young Mens or Young Womens
			//determine the class based on gender
			System.out.println("Please enter the member's gender: ");
			String gender = sIn.nextLine();
			
			if (gender.equalsIgnoreCase("M")) {
				System.out.println("The member should attend Young Mens");
				
			}else if (gender.equalsIgnoreCase("F")) {
				System.out.println("The member should attend young womens");
				
			}else {
				System.out.println("Invalid response, please use M or F to indentify gender");
			}//end of young mens and young womens nested if statements
			
		} else if (age >= 3) {//no gender required
			System.out.println("The member should attend primary. ");
			
		}else if (age >= 1) {//no gender required
			System.out.println("The member should attend nursery. ");
		
		} else {
			System.out.println("The member should stay with their parents. ");
				
		}//end of if, else if, and else statements

	}//end of main
}//end of lab 3c