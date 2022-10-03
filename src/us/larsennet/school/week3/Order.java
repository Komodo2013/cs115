/*
 *File:lab3b
 * Description: create order file
 * Lessons Learned:
 *   creating an object interfacing with other objects
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 10/03/2022
 */

package us.larsennet.school.week3;

import java.util.ArrayList;

public class Order {
    ArrayList<DessertItem> order;

    public Order() {
        this.order = new ArrayList<>();
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
