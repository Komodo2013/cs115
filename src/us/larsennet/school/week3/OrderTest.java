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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    void getPrice() {
        Order o = new Order();
        o.addItem(new Cookie("Testing", 3, 4.00));
        assertEquals(12.00, o.getPrice());
    }

    @Test
    void setTax() {
        Order o = new Order();
        o.addItem(new IceCream("Testing", 2, 3.50));
        o.getOrder().get(0).setTaxRate(.1);
        assertEquals(2*3.5*.1, o.getTax());
    }

    @Test
    void getItemCount() {
        Order o = new Order();
        o.addItem(new Candy("Testing", 1.1, 4));
        assertEquals(1, o.itemCount());
    }



}
