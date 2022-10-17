/*
 *File:lab 5a
 * Description:
 * Lessons Learned:
 *   Interfaces
 * Instructor's Name: Barbara Chamberlin
 *
 * @author: William Spencer, Jacob Larsen, Oshane Stewart
 * since: 17 Oct 2022
 */

package us.larsennet.school.week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DessertItemTest {

    @Test
    void setName() {
        DessertItem t = new Candy(); // candy used since DessertItem is abstract
        t.setName("Testing");
        assertEquals("Testing", t.getName());

        t.setName(" ");
        assertEquals("DessertItem", t.getName());
    }

    @Test
    void getName() {
        // candy used since DessertItem is abstract
        DessertItem t = new Candy("Testing", 1.0, 1.0);
        assertEquals(t.getName(), "Testing");
    }

    @Test
    void getPackaging() {
        Cookie m = new Cookie();
        assertEquals("Box", m.getPackaging());
    }

    @Test
    void setPackaging() {
        Cookie m = new Cookie();
        m.setPackaging("Box");
        assertEquals("Box", m.getPackaging());
    }
}