/*Program/Project: Lab3b - Calculating BMI
 * *Name: William Spencer
 * Date: September 27, 2021
 * Instructor: Sister Kristi Hays
 * Description: Calculate the users BMI.
 */


package week3;
import java.util.Scanner;

public class lab3b {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner for user input
		Scanner in = new Scanner(System.in);
				
		//Description of program
		System.out.println("This program will calculate your BMI (Body Mass Index.");
		
		//Asking the user for information
		System.out.println("Please enter your height in inches: ");
		
		int Iheight = in.nextInt();
		
		//Asking the user for information
		System.out.println("Please enter your weight in pounds");
		
		int lbsWeight = in.nextInt();
		
		//Convert height and weight to the metric system
		
		double heightmeters = Iheight * 0.0254;
		
		double weightkilos = lbsWeight * 0.45359237;
		
		//calculate the BMI
		double bmi = weightkilos/(heightmeters*heightmeters);
		
		//print out the BMI classification with if, esle if, and else statements
		if (bmi < 18.5) {
			System.out.println("The persons BMI is: " + bmi + ". The person is Underweight");
			
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("The person's BMI is: " + bmi + ". The person is a normal weight");
			
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("The person's BMI is: " + bmi + ". The person is overweight");
			
		} else {
			System.out.println("The person's BMI is: " + bmi + ". The person is an obese weight");			
			
		}//end of if, else if, and else statements
		
	}//end of main

}//end of lab3b