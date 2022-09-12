/*
Jacob Larsen
12 Sept 2022
Lab 1i: Java Basics Review
 */

package us.larsennet.school.week1;

import java.util.Iterator;
import java.util.Scanner; // Needed for user input
import java.util.ArrayList; // Needed to create dynamic Array (ArrayList)


public class assign1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> info = getNumbers(scan);

        int sum = sum_array(info);
        int big = largest_number(info);

        System.out.printf("The sum of the list is: %s\n\n", sum);
        System.out.printf("The max number of the list is: %s\n", big);

    }

    private static int largest_number(ArrayList<Integer> info) {
        int large = Integer.MIN_VALUE;
        Iterator<Integer> it = info.iterator();

        while(it.hasNext()){
            Integer i = it.next();
            if(i > large){
                large = i;
            }
        }

        return large;
    }

    private static int sum_array(ArrayList<Integer> info) {
        Integer suma = 0;
        Iterator<Integer> it = info.iterator();

        while(it.hasNext()){
            suma += it.next();
        }

        return suma;
    }

    private static ArrayList getNumbers(Scanner scan) {
        ArrayList inputted = new ArrayList<Integer>();
        String in = "";

        while(true){
            try{
                System.out.print("Please enter an integer (or hit enter): ");
                in = scan.nextLine().strip();
                inputted.add(Integer.parseInt(in));
            } catch (Exception e) {
                if("".equals(in) && !inputted.isEmpty()) {
                    return inputted;
                }
                System.out.printf("'%s' is not a valid input", in);
            }
        }
    }
}
