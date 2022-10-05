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
                    case "1":
                        orderItem = userPromptCandy();
                        o.addItem(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "2":
                        orderItem = userPromptCookie();
                        o.addItem(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "3":
                        orderItem = userPromptIceCream();
                        o.addItem(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    case "4":
                        orderItem = userPromptSundae();
                        o.addItem(orderItem);
                        System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }//end of switch (choice)
            }//end of if (choice.equals(""))
        }//end of while (!done)
        System.out.println("\n");

        o.getOrder().forEach(
                I -> System.out.printf("%-25s \t$%-8.2f \t[Tax: $%.2f]", I.getName(), I.getPrice(), I.getTax())
        );
        System.out.println("-----------------------------------------------");
        System.out.printf("%-25s \t$%-8.2f \t[Tax: $%.2f]", "Order Subtotals:", o.getPrice(), o.getTax());
        System.out.printf("%-25s \t$%-8.2f", "Order Total:", o.getPrice() + o.getTax());
        System.out.printf("%-25s \t%d","Total items in order: ", o.getOrder().size() );
    }

    // TODO: create this method. It will need to validate inputs and create the appropriate orderItem
    private static DessertItem userPromptSundae() {

        return new Sundae();
    }

    // TODO: create this method. It will need to validate inputs and create the appropriate orderItem
    private static DessertItem userPromptIceCream() {

        return new IceCream();
    }

    // TODO: create this method. It will need to validate inputs and create the appropriate orderItem
    private static DessertItem userPromptCookie() {

        return new Cookie();
    }

    // TODO: create this method. It will need to validate inputs and create the appropriate orderItem
    private static DessertItem userPromptCandy() {

        return new Candy();
    }
}
