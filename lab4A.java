/*Program/Project: Lab4A - Factorial Fun
 * *Name: William Spencer
 * Date: October 4, 2021
 * Instructor: Sister Kristi Hays
 * Description: Use a loop to calculate the factorials.
 */

package week4;
import java.util.Scanner;

public class lab4A {
	
	//all necessary ints from scanner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int factor;
		int result=1;
		int i=1;
		
		System.out.println("What number do you want me to find the factorial for?");
		factor = read.nextInt();
		
		while(i<factor) {
			result = (result*(i+1));
			i++;
			System.out.println(result);
		}
		
	
		
	}
		
				
		
		
	
	

}


