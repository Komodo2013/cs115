/*
 *File:lab 8b
 * Description: Admin Module
 * accessing hashmaps
 * Lessons Learned:
 *   Hash maps
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 07 Nov 2022
 */

package us.larsennet.school.week3;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class DessertShop {

    //HashMap object called name
    static HashMap<String, Customer> db = new HashMap<>();

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
                System.out.println("5: Admin Module");


                System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
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
                        case "5" -> {
                            AdminModule(sIn);
                        }
                        default -> System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                    }//end of switch (choice)
                }//end of if (choice.equals(""))
            }//end of while (!done)

            System.out.print("Customer Name \t > ");
            String name = sIn.nextLine();

            //default values
            int id = 0;
            int total_orders = 1;

            if("".equals(name)){// No customer name was inputted
                name = "Unknown Customer";
            } else {
                if(!db.containsKey(name)) {
                    db.put(name, new Customer(name));
                }
                id = db.get(name).getID();
                db.get(name).addToHistory(o);
                total_orders = db.get(name).getOrderHistory().size();
            }



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

            System.out.printf("Customer Name: %s\t Customer ID: %d\t Total Orders: %d\n", name, id, total_orders);
        }
    }

    private static void AdminModule(Scanner sc){

        // This is a copy-paste of the above menu system
        while (true) {
            System.out.println("\n1: Shop Customer List");
            System.out.println("2: Customer Order History");
            System.out.println("3: Best Customer");
            System.out.println("4: Exit Admin Module");

            System.out.print("\nWhat would you like to do? (1-4):");
            String choice = sc.nextLine();

            if (choice.equals("")) {
                return;
            } else {
                switch (choice) {
                    case "1" -> {
                        printAllCustomers();
                    }
                    case "2" -> {
                        printAllCustomerOrders(sc);
                    }
                    case "3" -> {
                        System.out.printf("The customer with the most purchases is: %s", getMostCommonCustomer());
                    }
                    case "4" -> {
                        return;
                    }
                    default -> System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                }//end of switch (choice)
            }//end of if (choice.equals(""))
        }//end of while (!done)
    }

    private static String getMostCommonCustomer() {
        // Customer to compare against
        Customer most = new Customer();

        for(Map.Entry<String, Customer> c: db.entrySet()){
            // if the one we are looking at has more orders, set it as most
            most = c.getValue().getOrderHistory().size() > most.getOrderHistory().size() ? c.getValue() : most;
        }

        return most.getName(); // This also works as a key
    }

    private static void printAllCustomerOrders(Scanner sc) {
        Customer c;

        // Printing a list of all customers
        int i = 0;
        StringBuilder table = new StringBuilder();

        for(Map.Entry<String, Customer> e: db.entrySet()){
            i++;
            table.append(String.format("%-20s\t ", e.getKey())).append((i % 5 == 0) ? "\n" : "");
        }

        // Execute until we get a valid customer
        while(true){
            System.out.println(table.toString());
            String cus = sc.nextLine();

            if(!"".equals(cus) && db.containsKey(cus)){
                c = db.get(cus);
                break;
            }
        }

        // print each order to terminal
        c.getOrderHistory().forEach(order -> System.out.println(order.toString()));
    }

    private static void printAllCustomers() {
        //show a listing of all Dessert Shop customers and their Customer IDs in a nice format as shown in the Example Run.
        db.forEach((key, value) ->
                System.out.println("Customer: " + value.getName() + "\t Customer ID: " + value.getID()));
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

}


