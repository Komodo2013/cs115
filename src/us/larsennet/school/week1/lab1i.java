//**
//*File:lab1i
//* Description:
//Lessons Learned:
//* Construct 1
//* Construct 2
//* Instructor's Name: Barbara Chamberlin
//*
//@author: William Spencer
//* since: 9/12/2022
//*/

package lab1i;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class lab1i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList <Integer>();
		Scanner nIn = new Scanner(System.in);
		
		String ans = ""; 
		int num = 0;
		
		//New added
		System.out.print("In this program you will be asked to enter a list of numbers.");
		
		
			boolean loop = true;
			
			
		while (loop) { //user input for numbers
				System.out.print("\n\nPlease enter a number (or just hit the <enter> key to finish): ");
				ans = nIn.nextLine();
				
				if (ans.equals("")) {
					loop = false;
				} else {
					try {
						num = Integer.parseInt(ans);
						numbers.add(num);
						
					} catch (Exception e) { //invalid response method if ans is not a number
						System.out.print("Invalid response, " + ans + " is not a number.");
					}
				}
			}
				
				System.out.println("The total of the list of numbers is " + sumNum(numbers));
				System.out.println("The biggest number in the list is " + largeNum(numbers));
				
				
			}
			
	public static int sumNum(ArrayList<Integer> arrNums) {
		int addedNum = 0;
		
		for(int i = 0; i < arrNums.size(); i++) {
			addedNum = addedNum + arrNums.get(i);
		}
		return addedNum;
	}
	
	public static int largeNum(ArrayList<Integer> arrNums) {
		int biggestNum = -10000;
		
		for(int i = 0; i < arrNums.size(); i++) {
			if (arrNums.get(i) > biggestNum) {
				biggestNum = arrNums.get(i);
			}
		}
		return biggestNum;
	}
//
	
 
}//end of Lab1i