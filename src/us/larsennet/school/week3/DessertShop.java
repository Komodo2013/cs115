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
    }
}
