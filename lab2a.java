/*Program/Project: Lab2a - Hello World Revised
 * *Name: William Spencer
 * Date: September 20, 2021
 * Instructor: Sister Kristi Hays
 * Description: Asking users questions.
 */

package week2;
import java.util.Scanner;

public class lab2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		//Ask the user's name
		System.out.println("Please enter your name");
		String name = in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println();
		
		//Ask the user's favorite dessert
		System.out.println("Please enter your favorite dessert");
		String dessert = in.nextLine();
		System.out.println("I'm sure you like coding java more than " + dessert + "!");
		System.out.println();
				
		//Ask the user's favorite book
		System.out.println("What is your favorite book?");
		String book = in.nextLine();
		System.out.println("I also love reading " + book + "!");
		System.out.println();
		
		//Ask the user's favorite sport to watch
		System.out.println("What is your favorite sport to watch");
		String sport = in.nextLine();
		System.out.println("I also love watching " + sport + "!");
		System.out.println();
		
		//Ask the user's favorite food
		System.out.println("What is your favorite food?");
		String food = in.nextLine();
		System.out.println("I love eating bbq chicken but " + food + " is great to!");
		System.out.println();
		
		//Ask the user's favorite type of animal
		System.out.println("What is your favorite type of animal");
		String animal = in.nextLine();
		System.out.println("I think that a " + animal + "is my favorite animal to!");
		System.out.println();
	}

}
