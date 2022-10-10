/*
 *File:lab 4a and b
 * Description:
 * Lessons Learned:
 *   overrides and UI
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 5 Oct 2022
 */

package us.larsennet.school.week3;

import java.util.Date;
import java.util.Scanner;

public class DessertShop {
    public static void main(String[] args){
        Order o = new Order();
        o.addItem(new Candy("Candy Corn", 1.0, 3.99));
        o.addItem(new Candy("Gummy Bears", 1.0, 2.99));
        o.addItem(new Cookie("Chocolate Chip", 12, 2.20));
        o.addItem(new Cookie("Oatmeal Raisin", 2, 3.25));
        o.addItem(new Sundae("Vanilla", 3, .69,  "Hot Fudge", 1.29));
        o.addItem(new IceCream("Pistachio", 2, .79));

        o.getOrder().forEach(t -> System.out.println(t.getName()));
        System.out.printf("\nTotal number of items in order: %d", o.itemCount());

        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;


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

        o.getOrder().forEach(
                I -> System.out.println(I.toString())
        );

        //TODO: toString and print dessertShop
        // so we just need to add some pretty print commands... Which classes do you want to update with overriden toString() methods and w
        // watch me just sit back and let you and Oshane die xD lol
        // What do you want to take charge of for updating? also is Oshane there?
        //yes he is, can I see a toString in action?!
        /* Old print statement
        System.out.println("\n");

        o.getOrder().forEach(
                I -> System.out.printf("%-25s \t$%-8.2f \t[Tax: $%.2f]\n", I.getName(), I.getPrice(), I.getTax())
        );
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-25s \t$%-8.2f \t[Tax: $%.2f]\n", "Order Subtotals:", o.getPrice(), o.getTax());
        System.out.printf("%-25s \t$%-8.2f\n", "Order Total:", o.getPrice() + o.getTax());
        System.out.printf("%-25s \t%d\n","Total items in order: ", o.getOrder().size() );
        */
    }

    public String toString(){
        return this.toString();// Obviously this won't work... this just calls the super.toString() method...
        // We have to add the code to make this work
        // Do you really want me to spoil this for you guys xD
        //I dont believe in santa anymore so my heart cant be broken by spoiling anything anymore
        // Can it be broken if I let you figure it out? trick question the answer is no...
        /* It'll look a lot like this::::
        o.getOrder().forEach(
                I -> System.out.printf("%-25s \t$%-8.2f \t[Tax: $%.2f]\n", I.getName(), I.getPrice(), I.getTax())
        );
        Just not a for each loop..... follow me to Candy
        */
    }

    private static DessertItem userPromptSundae() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of Ice Cream scoops");
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

        System.out.println("Please enter the number of Ice Cream scoops");
        String name = getString(sc, "That is not a valid Ice Cream type");

        System.out.println("Please enter the number of Ice Cream scoops");
        int scoops = getValidInt(sc, "That is not a valid number of scoops");

        System.out.println("Please enter the price per scoop");
        double price = getValidDouble(sc, "That is not a valid price");

        return new IceCream(name, scoops, price);
    }

    private static DessertItem userPromptCookie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of Cookies");
        int cookieQty = getValidInt(sc, "That is not a valid number of cookies");

        System.out.println("Please enter the price per Cookie");
        double price = getValidDouble(sc, "That is not a valid price");

        System.out.println("Please ender the name of the Cookie Type");
        String name = getString(sc, "That is not a valid name of a Candy Type");

        return new Cookie(name, cookieQty, price);
    }

    private static DessertItem userPromptCandy() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of Candies");
        double candyWeight = getValidInt(sc, "That is not a valid Candy Weight");

        System.out.println("Please enter the price per pound");
        double price = getValidDouble(sc, "That is not a valid price");

        System.out.println("Please ender the name of the Candy Type");
        String name = getString(sc, "That is not a valid name of a Candy Type");

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
}
