/*Program/Project: Lab2c - Calculating Interest
 * *Name: William Spencer
 * Date: September 22, 2021
 * Instructor: Sister Kristi Hays
 * Description: Calculating the interest over a term of six months of a bank account.
 */

package week2;
import java.util.Scanner;


public class lab2c {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner for the user input
		
		Scanner in = new Scanner(System.in);
				
		//Ask user for the ammount they are depositing
		System.out.println("Please enter the deposited ammount: ");
		float depo = in.nextFloat();
		
		//Ask user the annual interest rate
		System.out.println("Please enter the annual interest rate: ");
		float annualinter = in.nextFloat();
		
		float monthlyInterest = annualinter / 100 / 12;
		
		//calculate month one
		float month1 =  depo * (1 + monthlyInterest);
		
		//calculate month two
		float month2 = ( month1 +  depo) * (1 + monthlyInterest);
				
		//calculate month three
		float month3 = ( month2 +  depo) * (1 + monthlyInterest);
		
		//calculate month four
		float month4 = ( month3 +  depo) * (1 + monthlyInterest);
						
		//calculate month five
		float month5 = ( month4 +  depo) * (1 + monthlyInterest);
				
		//calculate month six
		float month6 = ( month5 +  depo) * (1 + monthlyInterest);
		
		System.out.println("The total in your account after six months with an monthly deposit of " +  depo + " and an annual interest rate of " +  annualinter + " is " +  month6 + ".");
						

	}//end of main

}//end of lab2c