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
class DessertItemTest {

    @Test
    void setName() {
        DessertItem t = new Candy(); // candy used since DessertItem is abstract
        t.setName("Testing");
        assertEquals("testing", t.getName());

        t.setName(" ");
        assertEquals("DessertItem", t.getName());
    }

    @Test
    void getName() {
        // candy used since DessertItem is abstract
        DessertItem t = new Candy("Testing", 1.0, 1.0);
        assertEquals(t.getName(), "testing");
    }
}