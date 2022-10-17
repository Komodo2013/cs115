/*
 *File:lab 5a
 * Description: Interfaces
 * Lessons Learned:
 *   Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 17 Oct 2022
 */

package us.larsennet.school.week3;

public class Sundae extends IceCream{
    private String topping;
    private double toppingPrice;

    public Sundae(String name, int scoops, double pricePerScoop, String topping, double toppingPrice) {
        super(name, scoops, pricePerScoop);
        this.setTopping(topping);
        this.setToppingPrice(toppingPrice);
        super.setPackaging("Boat");
    }

    public Sundae() {
        super();
        this.topping = "none";
        super.setPackaging("Boat");
    }

    public double getPrice(){
        return super.getPrice() + toppingPrice;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        String s = topping.strip().toLowerCase();
        this.topping = (s.equals("") ? "none" : s);
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        if(toppingPrice < 0) {
            this.toppingPrice = toppingPrice;
        } else {
            this.toppingPrice = 0;
        }
    }

    public String getName(){
        return super.getName() + " with " + topping.toUpperCase().charAt(0) + topping.substring(1);
    }
}
