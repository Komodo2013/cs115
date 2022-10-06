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
//TODO: update this file with all added functions
public class OrderTest {
    @Test
    void getPrice() {
        Order o = new Order();
        o.addItem(new Cookie("Testing", 3, 4.00));
        assertEquals(2, o.itemCount());
    }

    @Test
    void setTax() {
        Order o = new Order();
        o.addItem(new IceCream("Testing", 2, 3.50));
        assertEquals(2, o.itemCount());
    }

    @Test
    void getItemCount() {
        Order o = new Order();
        o.addItem(new Candy("Testing", 1.1, 4));
        assertEquals(1, o.itemCount());
    }



}
