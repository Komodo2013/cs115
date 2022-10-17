/*
 *File:lab 5a
 * Description:
 * Lessons Learned:
 *   Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 17 Oct 2022
 */

package us.larsennet.school.week3;

import java.util.ArrayList;

public class Order {
    ArrayList<DessertItem> order;

    public Order() {
        this.order = new ArrayList<>();
    }

    public String toString(){
        String out = "--------------------------------Receipt--------------------------------\n";

        for (DessertItem item : order) {
            out += item.toString() + "\n";
        }

        out += "-----------------------------------------------------------------------\n";

        out += String.format("Total number of items in order: %d\n", order.size());
        out += String.format("%-49s$%3.2f\t[Tax: $%2.2f]\n", "Order Subtotals: ", getPrice(), getTax());
        out += String.format("%-49s$%3.2f\n", "Order Total: ", getPrice() + getTax());

        out += "-----------------------------------------------------------------------\n";

        return out;
    }

    public double getTax(){
        double total = 0;
        for (DessertItem item : order) {
            total += item.getTax();
        }
        return total;
    }

    public double getPrice(){
        double total = 0;
        for (DessertItem item : order) {
            total += item.getPrice();
        }
        return total;
    }

    public ArrayList<DessertItem> getOrder() {
        return order;
    }

    public int itemCount(){
        return order.size();
    }

    public void addItem(DessertItem i){
        order.add(i);
    }
}
