package us.larsennet.school.week3;

import java.util.ArrayList;

public class Customer {

    // Attributes
    private String name;
    private ArrayList<Order> orderHistory;
    private int custID;
    private static int nextCustID = 1000;

    // Constructor
    public Customer(String custName) {
        name = custName;
        orderHistory = new ArrayList<>();
        custID = nextCustID;
        nextCustID++;
    }

    // Methods
    public String getName() {
        return name;
    }

    public int getID() {
        return custID;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setName(String n) {
        if(!"".equals(n)) {
            this.name = n;
        } else {
            this.name = "Default Name";
        }
    }

    public void addToHistory(Order o) {
        orderHistory.add(o);
    }
}
