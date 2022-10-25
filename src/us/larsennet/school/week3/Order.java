/*
 *File:lab 7a
 * Description:
 * Lessons Learned:
 *   instancing
 *   casting
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 25 Oct 2022
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

    public void addItem(DessertItem item){
        if(item instanceof Candy) {
            for (DessertItem dessertItem : order) {
                if(dessertItem.isSameAs(item)) {
                    ((Candy) dessertItem).setCandyWeight(
                            ((Candy) dessertItem).getCandyWeight() + ((Candy) item).getCandyWeight());
                }
            }
        } else if(item instanceof Cookie) {
            for (DessertItem dessertItem : order) {
                if(dessertItem.isSameAs(item)) {
                    ((Cookie) dessertItem).setCookieQty(
                            ((Cookie) dessertItem).getCookieQty() + ((Cookie) item).getCookieQty());
                }
            }
        }




        order.add(item);
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
