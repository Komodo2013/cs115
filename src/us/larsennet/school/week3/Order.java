/*
 *File:lab 6a
 * Description:
 * Lessons Learned:
 *   Interfaces
 *   Enums
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 19 Oct 2022
 */

package us.larsennet.school.week3;

import java.util.ArrayList;

public class Order implements Payable{
    ArrayList<DessertItem> order;
    Payable.TYPES payType;

    public Order() {
        this.order = new ArrayList<>();
        this.payType = TYPES.CASH;
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

        out += String.format("Paid for with %s", payType);

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

    @Override
    public TYPES getPayType() {
        return payType;
    }

    @Override
    public void setPayType(TYPES t) {
        payType = t;
    }
}
