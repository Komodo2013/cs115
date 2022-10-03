package us.larsennet.school.week3;

import java.util.ArrayList;

public class Order {
    //Attribute
    ArrayList<DessertItem>order;
    //Constructor
    public Order(){
        order = new ArrayList<>();
    }
    public ArrayList<DessertItem> getOrderList() {
        return order;
    }
    public void add(DessertItem Product) {
        order.add(Product);

    }

    public int itemCount() {
        return(order.size());

    }
}
