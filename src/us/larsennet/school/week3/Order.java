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

import java.util.ArrayList;

public class Order {
    ArrayList<DessertItem> order;

    public Order() {
        this.order = new ArrayList<>();
    }

    public double getTax(){
        double total = 0;
        for(int i=0; i < this.order.size(); i++){
            total =+ this.order.get(i).getTax();
        }
        return total;
    }

    public double getPrice(){
        double total = 0;
        for(int i=0; i < this.order.size(); i++){
            total =+ this.order.get(i).getPrice();
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
