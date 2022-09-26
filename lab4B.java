/*Program/Project: Lab4A - Input Validation
 * *Name: William Spencer
 * Date: October 4, 2021
 * Instructor: Sister Kristi Hays
 * Description: validating the input through a program.
 */

package week4;

import java.util.Scanner;

public class lab4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input ="";
		int num1=0;
		int num2=0;
		int num3=0;
		boolean valid=false;
		
		//do while loop
		do {
			System.out.print("Please enter a whole number: ");
			input = in.nextLine();
			
			try{
				num1 = Integer.parseInt(input);
				valid = true;

		 

		          } catch (Exception e) {
		        	  System.out.println("Error: Please enter a whole number.\n");

		 

		          } //end of try/catch
			
		}while (!(valid));
		
		num2 = (num1 + 1000);//calculations to print
		num3 = (num1 * 2);
				
		System.out.println("num1 = " + num1 +".\nnum2 = " + num2 + ".\nnum3 = " + num3 + ".");
		
		
	}//end of main
		

}//end of lab 4b


