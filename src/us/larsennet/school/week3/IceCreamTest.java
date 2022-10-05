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

import static org.junit.jupiter.api.Assertions.*;
//TODO: update this file with all added functions
class IceCreamTest {

    @Test
    void setScoops() {
        IceCream t = new IceCream();
        t.setScoops(5);
        assertEquals(5, t.getScoops());

        t.setScoops(-5);
        assertEquals(1, t.getScoops());
    }

    @Test
    void setPricePerScoop() {
        IceCream t = new IceCream();
        t.setPricePerScoop(4.99);
        assertEquals(4.99, t.getPricePerScoop());

        t.setPricePerScoop(-1.25);
        assertEquals(0.0, t.getScoops());
    }

    @Test
    void getScoops() {
        IceCream t = new IceCream("", 5, 1.1);
        assertEquals(5, t.getScoops());
    }

    @Test
    void getPricePerScoop() {
        IceCream t = new IceCream("", 5, 4.99);
        assertEquals(4.99, t.getPricePerScoop());
    }
}