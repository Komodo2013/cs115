/*
 *File:lab 7b
 * Description: Static Fields
 * use a static field to share a value across objects
 * Lessons Learned:
 *   Static fields
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 31 Oct 2022
 */

package us.larsennet.school.week3;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.HashMap;
public class DessertShop {

    private String paymentMethod;
    private static final boolean DEBUG = true;

    public static void main(String[] args){

        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

        while(true) {
            Order o = new Order();

            if(DEBUG){
                o.addItem(new Candy("Candy Corn", 1.0, 3.99));
                o.addItem(new Candy("Gummy Bears", 1.0, 2.99));
                o.addItem(new Cookie("Chocolate Chip", 12, 2.20));
                o.addItem(new Cookie("Oatmeal Raisin", 2, 3.25));
                o.addItem(new Sundae("Vanilla", 3, .69,  "Hot Fudge", 1.29));
                o.addItem(new IceCream("Pistachio", 2, .79));
            }

            boolean done = false;
            while (!done) {
                System.out.println("\n1: Candy");
                System.out.println("2: Cookie");
                System.out.println("3: Ice Cream");
                System.out.println("4: Sunday");

                System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
                choice = sIn.nextLine();

                if (choice.equals("")) {
                    done = true;
                } else {
                    switch (choice) {
                        case "1" -> {
                            orderItem = userPromptCandy();
                            o.addItem(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        }
                        case "2" -> {
                            orderItem = userPromptCookie();
                            o.addItem(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        }
                        case "3" -> {
                            orderItem = userPromptIceCream();
                            o.addItem(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        }
                        case "4" -> {
                            orderItem = userPromptSundae();
                            o.addItem(orderItem);
                            System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        }
                        default -> System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                    }//end of switch (choice)
                }//end of if (choice.equals(""))
            }//end of while (!done)


            String out = "What form of payment will be used to pay for your items? (";
            for (Payable.TYPES type : Payable.TYPES.values()) {
                out += type + ", ";
            }
            System.out.println(out.substring(0, out.length() - 2) + ")\n");

            boolean isValid = false;
            Payable.TYPES types = Payable.TYPES.CASH;

            while (!isValid) {
                String paymentMethod = sIn.nextLine();

                for (Payable.TYPES type : Payable.TYPES.values()) {
                    if (type.name().equals(paymentMethod)) {
                        isValid = true;
                        types = type;
                    }
                }

                System.out.println("Please choose a valid payment method");
            }
            o.payType = types;

            o.getOrder().sort(DessertItem::compareTo);

            System.out.print(o.toString());
        }
    }


    private static DessertItem userPromptSundae() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Ice Cream");
        String name = getString(sc, "That is not a valid Ice Cream type");

        System.out.println("Please enter the number of Ice Cream scoops");
        int scoops = getValidInt(sc, "That is not a valid number of scoops");

        System.out.println("Please enter the price per scoop");
        double price = getValidDouble(sc, "That is not a valid price");

        System.out.println("Please enter the topping type");
        String topping = getString(sc, "That is not a valid topping");

        System.out.println("Please enter the price per topping");
        double toppingPrice = getValidDouble(sc, "That is not a valid price");

        return new Sundae(name, scoops, price, topping, toppingPrice);
    }

    private static DessertItem userPromptIceCream() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Ice Cream");
        String name = getString(sc, "That is not a valid Ice Cream type");

        System.out.println("Please enter the number of Ice Cream scoops");
        int scoops = getValidInt(sc, "That is not a valid number of scoops");

        System.out.println("Please enter the price per scoop");
        double price = getValidDouble(sc, "That is not a valid price");

        return new IceCream(name, scoops, price);
    }

    private static DessertItem userPromptCookie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Cookie Type");
        String name = getString(sc, "That is not a valid name of a Candy Type");

        System.out.println("Please enter the number of Cookies");
        int cookieQty = getValidInt(sc, "That is not a valid number of cookies");

        System.out.println("Please enter the price per Cookie");
        double price = getValidDouble(sc, "That is not a valid price");

        return new Cookie(name, cookieQty, price);
    }

    private static DessertItem userPromptCandy() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Candy Type");
        String name = getString(sc, "That is not a valid name of a Candy Type");


        System.out.println("Please enter the pounds of Candy");
        double candyWeight = getValidDouble(sc, "That is not a valid Candy Weight");

        System.out.println("Please enter the price per pound");
        double price = getValidDouble(sc, "That is not a valid price");

        return new Candy(name, candyWeight, price);
    }

    private static int getValidInt(Scanner sc, String prompt){
        while(true) {
            try{
                int in = Integer.parseInt(sc.nextLine());
                if(in > 0) {
                    return in;
                }
                System.out.println(prompt);
            } catch(Exception e) {
                System.out.println(prompt);
            }
        }
    }

    private static double getValidDouble(Scanner sc, String prompt) {
        while(true) {
            try{
                double in = Double.parseDouble(sc.nextLine());
                if(in > 0) {
                    return in;
                }
                System.out.println(prompt);
            } catch(Exception e) {
                System.out.println(prompt);
            }
        }
    }

    private static String getString(Scanner sc, String prompt) {
        while (true) {
            String in = sc.nextLine();
            if(!in.equals("")){
                return in;
            } else {
                System.out.println(prompt);
            }
        }
    }
    //HashMap object called name
    HashMap<String, String> name = new HashMap<String, String>();
}


