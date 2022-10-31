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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CandyTest {

    @Test
    void setCandyWeight() {
        Candy s = new Candy();
        s.setCandyWeight(7);
        assertEquals(7, s.getCandyWeight());
        s.setCandyWeight(-7);
        assertEquals(0, s.getCandyWeight());
    }

    @Test
    void setPricePerLb() {
        Candy s = new Candy();
        s.setPricePerLb(10.99);
        assertEquals(10.99, s.getPricePerLb());
        s.setPricePerLb(-10.99);
        assertEquals(0.0, s.getPricePerLb());
    }

    @Test
    void getCandyWeight() {
        Candy s = new Candy("", 7, 5.9);
        assertEquals(7.0, s.getCandyWeight());

    }

    @Test
    void getPricePerLb() {
        Candy s = new Candy("", 7, 10.99);
        assertEquals(10.99, s.getPricePerLb());
    }

    @Test
    void getPrice() {
        Candy t = new Candy("", 1.2, .5);
        assertEquals(0.6, t.getPrice());
    }


    @Test
    void getPackaging() {
        Candy m = new Candy();
        assertEquals("Bag", m.getPackaging());
    }
    @Test
    void isSameAs() {
        Candy c = new Candy("", 0, 0);
        Candy other = new Candy("", 0, 0);
        assertEquals(true, c.isSameAs(other));

    }
}